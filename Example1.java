package com.cg.taherimcollectionmap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<Integer,String> empDetails= new  HashMap<Integer,String>();
       empDetails.put(124, "sana");
       System.out.println(empDetails);
       empDetails.put(160, "Hina");
       System.out.println(empDetails);
       HashMap<Integer,Employee> empData= new  HashMap<Integer,Employee>();
       Employee emp1=new Employee(104,"rama");
       Employee emp2=new Employee(105,"ramu");
       Employee emp3=new Employee(106,"renu");
       empData.put(1,emp1);
       empData.put(2,emp2);
       empData.put(3,emp3);
       System.out.println("===================================");
       System.out.println(empData);
       Set<Integer> empDetails_key=empDetails.keySet(); 
       System.out.println("emoDetails key is ...... ");
       for(Integer i:empDetails_key)
       {
    	   System.out.println(i);
       }
       
       Collection<String> empDetails_value=empDetails.values();
       System.out.println("empDetails_value is ................");
       for(String i:empDetails_value)
    	   System.out.println(i);

       Collection<Entry<Integer,String>> empDetails_EntrySet=empDetails.entrySet();
       System.out.println("empDetails_entry......");
       for(Entry<Integer,String> i:empDetails_EntrySet)
    	   System.out.println(i);
       
     
	}
	}