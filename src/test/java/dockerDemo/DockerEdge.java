package dockerDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DockerEdge {

	@Test
	public static void Test() throws MalformedURLException {
			EdgeOptions option=new EdgeOptions();
			option.addArguments("--headless--");
			URL url= new URL("http://localhost:4444");
			RemoteWebDriver driver=new RemoteWebDriver(url, option);
			
			driver.get("https://www.amazon.in/");
			System.out.println("Title of the App:" + driver.getTitle());
			driver.close();
	}

}
