package web.shop.app.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActionDto {

	private Integer id;
	private Date dateFrom;
	private Date dateTo;
	private Integer value;
	private List<ProductDto> product = new ArrayList<ProductDto>();
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Date getDateFrom() {
		return dateFrom;
	}
	
	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
	
	public Date getDateTo() {
		return dateTo;
	}
	
	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}
	
	public Integer getValue() {
		return value;
	}
	
	public void setValue(Integer value) {
		this.value = value;
	}
	
	public List<ProductDto> getProduct() {
		return product;
	}
	
	public void setProduct(List<ProductDto> product) {
		this.product = product;
	}

	public ActionDto(Integer id, Date dateFrom, Date dateTo, Integer value, List<ProductDto> product) {
		super();
		this.id = id;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.value = value;
		this.product = product;
	}

	public ActionDto() {
		super();
	}
}
