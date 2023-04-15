package Extentreports;

import java.io.File;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Seshu  {
    @Test
	public void before() {
		ExtentReports report = new ExtentReports();
		File file = new File(System.getProperty("user.dir") + "\\karanam\\report.html");
		ExtentSparkReporter sparkreport = new ExtentSparkReporter(file);
		report.flush();

	}

}
