package anhtester.com.Bai8_CheckboxRadioDropdown;

import anhtester.com.ThucHanh.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownListStatic extends BaseTest {
    public static void main(String[] args) {
        createDriver();
        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

        WebElement selectElement = driver.findElement( By.xpath("//select[@id='select-demo']"));

        //Khơi tạo đối tượng select và giá trị là một WebElement của thẻ sewlect trong  HTML
        Select select = new Select (selectElement);
        System.out.println(select.getFirstSelectedOption().getText());
        System.out.println("Kiểm tra kiểu của select: " + select.isMultiple());
        System.out.println("Số lượng option trong dropdown là " + select.getOptions().size());

        //Get option với các hàm hỗ trợ của class select
        select.selectByVisibleText("Wednesday");
        sleep(1);

        System.out.println(select.getFirstSelectedOption().getText());

        //Get option
        select.selectByValue("Monday");
        sleep(1);
        System.out.println(select.getFirstSelectedOption().getText());

        //Get option from position 6
        select.selectByIndex(6);
        sleep(2);
        System.out.println(select.getFirstSelectedOption().getText());

        closeDriver();
    }

}
