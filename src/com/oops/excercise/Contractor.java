package com.oops.excercise;

import java.util.*;
public class Contractor extends Employee{
	private String dateTimeStarts;
	private String dateTimeEnds;
	private float hourlyRate;
	ArrayList<String> contract_details=new ArrayList<String>();
	
	
	public Contractor(String dateTimeStarts,String dateTimeEnds,float hourlyRate) {
		this.dateTimeStarts=dateTimeStarts;
		this.dateTimeEnds=dateTimeEnds;
		this.hourlyRate=hourlyRate;
	}

	public ArrayList<String> getContract() {
		contract_details.add(dateTimeStarts);
		contract_details.add(dateTimeEnds);
		contract_details.add(String.valueOf(hourlyRate));
		return contract_details;
	}
}
