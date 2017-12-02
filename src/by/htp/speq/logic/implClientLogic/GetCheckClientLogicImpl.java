package by.htp.speq.logic.implClientLogic;

import java.util.Date;

import by.htp.speq.entity.Client;
import by.htp.speq.entity.RentUnit;
import by.htp.speq.logic.ClientLogic;

public class GetCheckClientLogicImpl implements ClientLogic {

	@Override
	public void getCheck(Client client) {
		// TODO Auto-generated method stub
		System.out.println("-------");
		client.setHours(getTimeOfClient(client));
		client.countCostOfEquipmentOfClient();
		System.out.println(client);
		for(RentUnit rentUnit: client.getRentUnits()) {
			System.out.println("--------");
			System.out.println(rentUnit.getEquipment().getTitle());
		}
	}
	
	
	public int getTimeOfClient(Client client) {
		Date today = new Date();
		String hour = String.format("%tk", today);
		int hours = Integer.parseInt(hour);
		return hours;
	}

	@Override
	public void addRentUnit(Client client, RentUnit rentUnit) {
		// TODO Auto-generated method stub
		System.err.println("Program was not implemented");
	}

	@Override
	public void removeRentUnit(Client client, RentUnit rentUnit) {
		// TODO Auto-generated method stub
		System.err.println("Program was not implemented");
	}

	@Override
	public void showClientRentUnits(Client client) {
		// TODO Auto-generated method stub
		System.err.println("Program was not implemented");
	}

	@Override
	public void showCostOfequipment(Client client) {
		// TODO Auto-generated method stub
		System.err.println("Program was not implemented");
	}

}
