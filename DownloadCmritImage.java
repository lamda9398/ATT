package att;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Week8  {
	public static void main(String[] args)  throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		WebElement searchBar=driver.findElement(By.name("q"));
		searchBar.sendKeys("cmrit hyderabad");
		searchBar.submit();
		Thread.sleep(1000);
		WebElement img=driver.findElement(By.xpath("//a[normalize-space()='Images']"));
		img.click();
		WebElement img1=driver.findElement(By.xpath("/html/body/div[2]/c-wiz/div[3]/div[1]/div/div/div/div/div[1]/div[1]/span/div[1]/div[1]/div[1]/a[1]/div[1]/img"));
		Actions action = new Actions(driver);
		action.contextClick(img1).build().perform();
		Robot robot=new Robot();
		for(int i=0;i<=6;i++) {
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		System.out.println("downloaded");
	}
}
 
