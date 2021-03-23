import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FuelExpensesTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetEmpId() {
		
		FuelExpenses fuel = new FuelExpenses();
		
		String empId = "0101";
		
		String actual = fuel.getEmpId(empId);
		String expect = "0101";
		
		assertEquals(expect, actual);

	}

	@Test
	void testUpdateFuel() {
		
		FuelExpenses fuel = new FuelExpenses();
		
		double fuelExp = 40000;
		
		double actual = fuel.updateFuel(fuelExp);
		double expect = 40000;
		
		assertEquals(expect, actual);
		
	}

}
