package br.diego.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class CtAppium01 {
	
	@Test
	public void devePreecherCampoTexto() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    
	   
	    desiredCapabilities.setCapability("deviceName", "ec6163f");
	    desiredCapabilities.setCapability("automationName", "uiautomator2");
	    desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\Dev\\ESTUDOS\\CursoAppium\\src\\main\\resources\\CTAppium-1-1.apk");
	    desiredCapabilities.setCapability("platformName", "Android");

	    
	    AndroidDriver<MobileElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    //SELECIONAR FORMULARIO
	    List<MobileElement> teste = driver.findElements(By.className("android.widget.TextView"));
	    for(MobileElement elementos: teste) {
	    	System.out.println(elementos.getText());
	    }
	    
//	    elementosEncontrados.get(1).click();
	    
	    //ESCREVER UM NOME
	    MobileElement campoNome = driver.findElement(MobileBy.AccessibilityId("nome"));
	    campoNome.sendKeys("Diego");
	    
	    //CHECAR SE O NOME ESTÁ ESCRITO
	    String text = campoNome.getText();
	    Assert.assertEquals("Diego", text);
	    
	    driver.quit();
	}

}
