package com.dsi.builder.back;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.awt.List;
import java.text.DateFormat;
import java.text.ParseException;

public class Utils {
	
	/**
     * Convierte una cadena de caracteres a una fecha (Date)
     * @param date - fecha en formato -> dd/MM/yyyy
     * @return Objet Date
     */
    public static Date parseDate(String date)
    {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date dt = null;
        try {
            dt = format.parse(date);
        } 
        catch (ParseException ex) 
        {
            System.out.println("Unexpected error during the conversion - " + ex);
        }
        return dt;
    }
    
    public static Date parseTime(String time) throws ParseException {
    	DateFormat formatter = new SimpleDateFormat("HH:mm");
    	Date result;
    	try {
			result = formatter.parse(time);			
		} catch (ParseException e) {
			result = formatter.parse("00:00");
		}
    	
    	return result;
    }
    
    public static long calculateMinDiference(Date initialDate, Date finalDate) {
    	return Math.abs(finalDate.getTime() - initialDate.getTime()) / (1000 * 60);
    }
    
    public static double calculateAverage(ArrayList<Long> marks) {
    	  Long sum = (long) 0;
    	  if(!marks.isEmpty()) {
    	    for (Long mark : marks) {
    	        sum += mark;
    	    }
    	    return sum.doubleValue() / marks.size();
    	  }
    	  return sum;
    	}

}
