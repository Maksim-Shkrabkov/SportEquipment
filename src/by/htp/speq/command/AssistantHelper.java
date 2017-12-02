package by.htp.speq.command;


import by.htp.speq.logic.AssistantLogic;
import by.htp.speq.logic.implAssistantLogic.DefaultAssistantLogicImpl;
import by.htp.speq.logic.implAssistantLogic.GreetingAssistantLogicImpl;

public class AssistantHelper {
	
	public static AssistantLogic defineAction(int input) {
		
		AssistantLogic action = new DefaultAssistantLogicImpl();
		
		switch(input) {
		case 1:
//			action = ;
			break;
		case 2:
			action = new GreetingAssistantLogicImpl();;
			break;
		case 3:
//			action = ;
			break;
		default:	
		}
		
		return action;
		
	}

}
