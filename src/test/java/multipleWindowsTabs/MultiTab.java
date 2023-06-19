package multipleWindowsTabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class MultiTab {

        public static void main(String[] args) {

            WebDriver driver = new ChromeDriver();

            driver.get("https://rahulshettyacademy.com/angularpractice/");

            driver.switchTo().newWindow(WindowType.TAB);

            Set<String> handles = driver.getWindowHandles();

            Iterator<String> it = handles.iterator();

            String parentWindowId = it.next();
            String childWindowId = it.next();

            driver.switchTo().window(childWindowId);

            driver.get("https://rahulshettyacademy.com/");

            driver.switchTo().newWindow(WindowType.WINDOW);


        }

}
