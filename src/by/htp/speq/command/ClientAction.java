package by.htp.speq.command;

import by.htp.speq.entity.Client;
import by.htp.speq.entity.RentUnit;

public interface ClientAction {
	
	void performAction(Client client);
	void performAction(Client client, RentUnit rentUnit);

}
