package com.cg.exceptionhandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CheckExpection3 {
	
	static void writebuffer() throws IOException{
		
		BufferedWriter b =new BufferedWriter(new FileWriter("Lorem.txt"));
       b.write("What is Lorem Ipsum?\r\n"
       		+ "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.\r\n"
       		+ " ");
      
}
public static void main(String[]args) throws IOException
{
	writebuffer();

	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String st=s.nextLine();
		st.toLowerCase();
		int count=0;
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)=='a'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u'||st.charAt(i)=='e')
			{
				count++;
			}
			else {
				
			}
			
		}
		System.out.println("Count of vowels are: "+count);
	}

	
	}

