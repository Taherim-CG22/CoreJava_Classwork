package array;
import java.util.Scanner;
import java.util.Arrays;


public class Arrays3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int A[]=new int[20];
		int pos=0;
		int neg=0;
		int odd=0;
		int even=0;
		int zero=0;
		for ( int i=0;i<A.length;i++)
		{
			System.out.println("Enter the value of A["+i+"]");
			A[i]=s.nextInt();
			if(A[i]>0)
				pos++;
			
			if(A[i]<0)
				neg++;
			
			if(A[i]==0)
				zero++;
			
		if(A[i]%2==0)
				even++;
				
			if(A[i]%2!=0)
			{
				odd++;
				}
		}
		System.out.println(pos);
		System.out.println(neg);
		System.out.println(odd);
		System.out.println(even);
		System.out.println(zero);

		}
		
	}


