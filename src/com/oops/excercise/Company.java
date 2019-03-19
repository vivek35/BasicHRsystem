package com.oops.excercise;
import java.util.*;
import java.io.*;
public class Company{
	private int ID;
	private int contract;
	private List<String> employee;
	
	private static HashMap<Integer, List<String>> hmap= new HashMap<Integer, List<String>>();
	public void setCompany(int ID, List<String> employee){
		this.ID=ID;
		this.employee = employee;
		hmap.put(this.ID,this.employee);
	}
	
	public int deleteByID(int id) {
		hmap.remove(id);
		return 1;
	}
	public List<String> getEmployee() {
		return employee;
	}
	public List<String> searchByID(int id) {
		int gg=id;
		return hmap.get(gg);
	}
	public ArrayList<String> searchByFirstName(String name) {
		ArrayList<String> data=new ArrayList<String>();
		String efname=name;
		if(hmap.isEmpty()) {
			return data;
		}else {
			System.out.println("2");
		    Iterator it = hmap.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        System.out.println(pair.getKey() + " = " + pair.getValue());
		       ArrayList<String> list_data = (ArrayList)pair.getValue();
		        String ftname = list_data.get(1);	   
		        System.out.println("FT: "+ftname);
		        it.remove(); // avoids a ConcurrentModificationException
		        if((ftname).equals(efname)) {
		        	return list_data;
		        }else {
		        	return data;
		        }
		        
		    }
		    return data;
		}
		
	}
	public ArrayList<String> searchByLastName(String name) {
		ArrayList<String> ldata=new ArrayList<String>();
		String lname=name;
		if(hmap.isEmpty()) {
			return ldata;
		}else {
			System.out.println("2");
		    Iterator it = hmap.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        System.out.println(pair.getKey() + " = " + pair.getValue());
		       ArrayList<String> llist_data = (ArrayList)pair.getValue();
		        String ltname = llist_data.get(2);	   
		        System.out.println("FT: "+ltname);
		        it.remove(); // avoids a ConcurrentModificationException
		        if((ltname).equals(lname)) {
		        	return llist_data;
		        }else {
		        	return ldata;
		        }
		        
		    }
		    return ldata;
		}
		
	}
}
