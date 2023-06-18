package dimension;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class getHeightWidth {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/angularpractice/");

        WebElement nameTextBox = driver.findElement(By.xpath("(//*[@name='name'])[1]"));
        System.out.println(driver.findElement(with(By.tagName("label")).above(nameTextBox)).getText());

        nameTextBox.sendKeys("abcd");

        System.out.println(nameTextBox.getRect().getDimension().getHeight());
        System.out.println(nameTextBox.getRect().getDimension().getWidth());


        System.out.println(nameTextBox.getRect().getHeight());
        System.out.println(nameTextBox.getRect().getWidth());
    }
}