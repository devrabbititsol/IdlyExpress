package web.idlyexpress.idlyexpressweb.webtestclasses;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.utilities.BaseClass;
import com.utilities.ConfigFilesUtility;
import com.utilities.QFUtilities;
import web.idlyexpress.idlyexpressweb.webpageclasses.*;

public class TC_OrderBeverages extends BaseClass { 

 	private Logger logger;
 	QFUtilities qf;
	private ConfigFilesUtility configFileObj;
	public boolean isElementDispalyed = false;
 	private String browserName = "chrome";
	private WebDriver driver;


	public TC_OrderBeverages() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(TC_OrderBeverages.class);
		configFileObj = new ConfigFilesUtility();
		qf = new QFUtilities();
		configFileObj.loadPropertyFile("tc_orderbeverages.properties");
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

	private void mangoLassiSelectionTest(int i) throws Exception {

		try { 
			MangoLassiSelection mangoLassiSelectionObj = new MangoLassiSelection();
			windowHandle(driver);
						qf.wait(driver, mangoLassiSelectionObj._mangoLassi);
			qf.clickAction(driver, mangoLassiSelectionObj._mangoLassi, configFileObj.getBooleanProperty("mangoLassi2"  + i + "click"));
			if(configFileObj.getBooleanProperty("mangoLassi2"  + i + "click"))
			printSuccessLogAndReport(logger, "Clicked on Mango Lassi");
			windowHandle(driver);
						qf.wait(driver, mangoLassiSelectionObj._iconiconplusc);
			qf.clickAction(driver, mangoLassiSelectionObj._iconiconplusc);
			printSuccessLogAndReport(logger, "Clicked on icon icon-plus-c");
			windowHandle(driver);
						qf.wait(driver, mangoLassiSelectionObj._addtoCart);
			qf.clickAction(driver, mangoLassiSelectionObj._addtoCart, configFileObj.getBooleanProperty("addtoCart2"  + i + "click"));
			if(configFileObj.getBooleanProperty("addtoCart2"  + i + "click"))
			printSuccessLogAndReport(logger, "Clicked on Add to Cart");

		} catch (Exception e) {
			isElementDispalyed = false;
			printFailureLogAndReport( logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}

	private void roseMilkSelectionTest(int i) throws Exception {

		try { 
			RoseMilkSelection roseMilkSelectionObj = new RoseMilkSelection();
			windowHandle(driver);
						qf.wait(driver, roseMilkSelectionObj._roseMilk);
			qf.clickAction(driver, roseMilkSelectionObj._roseMilk, configFileObj.getBooleanProperty("roseMilk3"  + i + "click"));
			if(configFileObj.getBooleanProperty("roseMilk3"  + i + "click"))
			printSuccessLogAndReport(logger, "Clicked on Rose Milk");
			windowHandle(driver);
						qf.wait(driver, roseMilkSelectionObj._iconiconplusc);
			qf.clickAction(driver, roseMilkSelectionObj._iconiconplusc);
			printSuccessLogAndReport(logger, "Clicked on icon icon-plus-c");
			windowHandle(driver);
						qf.wait(driver, roseMilkSelectionObj._addtoCart);
			qf.clickAction(driver, roseMilkSelectionObj._addtoCart, configFileObj.getBooleanProperty("addtoCart3"  + i + "click"));
			if(configFileObj.getBooleanProperty("addtoCart3"  + i + "click"))
			printSuccessLogAndReport(logger, "Clicked on Add to Cart");
			windowHandle(driver);
						qf.wait(driver, roseMilkSelectionObj._checkout0);
			qf.clickAction(driver, roseMilkSelectionObj._checkout0, configFileObj.getBooleanProperty("checkout03"  + i + "click"));
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

	@Test
	public void screensTest() throws Exception {
		for(int datasets = 1; datasets <= configFileObj.getIntProperty("datasetsLength"); datasets++) {
			isElementDispalyed = true;		 
			setup();			
			setTestcaseName(browserName,"TC_OrderBeverages - " + configFileObj.getProperty("dataset" + (datasets)));
			if(isElementDispalyed) {dashboardScreenTest(datasets);}
			if(isElementDispalyed) {mangoLassiSelectionTest(datasets);}
			if(isElementDispalyed) {roseMilkSelectionTest(datasets);}
			if(isElementDispalyed) {checkoutScreenTest(datasets);}
			tearDown();
		}	}

	
	public void tearDown() throws Exception {
		driver.quit();
	}
}