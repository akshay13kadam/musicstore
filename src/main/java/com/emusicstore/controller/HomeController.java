package com.emusicstore.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.emusicstore.dao.ProductDao;
import com.emusicstore.model.Product;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {

		return "home";
	}
	 ModelAndView map = null;
	@RequestMapping("/productList")
	public String getProducts(Model model) throws ClassNotFoundException {
		
		 
		ProductDao dao = new ProductDao();
		
		List<Product> products = dao.getProductList();
		//Product product = listofProduct.get(0);
		System.out.println(products);
		
//		ListIterator<Product> p=listofProduct.listIterator();
//		System.out.println("Next");
//		 while(p.hasNext()){    
//             
//		        System.out.println("index:"+p.nextIndex()+" value:"+p.next()); 
//		        
//				
//		        }    
		
		
		//model.addAttribute(product);
		model.addAttribute("products", products);
	
		return "productList";
	}
	
//	@RequestMapping("/productList/viewProduct/{productId}")
//	public String viewProduct(@PathVariable String productId,Model model ) {
//		//Product product=new Product();
//		ProductDao productDao=new ProductDao();
//		
//		System.out.println("hey dao"+productDao);
//		
//		Product product=productDao.getProductById(productId);
//		System.out.println("JJJJ"+product);
//		model.addAttribute(product);
//		
//		return "viewProduct";
//		
//		
//	}
	
	@RequestMapping("/productList/viewProduct/{productId}")
	public  String viewProdcut(Model model,@PathVariable String productId) {
		ProductDao productDao=new ProductDao();
		//productId="1";
		System.out.println("EOOR"+productId);
		
		Product product=new Product();
		 product=productDao.getProductById(productId);
	
		model.addAttribute("product",product);
		
		return "viewProduct";
	}
}
