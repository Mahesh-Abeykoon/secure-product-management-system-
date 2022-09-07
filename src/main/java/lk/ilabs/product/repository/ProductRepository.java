package lk.ilabs.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import lk.ilabs.product.model.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
