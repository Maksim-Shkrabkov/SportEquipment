package by.htp.speq.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {
	
	private int id;
	private String name;
	private int hours;
	private int costOfEquipment;
	private List<RentUnit> rentUnits;
	
	{
		rentUnits = new ArrayList<>();
	}
	
	//Constructors
	
	public Client() {
		
	}
	
	public Client(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public Client(int id, String name, int hours, int costOfEquipment, List<RentUnit> rentUnits) {
		super();
		this.id = id;
		this.name = name;
		this.hours = hours;
		this.costOfEquipment = costOfEquipment;
		this.rentUnits = rentUnits;
	}
	
	//Getters and setters
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getCostOfEquipment() {
		return costOfEquipment;
	}
	public void setCostOfEquipment(int costOfEquipment) {
		this.costOfEquipment = costOfEquipment;
	}
	public List<RentUnit> getRentUnits() {
		return rentUnits;
	}
	public void setRentUnits(List<RentUnit> rentUnits) {
		this.rentUnits = rentUnits;
	}
	
	//methods
	
	public void get—heckWithTime() {
		
		System.out.println("-------");
		Date today = new Date();
		String hour = String.format("%tk", today);
		int hours = Integer.parseInt(hour);
		this.hours = hours;
		
	}
	
	public void addRentUnit(RentUnit rentUnit) {
		rentUnits.add(rentUnit);
	}
	
	public void removeRentUnit(RentUnit rU) {
		System.out.println("------");
		rentUnits.remove(rU);
		System.out.println("Clint remove rentUnit from his rent list: " + rU.getEquipment().toString());
	}
	
	public void showClientRentUnits() {
		for(RentUnit rU: rentUnits) {
			System.out.println("----------");
			System.out.println("Client have: "+ rU.getEquipment().toString());
		}
	}
	
	
	public void countCostOfEquipmentOfClient() {
		for(RentUnit rU: rentUnits) {
			costOfEquipment = costOfEquipment + rU.getEquipment().getCostOfEquipment();
		}
	}
	
	@Override
	public String toString() {
		return "Client [name=" + this.name + "]" + "[ID=" + this.id + "]" + "[hours=" + this.hours + "]" +
				"[costOfequipment=" + this.costOfEquipment + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + costOfEquipment;
		result = prime * result + hours;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((rentUnits == null) ? 0 : rentUnits.hashCode());
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
		Client other = (Client) obj;
		if (costOfEquipment != other.costOfEquipment)
			return false;
		if (hours != other.hours)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rentUnits == null) {
			if (other.rentUnits != null)
				return false;
		} else if (!rentUnits.equals(other.rentUnits))
			return false;
		return true;
	}
	
	
	
	

}
