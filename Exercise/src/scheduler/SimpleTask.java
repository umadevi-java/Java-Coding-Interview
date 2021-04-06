package scheduler;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

		// TODO Auto-generated method stub
		
class MyTask extends TimerTask {
   public void run() {
      System.out.println("Task is running");
   }
}

public class SimpleTask {
	   public static void main(String[] args) throws ParseException {
		  String pattern = "dd-MM-yy hh:mm:ss";
		  SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		  Date date = sdf.parse("06-04-21 12:33:00");
		  
		  DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			Date date2 = dateFormatter.parse("2021-04-05 21:41:08");
			
		  
	      Timer timer = new Timer(); // creating timer
	      TimerTask task = new MyTask(); // creating timer task
	      // scheduling the task at the specified time at fixed-rate
	      timer.scheduleAtFixedRate(task,date,10000);
	      // cancelling the task and displaying its status
	    //  System.out.println("Task is cancelled:"+task.cancel());
	   }
	}
