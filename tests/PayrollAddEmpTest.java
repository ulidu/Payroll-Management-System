import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PayrollAddEmpTest {

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

		PayrollAddEmp employee = new PayrollAddEmp();
		
		String empId = "0101";
		
		String actual = employee.getEmpId(empId);
		String expect = "0101";
		
		assertEquals(expect, actual);
		
	}

	@Test
	void testGetEmpName() {
		
		PayrollAddEmp employee = new PayrollAddEmp();
		
		String name = "A.R. Thesha Gimhani";
		
		String actual = employee.getEmpName(name);
		String expect = "A.R. Thesha Gimhani";
		
		assertEquals(expect, actual);
	}

	@Test
	void testGetEmpGender() {
		
		PayrollAddEmp employee = new PayrollAddEmp();
		
		String gender = "female";
		
		String actual = employee.getEmpGender(gender);
		String expect = "female";
		
		assertEquals(expect, actual);
	}

	@Test
	void testGetEmpPosition() {
		
		PayrollAddEmp employee = new PayrollAddEmp();
		
		String position = "Project manager";
		
		String actual = employee.getEmpPosition(position);
		String expect = "Project manager";
		
		assertEquals(expect, actual);
	}

	@Test
	void testGetjoinDate() {
		
		PayrollAddEmp employee = new PayrollAddEmp();
		
		String joinDate = "2020.02.02";
		
		String actual = employee.getjoinDate(joinDate);
		String expect = "2020.02.02";
		
		assertEquals(expect, actual);
	}

	@Test
	void testGetEmpBasic() {
		
		PayrollAddEmp employee = new PayrollAddEmp();
		
		double basicSalary = 112000;
		
		double actual = employee.getEmpBasic(basicSalary);
		double expect = 112000;
		
		assertEquals(expect, actual);
	}

	@Test
	void testCheckEmpEmail() {
		
		PayrollAddEmp employee = new PayrollAddEmp();
		
		String email = "";
		
		String actual = employee.checkEmpEmail(email);
		String expect = "theshari@gmail.com";
		
		assertEquals(expect, actual, "Email field required");
	}

}
