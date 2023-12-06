package Maven_Sample.SampleMavenProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class JenkinsMaven1 {
	
	@Parameters("Browser")
	@Test
	public void test(String bname)
	{
		System.out.println(bname);
		if(bname.equals("chrome"))
		{
			System.out.println("hi chrome");
		}
		else if(bname.equals("edge"))
		{
			System.out.println("hi edge");
		}
		else if(bname.equals("firefox"))
		{
			System.out.println("hi firefox");
		}
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\graje\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
