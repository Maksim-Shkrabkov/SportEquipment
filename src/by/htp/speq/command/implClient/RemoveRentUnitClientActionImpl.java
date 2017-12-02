package by.htp.speq.command.implClient;

import by.htp.speq.command.ClientAction;
import by.htp.speq.entity.Client;
import by.htp.speq.entity.RentUnit;
import by.htp.speq.logic.ClientLogic;
import by.htp.speq.logic.implClientLogic.RemoveRentUnitClientLogic;

public class RemoveRentUnitClientActionImpl implements ClientAction {
	
	private ClientLogic logic;
	
	{
		logic = new RemoveRentUnitClientLogic();
	}
	
	@Override
	public void performAction(Client client) {
		// TODO Auto-generated method stub
		System.err.println("Program was not implemented");
	}

	@Override
	public void performAction(Client client, RentUnit rentUnit) {
		// TODO Auto-generated method stub
		logic.removeRentUnit(client, rentUnit);
	}

}
