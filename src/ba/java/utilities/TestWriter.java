package ba.java.utilities;

import java.io.*;

public class TestWriter {

  public static void main(String[] args) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File("/Users/Hannes/Desktop/test.txt")))) {
      String[] toSerialize = {"Hallo", "ich", "bin", "ein", "array"};
      for (String string : toSerialize) {
        writer.write(string);
        writer.newLine();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    try (BufferedReader reader = new BufferedReader(new FileReader(new File("/Users/Hannes/Desktop/test.txt")))) {
      String in = null;
      while ((in = reader.readLine()) != null) {
        System.out.println(in);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println(Integer.parseInt("12"));
    System.out.println(Boolean.parseBoolean("true"));
  }
}
