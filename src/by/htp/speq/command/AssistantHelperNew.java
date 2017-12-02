package by.htp.speq.command;

import by.htp.speq.command.implAssistant.AddClientAssistantActionNewImpl;
import by.htp.speq.command.implAssistant.DefaultAssistanActionNewImpl;
import by.htp.speq.command.implAssistant.GetCheckOfClientActionImpl;
import by.htp.speq.command.implAssistant.GreetingAssistantActionImpl;
import by.htp.speq.command.implAssistant.ShowDefaultCatalogActionNewImpl;

public class AssistantHelperNew {
	
	public static AssistantActionNew defineAction(int input) {
		
		
		AssistantActionNew action = new DefaultAssistanActionNewImpl();
		switch(input) {
		case 1:
			action = new ShowDefaultCatalogActionNewImpl();
			break;
		case 2:
			action = new GreetingAssistantActionImpl();
			break;
		case 3:
			action = new AddClientAssistantActionNewImpl();
			break;
		case 4:
			action = new GetCheckOfClientActionImpl();
			break;
		default:	
		}
		
		return action;
		
	}

}
