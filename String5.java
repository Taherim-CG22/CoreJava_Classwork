package string;

import java.util.Scanner;

public class String5 {

	public static void main(String[] args) {

		remostr();
		
	}
		
	public static void remostr(String newstr)
	{
		Scanner s=new Scanner(System.in);
		String str;
		System.out.println("Enter the message");
		str=s.nextLine();
		String newstr =new String();
		int length=str.length();
		for(int i=0;i<str.length();i++)
		{
			char charAtPosition=str.charAt(i);
			if(str.indexOf(charAtPosition)<0)
			{
				newstr+=charAtPosition;
			}
		}
		System.out.println(newstr);
	}

}
