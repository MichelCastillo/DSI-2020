package com.dsi.builder.back;

import java.text.SimpleDateFormat;
import java.util.Date;
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

}
