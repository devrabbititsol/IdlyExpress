package web.idlyexpress.web.webtestclasses;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.utilities.BaseClass;
import com.utilities.ConfigFilesUtility;
import com.utilities.QFUtilities;
import web.idlyexpress.web.webpageclasses.*;

public class TC_OrderIdlyTestcase extends BaseClass { 

 	private Logger logger;
 	QFUtilities qf;
	private ConfigFilesUtility configFileObj;
	public boolean isElementDispalyed = false;
 	private String browserName = "chrome";
	private WebDriver driver;


	public TC_OrderIdlyTestcase() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(TC_OrderIdlyTestcase.class);
		configFileObj = new ConfigFilesUtility();
		qf = new QFUtilities();
		configFileObj.loadPropertyFile("tc_orderidlytestcase.properties");
	}

	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser) throws Exception {
		browserName = browser;
	}

	private void setup() {
		driver = launchBrowser(browserName, configFileObj);
	}

	private void dashboardScreenTest(int i) throws Exception {

		try { 
			DashboardScreen dashboardScreenObj = new DashboardScreen();
			qf.clickAction(driver, dashboardScreenObj._onlinestore, configFileObj.getBooleanProperty("onlinestore1"  + i + "click"));
			if(configFileObj.getBooleanProperty("onlinestore1"  + i + "click"))
			printSuccessLogAndReport(logger, "Clicked on Online store");

		} catch (Exception e) {
			isElementDispalyed = false;
			printFailureLogAndReport( logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}

	private void idlySelectionTest(int i) throws Exception {

		try { 
			IdlySelection idlySelectionObj = new IdlySelection();
			windowHandle(driver);
						qf.wait(driver, idlySelectionObj._close);
			qf.clickAction(driver, idlySelectionObj._close);
			printSuccessLogAndReport(logger, "Clicked on Close");
			windowHandle(driver);
						windowHandle(driver);
						windowHandle(driver);
						qf.clickAction(driver, idlySelectionObj._idlyV, configFileObj.getBooleanProperty("idlyV2"  + i + "click"));
			if(configFileObj.getBooleanProperty("idlyV2"  + i + "click"))
			printSuccessLogAndReport(logger, "Clicked on Idly (V)");
			windowHandle(driver);
						qf.clickAction(driver, idlySelectionObj._addtoCart, configFileObj.getBooleanProperty("addtoCart2"  + i + "click"));
			if(configFileObj.getBooleanProperty("addtoCart2"  + i + "click"))
			printSuccessLogAndReport(logger, "Clicked on Add to Cart");

		} catch (Exception e) {
			isElementDispalyed = false;
			printFailureLogAndReport( logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}

	private void podiIdlySelectionTest(int i) throws Exception {

		try { 
			PodiIdlySelection podiIdlySelectionObj = new PodiIdlySelection();
			windowHandle(driver);
						qf.clickAction(driver, podiIdlySelectionObj._podiIdlyV, configFileObj.getBooleanProperty("podiIdlyV3"  + i + "click"));
			if(configFileObj.getBooleanProperty("podiIdlyV3"  + i + "click"))
			printSuccessLogAndReport(logger, "Clicked on Podi Idly (V)");
			windowHandle(driver);
						windowHandle(driver);
						qf.clickAction(driver, podiIdlySelectionObj._addtoCart, configFileObj.getBooleanProperty("addtoCart3"  + i + "click"));
			if(configFileObj.getBooleanProperty("addtoCart3"  + i + "click"))
			printSuccessLogAndReport(logger, "Clicked on Add to Cart");
			windowHandle(driver);
						qf.clickAction(driver, podiIdlySelectionObj._checkout0, configFileObj.getBooleanProperty("checkout03"  + i + "click"));
			if(configFileObj.getBooleanProperty("checkout03"  + i + "click"))
			printSuccessLogAndReport(logger, "Clicked on Checkout (0)");

		} catch (Exception e) {
			isElementDispalyed = false;
			printFailureLogAndReport( logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}

	private void checkoutScreenTest(int i) throws Exception {

		try { 
			CheckoutScreen checkoutScreenObj = new CheckoutScreen();
			windowHandle(driver);
						qf.sendKeys(driver, checkoutScreenObj._yourfirstnamehere, configFileObj.getProperty("yourfirstnamehere4"  + i + "input"));
			printSuccessLogAndReport(logger, "Entered Your first name here input: " + configFileObj.getProperty("yourfirstnamehere4"  + i + "input"));
			windowHandle(driver);
						qf.sendKeys(driver, checkoutScreenObj._yourlastnamehere, configFileObj.getProperty("yourlastnamehere4"  + i + "input"));
			printSuccessLogAndReport(logger, "Entered Your last name here input: " + configFileObj.getProperty("yourlastnamehere4"  + i + "input"));
			windowHandle(driver);
						qf.sendKeys(driver, checkoutScreenObj._youremailhere, configFileObj.getProperty("youremailhere4"  + i + "input"));
			printSuccessLogAndReport(logger, "Entered Your email here input: " + configFileObj.getProperty("youremailhere4"  + i + "input"));
			windowHandle(driver);
						qf.sendKeys(driver, checkoutScreenObj._yourphonenumberhere, configFileObj.getProperty("yourphonenumberhere4"  + i + "input"));
			printSuccessLogAndReport(logger, "Entered Your phone number here input: " + configFileObj.getProperty("yourphonenumberhere4"  + i + "input"));
			windowHandle(driver);
						qf.clickAction(driver, checkoutScreenObj._cOD);
			printSuccessLogAndReport(logger, "Clicked on COD");
			windowHandle(driver);
						qf.clickAction(driver, checkoutScreenObj._cONTINUE, configFileObj.getBooleanProperty("cONTINUE4"  + i + "click"));
			if(configFileObj.getBooleanProperty("cONTINUE4"  + i + "click"))
			printSuccessLogAndReport(logger, "Clicked on CONTINUE");

		} catch (Exception e) {
			isElementDispalyed = false;
			printFailureLogAndReport( logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}

	private void orderConfirmedScreenTest(int i) throws Exception {

		try { 
			OrderConfirmedScreen orderConfirmedScreenObj = new OrderConfirmedScreen();
			windowHandle(driver);
						qf.clickAction(driver, orderConfirmedScreenObj._yourorderhasbeenplacedsuccessfully);
			printSuccessLogAndReport(logger, "Clicked on Your order has been placed successfully");

		} catch (Exception e) {
			isElementDispalyed = false;
			printFailureLogAndReport( logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}

	@Test
	public void screensTest() throws Exception {
		for(int datasets = 1; datasets <= configFileObj.getIntProperty("datasetsLength"); datasets++) {
			isElementDispalyed = true;		 
			setup();			
			setTestcaseName(browserName,"TC_OrderIdlyTestcase - " + configFileObj.getProperty("dataset" + (datasets)));
			if(isElementDispalyed) {dashboardScreenTest(datasets);}
			if(isElementDispalyed) {idlySelectionTest(datasets);}
			if(isElementDispalyed) {podiIdlySelectionTest(datasets);}
			if(isElementDispalyed) {checkoutScreenTest(datasets);}
			if(isElementDispalyed) {orderConfirmedScreenTest(datasets);}
			tearDown();
		}	}

	
	public void tearDown() throws Exception {
		driver.quit();
	}
}