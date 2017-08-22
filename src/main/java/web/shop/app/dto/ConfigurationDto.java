package web.shop.app.dto;

public class ConfigurationDto {

	private Integer id;
	private String field;
	private String value;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getField() {
		return field;
	}
	
	public void setField(String field) {
		this.field = field;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}

	public ConfigurationDto(Integer id, String field, String value) {
		super();
		this.id = id;
		this.field = field;
		this.value = value;
	}

	public ConfigurationDto() {
		super();
	}	
}
