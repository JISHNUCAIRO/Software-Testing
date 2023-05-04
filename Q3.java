package questions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q3 {
  public static void main(String[] d) throws InterruptedException {
	  WebDriverManager.edgedriver().setup();
		EdgeOptions co=new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		Thread.sleep(1000);;
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("9488594226");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("8001jishnu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/a/div/div")).click();
		Thread.sleep(1000);
		
		String s = driver.findElement(By.xpath("//*[@id=\"a-page\"]/section/div/div[4]/form/label")).getText();
		System.out.print("Orders placed - "+s+".");
  }
}