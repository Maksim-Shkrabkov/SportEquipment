package by.htp.speq.dao.parser.sax;

import java.io.IOException;
import java.util.List;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;
import by.htp.speq.entity.Equipment;
import by.htp.speq.dao.CatalogData;
import by.htp.speq.station.CatalogXML;


public class CatalogDataSaxImpl implements CatalogData {
	
	private static final String XML_FILE_PATH ="resources/sport_equipment.xml";

	@Override
	public CatalogXML readCatalog() {
		
		CatalogXML catalogXML = new CatalogXML();
				
		try {
			CatalogDataHandler handler = new CatalogDataHandler();
			
			XMLReader reader = XMLReaderFactory.createXMLReader();
			reader.setContentHandler(handler);
			reader.parse(XML_FILE_PATH);
			
			List<Equipment> equipments = handler.getEquipments();
			catalogXML.setEquipments(equipments);
			
		} catch (SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return catalogXML;
	}
	
	
	
}
