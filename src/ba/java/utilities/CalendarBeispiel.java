package ba.java.utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarBeispiel {

  private SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

  public CalendarBeispiel() {
    GregorianCalendar calendar = new GregorianCalendar();
    calendar.set(GregorianCalendar.HOUR, 9);
    System.out.println(calendar.get(GregorianCalendar.HOUR));
    System.out.println(sdf.format(calendar.getTime()));
    String dateString = "10.06.2013";
    try {
      Date parsedDate = sdf.parse(dateString);
      System.out.println(parsedDate);
    } catch (ParseException e) {
      e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
    }
  }

  public static void main(String[] args) {
    new CalendarBeispiel();
  }
}
