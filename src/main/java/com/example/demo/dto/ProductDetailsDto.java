package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT_DETAILS")
public class ProductDetailsDto {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long id;
	
	@Column(name="PROD_BRAND_MAP_ID")
	private Long productBrandMapping;
	
	@Column(name="COLOR")
	private String color;
	
	@Column(name="PRICE")
	private Long price;
	
	@Column(name="SIZE")
	private Long size;
	
	@Column(name="SELLER")
	private String seller;

	public ProductDetailsDto() {
		super();
	}

	public ProductDetailsDto(Long id, Long productBrandMapping, String color, Long price, Long size, String seller) {
		super();
		this.id = id;
		this.productBrandMapping = productBrandMapping;
		this.color = color;
		this.price = price;
		this.size = size;
		this.seller = seller;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProductBrandMapping() {
		return productBrandMapping;
	}

	public void setProductBrandMapping(Long productBrandMapping) {
		this.productBrandMapping = productBrandMapping;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((productBrandMapping == null) ? 0 : productBrandMapping.hashCode());
		result = prime * result + ((seller == null) ? 0 : seller.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductDetailsDto other = (ProductDetailsDto) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (productBrandMapping == null) {
			if (other.productBrandMapping != null)
				return false;
		} else if (!productBrandMapping.equals(other.productBrandMapping))
			return false;
		if (seller == null) {
			if (other.seller != null)
				return false;
		} else if (!seller.equals(other.seller))
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		return true;
	}
	
	
	
}
