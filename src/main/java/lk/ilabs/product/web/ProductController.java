package  lk.ilabs.product.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import lk.ilabs.product.model.Product;
import lk.ilabs.product.service.ProductService;

@Controller

public class ProductController {

@Autowired
	private ProductService productService;


	//	@GetMapping("/products")
	//	public String product() {
	//		return "products";
	//	}
	
	@GetMapping("/")
	public String listStudents(Model model) {
		
		model.addAttribute("products", productService.getAllProducts());
	    return "products";
	}

	@GetMapping("/products/new")
	public String createProduct(Model model) {
		
		Product product = new Product();
		model.addAttribute("product" , product);
		return "create_product";
		
		
	}
	
	@PostMapping("/products")
	public String saveProduct(@ModelAttribute("product") Product product) {
		productService.saveProduct(product);
		return "redirect:/";
		
	}
	
	@GetMapping("/products/edit/{id}")
	public String editProduct(@PathVariable Long id, Model model) {
		model.addAttribute("product", productService.getProductById(id));
		return "edit_product";
	}
	
	@PostMapping("/products/{id}")
	public String updateProduct( @PathVariable Long id, 
			@ModelAttribute("product") Product product, Model model) {
		
		
		Product existingProduct = productService.getProductById(id);
		existingProduct.setId(id);
		existingProduct.setProductName(product.getProductName());
		existingProduct.setMadeBy(product.getMadeBy());
		existingProduct.setPrice(product.getPrice());
		

		
		productService.updateProduct(existingProduct);
		return "redirect:/";
	}
	
	@GetMapping ("/products/{id}")
	public String deleteProduct(@PathVariable Long id) {
		productService.deleteProductById(id);
		return "redirect:/";
	}
}
