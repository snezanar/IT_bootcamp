package ProjectTests;

import Projekat.ContactUs;
import Projekat.Home;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestContactUs {
    public static void main(String[] args) {
    }
    private static WebDriver wd;
    private static SoftAssert sa;

    @BeforeSuite
    public void setProperties(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Misa i Sneza\\Downloads\\!IT BOOTCAMP\\7. SELENIJUM\\chromedriver.exe");
    }
    @BeforeMethod
    public void setDriver() {
        wd = new ChromeDriver();
        wd.get(Home.URL);
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        sa=new SoftAssert();
    }
    @Test
    public void contactForm() throws InterruptedException {

        ContactUs.clickContactUs(wd);
        ContactUs.selectSubjectHeading(wd, "Webmaster");
        ContactUs.inputEmail(wd, "snezana@mail.com");
        ContactUs.inputOrderRef(wd, "123456789");
        ContactUs.chooseFile(wd, "C:\\Users\\Misa i Sneza\\Downloads\\!IT BOOTCAMP\\4. CV\\V4.jpg");
        ContactUs.inputMessage(wd, "Hello!");
        ContactUs.clickSend(wd);
        Thread.sleep(2000);
        Assert.assertEquals(ContactUs.messageStatus(wd).getAttribute("class"), "alert alert-success");

    }

    @Test
    public void contactFormReading() throws InterruptedException {

        HSSFWorkbook wb;
        FileInputStream fi;
        try {
            fi = new FileInputStream("C:\\Users\\Misa i Sneza\\Downloads\\!IT BOOTCAMP\\7. SELENIJUM\\ContactFormData.xls");
            wb = new HSSFWorkbook(fi);

            Sheet sheet = wb.getSheetAt(0);
            for (int i = 1; i <= 3; i++) {
                Thread.sleep(1000);
                Row row = sheet.getRow(i);
                Cell subjectHeading = row.getCell(0);
                Cell email = row.getCell(1);
                Cell orderRef = row.getCell(2);
                Cell message = row.getCell(3);

                ContactUs.clickContactUs(wd);
                ContactUs.selectSubjectHeading(wd, subjectHeading.toString());
                ContactUs.inputEmail(wd, email.toString());
                ContactUs.inputOrderRef(wd, orderRef.toString());
                ContactUs.inputMessage(wd, message.toString());
                ContactUs.clickSend(wd);
                Thread.sleep(1000);
                Assert.assertEquals("alert alert-success", ContactUs.messageStatus(wd).getAttribute("class")); //class="alert alert-success"

                wd.navigate().back();

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @AfterMethod
    public void closePage(){
        wd.close();
    }
}