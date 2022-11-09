package anhtester.com.Bai8_CheckboxRadioDropdown;

import anhtester.com.ThucHanh.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class HandleDropdownListDynamic extends BaseTest {
    public static void main(String[] args) {
        createDriver();

        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");

        //Click vào dropdown category
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']")).click();

        //Search giá trị cần chọn
        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']/parent::a/following-sibling::div//input")).sendKeys("Hotels");

        //Click giá trị cần chọn
//        driver.findElement(By.xpath("//li[@class='active-result highlighted']")).click();
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).perform();


        closeDriver();
    }
}
