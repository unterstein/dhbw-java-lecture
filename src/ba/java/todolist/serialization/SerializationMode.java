package ba.java.todolist.serialization;

public enum SerializationMode {
  BINARY(new BinarySerializer()), //
  XML(null), //
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
