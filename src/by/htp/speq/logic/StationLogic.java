package by.htp.speq.logic;

import java.io.FileNotFoundException;

import by.htp.speq.station.Catalog;
import by.htp.speq.station.RentedCatalog;

public interface StationLogic {
	
	Catalog readCatalog() throws FileNotFoundException;
	RentedCatalog readRentedCatalog();
	

}
 