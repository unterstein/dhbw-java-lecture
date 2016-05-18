package ba.java.utilities;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class AnnotationBeispiel {

  public AnnotationBeispiel() {
    UserBean bean = new UserBean();
    bean.name = "James";
    bean.surename = "Hetfield";
    bean.birthDate = new Date(63, 7, 3); // 3. August 1963
    // XMLSerializeHelper ist kein Bestandteil von Java
    System.out.println(XMLSerializeHelper.instance().serialize(bean));
  }

  @XmlRootElement
  public static class UserBean implements Serializable {
    private static final long serialVersionUID = -909105371662696039L;

    @XmlElement(name = "vorname")
    public String name;
    public String surename;
    @XmlElement(name = "geburtstag")
    public Date birthDate;
  }

  public static void main(String[] args) {
    new AnnotationBeispiel();
  }
}
