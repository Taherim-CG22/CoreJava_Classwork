package array;
import java.util.*;

public class Array4 {

	public static void main(String[] args) {
  int []x= {1,1,4,4,5,6};
  boolean d=true;
  int y=x.length-1;
  for (int i=0;i<x.length/2;i++)
  {
	  if(x[i]!=x[y]) {
		  d=false;
		  break;
	  }
	  else
		  y--;
  }
	System.out.println(d);	  
	}

}
