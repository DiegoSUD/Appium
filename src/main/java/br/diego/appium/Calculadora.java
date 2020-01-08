package br.diego.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;



import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculadora {
	
	@Test
	public void deveSomarDoisValores() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "ec6163f");
	    desiredCapabilities.setCapability("automationName", "uiautomator2");
//	    desiredCapabilities.setCapability("appPackage", "com.miui.calculator");
//	    desiredCapabilities.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
	    desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\Dev\\ESTUDOS\\CursoAppium\\src\\main\\resources\\CTAppium-1-1.apk");

	    
	    AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
	    
//	    MobileElement el2 = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_2_s");
//	    el2.click();
//	    MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("adição");
//	    el3.click();
//	    MobileElement el4 = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_2_s");
//	    el4.click();
//	    MobileElement el5 = (MobileElement) driver.findElementById("com.miui.calculator:id/result");
	    
//	    driver.quit();
	}

}
