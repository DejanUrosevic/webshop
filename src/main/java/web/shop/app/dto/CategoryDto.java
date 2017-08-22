package web.shop.app.dto;

import java.util.ArrayList;
import java.util.List;

public class CategoryDto {

	private Integer id;
	private String name;
	private String description;
	private List<ProductDto> products = new ArrayList<ProductDto>();
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public List<ProductDto> getProducts() {
		return products;
	}
	
	public void setProducts(List<ProductDto> products) {
		this.products = products;
	}
	
	public CategoryDto(Integer id, String name, String description, List<ProductDto> products) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.products = products;
	}
	
	public CategoryDto() {
		super();
	}	
}
