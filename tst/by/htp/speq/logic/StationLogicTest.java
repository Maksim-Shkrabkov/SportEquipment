package by.htp.speq.logic;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;

public class StationLogicTest {

	private StationLogic logic;
	
	
	@Before
	
	public void initSportLogic() {
		logic = new ConsoleStationLogicImpl();
	}
	
	
	@Test
	public void testReadCatalogNotNull() throws FileNotFoundException {
		
		assertNotNull(logic.readCatalog());

		
//		fail("Not yet implemented");
//		int x = 2;
//		int y = 2;
//		int c = x + y;
//		assertEquals(c,4);
		
	}

}
