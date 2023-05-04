package questions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q2 {
  
  public static void main(String[] s) throws InterruptedException {
	  WebDriverManager.edgedriver().setup();
		EdgeOptions co=new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("bag");
		Thread.sleep(4000);
		
		 driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"p_89/American Tourister\"]/span/a/div/label/i")).click();
		Thread.sleep(1000);
		List<WebElement> web=driver.findElements(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-4']"));
		Thread.sleep(1000);
		int c=0;
		for(WebElement i:web)
		{
			System.out.println(i.getText());
			if(c==5)
				break;
			c++;
		}
		
  }
}