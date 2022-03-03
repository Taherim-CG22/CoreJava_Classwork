package array;
import java.util.Arrays;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int Size=s.nextInt();
		System.out.println("Enter the element of Array");
		int myArray[]=new int[Size];
		for(int i=0;i<Size;i++)
		{
			myArray[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(myArray));
		int[] myArray1=Arrays.copyOfRange(myArray, 0, myArray.length/2);
		int [] myArray2=Arrays.copyOfRange(myArray,myArray.length/2,myArray.length);
		System.out.println(Arrays.toString(myArray1));
		System.out.println(Arrays.toString(myArray2));

		}
		
	}


