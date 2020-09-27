package Projekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContactUs {
    private static String contactUsXpath = "//div[@id='contact-link']//a[contains(text(),'Contact us')]";
    public static final String subjectHeadingXpath = "//select[@id='id_contact']";
    public static final String emailXpath = "//input[@id='email']";
    public static final String orderRefXpath = "//input[@id='id_order']";
    public static final String chooseFileXpath = "//input[@id='fileUpload']";
    public static final String sendXpath = "//span[contains(text(),'Send')]";
    public static final String messageBodyXpath = "//textarea[@id='message']";
    public static final String messageStatusXpath = "//p[@class='alert alert-success']";

    public static WebElement getContactUs(WebDriver wd) {
        return wd.findElement(By.xpath(contactUsXpath));
    }

    public static void clickContactUs(WebDriver wd) {
        getContactUs(wd).click();
    }

    public static WebElement getSubjectHeading(WebDriver wd) {
        return wd.findElement(By.xpath(subjectHeadingXpath));
    }

    public static void selectSubjectHeading(WebDriver wd, String value){
        Select select = new Select(getSubjectHeading(wd));
        select.selectByVisibleText(value);
    }

    public static WebElement getEmail(WebDriver wd) {
        return wd.findElement(By.xpath(emailXpath));
    }

    public static void inputEmail(WebDriver wd, String value) {
        getEmail(wd).sendKeys(value);
    }

    public static WebElement getOrderRef(WebDriver wd) {
        return wd.findElement(By.xpath(orderRefXpath));
    }

    public static void inputOrderRef(WebDriver wd, String value) {
        getOrderRef(wd).sendKeys(value);
    }

    public static WebElement getChooseFile(WebDriver wd) {
        return wd.findElement(By.xpath(chooseFileXpath));
    }

    public static void chooseFile(WebDriver wd, String path) {
        getChooseFile(wd).sendKeys(path);
    }

    public static WebElement getMessageBody(WebDriver wd) {
        return wd.findElement(By.xpath(messageBodyXpath));
    }

    public static void inputMessage(WebDriver wd, String value) {
        getMessageBody(wd).sendKeys(value);
    }

    public static void clickSend(WebDriver wd){
        wd.findElement(By.xpath(sendXpath)).click();
    }

    public static WebElement messageStatus(WebDriver wd){
        return wd.findElement(By.xpath(messageStatusXpath));
    }
}
