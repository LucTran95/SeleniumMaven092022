package anhtester.com.Bai6_WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginCMS {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Mở browser
        driver.get("https://demo.activeitzone.com/ecommerce/login");

        //Bắt WebElement email (Object)
        WebElement inputEmail = driver.findElement(By.id("email"));
        inputEmail.sendKeys("admin@example.com");
        // Cách 2 driver.findElement(By.id("email")).sendKeys("Huuluc95@gmail.com");

        driver.findElement(By.id("password")).sendKeys("123456");
        Thread.sleep(2000);

        //Clear Email and Password
//        inputEmail.clear();
//        driver.findElement(By.id("password")).clear();

        WebElement checkboxRemember1 = driver.findElement(By.id("remember"));
        System.out.println("Đã chon: " + checkboxRemember1.isSelected());

        driver.findElement(By.xpath("(//span[normalize-space()='Remember Me'])[1]")).click();

        WebElement checkboxRemember2 = driver.findElement(By.id("remember"));
        System.out.println("Đã chon: " + checkboxRemember2.isSelected());

        //Get text của tiêu đề h1
        WebElement tieude = driver.findElement(By.xpath("//div[@class='card-body']//h1"));
        System.out.println(tieude.getText());

        WebElement buttonCopy = driver.findElement(By.xpath("(//button[normalize-space()='Copy'])"));
        System.out.println("Trạng thái nút Copy: " + buttonCopy.isDisplayed());

        //Lấy mã màu
        WebElement buttonlogin =driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        System.out.println(buttonlogin.getCssValue("background-color"));

//        if(buttonCopy.isDisplayed() == true) {
////          driver.findElement(By.xpath(" //button[normalize-space()='Login']")).click();
//            driver.findElement(By.xpath(" //button[normalize-space()='Login']")).submit();
//        }

        
       // driver.findElement(By.xpath(" //button[normalize-space()='Login']")).click();
        Thread.sleep(2000);

        //Close Browser
        driver.quit();
    }
}
