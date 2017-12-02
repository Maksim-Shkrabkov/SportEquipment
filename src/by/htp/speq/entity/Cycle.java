package by.htp.speq.entity;

public class Cycle extends Equipment {
	
	private Category category;
	private int cost;
	private int countOfWheels;
	
	//Constructors
	
	public Cycle() {
		
	}
	
	public Cycle(Category category, int cost, int countOfWheels, String title) {
		super(title);
		this.category = category;
		this.cost = cost;
		this.countOfWheels = countOfWheels;
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
	public int getCountOfWheels() {
		return countOfWheels;
	}
	public void setCountOfWheels(int countOfWheels) {
		this.countOfWheels = countOfWheels;
	}
	
	//methods
	
	public int getCostOfEquipment() {
		return this.cost;
	}
	
	//toString
	
	@Override
	public String toString() {
		return "Cycle [Category = " + this.category + "]" +  "[Cost = " + this.cost + "]"
				+ "[CountOfWheels = " + this.countOfWheels + "]" + "[Title = " + getTitle() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + cost;
		result = prime * result + countOfWheels;
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
		Cycle other = (Cycle) obj;
		if (category != other.category)
			return false;
		if (cost != other.cost)
			return false;
		if (countOfWheels != other.countOfWheels)
			return false;
		return true;
	}
	
	

}
