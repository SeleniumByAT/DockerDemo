package dockerDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DockerChrome {

	public static void main(String[] args) throws MalformedURLException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("---headless--");
		URL url = new URL("http://localhost:4444");
		RemoteWebDriver driver = new RemoteWebDriver(url, option);
	
		

		driver.get("https://www.amazon.in/");
		System.out.println("Title of the App:" + driver.getTitle());
		driver.close();
	}

}
