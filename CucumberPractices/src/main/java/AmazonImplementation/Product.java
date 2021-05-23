package AmazonImplementation;

import java.util.ArrayList;
import java.util.List;

public class Product {

	String productName;
	int price;
	
	public Product(String productName, int Price) {
		this.productName = productName;
		this.price = Price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public List<String> getProductList(){
		List<String> productlist=new ArrayList<>();
		productlist.add("Apple MacBook Pro");
		productlist.add("Apple MacBook Air");
		productlist.add("Apple Iphone 11");
		return productlist;
		
		
	}
	
}
