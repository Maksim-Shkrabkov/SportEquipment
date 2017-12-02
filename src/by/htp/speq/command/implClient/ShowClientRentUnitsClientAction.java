package by.htp.speq.command.implClient;

import by.htp.speq.command.ClientAction;
import by.htp.speq.entity.Client;
import by.htp.speq.entity.RentUnit;
import by.htp.speq.logic.ClientLogic;
import by.htp.speq.logic.implClientLogic.RemoveRentUnitClientLogic;
import by.htp.speq.logic.implClientLogic.ShowClientRentUnitsClientLogic;

public class ShowClientRentUnitsClientAction implements ClientAction {
	
	private ClientLogic logic;
	
	{
		logic = new ShowClientRentUnitsClientLogic();
	}
	
	@Override
	public void performAction(Client client) {
		// TODO Auto-generated method stub
		logic.showClientRentUnits(client);
	}

	@Override
	public void performAction(Client client, RentUnit rentUnit) {
		// TODO Auto-generated method stub
		System.err.println("Program was not implemented");
	}

}
