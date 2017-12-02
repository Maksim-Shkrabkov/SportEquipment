package by.htp.speq.command.implAssistant;

import by.htp.speq.command.AssistantActionNew;
import by.htp.speq.entity.Client;
import by.htp.speq.entity.staff.Assistant;
import by.htp.speq.logic.AssistantLogic;
import by.htp.speq.logic.implAssistantLogic.AddClientAssistantLogicImpl;
import by.htp.speq.logic.implAssistantLogic.GreetingAssistantLogicImpl;

public class GreetingAssistantActionImpl implements AssistantActionNew{
	
	private AssistantLogic logic;
	
	{
		logic = new GreetingAssistantLogicImpl();
	}
	
	@Override
	public void performAction() {
		// TODO Auto-generated method stub
		logic.greeting();
	}

	@Override
	public void performAction(Assistant assistant) {
		// TODO Auto-generated method stub
		logic.greeting();
	}

	@Override
	public void performAction(Assistant assistant, Client client) {
		// TODO Auto-generated method stub
		logic.greeting();
	}

}
