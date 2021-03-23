import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PayrollEmpLeaveTest {

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
	void testEmpId() {
		
		PayrollEmpLeave leave = new PayrollEmpLeave();
		
		String empId = "0101";
		
		String actual = leave.empId(empId);
		String expect = "0101";

		assertEquals(expect, actual);
		
	}

	@Test
	void testLeave() {
		
		PayrollEmpLeave leave = new PayrollEmpLeave();
		
		String type = "Sick leave";
		
		String actual = leave.leave(type);
		String expect = "Sick leave";
		
		assertEquals(expect, actual);
	}

	@Test
	void testDate() {
		PayrollEmpLeave leave = new PayrollEmpLeave();
		
		String Tdate = "SSQQAA";
		
		String actual = leave.date(Tdate);
		String expect = "2021.03.02";
		
		assertEquals(expect, actual,"Incorrect date format.");
	}

	@Test
	void testFromdate() {
		PayrollEmpLeave leave = new PayrollEmpLeave();
		
		String Fromdate = "2021.06.09";
		
		String actual = leave.Fromdate(Fromdate);
		String expect = "2021.06.09";
		
		assertEquals(expect, actual);
	}
	

	@Test
	void testTodate() {
		PayrollEmpLeave leave = new PayrollEmpLeave();
		
		String Todate = "2021.06.11";
		
		String actual = leave.Todate(Todate);
		String expect = "2021.06.11";
		
		assertEquals(expect, actual);
	}

	@Test
	void testPurpose() {
		PayrollEmpLeave leave = new PayrollEmpLeave();
		
		String purpose = "Due to the medical report.";
		
		String actual = leave.purpose(purpose);
		String expect = "Due to the medical report.";
		
		assertEquals(expect, actual);
	}

}
