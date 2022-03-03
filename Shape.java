package com.cg;
import java.util.Scanner;
public abstract class Shape {
	public int length;
	public int breadth;
	Scanner s=new Scanner(System.in);
	public abstract void calculateArea();
	
   public abstract  void calculatePiremter();
   public void readDimension()
   {
	   System.out.println("Enter the length");
	   length=s.nextInt();
	   System.out.println("Enter the breadth");
	   breadth=s.nextInt();
   }
}


