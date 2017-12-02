package by.htp.speq.station;

import java.util.List;

import by.htp.speq.entity.Equipment;

public class CatalogXML {
	
	private List<Equipment> equipments;

	public List<Equipment> getEquipments() {
		return equipments;
	}

	public void setEquipments(List<Equipment> equipments) {
		this.equipments = equipments;
	}
	
	public String toString() {
		return "Catalog= " + this.equipments;
	}

}
