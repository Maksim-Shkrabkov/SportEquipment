package by.htp.speq.command;

import by.htp.speq.entity.Client;
import by.htp.speq.entity.staff.Assistant;

public interface AssistantActionNew {
	
	void performAction();
	void performAction(Assistant assistant);
	void performAction(Assistant assistant, Client client);
	

}
