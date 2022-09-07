package lk.ilabs.product.service;

import java.util.List;

import lk.ilabs.product.model.Product;

public interface ProductService {

	List<Product> getAllProducts();
	
	Product saveProduct(Product product);
	
	Product getProductById(Long id);
	
	Product updateProduct(Product product);
	
	Product deleteProductById(Long id);
}
