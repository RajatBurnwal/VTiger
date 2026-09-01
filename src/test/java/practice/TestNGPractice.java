package practice;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(genericUtility.ListenersImplementation.class)
public class TestNGPractice {

//	@Ignore
	@Test(priority = 1 /*invocationCount = 0, enabled = false*/)
	public void saiWakesUp() {
		System.out.println("Hello Vishnu");
	}
	
	@Test(priority = -2, dependsOnMethods = {"saiSleeps"})
	public void saiEatFood() {
		System.out.println("Dosa Idli Sambhar Chutney Chutney");
	}
	
	@Test(priority = 3)
	public void saiSleeps() {
//		Assert.fail();
		System.out.println("Good night Vishnu Bro");
	}
	
}
