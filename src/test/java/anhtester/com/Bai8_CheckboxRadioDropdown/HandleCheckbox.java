package anhtester.com.Bai8_CheckboxRadioDropdown;

import anhtester.com.ThucHanh.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandleCheckbox extends BaseTest {
    public static void main(String[] args) {
        createDriver();

        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        //Kiểm tra checkbox mặc định
        WebElement checkboxOne = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        boolean checkboxStatusBefore = checkboxOne.isSelected();
        System.out.println(checkboxStatusBefore);

        //Nếu checkbox chưa chọn thì click
        if (checkboxStatusBefore == false) {
            checkboxOne.click();
        }
        sleep(1);

        //Kiểm tra lại sau khi click chọn
        boolean checkboxStatusAfter = checkboxOne.isSelected();
        System.out.println("Trạng thái checkbox sau khi chọn " + checkboxStatusAfter);

        //Kiểm tra lại đoạn text sau khi click chọn
        WebElement message = driver.findElement(By.xpath("//div[@id='txtAge']"));
        System.out.println("Trạng thái message " + message.isDisplayed());
        System.out.println(message.getText());

        closeDriver();
    }
}
