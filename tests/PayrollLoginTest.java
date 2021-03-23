import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PayrollLoginTest {

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
	void testUsername() {
		
		PayrollLogin login = new PayrollLogin();
		
		String username = "ulidu";
		
		String actual = login.username(username);
		String expect = "ulidu";
		
		assertEquals(expect, actual, "Username entered.");
		
	}

	@Test
	void testPassword() {
		
	PayrollLogin login = new PayrollLogin();
		
		String password = "theerake555";
		
		String actual = login.password(password);
		String expect = "ulidu333";
		
		assertEquals(expect, actual, "Password is incorrect.");
	}

}
