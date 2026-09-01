package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionPractice {

	@Test
	public void softAssertion() {
		System.out.println("Soft Assertion starts");
		String expectedFood = "Anna Sambhar";
		String actualFood = "AnnaSambhar";
		SoftAssert s = new SoftAssert();
		s.assertTrue(actualFood.contains(expectedFood));
		s.assertEquals(actualFood, expectedFood);
		System.out.println("Soft Assertion ends");
		s.assertAll();
	}
	
}
