package string;
import java.util.Scanner;

public class String4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char maxchar=' ';
		int i,max=-1;
		int charfreq=new int[500];
				System.out.println("Enter the String");
				String str=s.nextLine();
				
				for(int i=0;i<str.length;i++)
				{
					charfreq[str.charAt(i)++;
				}
				for(int j=0;i<str.length;j++)
				{
					char ch=str.chatAt(j);
					if(max<charfreq([ch])
					{
						max=charfreq[ch];
						maxchar=ch;
					}
				}
				System.out.println(maxchar);
		

	}

}
