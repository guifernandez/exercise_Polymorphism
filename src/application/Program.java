package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of products:");
	int n = sc.nextInt();
	List<Product> listProduct = new ArrayList<>();
	for (int i = 0; i < n; i++) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Product #" + (i+1) + " data:");
		System.out.println("Comoon, imported or used? (1/2/3)");
		int cui = sc.nextInt();
		if(cui ==1) {
			System.out.println("Name:");
			String name = sc.next();
			System.out.println("Price:");
			double price = sc.nextDouble();
			Product comoon = new Product(name, price);
			listProduct.add(comoon);
	
		}else if(cui ==2) {
			System.out.println("Name:");
			String name = sc.next();
			System.out.println("Price:");
			double price = sc.nextDouble();
			System.out.println("Customs fee: ");
			double customFee = sc.nextDouble();
			Product imported = new ImportedProduct(name, price, customFee);
			listProduct.add(imported);
			
		}else {
			System.out.println("Name:");
			String name = sc.next();
			System.out.println("Price:");
			double price = sc.nextDouble();
			System.out.println("Manufacture date (DD/MM/YYYY):");
			LocalDate manufacture = LocalDate.parse(sc.next(),fmt1);
			Product used = new UsedProduct(name, price, manufacture);
			listProduct.add(used);
		}
		
	}
	System.out.println("PRICE TAGS:");
	for(Product p: listProduct) {
		System.out.println(p.priceTag());
	}
	
	
	
	
	sc.close();

	}

}
