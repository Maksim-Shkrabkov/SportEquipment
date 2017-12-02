package by.htp.speq.logic;

import by.htp.speq.entity.Client;
import by.htp.speq.entity.staff.Assistant;

public interface AssistantLogic {
	
	void showDefaultCatalog();
	void greeting();
	void addClient(Assistant assistant, Client client);
	void getCheckOfClient(Assistant assistant, Client client);

}
