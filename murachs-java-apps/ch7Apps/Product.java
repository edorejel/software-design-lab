package murachsJavaProg.ch7Apps;

import java.text.NumberFormat;

public class Product {
	
	//instance variables
	private String code;
	private String description;
	private double price;
	
	public Product() {
		code = ".";
		description = "";
		price = 0;
	}
	
	//set and get methods for the code variable
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
	
	//set and get methods for the description variable
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	//the set and get methods for the price variable
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getFormattedPrice() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(price);
	}
	
}
