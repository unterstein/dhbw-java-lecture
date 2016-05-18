package ba.java.utilities;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public final class XMLSerializeHelper {

  private static XMLSerializeHelper instance;

  private XMLSerializeHelper() {
  }

  public void serialize(Object obj, OutputStream outputStream) {
    serialize(obj, outputStream, true);
  }

  public void serialize(Object obj, OutputStream outputStream, boolean prettyPrint) {
    try {
      JAXBContext jc = JAXBContext.newInstance(obj.getClass());
      Marshaller marshaller = jc.createMarshaller();
      marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, prettyPrint);
      marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
      marshaller.marshal(obj, outputStream);
    } catch (Exception e) {
      // LOG.error("Error during marshalling", e);
      e.printStackTrace();
    }
  }

  public String serialize(Object obj) {
    return serialize(obj, true);
  }

  public String serialize(Object obj, boolean prettyPrint) {
    OutputStream outputStream = new ByteArrayOutputStream();
    serialize(obj, outputStream, prettyPrint);
    return outputStream.toString();
  }

  public <T> T deserialize(String string, Class<T> targetClass) {
    return deserialize(string, targetClass, true);
  }

  @SuppressWarnings("unchecked")
  public <T> T deserialize(String string, Class<T> targetClass, boolean prettyPrint) {
    try {
      JAXBContext jc = JAXBContext.newInstance(targetClass);
      Unmarshaller unmarshaller = jc.createUnmarshaller();
      return (T) unmarshaller.unmarshal(new ByteArrayInputStream(string.getBytes()));
    } catch (Exception e) {
      // LOG.error("Error during unmarshalling", e);
      e.printStackTrace();
    }
    return null;
  }

  public static final XMLSerializeHelper instance() {
    if (instance == null) {
      instance = new XMLSerializeHelper();
    }
    return instance;
  }
}