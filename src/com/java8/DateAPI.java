package com.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateAPI {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();  
		LocalDate lDate = LocalDate.of(2021, Month.FEBRUARY, 19);
		System.out.println(" date is :: "+localDate+" with month :: "+lDate);
		LocalTime localTime = LocalTime.now();
		System.out.println(" time is :: "+localTime.toString());
		LocalDateTime ldT = LocalDateTime.now();
		System.out.println(" local date time :: "+ldT.toString());

	}

}
