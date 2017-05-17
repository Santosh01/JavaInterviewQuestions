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

	private static WebDriver webDriver;

	@BeforeTest
	private void doSetUp() {
		System.setProperty("webdriver.gecko.driver", "F:/Set-up/Selenium/geckodriver.exe");
		webDriver = new FirefoxDriver();
		webDriver.manage().window().maximize();
		webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		webDriver.get("https://www.google.com/");
		webDriver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("Santosh Dubey");
	}

	@Test
	private void doLoginTest() throws InterruptedException {

		webDriver.findElement(By.xpath("//*[@id='_fZl']")).click();
		String result = webDriver.findElement(By.xpath("//*[@class='hdtb-mitem hdtb-msel hdtb-imb']")).getText();
		assertEquals("All", result);
	}

	@Test
	private void clickProfile() throws InterruptedException {

		String result = webDriver.findElement(By.xpath("//*[@class='hdtb-mitem hdtb-imb'][2]/a")).getText();
		assertEquals("Videos", result);

	}

	@AfterTest
	private void doTeatDown() throws InterruptedException {
		webDriver.close();
		webDriver.quit();
	}

	public static void main(String[] args) {

		FunctionalTest fb = new FunctionalTest();
		fb.doSetUp();

	}

}
