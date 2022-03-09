package com.cg.taherimcollectionmap;

import java.util.Objects;

public class Employee1 {
	private  String EmpName;
	private String EmpDesg;
	private int age;
	private float Salary;
	
	public Employee1() {
		super();
	}

	public Employee1(String empName, String empDesg, int age, float salary) {
		super();
		EmpName = empName;
		EmpDesg = empDesg;
		this.age = age;
		Salary = salary;
	}
	

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return EmpName;
	}

	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		EmpName = empName;
	}

	/**
	 * @return the empDesg
	 */
	public String getEmpDesg() {
		return EmpDesg;
	}

	/**
	 * @param empDesg the empDesg to set
	 */
	public void setEmpDesg(String empDesg) {
		EmpDesg = empDesg;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the salary
	 */
	public Float getSalary() {
		return Salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		Salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(EmpDesg, EmpName, Salary, age);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		return Objects.equals(EmpDesg, other.EmpDesg) && Objects.equals(EmpName, other.EmpName)
				&& Salary == other.Salary && age == other.age;
	}

	@Override
	public String toString() {
		return "Employee1 [EmpName=" + EmpName + ", EmpDesg=" + EmpDesg + ", age=" + age + ", Salary=" + Salary + "]";
	}
	
	
	

}
