package by.htp.speq.entity;

public class Kayak extends Equipment {
	
	private Category category;
	private int cost;
	private int countOfpaddles;
	
	//Constructors
	
	public Kayak() {
		
	}
	
	public Kayak(Category category, int cost, int countOfpaddles, String title) {
		super(title);
		this.category = category;
		this.cost = cost;
		this.countOfpaddles = countOfpaddles;
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

	public int getCountOfpaddles() {
		return countOfpaddles;
	}

	public void setCountOfpaddles(int countOfpaddles) {
		this.countOfpaddles = countOfpaddles;
	}
	
	//methods
	
	public int getCostOfEquipment() {
		return this.cost;
	}
	
	//toString
	
	@Override
	public String toString() {
		return "Kayak [Category = " + this.category + "]" +  "[Cost = " + this.cost + "]" 
				+ "[CountOfpaddles = " + this.countOfpaddles + "]" + "[Title = " + getTitle() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + cost;
		result = prime * result + countOfpaddles;
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
		Kayak other = (Kayak) obj;
		if (category != other.category)
			return false;
		if (cost != other.cost)
			return false;
		if (countOfpaddles != other.countOfpaddles)
			return false;
		return true;
	}
	
	
	
	
	

}
