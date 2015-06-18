package com.lrgoncalves.java.eight;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 * @author lrgoncaves
 */
public class App 
{
    /**
     * @param args
     */
    public static void main( String[] args ){
            	
    	//new Thread(()-> System.out.println("Java Eight")).start();
    											  //Params -> impl
    	//System.out.println(new Test().execute(2, 4, (a,b)-> a==b));
    	
    	//List<String> cars = Arrays.asList("Corsa","Opala","Fusca","Focus","Zafira");
    	
    	//Collections.sort(cars, (a,b)-> b.compareTo(a));
    	//Collections.sort(cars);
    	
    	LocalDate localDate = LocalDate.now();
    	LocalTime localTime	= LocalTime.now();	
    	LocalDateTime localDateTime = LocalDateTime.now();
    	ZonedDateTime zonedDateTime = ZonedDateTime.now();
    	
    	OffsetDateTime offsetDateTime = OffsetDateTime.now();
    	
    	Instant instant = Instant.now();
    	
    	LocalTime start = LocalTime.now();
    	LocalTime end   = LocalTime.now().plusNanos(999999999).plusSeconds(1);
    	
    	Duration duration = Duration.between(start, end);
    	
    	LocalDate hoje = LocalDate.now();
    	LocalDate niver = LocalDate.of(2015,Month.APRIL,16);
    	Period period = Period.between(hoje, niver);
    	
    	//System.out.println(period);
    	
    	//System.out.println(duration);
    	
    	//System.out.println(cars);
    	
    	LocalDateTime niverTime = LocalDateTime.now().withMonth(Month.APRIL.getValue()).withDayOfMonth(16);  
    	System.out.println(niverTime);
    
    	System.out.println(niverTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
