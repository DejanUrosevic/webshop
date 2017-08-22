package web.shop.app.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import web.shop.app.model.Image;

public class ProductDto {

	private Integer id;
	private String name;
	private BigDecimal price;
	private BigDecimal actionPrice;
	private Integer quantity;
	private List<ImageDto> images = new ArrayList<ImageDto>();
	private ColorDto color;
	private BrandDto brand;
	private ActionDto action;
	
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
	
	public BigDecimal getPrice() {
		return price;
	}
	
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	public BigDecimal getActionPrice() {
		return actionPrice;
	}
	
	public void setActionPrice(BigDecimal actionPrice) {
		this.actionPrice = actionPrice;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public List<ImageDto> getImages() {
		return images;
	}
	
	public void setImages(List<ImageDto> images) {
		this.images = images;
	}
	
	public ColorDto getColor() {
		return color;
	}
	
	public void setColor(ColorDto color) {
		this.color = color;
	}
	
	public BrandDto getBrand() {
		return brand;
	}
	
	public void setBrand(BrandDto brand) {
		this.brand = brand;
	}
	
	public ActionDto getAction() {
		return action;
	}
	
	public void setAction(ActionDto action) {
		this.action = action;
	}

	public ProductDto(Integer id, String name, BigDecimal price, BigDecimal actionPrice, Integer quantity,
			List<ImageDto> images, ColorDto color, BrandDto brand, ActionDto action) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.actionPrice = actionPrice;
		this.quantity = quantity;
		this.images = images;
		this.color = color;
		this.brand = brand;
		this.action = action;
	}

	public ProductDto() {
		super();
	}
}
