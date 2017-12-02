package by.htp.speq.command.implAssistant;

import by.htp.speq.command.AssistantActionNew;
import by.htp.speq.entity.Client;
import by.htp.speq.entity.staff.Assistant;
import by.htp.speq.logic.AssistantLogic;
import by.htp.speq.logic.implAssistantLogic.AddClientAssistantLogicImpl;
import by.htp.speq.logic.implAssistantLogic.ShowDefaultCatalogLogicImpl;

public class ShowDefaultCatalogActionNewImpl implements AssistantActionNew {
	
	private AssistantLogic logic;
	
	{
		logic = new ShowDefaultCatalogLogicImpl();
	}


	@Override
	public void performAction() {
		// TODO Auto-generated method stub
		logic.showDefaultCatalog();
	}

	@Override
	public void performAction(Assistant assistant) {
		// TODO Auto-generated method stub
		logic.showDefaultCatalog();
	}

	@Override
	public void performAction(Assistant assistant, Client client) {
		// TODO Auto-generated method stub
		logic.showDefaultCatalog();
	}

}
