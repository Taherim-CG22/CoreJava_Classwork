package string;
import java.util.Scanner;

public interface String2 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		String str;
		System.out.println("Enter the message");
		str=s.nextLine();
		int count=0;
		String word[]=str.split(" ");
		for(String w: word)
		{
			System.out.println(w);
			count++;
		}
		System.out.println("the count is:"+count);
	}

}
