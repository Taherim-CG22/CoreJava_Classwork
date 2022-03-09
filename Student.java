package com.cg.taherimcollectionmap;

import java.util.Objects;

class Student{
	private int StudentMark;
	private String StudentName;
	public Student() {
		super();
	}
	public Student(int studentMark, String studentName) {
		super();
		StudentMark = studentMark;
		StudentName = studentName;
	}
	/**
	 * @return the studentMark
	 */
	public int getStudentMark() {
		return StudentMark;
	}
	/**
	 * @param studentMark the studentMark to set
	 */
	public void setStudentMark(int studentMark) {
		StudentMark = studentMark;
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return StudentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(StudentMark, StudentName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return StudentMark == other.StudentMark && Objects.equals(StudentName, other.StudentName);
	}
	@Override
	public String toString() {
		return "Student [StudentMark=" + StudentMark + ", StudentName=" + StudentName + "]";
	}
	


}
