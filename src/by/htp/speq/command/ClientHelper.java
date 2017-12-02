package by.htp.speq.command;

import by.htp.speq.command.implClient.AddRentUnitClientActionImpl;
import by.htp.speq.command.implClient.DefaultClientActionImpl;
import by.htp.speq.command.implClient.GetCheckClientActionImpl;
import by.htp.speq.command.implClient.RemoveRentUnitClientActionImpl;
import by.htp.speq.command.implClient.ShowClientCostOfEquipmentClientActionImpl;
import by.htp.speq.command.implClient.ShowClientRentUnitsClientAction;
import by.htp.speq.logic.ClientLogic;

public class ClientHelper {
	
	public static ClientAction defineAction(int input) {
		
		ClientAction action = new DefaultClientActionImpl();
		
		switch(input) {
		case 1:
			action = new GetCheckClientActionImpl();
			break;
		case 2:
			action = new ShowClientRentUnitsClientAction();
			break;
		case 3:
			action = new AddRentUnitClientActionImpl();
			break;
		case 4:
			action = new RemoveRentUnitClientActionImpl();
		case 5:
			action = new ShowClientCostOfEquipmentClientActionImpl();	
		default:	
		}
		
		return action;
	}
	
}


