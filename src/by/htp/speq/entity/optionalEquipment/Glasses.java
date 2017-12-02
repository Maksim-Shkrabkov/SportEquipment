package by.htp.speq.entity.optionalEquipment;

import by.htp.speq.entity.Category;

public class Glasses extends Accessory {
		
	private Category category;
	private int cost;
	private String colour;
	
	public Glasses() {
		
	}
	
	public Glasses(Category category, int cost, String colour) {
		super();
		this.category = category;
		this.cost = cost;
		this.colour = colour;
	}

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

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	@Override
	public String toString() {
		return "[Glasses" + "[Cost = " + this.cost + "]" + "[Colour = " + this.colour + "]" + "[Category = " + this.category + "]"
				+ "[Type = " + getType() + "]" + "[Title = " + getTitle() + "]";
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((colour == null) ? 0 : colour.hashCode());
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
		Glasses other = (Glasses) obj;
		if (category != other.category)
			return false;
		if (colour == null) {
			if (other.colour != null)
				return false;
		} else if (!colour.equals(other.colour))
			return false;
		if (cost != other.cost)
			return false;
		return true;
	}
	
	
	
}
