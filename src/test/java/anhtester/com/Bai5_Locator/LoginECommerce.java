package anhtester.com.Bai5_Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginECommerce {
    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mở trang Ecommerce
        driver.get("https://demo.activeitzone.com/ecommerce/login");
        Thread.sleep(1000);

        // Điền email - Tìm locator theo ID
        driver.findElement(By.id("email")).sendKeys("Huuluc95@gmail.com");
        Thread.sleep(2000);

        // Điền Passwroid - Tìm locator theo name
        driver.findElement(By.name("password")).sendKeys("123456");
        Thread.sleep(2000);

        // Click link forgot password
        //driver.findElement(By.linkText("Forgot password ?")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();
        Thread.sleep(2000);

        //Tắt browser
        driver.quit();
    }
}
