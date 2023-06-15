package main;

public class Item {
	protected String name;
	protected String category;
	protected int price;
	
	//constructor with arguments
	public Item(String itemName, String itemCategory, int itemPrice) {
		this.name = itemName;
		this.category = itemCategory;
		this.price = itemPrice;
	}
	
	//getters and setters
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int itemPrice) {
		this.price = itemPrice;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String itemName) {
		this.name = itemName;
	}
	
	public String getCategory() {
		return this.category;
	}
	
	public void setCategory(String itemCategory) {
		this.category = itemCategory;
	}
}
