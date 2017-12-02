package by.htp.speq.entity;

public class Skiing extends Equipment{
	
	private Category category;
	private int cost;
	private String brand;
	
	//Constructors
	
	public Skiing() {
		
	}
	
	public Skiing(Category category, int cost, String brand, String title) {
		super(title);
		this.category = category;
		this.cost = cost;
		this.brand = brand;
	}
	
	//Getters and setters

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	//methods
	
	public int getCostOfEquipment() {
		return this.cost;
	}
	
	//toString
	
	@Override
	public String toString() {
		return "Skiing [Category = " + this.category + "]" +  "[Cost = " + this.cost + "]" 
				+ "[Brand = " + this.brand + "]" + "Title = " + getTitle() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + cost;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Skiing other = (Skiing) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (category != other.category)
			return false;
		if (cost != other.cost)
			return false;
		return true;
	}
	
	

}
