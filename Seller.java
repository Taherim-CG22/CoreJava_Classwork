package Demo;
import java.util.Scanner;
public class Seller {
	int SellerId;
	String Name;
	void redSellerDetails()
	{   Scanner input=new Scanner(System.in);
		System.out.println("Enter the seller details");
		System.err.println("Enter the sellerId....");
		SellerId=input.nextInt();
		System.err.println("Enter the sellerName....");
		Name=input.next();
	}
void printSellerDetails()
{
	System.out.println("Seller id:"+SellerId);
	System.out.println("Seller Name:"+Name);

	
	}
}
