package anhtester.com.ThucHanh;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class ClientCRM extends BaseTest {

    public static void signinCRM() {
        driver.get("https://rise.fairsketch.com/signin");
        driver.findElement(By.xpath("//input[@id='email']")).clear();
        driver.findElement(By.xpath("//input[@id='password']")).clear();
        sleep(1);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@demo.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("riseDemo");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    //Open client page
    public static void OpenPage() {
        sleep(1);
        driver.findElement(By.xpath("//span[normalize-space()='Clients']")).click();
        sleep(1);
        driver.findElement(By.xpath("//div[@id='page-content']//a[normalize-space()='Clients']")).click();
        sleep(1);
    }

    //Enter data on Add client Dialog
    public static void enterDataAddClient(String ClientName) {
        driver.findElement(By.xpath("(//a[normalize-space()='Add client'])")).click();
        sleep(2);
        driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys(ClientName);
        driver.findElement(By.xpath("//div[@id='s2id_created_by']")).click();
        driver.findElement(By.xpath("//div[@id='select2-drop']//input")).sendKeys("Sara Ann", Keys.ENTER);
        sleep(1);
        driver.findElement(By.id("address")).sendKeys("ĐHĐN");
        driver.findElement(By.id("city")).sendKeys("Đà Nẵng");
        driver.findElement(By.id("state")).sendKeys("ĐN");
        driver.findElement(By.id("zip")).sendKeys("9999");
        driver.findElement(By.id("country")).sendKeys("Viet Nam");
        driver.findElement(By.id("phone")).sendKeys("8748564");
        driver.findElement(By.id("website")).sendKeys("taolao.com");

        //Cuộn chuột đến element vAT_number (vÌ nớ bị che)
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.xpath("//label[normalize-space()='Disable online payment']")));

        driver.findElement(By.id("vat_number")).sendKeys("8748");
        driver.findElement(By.xpath("//div[@id='s2id_group_ids']")).click();
        driver.findElement(By.xpath("//div[@id='s2id_group_ids']//input")).sendKeys("VIP", Keys.ENTER);
        sleep(1);
        driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
    }

    //Search Client after Added
    public static void checkClientAfterAdded(String clientName) {
        sleep(2);
        driver.findElement(By.xpath("//div[@id='client-table_filter']//input")).sendKeys(clientName);
        sleep(2);
        String clientNameInTable = driver.findElement(By.xpath("//table[@id='client-table']//tbody//tr[1]/td[2]")).getText();
        System.out.println(clientNameInTable);
    }

    public static void main(String[] args) {
        createDriver();

        signinCRM();
        OpenPage();
        enterDataAddClient("Tào lao");
        checkClientAfterAdded("Emily Smit");

        closeDriver();
    }

}