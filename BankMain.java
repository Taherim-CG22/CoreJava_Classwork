package com.cg;

public class BankMain {

	public static void main(String[] args) {
SBI s=new SBI();
ICICI i=new ICICI();
Axis a=new Axis();
System.out.println("Rate of intrest of SBI is:"+s.getRateOfIntrest());
System.out.println("Rate of intrest of ICIC is:"+i.getRateOfIntrest());
System.out.println("Rate of intrest of Axis is:"+a.getRateOfIntrest());


	}

}
