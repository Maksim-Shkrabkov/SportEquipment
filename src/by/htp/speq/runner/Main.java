package by.htp.speq.runner;

import java.io.IOException;

import by.htp.speq.dao.CatalogData;
import by.htp.speq.dao.parser.Stax.CatalogDataStaxImpl;
import by.htp.speq.dao.parser.dom.CatalogDataDomImpl;
import by.htp.speq.dao.parser.sax.CatalogDataSaxImpl;
import by.htp.speq.command.ActionHelper;
import by.htp.speq.command.AssistantActionNew;
import by.htp.speq.command.AssistantHelper;
import by.htp.speq.command.AssistantHelperNew;
import by.htp.speq.command.ClientAction;
import by.htp.speq.command.ClientHelper;
import by.htp.speq.command.StationAction;
import by.htp.speq.command.impl.ViewRentedItemsActionImpl;
import by.htp.speq.entity.Category;
import by.htp.speq.entity.Client;
import by.htp.speq.entity.Cycle;
import by.htp.speq.entity.Equipment;
import by.htp.speq.entity.Kayak;
import by.htp.speq.entity.RentUnit;
import by.htp.speq.entity.Skiing;
import by.htp.speq.entity.staff.Assistant;
import by.htp.speq.logic.AssistantLogic;
import by.htp.speq.station.CatalogXML;
import by.htp.speq.view.ConsoleMenu;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		ConsoleMenu.printMenu();
//		int input = ConsoleMenu.readUserInput();
//		
//		StationAction action = ActionHelper.defineAction(input);
//		action.performAction();
//		
//		
//		//testWritingOfFiles
//		int in = ConsoleMenu.askWhatItemDoYouWantRent();
//		Assistant as = new Assistant("Vasya", 18);
//		as.createNewRentCatalogTxtFIle(in);
//		as.createNewCatalogTxtFIle(in);
		
		
		//test1
//		Assistant as = new Assistant("Vasys", 18);
////		as.openRentStation();
////		as.showDefaultCatalog();
//		Client cl = new Client();
//		
//		Equipment cycle = new Cycle(Category.SUMMER, 100, 2, "Best Cycle");
//		Equipment kayak = new Kayak(Category.SUMMER, 150, 2, "Best kayak");
//		Equipment skiing = new Skiing(Category.WINTER, 50, "Limbet", "Best skiing");
//		
//		RentUnit rentUnit1 = as.createRentUnit(cycle, 4);
//		RentUnit rentUnit2 = as.createRentUnit(kayak, 3);
//		RentUnit rentUnit3 = as.createRentUnit(skiing, 5);
//		
//		cl.addRentUnit(rentUnit1);
//		cl.addRentUnit(rentUnit2);
//		cl.addRentUnit(rentUnit3);
		
//		cl.showClientRentUnits();
//		cl.removeRentUnit(rentUnit2);
//		cl.showClientRentUnits();
//		
//		cl.countCostOfEquipmentOfClient();
//		cl.get—heckWithTime();
//		as.addClient(cl);
//		as.getClientCostOfRent(0);
//		as.getCheckOfClient(0);
		
		
//		testMenuAssistant
//		Assistant assistant1 = new Assistant("Ira", 18);
//		Client client1 = new Client(1, "Vasay");
		
//		ConsoleMenu.printAssistantMenu();
//		int input = ConsoleMenu.readUserInput();
//		
//		AssistantActionNew action = AssistantHelperNew.defineAction(input);
//		action.performAction(as, cl);
		
//		AssistantActionNew action = AssistantHelperNew.defineAction(input);
//		action.performAction(assistant1, client1);
		
		
		
		
		
//		testMenuClient
//		ConsoleMenu.printClientMenu();
//		int input = ConsoleMenu.readUserInput();
//		
//		ClientAction action = ClientHelper.defineAction(input);
//		action.performAction(cl);
//		
//		
//		System.out.println(" ");
		
//		testXML
//		CatalogData dao = new CatalogDataSaxImpl();
//		CatalogData dao = new CatalogDataDomImpl();
		CatalogData dao = new CatalogDataStaxImpl();
		CatalogXML catalogXML = dao.readCatalog();
		
		System.out.println(catalogXML);

		

	}

}
