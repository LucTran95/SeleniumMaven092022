package anhtester.com.Bai5_Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginHRM {
    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo browser với Chrome
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Mở trang Ecommerce
        driver.get("https://app.hrsale.com/");
        Thread.sleep(1000);


        driver.findElement(By.xpath("//*[@id=\"iusername\"]")).sendKeys("Huulu995@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"ipassword\"]")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id=\"erp-form\"]/div[3]/div[1]/button")).click();

        //Tắt browser
        driver.quit();
    }
}
