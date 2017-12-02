package by.htp.speq.command.implAssistant;

import by.htp.speq.command.AssistantActionNew;
import by.htp.speq.entity.Client;
import by.htp.speq.entity.staff.Assistant;
import by.htp.speq.logic.AssistantLogic;
import by.htp.speq.logic.implAssistantLogic.GetCheckOfClientLogicImpl;
import by.htp.speq.logic.implAssistantLogic.ShowDefaultCatalogLogicImpl;

public class GetCheckOfClientActionImpl implements AssistantActionNew {
	
	private AssistantLogic logic;
	
	{
		logic = new GetCheckOfClientLogicImpl();
	}
	
	@Override
	public void performAction() {
		// TODO Auto-generated method stub
		System.err.println("Program was not implemented");
	}

	@Override
	public void performAction(Assistant assistant) {
		// TODO Auto-generated method stub
		System.err.println("Program was not implemented");
	}

	@Override
	public void performAction(Assistant assistant, Client client) {
		// TODO Auto-generated method stub
		logic.getCheckOfClient(assistant, client);
	}

}
