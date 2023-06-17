package cdp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.emulation.Emulation;

import static java.util.Optional.empty;

public class CDPCommandWrapper {

//No need to use Selenium Commands. We can directly use the CDP commands

    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();

        DevTools devTools = driver.getDevTools();

        devTools.createSession();

 //       driver.executeCdpCommand(Emulation.setDeviceMetricsOverride(600,1000,75,true, empty(), empty(), empty(), empty(), empty(), empty(), empty(), empty(), empty()));


    }
}
