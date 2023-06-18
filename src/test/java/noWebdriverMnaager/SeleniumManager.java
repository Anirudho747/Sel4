package noWebdriverMnaager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class SeleniumManager {

    public static void main(String[] args) {

        //available from Selemiun Webdribver 4.6.0
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/angularpractice/");

        WebElement nameTextBox = driver.findElement(By.xpath("(//*[@name='name'])[1]"));
        System.out.println(driver.findElement(with(By.tagName("label")).above(nameTextBox)).getText());

        nameTextBox.sendKeys("abcd");

    }
}