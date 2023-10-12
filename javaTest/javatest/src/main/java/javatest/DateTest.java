package javatest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateTest {

	
	Date date = new Date();
	
	LocalDate getDate() {
		return LocalDate.now();
	}
	
	LocalTime getTime() {
		return LocalTime.now();
}
	LocalDateTime getDateTime() {
		return LocalDateTime.now();
	}
}
