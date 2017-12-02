package by.htp.speq.logic.implClientLogic;

import by.htp.speq.entity.Client;
import by.htp.speq.entity.RentUnit;
import by.htp.speq.logic.ClientLogic;

public class ShowClientCostOfEquipmentClientLogic implements ClientLogic {

	@Override
	public void getCheck(Client client) {
		// TODO Auto-generated method stub
		System.err.println("Program was not implemented");
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
		int costOfEquipment = 0;
		for(RentUnit rentUnit: client.getRentUnits()) {
			costOfEquipment = costOfEquipment + rentUnit.getEquipment().getCostOfEquipment();
		}
		System.out.println("Cost of equipment client name " + client.getName() + " = " + costOfEquipment );
	}

}
