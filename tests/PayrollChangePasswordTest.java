import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PayrollChangePasswordTest {

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
	void testNewPassword() {

		PayrollChangePassword changePassword = new PayrollChangePassword();
		
		String newPassword = "ulidu333";
		
		String actual = changePassword.newPassword(newPassword);
		String expect = "ulidu333";
		
		assertEquals(expect, actual);
	}

	@Test
	void testConfirmPassword() {
		
		PayrollChangePassword changePassword = new PayrollChangePassword();
		
		String confirmPassword = " ";
		
		String actual = changePassword.newPassword(confirmPassword);
		String expect = "ulidu333";
		
		assertEquals(expect, actual,"Enter the confirm password");
	}

}
