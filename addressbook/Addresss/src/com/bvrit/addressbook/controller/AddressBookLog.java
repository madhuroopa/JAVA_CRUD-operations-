package com.bvrit.addressbook.controller;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class AddressBookLog {
	
	protected static String logFile = "/home/mic-26/Desktop/address.txt";
	private static org.apache.log4j.Logger log = Logger.getLogger(AddressBookLog.class);
	private static Object appender;
	//private Logger logger = null;
	
	public void init() {
		log = Logger.getRootLogger();
		BasicConfigurator.configure();
		
	}
		 public static void write(String username) throws IOException {
	         write(logFile, username);
	     }
	    
	    public static void write(String logFile, String username) throws IOException {
	         TimeZone tZone = TimeZone.getTimeZone("EST"); // or PST, MID, etc ...
	         Date date = new Date();
	         DateFormat dFormat = new SimpleDateFormat("yyyy.mm.dd hh:mm:ss");
	         dFormat.setTimeZone(tZone);
	         String currentTime = dFormat.format(date);
	         
	         FileWriter fWriter = new FileWriter(logFile, true);
	         fWriter.write(currentTime + " " + username +" logged in" + "\n");
	         
	         //AddressBookLog.appender.DatePattern='yyyy-MM-dd';
	         fWriter.flush();
	         fWriter.close();
	     }
}