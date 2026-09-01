package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionPractice {

	@Test
	public void hardAssertion() {
		System.out.println("Hard Assertion starts");
		String expectedCity = "Bengaluru";
		String actualCity = "Mysuru";
		Assert.assertNotEquals(actualCity, expectedCity);
		System.out.println("Hard Assertion middle");
		Assert.assertTrue(actualCity.equals(expectedCity));
		System.out.println("Hard Assertion ends");
	}
}
