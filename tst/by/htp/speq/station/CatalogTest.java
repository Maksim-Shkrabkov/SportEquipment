package by.htp.speq.station;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import by.htp.speq.entity.Equipment;
import by.htp.speq.entity.RentUnit;

public class CatalogTest {

	private Catalog catalog;
	
	@Before
	
	public void intCatalog() {
		catalog = new Catalog();
	}
	
	
	@Test
	
	public void testCatalogRentUnitNotNull () {
		RentUnit[] units = catalog.getUnits();
		assertNotNull("RentUnit Storage was not initialized", units);

	}
	
	@Test
	public void testAddedRentUnitPresent() {
		RentUnit unit = new RentUnit();
		Equipment eq = new Equipment("Equipment 1");
		unit.setEquipment(eq);
		unit.setHourRate(2.5);
		
		catalog.addRentUnit(unit);
		
		RentUnit[] units = catalog.getUnits();
		RentUnit lastItem = catalog.getLastRentUnit();
		
		assertEquals("RentUnit wasn't added", unit, lastItem);
		
		}		
		
	}

