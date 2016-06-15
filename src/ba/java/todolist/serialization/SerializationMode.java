package ba.java.todolist.serialization;

public enum SerializationMode {
  BINARY(new BinarySerializer()), //
  XML(new XmlSerializer()), //
  LIST(null), //
  ;

  private Serializer serializer;

  SerializationMode(Serializer serializer) {
    this.serializer = serializer;
  }

  public Serializer getSerializer() {
    return serializer;
  }
}
