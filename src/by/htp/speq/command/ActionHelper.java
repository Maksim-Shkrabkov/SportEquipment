package by.htp.speq.command;

import by.htp.speq.command.impl.DefaultActionImpl;
import by.htp.speq.command.impl.ViewCatalgActionImpl;
import by.htp.speq.command.impl.ViewRentedItemsActionImpl;

public class ActionHelper {
	
	public static StationAction defineAction(int input) {
		
		StationAction action = new DefaultActionImpl();
		switch(input) {
		case 1:
			action = new ViewCatalgActionImpl();
			break;
		case 3:
			action = new ViewRentedItemsActionImpl();
			break;
		default:	
		}
		return action;
	}
	
}
