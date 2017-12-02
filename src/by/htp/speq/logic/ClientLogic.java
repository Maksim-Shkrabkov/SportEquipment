package by.htp.speq.logic;

import by.htp.speq.entity.Client;
import by.htp.speq.entity.RentUnit;

public interface ClientLogic {
	
	void getCheck(Client client);
	void addRentUnit(Client client, RentUnit rentUnit);
	void removeRentUnit(Client client, RentUnit rentUnit);
	void showClientRentUnits(Client client);
	void showCostOfequipment(Client client);

}
