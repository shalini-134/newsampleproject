package Allpagespageobjectmodel;

import org.openqa.selenium.By;

import BaseP.BaseC;

public class loginPage extends BaseC
{
	public static By EMailInput= By.xpath("//input[@id='email']");
	public static By EMailpassword= By.xpath("//input[@id='pass']");
	public static  By Buttonlogin=By.xpath("//button[@name='login']");


	public static void Enter_email(String emailid,By EMailInput)

	{
		driver.findElement(EMailInput).sendKeys(emailid);
		
	}
	
	public static void Enter_password(String passwordid,By EMailpassword)
	{
		driver.findElement(EMailpassword).sendKeys(passwordid);
		
	}
	
	public static void Button_login()
	{
		 driver.findElement(Buttonlogin).click();
	
		
	}

}