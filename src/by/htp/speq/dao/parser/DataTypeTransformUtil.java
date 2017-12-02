package by.htp.speq.dao.parser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTypeTransformUtil {
	
	public static int convertID(String id) {
		
		int idInt = 0;
		
			try {
				idInt =Integer.parseInt(id);
			} catch(NumberFormatException e) {
				System.out.println("wrong value for id");
				e.printStackTrace();
			}
		
		return idInt;
	}
	
	public static double convertPrice(String price){
		double priceDouble = 0;
		
		try {
			priceDouble = Double.parseDouble(price);
		} catch(NumberFormatException e) {
			System.out.println("wrong value for price");
			e.printStackTrace();
		}
		
		return priceDouble;
	}
	
	public static int convertCost(String price){
		int priceInt = 0;
		
		try {
			priceInt = Integer.parseInt(price);
		} catch(NumberFormatException e) {
			System.out.println("wrong value for cost");
			e.printStackTrace();
		}
		
		return priceInt;
	}
	
	public static int convertCountOfWheels(String countOfWheels){
		int countOfWheelsInt = 0;
		
		try {
			countOfWheelsInt = Integer.parseInt(countOfWheels);
		} catch(NumberFormatException e) {
			System.out.println("wrong value for countOfWheels");
			e.printStackTrace();
		}
		
		return countOfWheelsInt;
	}
	
	public static int convertCountOfPaddles(String countOfPaddles){
		int countOfPaddlesInt = 0;
		
		try {
			countOfPaddlesInt = Integer.parseInt(countOfPaddles);
		} catch(NumberFormatException e) {
			System.out.println("wrong value for countOfWheels");
			e.printStackTrace();
		}
		
		return countOfPaddlesInt;
	}
	
	
	
	
	
	public static Date convertData(String dateString){
		
		Date date = null;
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
			date = sdf.parse(dateString);
		} catch(ParseException e) {
			System.out.println("wrong value for date");
			e.printStackTrace();
		}
		
		return date;
	}

}
