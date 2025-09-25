package Maven1.M1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Swaglabs {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\NITHIN RAJ\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		Thread.sleep(1000);
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		Thread.sleep(1000);
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		Thread.sleep(1000);
		submit.click();
		Thread.sleep(2000);
		WebElement add = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button"));
		add.click();
		Thread.sleep(2000);
		WebElement cart = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]/a/span"));
		cart.click();
		Thread.sleep(2000);
		WebElement checkout = driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/a[2]"));
		checkout.click();
		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.id("first-name"));
		firstname.sendKeys("Nithin R ");
		Thread.sleep(1000);
		WebElement lastname = driver.findElement(By.id("last-name"));
		lastname.sendKeys("Rajan");
		Thread.sleep(1000);
		WebElement post = driver.findElement(By.id("postal-code"));
		post.sendKeys("688003");
		Thread.sleep(1000);
		WebElement cont = driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/form/div[2]/input"));
		cont.click();
		Thread.sleep(2000);
		WebElement finish = driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/div[8]/a[2]"));
		finish.click();
		

		Thread.sleep(2000);
		driver.quit();

	}

}
