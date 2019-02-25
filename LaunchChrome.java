import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchChrome {

  public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/enwayimac6/eclipse-workspace/TestProd/chromedriver");
        WebDriver driver = new ChromeDriver();              
        String baseUrl = "https://e2e-e2efleetcor.cs101.force.com/e2eForm?country=Germany#";
        driver.get(baseUrl);
        driver.findElement(By.id("longForm:form:firstName")).click();
        driver.findElement(By.id("longForm:form:firstName")).clear();
        driver.findElement(By.id("longForm:form:firstName")).sendKeys("test");
        driver.findElement(By.id("longForm:form:lastName")).clear();
        driver.findElement(By.id("longForm:form:lastName")).sendKeys("test");
        driver.findElement(By.id("longForm:form:email")).clear();
        driver.findElement(By.id("longForm:form:email")).sendKeys("test@mail.com");
        driver.findElement(By.id("longForm:form:phone")).sendKeys("49123456789");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Kunde werden und Tankkarten beantragen'])[2]/following::div[8]")).click();
        driver.findElement(By.id("longForm:form:j_id98")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[6]/following::label[1]")).click();
        driver.findElement(By.id("longForm:form:j_id112")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        driver.findElement(By.id("longForm:form:city")).sendKeys("weimar");
        driver.findElement(By.id("longForm:form:company")).sendKeys("test");
        driver.findElement(By.id("longForm:form:j_id148")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Die Karten werden an diese Adresse geliefert'])[1]/following::label[1]")).click();
        driver.findElement(By.id("longForm:form:j_id174")).click();
        Thread.sleep(8000);
        
        driver.findElement(By.id("longForm:form:taxid")).sendKeys("123456789");
        driver.findElement(By.id("longForm:form:continueToPumping")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        driver.findElement(By.id("longForm:form:pump")).sendKeys("1111");
        driver.findElement(By.id("longForm:form:j_id211")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        driver.findElement(By.id("longForm:form:j_id299")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        driver.findElement(By.id("longForm:form:continue-button")).click();
        driver.findElement(By.id("longForm:form:j_id707:0:j_id764")).click();
        Thread.sleep(8000);
        driver.findElement(By.id("longForm:form:j_id780")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        driver.findElement(By.id("longForm:form:j_id790:0:companyName")).sendKeys("test");
        driver.findElement(By.id("longForm:form:j_id790:0:save-param-btn-id")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("longForm:form:j_id790:1:save-param-btn-id")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("longForm:form:goToPaymentOptionsBtn")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        driver.findElement(By.id("longForm:form:j_id929")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        driver.findElement(By.id("longForm:form:IBAN")).sendKeys("DE89370400440532013000");
        driver.findElement(By.id("longForm:form:SWIFT")).sendKeys("AARBDE5W100");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='?'])[3]/following::label[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='?'])[3]/following::label[2]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='?'])[3]/following::label[3]")).click();
        driver.findElement(By.id("longForm:form:j_id1009")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Einfache, schnelle und bequeme Zahlungsmethode.'])[1]/following::label[1]")).click();
        driver.findElement(By.id("longForm:form:j_id1020:0:j_id1022")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("longForm:form:j_id1046")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        driver.findElement(By.id("Ecom_Payment_Card_Name")).sendKeys("TEST TEST");
        driver.findElement(By.id("Ecom_Payment_Card_Number")).sendKeys("4111111111111111");
        driver.findElement(By.id("Ecom_Payment_Card_ExpDate_Month")).sendKeys("12");
        driver.findElement(By.id("Ecom_Payment_Card_ExpDate_Year")).sendKeys("2021");
        driver.findElement(By.id("Ecom_Payment_Card_Verification")).sendKeys("123");
        Thread.sleep(3000);
        driver.findElement(By.id("submit3")).click();
        
        
        
  }

  
}