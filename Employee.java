package com.cg.taherimcollectionmap;

import java.util.Objects;

public class Employee {
	private int empid;
	private String EmpName;
	public Employee() {
		super();
	}
	public Employee(int empid, String empName) {
		super();
		this.empid = empid;
		EmpName = empName;
	}
	/**
	 * @return the empid
	 */
	public int getEmpid() {
		return empid;
	}
	/**
	 * @param empid the empid to set
	 */
	public void setEmpid(int empid) {
		this.empid = empid;
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
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", EmpName=" + EmpName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(EmpName, empid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(EmpName, other.EmpName) && empid == other.empid;
	}
	

}
