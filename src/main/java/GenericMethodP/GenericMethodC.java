package GenericMethodP;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.OutputType;

import BaseP.BaseC;

public class GenericMethodC extends BaseC

{
	public static void JavascriptExecutor_click(By Buttonlogin)
	{
		WebElement ele =driver.findElement(Buttonlogin);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	
		  js.executeScript("arguments[0].click();", ele);
	}
		
	// TakesScreenshot------------Interface------------------------->

	public static String captureScreenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) BaseC.driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\hp\\Documents\\screenshots\\" + "Screenshot"
				+ System.currentTimeMillis() + ".png");
		FileUtils.copyFile(src, des);
		return des.getAbsolutePath();

	}
}