package Projekat;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ContactFormReading {
    public static void main(String[] args)throws InterruptedException  {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Misa i Sneza\\Downloads\\!IT BOOTCAMP\\7. SELENIJUM\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get(Home.URL);
        wd.manage().window().maximize();

        try {
            FileInputStream fi = new FileInputStream("C:\\Users\\Misa i Sneza\\Downloads\\!IT BOOTCAMP\\7. SELENIJUM\\ContactFormData.xls");
            HSSFWorkbook wb = new HSSFWorkbook(fi);

            Sheet sheet = wb.getSheetAt(0);
            for(int i =1;i<=30;i++){
                Row row = sheet.getRow(i);
                Cell subjectHeading = row.getCell(0);
                Cell email = row.getCell(1);
                Cell orderRef = row.getCell(2);
                Cell message = row.getCell(3);

                ContactUs.clickContactUs(wd);
                ContactUs.selectSubjectHeading(wd,subjectHeading.toString());
                ContactUs.inputEmail(wd, email.toString());
                ContactUs.inputOrderRef(wd, orderRef.toString());
                ContactUs.inputMessage(wd, message.toString());
                ContactUs.clickSend(wd);
                Thread.sleep(1000);
                wd.navigate().back();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("input format not correct");
        }
    }

}

