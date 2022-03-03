package array;
import java.util.Arrays;


public class Array2 {
	public static void main(String[]args)
	{
	int A[]= {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
	Arrays.sort(A);
	System.out.println("After Sorting:"+Arrays.toString(A));
	System.out.println("After copying out"+Arrays.toString(Arrays.copyOfRange(A,3,8)));
}
}
