package web.shop.app.dto;

public class ImageDto {

	private Integer id;
	private String value;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}

	public ImageDto(Integer id, String value) {
		super();
		this.id = id;
		this.value = value;
	}

	public ImageDto() {
		super();
	}	
}
