package com.gprojects.java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalculadoraGravidez {
	
	public static String calcularParto(String ultimaMenst) {
		Date menst = stringToDate(ultimaMenst);
		return nextWeek(menst, 40);
	}
	
	public static String calcularConcepcao(String ultimaMenst) {
		Date menst = stringToDate(ultimaMenst);
		return nextWeek(menst, 2);
	}
	
	public static String nextWeek(Date date, int weeks) {
		Calendar gregorianCalendar = new GregorianCalendar();
		gregorianCalendar.setTime(date);
		gregorianCalendar.add(Calendar.WEEK_OF_YEAR, weeks);
		return dateToString(gregorianCalendar.getTime());
	}
	
	// conversor de String para data
	public static Date stringToDate(String data) {
		Date d = new Date();
		try {
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			d = dateFormat.parse(data);
		} catch (ParseException ex) {
			System.out.println("Formato de data invalido! \nUse como ex: 31/12/2000");
		}
		return d;
	}
	
	// date para string
	public static String dateToString(Date d) {
		DateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return simpleDateFormat.format(d);
	}
	
	public static void calcular (String ultimaMenst) {
		System.out.println("Data da sua 40° semana completa: " + calcularParto(ultimaMenst));
		System.out.println("Data possivel da concep��o: " + calcularConcepcao(ultimaMenst));
	}
	
}
