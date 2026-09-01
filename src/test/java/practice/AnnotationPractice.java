package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationPractice {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite executed");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class executed");
	}
	
	@BeforeMethod
	public void beforeMethod() {		
		System.out.println("Before Method executed");
	}
	
	@AfterMethod
	public void afterMethod() {		
		System.out.println("After Method executed");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite executed");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class executed");
	}
	
	@Test
	public void m1() {
		System.out.println("In method m1");
	}
	
	@Test
	public void m2() {
		System.out.println("In method m2");
	}
	
}
