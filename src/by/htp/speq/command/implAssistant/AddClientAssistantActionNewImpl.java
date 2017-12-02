package by.htp.speq.command.implAssistant;

import by.htp.speq.command.AssistantActionNew;
import by.htp.speq.entity.Client;
import by.htp.speq.entity.staff.Assistant;
import by.htp.speq.logic.AssistantLogic;
import by.htp.speq.logic.implAssistantLogic.AddClientAssistantLogicImpl;

public class AddClientAssistantActionNewImpl implements AssistantActionNew {
	
	private AssistantLogic logic;
	
	{
		logic = new AddClientAssistantLogicImpl();
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
		logic.addClient(assistant, client);
		System.out.println("Assistant: " + assistant.getName() + " " + "successfully add customer: "
				+ "id: " + client.getId() + " Name: " + client.getName() + " in assistant list of client");
	}

}
