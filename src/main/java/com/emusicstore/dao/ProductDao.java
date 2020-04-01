package com.emusicstore.dao;

import java.util.ArrayList;
import java.util.List;

import com.emusicstore.model.Product;

public class ProductDao {

	private List<Product> productList;
	
	
	public List<Product> getProductList(){
		
		Product product1=new Product();
		product1.setProductId("1");
		product1.setProductName("Guitar");
		product1.setProductCategory("Instrument");
		product1.setProductDescription("Music Instrument");
		product1.setProdutPrice(2000.10);
		product1.setProductCandition("New");
		product1.setProductStatus("Active");
		product1.setProductManufacturer("Yamaha");
		product1.setUnitInStock(2);
		
Product product2=new Product();
		product2.setProductId("2");
		product2.setProductName("Violine");
		product2.setProductCategory("Instrument");
		product2.setProductDescription("Music Instrument");
		product2.setProdutPrice(5000);
		product2.setProductCandition("New");
		product2.setProductStatus("Active");
		product2.setProductManufacturer("Yamaha");
		product2.setUnitInStock(3);
		
		
Product product3=new Product();
		product3.setProductId("3");
		product3.setProductName("Tabla");
		product3.setProductCategory("Instrument");
		product3.setProductDescription("Music Instrument");
		product3.setProdutPrice(2000);
		product3.setProductCandition("New");
		product3.setProductStatus("Active");
		product3.setProductManufacturer("Yamaha");
		product3.setUnitInStock(10);
		
		
		productList=new ArrayList<Product>();
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		
		
		
		
		return productList;
		
		
	}


	public Product getProductById(String productId) {
		for (Product product : getProductList()) {
			
			System.out.println("List of product"+product);
			return product;
		}
		return null;
	
		
		
	}


}
