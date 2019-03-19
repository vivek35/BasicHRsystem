package com.oops.excercise;

import java.util.*;
public class Fulltime extends Employee{
	private String datetimeStarts;
	private float basesalaryPerYear;
	private float bonusPerYear;
	ArrayList<String> fulltime_details=new ArrayList<String>();
	
	public Fulltime(String datetimeStarts, float basesalaryPerYear, float bonusPerYear){
		
		this.datetimeStarts = datetimeStarts;
		this.basesalaryPerYear=basesalaryPerYear;
		this.bonusPerYear=bonusPerYear;
	}
	
	public List<String> getFulltime() {
		fulltime_details.add(datetimeStarts);
		fulltime_details.add(String.valueOf(basesalaryPerYear));
		fulltime_details.add(String.valueOf(bonusPerYear));	
		return fulltime_details;
	}
	
}
