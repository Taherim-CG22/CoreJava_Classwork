package com.cg.taherimcollectionmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeDetails {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,Employee1> empDetails=new HashMap<Integer,Employee1>();
		
		Employee1 emp1=new Employee1("Sana","Manager",25,20000);
		Employee1 emp2=new Employee1("Sona","CEO",27,50000);
		Employee1 emp3=new Employee1("Alfi","Analyst",22,20000);
		Employee1 emp4=new Employee1("Komal","Manager",35,40000);
		Employee1 emp5=new Employee1("Tahreem","ITsuport",25,30000);
		
	    empDetails.put(1, emp1);
		empDetails.put(2, emp2);
		empDetails.put(3, emp3);
		 empDetails.put(4, emp4);
		 empDetails.put(5, emp5);
		System.out.println("The emplyee details are .....");
		System.out.println(empDetails);
		
	Set<Integer> empDetails_key=empDetails.keySet();
		
		System.out.println("Employee key  are....");
		
		for(Integer i:empDetails_key )
		{
			System.out.println(i);
			
		}
		
		Collection<Employee1> empDetails_Values = empDetails.values();
		float sum=0;
		int age=0;
		for(Employee1 i:empDetails_Values ) {
			System.out.println(i.getSalary());
			System.out.println(i.getAge());
			 sum += i.getSalary(); 
			 age += i.getAge();
		}
		System.out.println("Sum of all Employee salary:= "+sum);
		System.out.println("===================================");
		System.out.println("The average age of all Employee:= "+age/empDetails_Values.size());
		System.out.println("===================================");

		
		System.out.println("The average of salary of all Employee is: = "+sum/ empDetails_Values.size());
		System.out.println("===================================");

		
	    TreeSet<Integer> empAge = new TreeSet<Integer>();
	    for(Employee1 emp: empDetails_Values)
	    {
	    	empAge.add(emp.getAge());
	    }
	    System.out.println("Highest Age is = "+empAge.last() );
		System.out.println("===================================");

	    
	    TreeSet<Float> empSalary = new TreeSet<Float>();
	    for(Employee1 emp: empDetails_Values)
	    {
	    	empSalary.add( emp.getSalary()) ;
	    }
	    System.out.println("Highest Salary is = "+empSalary.last() );
		System.out.println("===================================");

	    
	    System.out.println(" After Sorting employee Name .....");
	    TreeSet<String> empName = new TreeSet<String>();
	    for(Employee1 emp: empDetails_Values)
	    {
	    	empName.add(emp.getEmpName());
	    	
	    }
	    for(String empNames: empName)
	    {
	    	System.out.println(empName);
	    }
		System.out.println("===================================");

	    System.out.println("Sorting employee Department .....");
	    TreeSet<String> empDept = new TreeSet<String>();
	    for(Employee1 emp: empDetails_Values)
	    {
	    	empDept.add(emp.getEmpDesg());
	    	
	    }
	    for(String employeeDep: empDept)
	    {
	    	System.out.println(empDept);
	    }
		System.out.println("===================================");

	    
	    System.out.println("finding the employee details with CEO designation .....");
	    
	    ArrayList<String> arr=new ArrayList<String>();
	    for(Employee1 emp:empDetails_Values)
	    {
	    	arr.add(emp.getEmpDesg());
	    }
	    int count=0;
	    for(String employeeDep:arr)
	    {
	    	if(employeeDep.equalsIgnoreCase("CEO"))
	    	{
	    		count++;
	    	}
	    }
	    System.out.println("the no count of CEO is:"+count);
	   
	}
	


	}

