package screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class PartialSS {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/angularpractice/");

        WebElement nameTextBox = driver.findElement(By.xpath("(//*[@name='name'])[1]"));
        System.out.println(driver.findElement(with(By.tagName("label")).above(nameTextBox)).getText());

        nameTextBox.sendKeys("abcd");

        File file = nameTextBox.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(file,new File("img.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
