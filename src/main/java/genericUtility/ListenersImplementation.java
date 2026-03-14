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
	
	JavaUtility jUtil = new JavaUtility();
	String dateTimeStamp = jUtil.getCalendarDetails("dd-MM-YYYY hh-mm-ss");
	ExtentReports reports;
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"- On Test Start Executed");
		
		//Creating a Field in Extent Reports
		test = reports.createTest(methodName);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"- On Test success Executed");
		
		//Logging the Status as Pass
		test.log(Status.PASS, methodName+" - Successfully Executed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"- On Test Failure Executed");
		
		
		//Capturing Screenshot
		String screenshotName = methodName+ " - " +dateTimeStamp;
		SeleniumUtility sUtil = new SeleniumUtility();
		try {
			String path =sUtil.captureScreenshot(BaseClass.sDriver, screenshotName);
			//Attaching Screenshot to report
			test.addScreenCaptureFromPath(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//logging the Status as Fail
		test.log(Status.FAIL, methodName+" - Failed");
		test.log(Status.INFO, result.getThrowable());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"- On Test Skipped Executed");
		
		//logging the status as Skipped
		test.log(Status.SKIP, methodName+" - Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("On Start Executed");
		
		//Configuration of Extent Reports
		ExtentSparkReporter reporter = new ExtentSparkReporter(".\\Extent Reports\\report-"+dateTimeStamp+".html");
		reporter.config().setDocumentTitle("Extent Reports");
		reporter.config().setReportName("VTiger Report");
		reporter.config().setTheme(Theme.DARK);
		
		//Generate Empty Report
		reports = new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("Base URL", "http://localhost:8888/");
		reports.setSystemInfo("Base platform", "Windows");
		reports.setSystemInfo("Base Browser", "Chrome");
		reports.setSystemInfo("Test Engineer", "Hareesha");
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On Finish Executed");
		
		//Flushing the report
		reports.flush();
	}
	
	
	

}
