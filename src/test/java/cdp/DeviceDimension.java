package cdp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.emulation.Emulation;
import static java.util.Optional.*;

public class DeviceDimension {



    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();

        //Use ChromeDriver here as CDP is only available to hromeDriver and iEDriver which are under the superclass of ChromiumDriver
        // Other all are under superclass of RemoteWebDriver
         ChromeDriver driver = new ChromeDriver();

         DevTools devTools = driver.getDevTools();

         devTools.createSession();

         //send commands to CDP-> CDP Methods will invoke Chrome Dev Tools
        devTools.send(Emulation.setDeviceMetricsOverride(600,1000,75,true, empty(), empty(), empty(), empty(), empty(), empty(), empty(), empty(), empty()));

        driver.get("URL");

        //page is opened in said dimension

    }
}
