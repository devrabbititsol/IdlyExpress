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

public class TC_OrderIdly extends BaseClass { 

 	private Logger logger;
 	QFUtilities qf;
	private ConfigFilesUtility configFileObj;
	public boolean isElementDispalyed = false;
 	private String browserName = "chrome";
	private WebDriver driver;


	public TC_OrderIdly() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(TC_OrderIdly.class);
		configFileObj = new ConfigFilesUtility();
		qf = new QFUtilities();
		configFileObj.loadPropertyFile("tc_orderidly.properties");
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
						qf.wait(driver, idlySelectionObj._idlyV);
			qf.clickAction(driver, idlySelectionObj._idlyV, configFileObj.getBooleanProperty("idlyV2"  + i + "click"));
			if(configFileObj.getBooleanProperty("idlyV2"  + i + "click"))
			printSuccessLogAndReport(logger, "Clicked on Idly (V)");
			windowHandle(driver);
						qf.wait(driver, idlySelectionObj._iconiconplusc);
			windowHandle(driver);
						qf.wait(driver, idlySelectionObj._iconiconminusc);
			windowHandle(driver);
						qf.wait(driver, idlySelectionObj._addtoCart);
			qf.clickAction(driver, idlySelectionObj._addtoCart, configFileObj.getBooleanProperty("addtoCart2"  + i + "click"));
			if(configFileObj.getBooleanProperty("addtoCart2"  + i + "click"))
			printSuccessLogAndReport(logger, "Clicked on Add to Cart");

		} catch (Exception e) {
			isElementDispalyed = false;
			printFailureLogAndReport( logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}

	private void sambarIdlySelectionTest(int i) throws Exception {

		try { 
			SambarIdlySelection sambarIdlySelectionObj = new SambarIdlySelection();
			windowHandle(driver);
						qf.wait(driver, sambarIdlySelectionObj._sambarIdlyV);
			qf.clickAction(driver, sambarIdlySelectionObj._sambarIdlyV, configFileObj.getBooleanProperty("sambarIdlyV3"  + i + "click"));
			if(configFileObj.getBooleanProperty("sambarIdlyV3"  + i + "click"))
			printSuccessLogAndReport(logger, "Clicked on Sambar Idly (V)");
			windowHandle(driver);
						qf.wait(driver, sambarIdlySelectionObj._iconiconplusc);
			qf.clickAction(driver, sambarIdlySelectionObj._iconiconplusc);
			printSuccessLogAndReport(logger, "Clicked on icon icon-plus-c");
			windowHandle(driver);
						qf.wait(driver, sambarIdlySelectionObj._iconiconminusc);
			qf.clickAction(driver, sambarIdlySelectionObj._iconiconminusc);
			printSuccessLogAndReport(logger, "Clicked on icon icon-minus-c");
			windowHandle(driver);
						qf.wait(driver, sambarIdlySelectionObj._quantity);
			qf.sendKeys(driver, sambarIdlySelectionObj._quantity, configFileObj.getProperty("quantity3"  + i + "input"));
			printSuccessLogAndReport(logger, "Entered Quantity input: " + configFileObj.getProperty("quantity3"  + i + "input"));
			windowHandle(driver);
						qf.wait(driver, sambarIdlySelectionObj._addtoCart);
			qf.clickAction(driver, sambarIdlySelectionObj._addtoCart, configFileObj.getBooleanProperty("addtoCart3"  + i + "click"));
			if(configFileObj.getBooleanProperty("addtoCart3"  + i + "click"))
			printSuccessLogAndReport(logger, "Clicked on Add to Cart");

		} catch (Exception e) {
			isElementDispalyed = false;
			printFailureLogAndReport( logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}

	private void idlyVadaSelectionTest(int i) throws Exception {

		try { 
			IdlyVadaSelection idlyVadaSelectionObj = new IdlyVadaSelection();
			windowHandle(driver);
						qf.wait(driver, idlyVadaSelectionObj._idlyVadaComboV);
			qf.clickAction(driver, idlyVadaSelectionObj._idlyVadaComboV, configFileObj.getBooleanProperty("idlyVadaComboV4"  + i + "click"));
			if(configFileObj.getBooleanProperty("idlyVadaComboV4"  + i + "click"))
			printSuccessLogAndReport(logger, "Clicked on Idly Vada Combo (V)");
			windowHandle(driver);
						qf.wait(driver, idlyVadaSelectionObj._quantity);
			qf.sendKeys(driver, idlyVadaSelectionObj._quantity, configFileObj.getProperty("quantity4"  + i + "input"));
			printSuccessLogAndReport(logger, "Entered Quantity input: " + configFileObj.getProperty("quantity4"  + i + "input"));
			windowHandle(driver);
						qf.wait(driver, idlyVadaSelectionObj._iconiconplusc);
			qf.clickAction(driver, idlyVadaSelectionObj._iconiconplusc);
			printSuccessLogAndReport(logger, "Clicked on icon icon-plus-c");
			windowHandle(driver);
						qf.wait(driver, idlyVadaSelectionObj._addtoCart);
			qf.clickAction(driver, idlyVadaSelectionObj._addtoCart, configFileObj.getBooleanProperty("addtoCart4"  + i + "click"));
			if(configFileObj.getBooleanProperty("addtoCart4"  + i + "click"))
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
						qf.wait(driver, podiIdlySelectionObj._podiIdlyV);
			qf.clickAction(driver, podiIdlySelectionObj._podiIdlyV, configFileObj.getBooleanProperty("podiIdlyV5"  + i + "click"));
			if(configFileObj.getBooleanProperty("podiIdlyV5"  + i + "click"))
			printSuccessLogAndReport(logger, "Clicked on Podi Idly (V)");
			windowHandle(driver);
						qf.wait(driver, podiIdlySelectionObj._iconiconplusc);
			qf.clickAction(driver, podiIdlySelectionObj._iconiconplusc);
			printSuccessLogAndReport(logger, "Clicked on icon icon-plus-c");
			windowHandle(driver);
						qf.wait(driver, podiIdlySelectionObj._addtoCart);
			qf.clickAction(driver, podiIdlySelectionObj._addtoCart, configFileObj.getBooleanProperty("addtoCart5"  + i + "click"));
			if(configFileObj.getBooleanProperty("addtoCart5"  + i + "click"))
			printSuccessLogAndReport(logger, "Clicked on Add to Cart");
			windowHandle(driver);
						qf.wait(driver, podiIdlySelectionObj._checkout0);
			qf.clickAction(driver, podiIdlySelectionObj._checkout0, configFileObj.getBooleanProperty("checkout05"  + i + "click"));
			if(configFileObj.getBooleanProperty("checkout05"  + i + "click"))
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
						qf.sendKeys(driver, checkoutScreenObj._yourfirstnamehere, configFileObj.getProperty("yourfirstnamehere6"  + i + "input"));
			printSuccessLogAndReport(logger, "Entered Your first name here input: " + configFileObj.getProperty("yourfirstnamehere6"  + i + "input"));
			windowHandle(driver);
						qf.sendKeys(driver, checkoutScreenObj._yourlastnamehere, configFileObj.getProperty("yourlastnamehere6"  + i + "input"));
			printSuccessLogAndReport(logger, "Entered Your last name here input: " + configFileObj.getProperty("yourlastnamehere6"  + i + "input"));
			windowHandle(driver);
						qf.sendKeys(driver, checkoutScreenObj._youremailhere, configFileObj.getProperty("youremailhere6"  + i + "input"));
			printSuccessLogAndReport(logger, "Entered Your email here input: " + configFileObj.getProperty("youremailhere6"  + i + "input"));
			windowHandle(driver);
						qf.sendKeys(driver, checkoutScreenObj._yourphonenumberhere, configFileObj.getProperty("yourphonenumberhere6"  + i + "input"));
			printSuccessLogAndReport(logger, "Entered Your phone number here input: " + configFileObj.getProperty("yourphonenumberhere6"  + i + "input"));
			windowHandle(driver);
						qf.clickAction(driver, checkoutScreenObj._cOD);
			printSuccessLogAndReport(logger, "Clicked on COD");
			windowHandle(driver);
						qf.clickAction(driver, checkoutScreenObj._cONTINUE, configFileObj.getBooleanProperty("cONTINUE6"  + i + "click"));
			if(configFileObj.getBooleanProperty("cONTINUE6"  + i + "click"))
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
			setTestcaseName(browserName,"TC_OrderIdly - " + configFileObj.getProperty("dataset" + (datasets)));
			if(isElementDispalyed) {dashboardScreenTest(datasets);}
			if(isElementDispalyed) {idlySelectionTest(datasets);}
			if(isElementDispalyed) {sambarIdlySelectionTest(datasets);}
			if(isElementDispalyed) {idlyVadaSelectionTest(datasets);}
			if(isElementDispalyed) {podiIdlySelectionTest(datasets);}
			if(isElementDispalyed) {checkoutScreenTest(datasets);}
			tearDown();
		}	}

	
	public void tearDown() throws Exception {
		driver.quit();
	}
}