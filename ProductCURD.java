package com.cg.exceptionhandling;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;





public class ProductCURD {
	
	ArrayList<Product> listOfProduct = new ArrayList<Product>();
Product product;
	int noOfProduct;
	Scanner sc = new Scanner(System.in);
	char ch = 'y';
	
	public void menu()  {

	try {
		while (ch == 'y') {

			System.out.println("Enter the choice .....");
			System.out.println("add : to add Product in the array");
			System.out.println("update:to update Product in the array");
			System.out.println("delete:to delete Product in the array");
			System.out.println("display: to display all Product");
			System.out.println("search: to search for a Product");
			System.out.println("sort: to sort the Product list");
			sc.nextLine();
			String choice = sc.nextLine();
			switch (choice) {
			case "add":
				addProduct();
				break;
			case "update":
				updateProduct();
				break;
			case "delete":
				deleteProductUsingSearch();
				break;
			case "display":
				displayProduct();
				break;
			case "search":
				searchProduct();
				break;
			case "sort" :
				sortProduct();
				break;
			default:
				System.out.println("Not a proper choice");
				break;
			}

			System.out.println("do you want to continue....");
			System.out.println("Enter 'y' to continue ......");
			ch = sc.next().charAt(0);

		} // while close
  }//try close
	catch (Exception e) {
		e.printStackTrace();
	}
}

	private void sortProduct() {
		Collections.sort(listOfProduct);
		displayProduct();
	}

	private Product searchProduct() {
		System.out.println("Enter the Product details to search...");
		System.out.println("Enter the Product id to search...");
		int pId = sc.nextInt();
		for (int i = 0; i < listOfProduct.size(); i++) {
			if(listOfProduct.get(i).getProductId() == pId) {
				product= listOfProduct.get(i);
				System.out.println("Product Id" + "\t" + "Product Name" + "\t" + "Product Price");
				System.out.println(listOfProduct.get(i).getProductId() + "\t\t" +listOfProduct.get(i).getProductName() + "\t\t" +listOfProduct.get(i).getProductPrice() );
			}
		}
		return product;
	}

	private void displayProduct() {
		System.out.println("Product details to display.....");
		// display the student data
		System.out.println("Product Id" + "\t" + "Product Name" + "\t" + "Product Price");
		for (int i = 0; i < listOfProduct.size(); i++) {	
			System.out.println(listOfProduct.get(i).getProductId() + "\t\t" +listOfProduct.get(i).getProductName()+"\t\t"+listOfProduct.get(i).getProductId() );
		}
		
	}

	
	@SuppressWarnings("unused")
	private void deleteProduct() {
		System.out.println("Enter the student details to delete");
		System.out.println("Enter the student id to delete");
		int pId = sc.nextInt();
	
		for (int i = 0; i < listOfProduct.size(); i++) {
			if(listOfProduct.get(i).getProductId() == pId) {
				Product p = listOfProduct.get(i);
				System.out.println(p);
				if(listOfProduct.remove(p)) {
					System.out.println("Product removed successfully");
				}else {
					System.out.println("Product Not removed");
				}
				
			}
		}
		
		}
	private void deleteProductUsingSearch(){
		
		product = searchProduct();
				 if(listOfProduct.remove(product)) {
					System.out.println("product removed successfully");
				}else {
					System.out.println("product Not removed");
				}
				
		}


	private void updateProduct() {
		Product product1 = searchProduct();
		if(product!= null) {
			System.out.println("Enter the details to Modify .......");
			product1.readStudentDetails();
			
		}
		
		
	}

	private void addProduct() {
		System.out.println("Enter the number ofProduct");
		noOfProduct = sc.nextInt();
		System.out.println("Enter the product details");
				
		for (int i = 0; i < noOfProduct; i++) {
			product = new Product();
			product.readStudentDetails();
			System.out.println(product);
			listOfProduct.add(product);
			System.out.println(listOfProduct);
		}
		
	}


}



