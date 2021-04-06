package scheduler;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

public final class AtFixedTime extends TimerTask {
  public static void main(String... arguments) throws ParseException {
	
	DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	Date date = dateFormatter.parse("2021-04-05 21:25:08");
	
	Timer timer = new Timer();
    TimerTask fetchMail = new AtFixedTime();
    
    
    System.out.println("My format "+date);
   timer.scheduleAtFixedRate(fetchMail, date, 10000);
  }
  @Override
  public void run() {
    System.out.println("doing");
  }
 }
