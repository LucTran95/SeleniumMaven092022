package anhtester.com.Bai7_WedDriver;

import anhtester.com.ThucHanh.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ListWebElement extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createDriver();
            driver.get("https://app.hrsale.com/");
            driver.findElement(By.xpath("//button[normalize-space()='Super Admin']")).click();
            driver.findElement(By.xpath("//button[@type='submit']")).click();


        Thread.sleep(7000);

        List<WebElement> listMenu = driver.findElements(By.xpath("//ul[@class='pc-navbar']/li"));

        System.out.println(listMenu.get(3).getText());
//      listMenu.get(3).click();
        driver.findElement(By.xpath("//ul[@class='pc-navbar']/li[2]")).click();


//        for (int i =0; i< listMenu.size(); i++){
//            System.out.println(listMenu.get(i).getText());
//        }
        closeDriver();
    }
}
