package Maven_Sample.SampleMavenProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JenkinsMaven1 {
	
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\graje\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
