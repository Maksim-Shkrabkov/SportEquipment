package by.htp.speq.logic;

import by.htp.speq.entity.Equipment;
import by.htp.speq.entity.RentUnit;
import by.htp.speq.station.Catalog;
import by.htp.speq.station.RentedCatalog;

public class ConsoleStationLogicImpl implements StationLogic {

	@Override
	public Catalog readCatalog() {
		// TODO Auto-generated method stub
		
		Equipment eq1 = new Equipment();
		Equipment eq2 = new Equipment();
		Equipment eq3 = new Equipment();
		
		RentUnit re1 = new RentUnit(eq1, 2.5);
		RentUnit re2 = new RentUnit(eq2, 2.5);
		RentUnit re3 = new RentUnit(eq3, 2.5);
		
		Catalog catalog = new Catalog();
		
		catalog.addRentUnit(re1);
		catalog.addRentUnit(re2);
		catalog.addRentUnit(re3);
		
		return catalog;
	}

	@Override
	public RentedCatalog readRentedCatalog() {
		// TODO Auto-generated method stub
		return null;
	}

}
