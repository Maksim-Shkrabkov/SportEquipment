package by.htp.speq.command.impl;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import by.htp.speq.command.StationAction;
import by.htp.speq.entity.RentUnit;
import by.htp.speq.logic.FileStationLogicImpl;
import by.htp.speq.logic.StationLogic;
import by.htp.speq.station.Catalog;
import by.htp.speq.station.RentedCatalog;

public class ViewRentedItemsActionImpl implements StationAction {

	private StationLogic logic;
	
	{
		//logic = new ConsoleStationLogicImpl();
		logic = new FileStationLogicImpl();
		//logic = new DataBaseStationLogicImpl();
	}
	
	
	@Override
	public void performAction() throws FileNotFoundException {
		
		RentedCatalog catalog = logic.readRentedCatalog();
		
		RentUnit[] units = catalog.getUnits();
		
		for(RentUnit unit: units) {
			if(unit != null) {
				System.out.println(unit);
			}
		}
		
	}
	
		
}
