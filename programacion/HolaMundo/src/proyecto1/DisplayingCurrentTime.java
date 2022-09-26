package proyecto1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DisplayingCurrentTime {

	public static void main(String[] args) {

		// long time = System.currentTimeMillis();
		// Date currentDate = new Date(time);
		// String pattern = "hh:mm:ss";
		// SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		// String currentFormatDate = sdf.format(currentDate);
		// System.out.println(currentFormatDate);

		long millis = System.currentTimeMillis();
		long totalSeconds = millis / 1000;
		long secondsToday = totalSeconds % (3600 * 24);
		long hoursToday = (secondsToday / 3600) + 2;
		long minutesToday = (totalSeconds / 60) % 60;
		long secondsNow = totalSeconds % 60;

		System.out.println(secondsToday);
		// System.out.println(hoursToday);
		// System.out.println(minutesToday);

		System.out.println(secondsNow);

		System.out.printf("%d:%d:%d", hoursToday, minutesToday, secondsNow);

	}

}
