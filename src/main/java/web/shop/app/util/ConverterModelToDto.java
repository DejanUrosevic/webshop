package web.shop.app.util;

import web.shop.app.dto.ActionDto;
import web.shop.app.dto.BrandDto;
import web.shop.app.dto.CategoryDto;
import web.shop.app.dto.ColorDto;
import web.shop.app.dto.ConfigurationDto;
import web.shop.app.dto.ImageDto;
import web.shop.app.dto.ProductDto;
import web.shop.app.dto.UserDto;
import web.shop.app.model.Action;
import web.shop.app.model.Brand;
import web.shop.app.model.Category;
import web.shop.app.model.Color;
import web.shop.app.model.Configuration;
import web.shop.app.model.Image;
import web.shop.app.model.Product;
import web.shop.app.model.User;

public class ConverterModelToDto {

	public static ActionDto actionToActionDto(Action action){
		
		ActionDto actionDto = new ActionDto();
		
		actionDto.setId(action.getId());
		actionDto.setDateFrom(action.getDateFrom());
		actionDto.setDateTo(action.getDateTo());
		
		for(Product product : action.getProducts()){
			actionDto.getProduct().add(productToProductDto(product));
		}
		
		return actionDto;
	}
	
	public static BrandDto brandToBrandDto(Brand brand){
		
		BrandDto brandDto = new BrandDto();
		
		brandDto.setId(brand.getId());
		brandDto.setName(brand.getName());
		
		return brandDto;
	}
	
	public static CategoryDto categoryToCategoryDto(Category category){
		
		CategoryDto categoryDto = new CategoryDto();
		
		categoryDto.setId(category.getId());
		categoryDto.setName(category.getName());
		categoryDto.setDescription(category.getDescription());
		
		for(Product product : category.getProducts()){
			categoryDto.getProducts().add(productToProductDto(product));
		}
		
		return categoryDto;
	}
	
	public static ColorDto colorToColorDto(Color color){
		
		ColorDto colorDto = new ColorDto();
		
		colorDto.setId(color.getId());
		colorDto.setName(color.getName());
		
		return colorDto;
	}
	
	public static ConfigurationDto configurationsToConfigurationsDto(Configuration configurations){
		
		ConfigurationDto configurationsDto = new ConfigurationDto();
		
		configurationsDto.setId(configurations.getId());
		configurationsDto.setField(configurations.getField());
		configurationsDto.setValue(configurations.getValue());
		
		return configurationsDto;
	}
	
	public static ImageDto imageToImageDto(Image image){
		
		ImageDto imageDto = new ImageDto();
		
		imageDto.setId(image.getId());
		imageDto.setValue(image.getValue());
		
		return imageDto;
	}
	
	public static ProductDto productToProductDto(Product product){
		
		ProductDto productDto = new ProductDto();
		
		productDto.setId(product.getId());
		productDto.setName(product.getName());
		productDto.setColor(colorToColorDto(product.getColor()));
		productDto.setPrice(product.getPrice());
		productDto.setActionPrice(product.getActionPrice());
		productDto.setBrand(brandToBrandDto(product.getBrand()));
		productDto.setQuantity(product.getQuantity());
		productDto.setAction(actionToActionDto(product.getAction()));
		
		for(Image image : product.getImages()){
			productDto.getImages().add(imageToImageDto(image));
		}
		
		return productDto;
	}
	
	public static UserDto userToUserDto(User user){
		
		UserDto userDto = new UserDto();
		
		userDto.setId(user.getId());
		userDto.setFirstname(user.getFirstname());
		userDto.setLastname(user.getLastname());
		userDto.setEmail(user.getEmail());
		userDto.setRole(user.getRole());
		userDto.setPassword(user.getPassword());
		
		return userDto;
	}
}
