package vTiger.genericLibrary;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentsReportClass {

	ExtentReports htmlReport =new ExtentReports();
	ExtentSparkReporter htmlReport1=new ExtentSparkReporter("./ExtentReports/FirstReport"+new JavaLibrary().getSystemDate()+".html");
}
