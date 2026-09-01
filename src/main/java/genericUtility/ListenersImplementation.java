package genericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation implements ITestListener {

	ExtentReports reports;
	ExtentTest test;
	JavaUtility jutil = new JavaUtility();
	String dateTimeStamp = jutil.getCalendarDetails("dd-MM-YYYY hh-mm-ss");
	
	@Override
	public void onTestStart(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"--On Test Start executed");
		
		//Creating a field for every @Test method getting executed
		test = reports.createTest(methodName);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"--On Test Success executed");
		
		//Logging the status of @Test method as PASS
		test.log(Status.PASS, methodName+" -- passed");
	}

	@Override
	public void onTestFailure(ITestResult result){
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"--On Test Failure executed");
		
		//Logging the status of @Test method as FAIL
		test.log(Status.FAIL, methodName+" --failed");
		test.log(Status.INFO, result.getThrowable());
		
		//Webpage screenshot
		String screenshotName = methodName+" - "+dateTimeStamp;
		SeleniumUtility sutil = new SeleniumUtility();
		try {
			String path = sutil.takeWebpageScreenshot(BaseClass.sDriver, screenshotName);
			test.addScreenCaptureFromPath(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"--On Test Skipped executed");

		//Logging the status of @Test method as SKIP
		test.log(Status.SKIP, methodName+" --skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On Start executed");
		
		//Configuration of Extent Report
		ExtentSparkReporter reporter = new ExtentSparkReporter
				(".\\Extent_Reports\\report-"+dateTimeStamp+".html");
		reporter.config().setDocumentTitle("Extent Report");
		reporter.config().setReportName("VTiger Report");
		reporter.config().setTheme(Theme.STANDARD);
		
		//Generate an empty report
		reports = new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("Base OS", "Windows");
		reports.setSystemInfo("Base browser", "Chrome");
		reports.setSystemInfo("Base URL", "http://localhost:8888/");
		reports.setSystemInfo("Test Engineer", "Rajat");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On Finish executed");
		
		//Flushing the Extent report
		reports.flush();
	}
	
}
