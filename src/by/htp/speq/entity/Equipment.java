package by.htp.speq.entity;

public class Equipment {
	
	private String title;
	
	//Constructors
	
	public Equipment() {
		super();
	}
	
	public Equipment(String title) {
		super();
		this.title = title;
	}
	
	//Getters and setters

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	//methods
	
	public int getCostOfEquipment() {
		return 0;
	}
	
	@Override
	public String toString() {
		return "Equipment [title=" + title + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipment other = (Equipment) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	

}
