package add;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SeleniumFlight {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\global\\eclipse-workspace\\add\\target\\test-classes\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//li[@class='myspice_trip']/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_txtOriginStation1_MST")).sendKeys("Goa");
		driver.findElement(By.cssSelector(".text-label")).click();
		Thread.sleep(2000);


		//radio button
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		Thread.sleep(2000);

		//	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//	driver.findElement(By.xpath("//a[contains(text(), 'Varanasi')]")).click();
		Thread.sleep(3000);
		//	driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		Thread.sleep(5000);
		//s	driver.findElement(By.xpath("//div[@id='dropdownGroup1']//a[@value='IXZ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("#hrefIncAdt")).getText());

		int i=1;
		while(i<5)
		{
			driver.findElement(By.cssSelector("#hrefIncAdt")).click();
			i++;
		}
		System.out.println(driver.findElement(By.cssSelector("#hrefIncAdt")).getText());
		driver.findElement(By.id("btnclosepaxoption")).click();


		//dropdown with select tag means a static dropdown

		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		//Autosuggestive dropdown
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List <WebElement>options=driver.findElements(By.cssSelector("li[class=ui-menu-item] a"));
		for(WebElement option :options) {

			if(option.getText().equalsIgnoreCase("India"));
			{
				Thread.sleep(3000);
				option.click();
				Thread.sleep(3000);
				break;
			}
		}


		//Check boxes
		/*	
	Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

	//Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

	driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

	System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

	Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());


	Calendar-date selection

	// System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

{

System.out.println("its enabled");

Assert.assertTrue(true);

}

else

{

Assert.assertTrue(false);

}


		 */

		driver.quit();
	}

}
