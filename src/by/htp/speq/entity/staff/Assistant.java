package by.htp.speq.entity.staff;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import by.htp.speq.command.AssistantAction;
import by.htp.speq.entity.Category;
import by.htp.speq.entity.Client;
import by.htp.speq.entity.Cycle;
import by.htp.speq.entity.Equipment;
import by.htp.speq.entity.Kayak;
import by.htp.speq.entity.RentUnit;
import by.htp.speq.entity.Skiing;
import by.htp.speq.logic.FileStationLogicImpl;
import by.htp.speq.logic.StationLogic;
import by.htp.speq.station.Catalog;
import by.htp.speq.station.DefaultCatalog;

public class Assistant implements AssistantAction {
	
	private String name;
	private int age;
	private List<Client> listOfClients;
	private DefaultCatalog defaultCatalog;
	
	private StationLogic logic;
	
	{
		//logic = new ConsoleStationLogicImpl();
		logic = new FileStationLogicImpl();
		//logic = new DataBaseStationLogicImpl();
	}
	
	{
		listOfClients = new ArrayList<>();
	}
	
	//Constructors
	
	public Assistant() {
		
	}
	
	public Assistant(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	public List<Client> getListOfClients() {
		return listOfClients;
	}

	public void setListOfClients(List<Client> listOfClients) {
		this.listOfClients = listOfClients;
	}

	public DefaultCatalog getDefaultCatalog() {
		return defaultCatalog;
	}

	public void setDefaultCatalog(DefaultCatalog defaultCatalog) {
		this.defaultCatalog = defaultCatalog;
	}
	
	
	//methods for writing in files

	@Override
	public void createNewRentCatalogTxtFIle(int in) {
		
		RentUnit[] units = getRentUnitsValues();
		
		BufferedWriter wr = null;
		int itemIndex = in - 1;
		
		try {
			
			FileWriter writer = new FileWriter("resources/newRented_info.txt");
			wr = new BufferedWriter(writer);
			
			String line;
			
			for(int i = 0; i < units.length; i++) {
				if(i == itemIndex) {
					line = units[i].toString();
					wr.write(line);
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				wr.flush();
				wr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public RentUnit[] getRentUnitsValues() {
		
		Catalog catalog = null;
		
		try {
			catalog = logic.readCatalog();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RentUnit[] units = catalog.getUnits();
		
		return units;
	}
	
	
	@Override
	public void createNewCatalogTxtFIle(int in) {
		
		RentUnit[] units = getRentUnitsValues();
		
		BufferedWriter wr = null;
		
		int itemIndex = in - 1;
		
		try {
			
			FileWriter writer = new FileWriter("resources/newCatalog_info.txt");
			wr = new BufferedWriter(writer);
			
			String line;
			
			for(int i = 0; i < units.length; i++) {
				if(i != itemIndex && units[i] != null) {
					line = units[i].toString();
					wr.write(line);
					wr.newLine();
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				wr.flush();
				wr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	//methods
	
	public void openRentStation() {
		createDefaultCatalog();
	}
	
	public void showDefaultCatalog() {
		for(RentUnit rU: defaultCatalog.getListOfRentUnits()) {
			System.out.println("--------");
			System.out.println("Information about RentUnit in Default Catalog: " 
			+ rU.getEquipment().toString());
		}
	}
	
	
	public RentUnit createRentUnit(Equipment eq, int hourOfRate) {
		RentUnit rentUnit = new RentUnit(eq ,hourOfRate);
		return rentUnit;
	}
	
	public DefaultCatalog createDefaultCatalog() {
		
		defaultCatalog = new DefaultCatalog();
		
		Equipment cycle = new Cycle(Category.SUMMER, 100, 2, "Best Cycle");
		Equipment kayak = new Kayak(Category.SUMMER, 150, 2, "Best kayak");
		Equipment skiing = new Skiing(Category.WINTER, 50, "Limbet", "Best skiing");
		
		RentUnit rentUnit1 = createRentUnit(cycle, 4);
		RentUnit rentUnit2 = createRentUnit(kayak, 3);
		RentUnit rentUnit3 = createRentUnit(skiing, 5);
		
		defaultCatalog.getListOfRentUnits().add(rentUnit1);
		defaultCatalog.getListOfRentUnits().add(rentUnit2);
		defaultCatalog.getListOfRentUnits().add(rentUnit3);
		
		return defaultCatalog;
	}
	
	public static final void greeting() {
		System.out.println("--------");
		System.out.println("I am your assistant and we welcome you");
	}
	
	public static void greeting(String welcome) {
		System.out.println("-------");
		System.out.println(welcome);
	}
	
	//checkWithTime
	
	public void getCheckOfClient(int id) {
		
		int hoursOfAssistant = getTimeOfAssistant();
		int hoursOfClient = getTimeOfClient(id);
		int differenceOfHours = hoursOfAssistant - hoursOfClient;
		int costOfCheckClient = getCostOfCheckClient(differenceOfHours, id);
		
		for(Client client: listOfClients) {
			if(client.getId() == id && client != null) {
				System.out.println("Client name: " + client.getName() + "; ClientID: " + client.getId() 
				+ "; must to paid " + costOfCheckClient + " for our services!");
			}
		}
	}
	
	public int getTimeOfAssistant() {
		System.out.println("-------");
		Date today = new Date();
		String hour = String.format("%tk", today);
		int hoursOfAssistant = Integer.parseInt(hour);
		return hoursOfAssistant;
	}
	
	public int getTimeOfClient(int id) {
		
		int hoursOfClient = 0;
		
		for(Client client: listOfClients) {
			if(client.getId() == id && client != null) {
				hoursOfClient = (int) client.getHours();
			}
		}
		
		return hoursOfClient;
	}
	
	public int getCostOfCheckClient(int differenceOfHours, int id) {
		
		int costOfRent = 0;
		
		if(differenceOfHours > 4) {
			for(Client client: listOfClients) {
				if(client.getId() == id && client != null) {
					costOfRent = (int) client.getCostOfEquipment() * 3;
					System.out.println("The total cost of rent of client: " + costOfRent);
				}
			}
		}
		
		switch(differenceOfHours) {
		case 0:
			for(Client client: listOfClients) {
				if(client.getId() == id && client != null) {
					costOfRent = (int) client.getCostOfEquipment();
					System.out.println("The total cost of rent of client: " + costOfRent);
				}
			}
			break;
		case 1:
			for(Client client: listOfClients) {
				if(client.getId() == id && client != null) {
					costOfRent =  (int) (client.getCostOfEquipment() * 1.2);
					System.out.println("The total cost of rent of client: " + costOfRent);
				}
			}
			break;
		case 2:
			for(Client client: listOfClients) {
				if(client.getId() == id && client != null) {
					costOfRent =  (int) (client.getCostOfEquipment() * 1.4);
					System.out.println("The total cost of rent of client: " + costOfRent);
				}
			}
			break;
		case 3:
			for(Client client: listOfClients) {
				if(client.getId() == id && client != null) {
					costOfRent =  (int) (client.getCostOfEquipment() * 1.8);
					System.out.println("The total cost of rent of client: " + costOfRent);
				}
			}
			break;
		case 4:
			for(Client client: listOfClients) {
				if(client.getId() == id && client != null) {
					costOfRent =  (int) (client.getCostOfEquipment() * 2);
					System.out.println("The total cost of rent of client: " + costOfRent);
				}
			}
			break;	
		default:
		}
		
		return costOfRent;
	}
	
	
	public void getClientCostOfRent(int numOfClient) {
		
		System.out.println("-------");
		Date today = new Date();
		String hour = String.format("%tk", today);
		int hoursOfAssistant = Integer.parseInt(hour);
		int hoursOfClient = (int) listOfClients.get(numOfClient).getHours();		
		int hoursDifference = hoursOfAssistant - hoursOfClient;
		
		int costOfRent;
		
		if (hoursDifference == 0) {
			costOfRent = listOfClients.get(numOfClient).getCostOfEquipment();
			System.out.println("The total cost of rent of client: " + costOfRent);
		} else if(hoursDifference == 1) {
			costOfRent = (int) (listOfClients.get(numOfClient).getCostOfEquipment() * 1.2);
			System.out.println("The total cost of rent of client: " + costOfRent);
		} else if(hoursDifference == 2) {
			costOfRent = (int) (listOfClients.get(numOfClient).getCostOfEquipment() * 1.4);
			System.out.println("The total cost of rent of client: " + costOfRent);
		} else if(hoursDifference == 3) {
			costOfRent = (int) (listOfClients.get(numOfClient).getCostOfEquipment() * 1.8);
			System.out.println("The total cost of rent of client: " + costOfRent);
		} else if(hoursDifference == 4) {
			costOfRent = (int) (listOfClients.get(numOfClient).getCostOfEquipment() * 2);
			System.out.println("The total cost of rent of client: " + costOfRent);
		} else if(hoursDifference > 4) {
			costOfRent = (int) (listOfClients.get(numOfClient).getCostOfEquipment() * 3);
			System.out.println("The total cost of rent of client: " + costOfRent);
		}
		
	}
	
	public void addClient(Client cl) {
		listOfClients.add(cl);
	}
	

}
