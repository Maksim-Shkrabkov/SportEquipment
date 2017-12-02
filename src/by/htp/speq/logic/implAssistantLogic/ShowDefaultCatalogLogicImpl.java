package by.htp.speq.logic.implAssistantLogic;

import by.htp.speq.entity.Client;
import by.htp.speq.entity.staff.Assistant;
import by.htp.speq.logic.AssistantLogic;

public class ShowDefaultCatalogLogicImpl implements AssistantLogic{

	@Override
	public void showDefaultCatalog() {
		// TODO Auto-generated method stub
		Assistant assistant = new Assistant();
		assistant.openRentStation();
		assistant.showDefaultCatalog();
		System.out.println("--------");
		System.out.println("Assistant show default catalog");
	}

	@Override
	public void greeting() {
		// TODO Auto-generated method stub
		System.err.println("Program was not implemented");
	}

	@Override
	public void addClient(Assistant assistant, Client client) {
		// TODO Auto-generated method stub
		System.err.println("Program was not implemented");
	}

	@Override
	public void getCheckOfClient(Assistant assistant, Client client) {
		// TODO Auto-generated method stub
		System.err.println("Program was not implemented");
	}





}
