package relLoc;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocator {

    public static void main(String[] args)
    {
      WebDriverManager.chromedriver().setup();

       WebDriver driver = new ChromeDriver();

       driver.get("https://rahulshettyacademy.com/angularpractice/");

        WebElement nameTextBox = driver.findElement(By.xpath("(//*[@name='name'])[1]"));
        System.out.println(driver.findElement(with(By.tagName("label")).above(nameTextBox)).getText());

        WebElement dobTextBox = driver.findElement(By.xpath("//*[@for='dateofBirth']"));
        System.out.println(driver.findElement(with(By.tagName("input")).below(dobTextBox)).getText());

        WebElement iceCreamLover = driver.findElement(By.xpath("//label[@for='exampleCheck1']"));
        driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLover)).click();

        WebElement esLabel = driver.findElement(By.xpath("//label[@for='exampleFormControlRadio1']"));
        driver.findElement(with(By.tagName("input")).toRightOf(esLabel)).click();
    }

}
