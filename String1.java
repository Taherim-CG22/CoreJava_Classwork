package string;
import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		String message;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the message");
		message=s.nextLine();
		 int count=0;
	        String[] word=message.split(" ");
	        for(String w:word)
	        {
	            System.out.println( w );
	            count++;
	        }
	        System.out.println("the count of total word is:" + count);
	      
	 
	    }
	}
		
		
