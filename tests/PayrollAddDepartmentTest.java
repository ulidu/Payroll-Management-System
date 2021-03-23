import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PayrollAddDepartmentTest {

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
	void testDeptCode() {
		
		PayrollAddDepartment department = new PayrollAddDepartment();
		
		String deptCode = "IT300";
		
		String actual = department.deptCode(deptCode);
		String expect = "IT300";
		
		assertEquals(expect, actual);
	}

	@Test
	void testDeptName() {
		
		PayrollAddDepartment department = new PayrollAddDepartment();
		
		String deptName = "IT department";
		
		String actual = department.deptName(deptName);
		String expect = "IT department";
		
		assertEquals(expect, actual);
	}

}
