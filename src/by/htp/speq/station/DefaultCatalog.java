package by.htp.speq.station;

import java.util.ArrayList;
import java.util.List;

import by.htp.speq.entity.RentUnit;

public class DefaultCatalog {
	
	private List<RentUnit> listOfRentUnits;
	
	{
		listOfRentUnits = new ArrayList<>();
	}

	public List<RentUnit> getListOfRentUnits() {
		return listOfRentUnits;
	}

	public void setListOfRentUnits(List<RentUnit> listOfRentUnits) {
		this.listOfRentUnits = listOfRentUnits;
	}
	
	

}
