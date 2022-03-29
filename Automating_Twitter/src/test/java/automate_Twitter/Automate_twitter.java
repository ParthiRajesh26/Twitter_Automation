package automate_Twitter;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automate_twitter {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.navigate().to(
				"https://twitter.com");

		driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();

		driver.findElement(By.xpath("//input[@name='text']")).sendKeys("Dummy26@gmail.com");

		driver.findElement(By.xpath("//span[text()='Next']")).click();

		driver.findElement(By.xpath("//input[@name='text']")).sendKeys("1234567890"); 

		driver.findElement(By.xpath("//span[text()='Next']")).click();

		driver.findElement(By.xpath("//span[text()='Password']/following::input")).sendKeys("Dummy");

		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/div/div/div/label/div[1]/div/div/div/div/div[2]/div/div/div/div"))
		.sendKeys("Can we Automate tweet with selenium? \n Yes,we can \n Actually, this tweet itself a Automated one!\n #Parthi_codes"); 

		WebElement click=driver.findElement(By.xpath("//span[text()='Tweet']"));

		Actions action=new Actions(driver);
		action.moveToElement(click).click().build().perform();


	}

}
