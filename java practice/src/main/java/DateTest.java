import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class DateTest {
	Date date;

	Date getDateNow() {
		return new Date();
	}
	
	LocalTime local;
	LocalTime getTime() {
		return LocalTime.now();
	}
	LocalDate local1;
	LocalDate getDate() {
		return LocalDate.now();
	}
	static void dateTest() {
		Date dateOfBirth = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-mm-yyyy");
		String result = simpleDateFormat.format(dateOfBirth);
		System.out.println(result);
	}
} 
