package anhtester.com.ThucHanh;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;

    //Khởi tạo browser
    public static void createDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    //Đóng browser
    public static void closeDriver() {
        sleep(1);
        driver.close();
    }

    public static void sleep(double seconds)  {
        try {
            Thread.sleep((long) (1000 * seconds));
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
