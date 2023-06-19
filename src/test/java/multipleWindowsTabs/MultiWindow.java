package multipleWindowsTabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class MultiWindow {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/angularpractice/");

        driver.switchTo().newWindow(WindowType.WINDOW);

        Set<String> handles = driver.getWindowHandles();

        Iterator<String> it = handles.iterator();

        String parentWindowId = it.next();
        String childWindowId = it.next();

        driver.switchTo().window(childWindowId);

        driver.get("https://www.youtube.com/watch?v=9Er90GVTJpY&list=PLFh6J1ZHhqNjwQr51z25gbZ8mMeQUswaV&index=11&t=23s");
    }

}
