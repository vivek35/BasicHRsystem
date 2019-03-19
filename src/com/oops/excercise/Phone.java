package com.oops.excercise;

public class Phone{
	private int areacode;
	private int number;
	private int countrycode;
	
	public void setPhone(int areacode,int number, int countrycode) {
		this.areacode=areacode;
		this.countrycode=countrycode;
		this.number= number;
	}
	public String getPhone() {
		String phone=areacode+""+number+""+countrycode;
		return phone;
	}
}
