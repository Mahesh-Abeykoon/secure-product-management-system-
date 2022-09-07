package lk.ilabs.product.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "products")


public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="product_name", nullable = false)
	private String productName;
	
	@Column(name = "made_by")
	private String madeBy;
	
	@Column(name = "price")
	private double price;

	public long getId() {
		return id;
	}

	public Product() {
		
	}
	public Product(long id, String productName, String madeBy, double price) {
		this.id = id;
		this.productName = productName;
		this.madeBy = madeBy;
		this.price = price;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
