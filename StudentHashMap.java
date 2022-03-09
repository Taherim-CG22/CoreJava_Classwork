package com.cg.taherimcollectionmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class StudentHashMap {

	public static void main(String args[])
	{
	HashMap<String,Float> studentDetails=new HashMap<String,Float>();
	studentDetails.put("Sana", 80f);
	studentDetails.put("Taherim", 90f);
	studentDetails.put("Rama", 95f);
	studentDetails.put("Zoya", 80f);
	studentDetails.put("Sona", 92f);
	
	Set<String> studentDetails_key=studentDetails.keySet(); 
    System.out.println("studentDetails key is ...... ");
    for(String s:studentDetails_key)
    {
 	   System.out.println(s);
    }
    Collection<Float> studentDetails_value=studentDetails.values();
    System.out.println("studentDetails_value is ................");
    for(Float f:studentDetails_value)
 	   System.out.println(f);
    
    System.out.println("======================");
    Collection<Entry<String,Float>> studentDetails_EntrySet=studentDetails.entrySet();
    System.out.println("studentDetails_entry......");
    for(Entry<String,Float> i:studentDetails_EntrySet)
 	   System.out.println(i);
    System.out.println("========================");
    System.out.println("After Sorting..........");

    TreeMap<String,Float> treeMap=new TreeMap<String,Float>(studentDetails);
    for(Entry<String, Float> entry:treeMap.entrySet())
    {
    	System.out.println(entry.getKey());
    }
    
    
    Collection<Float> studentMarks = studentDetails.values();
	float sum = 0.0f;
	
    
    for(Float marks:studentMarks)
    {
    	sum=sum+marks;
    }
    System.out.println("Sum of the all studentsMarks is:"+sum);
    TreeSet<Float> sorted = new TreeSet<Float>();
    sorted.addAll(studentMarks);
    System.out.println("Maxi marks:"+(sorted.last()));
    
    
    Float avg=sum/studentMarks.size();
    System.out.println("Avrage of all the studentMarks is:"+avg);
    studentDetails.clear();
    
    System.out.println(studentDetails);
    
   
    
    
    }
	












}
