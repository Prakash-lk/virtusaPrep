package junit;

import javax.management.DescriptorKey;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName(value="My test class")
public class AddTest {
	@BeforeAll
	static void beforeAll() {
		System.out.println("Before All");
	}

	@BeforeEach
	void beforeEach() {
		System.out.println("Before Each");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("After All");
	}

	@AfterEach
	void afterEach() {
		System.out.println("after Each");
	}

	@Test
	public void addTest() {
		Add obj = new Add();
		int res = obj.add(1, 99);
		Assertions.assertEquals(100, res);
	}
	@Disabled
	@Test
	public void adddTest() {
		Add obj = new Add();
		int res = obj.add(1, 21);
		Assertions.assertEquals(100, res);
	}
}
