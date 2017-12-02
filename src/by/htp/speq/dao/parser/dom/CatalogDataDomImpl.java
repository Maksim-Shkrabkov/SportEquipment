package by.htp.speq.dao.parser.dom;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static by.htp.speq.dao.parser.DataTypeTransformUtil.*;
import javax.xml.parsers.*;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import by.htp.speq.dao.CatalogData;
import by.htp.speq.entity.Category;
import by.htp.speq.entity.Cycle;
import by.htp.speq.entity.Equipment;
import by.htp.speq.entity.Kayak;
import by.htp.speq.entity.Skiing;
import by.htp.speq.entity.optionalEquipment.Glasses;
import by.htp.speq.station.CatalogXML;

public class CatalogDataDomImpl implements CatalogData{
	
	private static final String XML_FILE_PATH ="resources/sport_equipment.xml";
	
	@Override
	public CatalogXML readCatalog() {
		
		CatalogXML catalogXML = new CatalogXML();
		
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		
		try {
			
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document document = documentBuilder.parse(XML_FILE_PATH);
			
			List<Equipment> equipments = parceDocument(document);
			catalogXML.setEquipments(equipments);
			
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return catalogXML;
	}
	
	private List<Equipment> parceDocument(Document document) {
		
		List<Equipment> list = new ArrayList<>();
		
		list.add(parceCycle(document));
		list.add(parceKayak(document));
		list.add(parceSkiing(document));
		list.add(parceGlasses(document));
		
		return list;
	}
	
	private Cycle parceCycle(Document document) {
		
		Element root = document.getDocumentElement();
		NodeList nodes = root.getElementsByTagName("cycle");
		Cycle cycle = null;
		
		for(int i = 0; i < nodes.getLength(); i++) {
			
			cycle = new Cycle();
			Element currentNode = (Element) nodes.item(i);
			
			Element element = getSingleChild(currentNode, "title");
			String title = element.getTextContent().trim();
			cycle.setTitle(title);
			
			element = getSingleChild(currentNode, "category");
			Category category = Category.valueOf(element.getTextContent().toUpperCase().trim());
			cycle.setCategory(category);
			
			element = getSingleChild(currentNode, "cost");
			String cost = element.getTextContent().trim();
			cycle.setCost(convertCost(cost));
			
			element = getSingleChild(currentNode, "countOfWheels");
			String countOfWheels = element.getTextContent().trim();
			cycle.setCountOfWheels(convertCountOfWheels(countOfWheels));
			
		}
		
		return cycle;
	}
	
	private Kayak parceKayak(Document document) {
		
		Element root = document.getDocumentElement();
		NodeList nodes = root.getElementsByTagName("kayak");
		Kayak kayak = null;
		
		for(int i = 0; i < nodes.getLength(); i++) {
			
			kayak = new Kayak();
			Element currentNode = (Element) nodes.item(i);
			
			Element element = getSingleChild(currentNode, "title");
			String title = element.getTextContent().trim();
			kayak.setTitle(title);
			
			element = getSingleChild(currentNode, "category");
			Category category = Category.valueOf(element.getTextContent().toUpperCase().trim());
			kayak.setCategory(category);
			
			element = getSingleChild(currentNode, "cost");
			String cost = element.getTextContent().trim();
			kayak.setCost(convertCost(cost));
			
			element = getSingleChild(currentNode, "countOfpaddles");
			String countOfpaddles = element.getTextContent().trim();
			kayak.setCountOfpaddles(convertCountOfPaddles(countOfpaddles));		
		}
		
		return kayak;

	}
	
	
	private Skiing parceSkiing(Document document) {
		
		Element root = document.getDocumentElement();
		NodeList nodes = root.getElementsByTagName("skiing");
		Skiing skiing = null;
		
		for(int i = 0; i < nodes.getLength(); i++) {
			
			skiing = new Skiing();
			Element currentNode = (Element) nodes.item(i);
			
			Element element = getSingleChild(currentNode, "title");
			String title = element.getTextContent().trim();
			skiing.setTitle(title);
			
			element = getSingleChild(currentNode, "category");
			Category category = Category.valueOf(element.getTextContent().toUpperCase().trim());
			skiing.setCategory(category);
			
			element = getSingleChild(currentNode, "cost");
			String cost = element.getTextContent().trim();
			skiing.setCost(convertCost(cost));
			
			element = getSingleChild(currentNode, "brand");
			String brand = element.getTextContent().trim();
			skiing.setBrand(brand);
			
		}
		
		return skiing;

	}
	
	
	private Glasses parceGlasses(Document document) {
		
		Element root = document.getDocumentElement();
		NodeList nodes = root.getElementsByTagName("glasses");
		Glasses glasses = null;
		
		for(int i = 0; i < nodes.getLength(); i++) {
			
			glasses = new Glasses();
			Element currentNode = (Element) nodes.item(i);
			
			Element element = getSingleChild(currentNode, "title");
			String title = element.getTextContent().trim();
			glasses.setTitle(title);
			
			element = getSingleChild(currentNode, "type");
			String type = element.getTextContent().trim();
			glasses.setType(type);
			
			element = getSingleChild(currentNode, "category");
			Category category = Category.valueOf(element.getTextContent().toUpperCase().trim());
			glasses.setCategory(category);
			
			element = getSingleChild(currentNode, "cost");
			String cost = element.getTextContent().trim();
			glasses.setCost(convertCost(cost));
			
			element = getSingleChild(currentNode, "colour");
			String colour = element.getTextContent().trim();
			glasses.setColour(colour);
			
		}
		
		return glasses;

	}
	
	private Element getSingleChild(Element node, String name){
		NodeList nodeList = node.getElementsByTagName(name);
		Element childElement = (Element) nodeList.item(0);
		return childElement;
	}

}
