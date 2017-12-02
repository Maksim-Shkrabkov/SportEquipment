package by.htp.speq.dao.parser.Stax;

import java.awt.image.ColorConvertOp;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import static by.htp.speq.dao.parser.DataTypeTransformUtil.*;

import by.htp.speq.dao.parser.CatalogTagName;
import by.htp.speq.entity.Category;
import by.htp.speq.entity.Cycle;
import by.htp.speq.entity.Equipment;
import by.htp.speq.entity.Kayak;
import by.htp.speq.entity.Skiing;
import by.htp.speq.entity.optionalEquipment.Glasses;
import by.htp.speq.dao.CatalogData;
import by.htp.speq.station.CatalogXML;

public class CatalogDataStaxImpl implements CatalogData{
	
	private static final String XML_FILE_PATH ="resources/sport_equipment.xml";
	
	@Override
	public CatalogXML readCatalog() {
		
		CatalogXML catalogXML = new CatalogXML();
		
		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		InputStream stream;
		
		try {
			
			stream = new FileInputStream(XML_FILE_PATH);
			XMLStreamReader reader = xmlInputFactory.createXMLStreamReader(stream);
			
			List<Equipment> equipments = processReader(reader);
			catalogXML.setEquipments(equipments);
			
		} catch (FileNotFoundException | XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return catalogXML;
	}
	
	private List<Equipment> processReader(XMLStreamReader reader) {
		
		List<Equipment> equipments = new ArrayList<>();
		
		Cycle cycle =null;
		Kayak kayak = null;
		Skiing skiing = null;
		Glasses glasses= null;
		
		CatalogTagName tag = null;
		
		try {
			while(reader.hasNext()) {
				
				int type = reader.next();
				
				switch(type) {
				case XMLStreamConstants.START_ELEMENT:
					
					tag = getTag(reader.getLocalName());
					
					switch(tag) {
					case CYCLE:
						cycle = new Cycle();
						break;
					case KAYAK:
						kayak = new Kayak();
						break;
					case SKIING:
						skiing = new Skiing();
						break;
					case GLASSES:
						glasses = new Glasses();
						break;
					}
					
					break;
					
				case XMLStreamConstants.CHARACTERS:
					
					String text = reader.getText().trim();
					
					if(text.isEmpty()) {
						break;
					}	
						
					switch(tag) {
					case TITLE:
						if(cycle != null && kayak == null && skiing == null && glasses == null) {
							cycle.setTitle(text);
						}
						if(cycle == null && kayak != null && skiing == null && glasses == null) {
							kayak.setTitle(text);
						}
						if(cycle == null && kayak == null && skiing != null && glasses == null) {
							skiing.setTitle(text);
						}
						if(cycle == null && kayak == null && skiing == null && glasses != null) {
							glasses.setTitle(text);
						}
						break;
					case CATEGORY:
						if(cycle != null && kayak == null && skiing == null && glasses == null) {
							Category category = Category.valueOf(text.toUpperCase().trim());
							cycle.setCategory(category);
						}
						if(cycle == null && kayak != null && skiing == null && glasses == null) {
							Category category = Category.valueOf(text.toUpperCase().trim());
							kayak.setCategory(category);
						}
						if(cycle == null && kayak == null && skiing != null && glasses == null) {
							Category category = Category.valueOf(text.toUpperCase().trim());
							skiing.setCategory(category);
						}
						if(cycle == null && kayak == null && skiing == null && glasses != null) {
							Category category = Category.valueOf(text.toUpperCase().trim());
							glasses.setCategory(category);
						}
						break;
					case COST:
						if(cycle != null && kayak == null && skiing == null && glasses == null) {
							cycle.setCost(convertCost(text));
						}
						if(cycle == null && kayak != null && skiing == null && glasses == null) {
							kayak.setCost(convertCost(text));
						}
						if(cycle == null && kayak == null && skiing != null && glasses == null) {
							skiing.setCost(convertCost(text));
						}
						if(cycle == null && kayak == null && skiing == null && glasses != null) {
							glasses.setCost(convertCost(text));
						}
						break;
					case COUNTOFWHEELS:
						cycle.setCountOfWheels(convertCountOfWheels(text));
						break;
					case COUNTOFPADDLES:
						kayak.setCountOfpaddles(convertCountOfPaddles(text));
						break;
					case BRAND:
						skiing.setBrand(text);
						break;
					case TYPE:
						glasses.setType(text);
						break;
					case COLOUR:
						glasses.setColour(text);
						break;
					}
					
					break;
					
				case XMLStreamConstants.END_ELEMENT:
					
					tag = getTag(reader.getLocalName());
					
					switch(tag) {
					case CYCLE:
						equipments.add(cycle);
						cycle = null;
						break;
					case KAYAK:
						equipments.add(kayak);
						kayak = null;
						break;
					case SKIING:
						equipments.add(skiing);
						skiing = null;
						break;
					case GLASSES:
						equipments.add(glasses);
						glasses = null;
						break;
					}
					
					break;	
				}
				
			}
			
			
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return equipments;
	}
	
	
//	private List<Equipment> processReader(XMLStreamReader reader) {
//		
//		List<Equipment> equipments = new ArrayList();
//		
//		equipments.add(processCycle(reader));
//		equipments.add(processKayak(reader));
//		
//		return equipments;
//	}
	
	private Cycle processCycle(XMLStreamReader reader) {
		
		Cycle cycle = null;
		CatalogTagName tag = null;
		
		try {
			while(reader.hasNext()) {
				
				int type = reader.next();
				
				switch(type) {
				case XMLStreamConstants.START_ELEMENT:
						
						tag = getTag(reader.getLocalName());
						
						switch(tag) {
						case CYCLE:
							cycle = new Cycle();
							break;
						}
						
					break;
				case XMLStreamConstants.CHARACTERS:
						
						String text = reader.getText().trim();
					
					if(text.isEmpty()) {
						break;
					}	
						
					switch(tag) {
					case TITLE:
						cycle.setTitle(text);
						break;
					case CATEGORY:
						Category category = Category.valueOf(text.toUpperCase().trim());
						cycle.setCategory(category);
						break;
					case COST:
						cycle.setCost(convertCost(text));
						break;
					case COUNTOFWHEELS:
						cycle.setCountOfWheels(convertCountOfWheels(text));
						break;
					}
					
					break;
				case XMLStreamConstants.END_ELEMENT:
					
					break;
				}
				
			}
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cycle;
	}

	private Kayak processKayak(XMLStreamReader reader) {
		
		Kayak kayak = null;
		CatalogTagName tag = null;
		
		try {
			while(reader.hasNext()) {
				
				int type = reader.next();
				
				switch(type) {
				case XMLStreamConstants.START_ELEMENT:
						
						tag = getTag(reader.getLocalName());
						
						switch(tag) {
						case KAYAK:
							kayak = new Kayak();
							break;
						}
						
					break;
				case XMLStreamConstants.CHARACTERS:
			
						String text = reader.getText().trim();
					
					if(text.isEmpty()) {
						break;
					}	
						
					switch(tag) {
					case TITLE:
						kayak.setTitle(text);
						break;
					case CATEGORY:
						Category category = Category.valueOf(text.toUpperCase().trim());
						kayak.setCategory(category);
						break;
					case COST:
						kayak.setCost(convertCost(text));
						break;
					case COUNTOFWHEELS:
						kayak.setCountOfpaddles(convertCountOfPaddles(text));
						break;
					}
					
					break;
				case XMLStreamConstants.END_ELEMENT:
					
					break;
				}
				
			}
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return kayak;
	}
	
	
	private CatalogTagName getTag(String localName) {
		String tag = localName.toUpperCase();
		CatalogTagName tagElement = CatalogTagName.valueOf(tag);
		return tagElement;
	}

}
