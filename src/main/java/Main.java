import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jelena84\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        /*WebElement product = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]"));
        for (int i = 0; i < 3; i++) {
            product.click();
        }*/
        WebElement product1 = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[3]/div/div[2]/div[2]/a[1]"));
                product1.click();
                WebElement continueShoppingButton = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span/i"));
                        continueShoppingButton.click();
        Wait<WebDriver> fluentWait = new FluentWait<>(driver).pollingEvery(Duration.ofSeconds(2));

        WebElement product2 = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[5]/div/div[2]/div[2]/a[1]"));
        product2.click();
        WebElement continueShoppingButton1 = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span/i"));
        continueShoppingButton1.click();

        WebElement product3 = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[4]/div/div[2]/div[2]/a[1]"));
        product3.click();

        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement cartButton = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
        cartButton.click();
        WebElement minus = driver.findElement(By.xpath("//*[@id=\"cart_quantity_down_1_1_0_0\"]/span/i"));
        minus.click();
        WebElement add = driver.findElement(By.xpath("//*[@id=\"cart_quantity_up_5_19_0_0\"]/span/i"));
        add.click();

        driver.quit();

    }
}
