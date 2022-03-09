package com.cg.exceptionhandling;
import java.util.*;
import java.util.Objects;

public class Product implements  Comparable<Product>  {
	private int ProductId;
	private String ProductName;
	private String ProductPrice;
	public Product() {
		super();
	}
	public Product(int productId, String productName, String productPrice) {
		super();
		ProductId = productId;
		ProductName = productName;
		ProductPrice = productPrice;
	}
	/**
	 * @return the productId
	 */
	public int getProductId() {
		return ProductId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		ProductId = productId;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return ProductName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		ProductName = productName;
	}
	/**
	 * @return the productPrice
	 */
	public String getProductPrice() {
		return ProductPrice;
	}
	/**
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(String productPrice) {
		ProductPrice = productPrice;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ProductId, ProductName, ProductPrice);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return ProductId == other.ProductId && Objects.equals(ProductName, other.ProductName)
				&& Objects.equals(ProductPrice, other.ProductPrice);
	}
	@Override
	public String toString() {
		return "Product [ProductId=" + ProductId + ", ProductName=" + ProductName + ", ProductPrice=" + ProductPrice
				+ "]";
	}
	Scanner sc  = new Scanner(System.in);
	//methods to access above variables
	public void readStudentDetails() {
	 try {
		System.out.println("Enter the Product data");
		System.out.println("Enter the Product id");
		ProductId = sc.nextInt();
		System.out.println("Enter the Product Name");
		sc.nextLine();//throw away the newline read by scanner
		ProductName = sc.nextLine();
		System.out.println("Enter the product Price......");
		ProductPrice =  sc.nextLine();
	 }catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	
	void displayProductDetails(){
		System.out.println("Entered the Product data ...............");
		System.out.println("Product Id = " + ProductId );
		System.out.println("Product name = " + ProductName);
		System.out.println("Product Price = " + ProductPrice);
	}
	
	
		public int compareTo(Product p) {
			
			if(this.ProductName.compareTo(p.getProductName()) == 0)
				return 0;
			else
				if(this.ProductName.compareTo(p.getProductName()) > 0)
					return 1;
				else
				    return -1;
		}
		public void readProductDetails() {
			// TODO Auto-generated method stub
			
		}}
