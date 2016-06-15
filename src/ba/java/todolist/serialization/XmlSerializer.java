package ba.java.todolist.serialization;

import ba.java.todolist.model.User;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Map;

public class XmlSerializer implements Serializer {

  @Override
  public void save(Map<String, User> users) {
    try (FileOutputStream fos = new FileOutputStream(DATABASE_FILE)) {
      JAXBContext jc = JAXBContext.newInstance(XmlMapper.class);
      Marshaller marshaller = jc.createMarshaller();
      marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
      marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
      marshaller.marshal(new XmlMapper(users), fos);
    } catch (Exception o_O) {
      o_O.printStackTrace();
    }
  }

  @Override
  public Map<String, User> load() {
    try (FileInputStream fis = new FileInputStream(DATABASE_FILE)) {
      JAXBContext jc = JAXBContext.newInstance(XmlMapper.class);
      Unmarshaller unmarshaller = jc.createUnmarshaller();
      return ((XmlMapper) unmarshaller.unmarshal(fis)).user;
    } catch (Exception e) {
      // LOG.error("Error during unmarshalling", e);
      e.printStackTrace();
    }
    return null;
  }

  @XmlRootElement(name = "users")
  public static class XmlMapper {
    public Map<String, User> user;

    public XmlMapper(Map<String, User> user) {
      this.user = user;
    }

    public XmlMapper() {
      // Default Constructor is needed or JAXB
    }
  }
}
