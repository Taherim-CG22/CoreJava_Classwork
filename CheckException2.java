package com.cg.exceptionhandling;
import java.util.Scanner;

public class CheckException2 {
	public static int arr[]= new int[3];
	static Scanner s=new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("Enter the array element");
		for(int i=0;i<=3;i++)
		{
			arr[i]=s.nextInt();
			
			
		}
	}

}
