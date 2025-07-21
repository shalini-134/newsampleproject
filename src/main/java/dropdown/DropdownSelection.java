package dropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropdownSelection {

    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); 

   
        WebDriver driver = new ChromeDriver();

       
        driver.get("your_webpage_url");

       
        WebElement dropdownElement = driver.findElement(By.id("your_dropdown_id")); 

       
        Select dropdown = new Select(dropdownElement);
     
         dropdown.selectByVisibleText("Option Text"); 

     
        dropdown.selectByIndex(2);

     
        dropdown.selectByValue("option_value");

     
        driver.quit();
    }
}