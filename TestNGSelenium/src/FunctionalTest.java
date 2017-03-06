import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


/**
 * @author Santosh
 *
 */
public class FunctionalTest {

	private static WebDriver driver;

	@BeforeTest
	private void doSetUp() {
		System.setProperty("webdriver.gecko.driver", "F:/Set-up/Selenium/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("Santosh Dubey");
	}

	@Test
	private void doLoginTest() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id='_fZl']")).click();
		String result = driver.findElement(By.xpath("//*[@class='hdtb-mitem hdtb-msel hdtb-imb']")).getText();
		assertEquals("All", result);
	}

	@Test
	private void clickProfile() throws InterruptedException {

		String result = driver.findElement(By.xpath("//*[@class='hdtb-mitem hdtb-imb'][2]/a")).getText();
		assertEquals("Videos", result);

	}

	@AfterTest
	private void doTeatDown() throws InterruptedException {
		driver.close();
		driver.quit();
	}

	public static void main(String[] args) {

		FunctionalTest fb = new FunctionalTest();
		fb.doSetUp();

	}

}
