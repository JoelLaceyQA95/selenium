package QA.Joel;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.junit.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ExtentReport {

	private String testString ="http://thedemosite.co.uk";
    private static ExtentReports report;
    private WebDriver webDriver;
	private HomePage home;
	private SpreadSheetReader reader;
	private List<String> spreadSheetRow;


    @BeforeClass
    public static void init() {
        report = new ExtentReports();
        String fileName = "MyReport" + ".html";
        String filePath = System.getProperty("user.dir")
                + File.separatorChar + fileName;
        report.attachReporter(new ExtentHtmlReporter(filePath));
        //System.out.print(filePath);
    }

    @Before
    public void setUp() {
        webDriver = new ChromeDriver();
        reader = new SpreadSheetReader((System.getProperty("user.dir")+ File.separatorChar +"loginDetails.xlsx"));
        spreadSheetRow = reader.readRow(1, "loginDetails");
    }

    @After
    public void tearDown() {
        webDriver.quit();
    }

    @AfterClass
    public static void cleanUp() {
        report.flush();
    }

    @Test
    public void MyFirstTestReportTest() throws IOException {
        ExtentTest test = report.createTest("MyFirstTest");
        test.log(Status.INFO, "My First Test is Starting ");
        
        String username = spreadSheetRow.get(0);
        String password = spreadSheetRow.get(1);
        String expectedResult = spreadSheetRow.get(2);
        
        webDriver.navigate().to(testString);
		home = PageFactory.initElements(webDriver, HomePage.class);
		home.addUserBtn();
		home.typeUsername(username);
		home.typePassword(password);
		home.submitUser();
		home.loginTab();
		home.typeUsername2(username);
		home.typePassword2(password);
		home.loginBtn();
		
		String loginMessage = home.getLoginMessage();
		System.out.print(loginMessage);
		String expectedSuccesfulLogin = expectedResult;
		
		try {
		assertEquals("error", expectedSuccesfulLogin, loginMessage);
		ScreenShot.take(webDriver, "loginsuccess");
		test.pass("successful login in test");
		}catch(AssertionError ae) {
			ScreenShot.take(webDriver, "loginfailure");
			test.fail("test failed to log in");
			throw ae;
		}
    }

}
