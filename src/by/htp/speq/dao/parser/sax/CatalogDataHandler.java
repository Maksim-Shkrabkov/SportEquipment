package by.htp.speq.dao.parser.sax;

import java.lang.reflect.AnnotatedElement;
import java.util.ArrayList;
import java.util.List;

import static by.htp.speq.dao.parser.DataTypeTransformUtil.*;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import by.htp.speq.dao.parser.CatalogTagName;
import by.htp.speq.dao.parser.DataTypeTransformUtil;
import by.htp.speq.entity.Category;
import by.htp.speq.entity.Cycle;
import by.htp.speq.entity.Equipment;
import by.htp.speq.entity.Kayak;
import by.htp.speq.entity.Skiing;
import by.htp.speq.entity.optionalEquipment.Glasses;

public class CatalogDataHandler extends DefaultHandler {
	
	private StringBuilder text;
	private Equipment equipment;
	private Cycle cycle;
	private Kayak kayak;
	private Skiing skiing;
	private Glasses glasses;
	private List<Equipment> equipments = new ArrayList<>();
	
	@Override
	public void characters(char[] ch, int start, int lenghts) throws SAXException {
		text.append(ch, start, lenghts);
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		
		CatalogTagName tag = getTag(localName);
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
		
		text = new StringBuilder();
		
	}
	
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		
		CatalogTagName tag = getTag(localName);
		endElementCycle(tag);
		endElementKayak(tag);
		endElementSkiing(tag);
		endElementGlasses(tag);
		endElementEssence(tag);
		
	}
	
	private void endElementCycle(CatalogTagName tag) {
		
		switch(tag) {
		case TITLE:
			if (cycle !=null) {
				cycle.setTitle(text.toString().trim());
			}
			break;
		case CATEGORY:
			if(cycle != null) {
				Category category = Category.valueOf(text.toString().toUpperCase().trim());
				cycle.setCategory(category);
			}
			break;
		case COST:
			if(cycle != null) {
				String cost = text.toString().trim();
				cycle.setCost(convertCost(cost));
			}
			break;
		case COUNTOFWHEELS:
			if(cycle != null) {
				String countOfWheels = text.toString().trim();
				cycle.setCountOfWheels(convertCountOfWheels(countOfWheels));
			}
			break;
		}
		
	}
	
private void endElementKayak(CatalogTagName tag) {
		
		switch(tag) {
		case TITLE:
			if(kayak != null) {
				kayak.setTitle(text.toString().trim());
			}
			break;
		case CATEGORY:
			if(kayak != null) {
				Category category = Category.valueOf(text.toString().toUpperCase().trim());
				kayak.setCategory(category);
			}
			break;
		case COST:
			if(kayak != null) {
				String cost = text.toString().trim();
				kayak.setCost(convertCost(cost));
			}
			break;
		case COUNTOFPADDLES:
			if(kayak != null) {
				String countOfPaddles = text.toString().trim();
				kayak.setCountOfpaddles(convertCountOfPaddles(countOfPaddles));
			}
			break;
		}
		
	}

private void endElementSkiing(CatalogTagName tag) {
	
	switch(tag) {
	case TITLE:
		if(skiing != null) {
			skiing.setTitle(text.toString().trim());
		}
		break;
	case CATEGORY:
		if(skiing != null) {
			Category category = Category.valueOf(text.toString().toUpperCase().trim());
			skiing.setCategory(category);
		}
		break;
	case COST:
		if(skiing != null) {
			String cost = text.toString().trim();
			skiing.setCost(convertCost(cost));
		}
		break;
	case BRAND:
		if(skiing != null) {
			String brand = text.toString().trim();
			skiing.setBrand(brand);
		}
		break;
	}
	
}

private void endElementGlasses(CatalogTagName tag) {
	
	switch(tag) {
	case TITLE:
		if(glasses != null) {
			glasses.setTitle(text.toString().trim());
		}
		break;
	case TYPE:
		if(glasses != null) {
			String type = text.toString().trim();
			glasses.setType(type);
		}
		break;
	case CATEGORY:
		if(glasses != null) {
			Category category = Category.valueOf(text.toString().toUpperCase().trim());
			glasses.setCategory(category);
		}
		break;
	case COST:
		if(glasses != null) {
			String cost = text.toString().trim();
			glasses.setCost(convertCost(cost));
		}
		break;
	case COLOUR:
		if(glasses != null) {
			String colour = text.toString().trim();
			glasses.setColour(colour);;
		}
		break;
	}
	
}

	private void endElementEssence(CatalogTagName tag) {
		
		switch(tag) {
		case CYCLE:
			equipment = cycle;
			equipments.add(equipment);
			cycle = null;
			break;
		case KAYAK:
			equipment = kayak;
			equipments.add(equipment);
			kayak = null;
			break;
		case SKIING:
			equipment = skiing;
			equipments.add(equipment);
			skiing = null;
			break;
		case GLASSES:
			equipment = glasses;
			equipments.add(equipment);
			glasses = null;
			break;
		}
	
	}
	
	
	private CatalogTagName getTag(String localName) {
		String tag = localName.toUpperCase();
		CatalogTagName tagElement = CatalogTagName.valueOf(tag);
		return tagElement;
	}

	public List<Equipment> getEquipments() {
		return equipments;
	}

	public void setEquipments(List<Equipment> equipments) {
		this.equipments = equipments;
	}
	
	
	

}
