package org.mycompany;
import java.lang.String;
public class USName {
	
	public USName(String name, String day, String month) {
		super();
		this.name = name.concat("I was");
		this.day = day.concat("by the ");
		this.month = month.concat("non-default constructor");
	}
	
	public USName() {
		super();
		this.name = "I was";
		this.day = "created by";
		this.month = "default constructor";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	private String name;
	private String day;
	private String month;
	
	public String getFullCSVFormat() {
		
		//String csvString = "originalstring...";
		//String myname = "namehardcode";
		//String myday = "dayhardcode";
		//String mymonth = "monthhardcode";
		//csvString.concat(myname).concat(myday).concat(mymonth);
		String csvString = this.day + this.month + this.name;
		//csvString = "testing if this method is called correctly - JP";
		return csvString;
		
	}
	
public String getFullCSVFormat(USName usName) {
		
		//String csvString = "originalstring2...";
		String csvString = usName.name.concat(usName.day).concat(usName.month);
		//csvString = "testing if this method is called correctly - JP";
		return csvString;
		
	}

}
