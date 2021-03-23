import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PayrollEmpNetSalaryTest {

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
		
		PayrollEmpNetSalary sal = new PayrollEmpNetSalary();
		
		String empId = "0101";
		
		String actual = sal.empId(empId);
		String expect = "0101";
		
		assertEquals(expect, actual);
	}

	@Test
	void testETFAmount() {
		PayrollEmpNetSalary sal = new PayrollEmpNetSalary();
		
		double basicSalary = 112000;
		double ETFRate = 0.03;
		
		double actual = sal.ETFAmount(basicSalary, ETFRate);
		double expect = 3360;
	
		assertEquals(expect, actual);
		
	}
		

	@Test
	void testOTAmount() {
		PayrollEmpNetSalary sal = new PayrollEmpNetSalary();
	
		double basicSalary = 112000;
		double oTRate = 0.05;
		float noHours = 10;
		
		double actual = sal.OTAmount(basicSalary, oTRate, noHours);
		double expect = 56000;
		
		assertEquals(expect, actual);
		
	}

	@Test
	void testEmpGrossSalary() {
		PayrollEmpNetSalary sal = new PayrollEmpNetSalary();
		
		double basicSalary = 112000;
		double ETFAmount = 3360;
		double OTAmount = 56000;
		
		double actual = sal.EmpGrossSalary(basicSalary, ETFAmount, OTAmount);
		double expect = 171360;
		
		assertEquals(expect, actual);
		
	}

	@Test
	void testEPF() throws ParseException {
		
		PayrollEmpNetSalary sal = new PayrollEmpNetSalary();
		
		double basicSalary = 112000;
		double less3YearsRate = 0.08;
		double over3YearsRate = 0.12;
		String gender = "female";

		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date joinDate = simpleDateFormat.parse("2020-02-02");
		
		double actual = sal.EPF(basicSalary, gender, joinDate, less3YearsRate, over3YearsRate);
		double expect = 8960;
		
		assertEquals(expect, actual);
	}

	@Test
	void testNetEmpSalary() {
		PayrollEmpNetSalary sal = new PayrollEmpNetSalary();
		
		double grossEmpSalary = 171360 ;
		double EPF = 8960;
	
		double actual = sal.netEmpSalary(grossEmpSalary, EPF);
		double expect = 162400;
		
		assertEquals(expect, actual);

	}

}
