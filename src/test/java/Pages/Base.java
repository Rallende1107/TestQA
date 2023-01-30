package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    private WebDriver driver;


    public Base(WebDriver driver) {
        this.driver = driver;
    }

    //Instancia de Chrome
    public WebDriver chromeDriverConnection() {
        System.setProperty("chromedriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

    public WebElement findElemento(By locator) {
        return driver.findElement(locator);
    }

    public List<WebElement> findElementos(By locator) {
        return driver.findElements(locator);
    }

    public String getText(WebElement element) {
        return element.getText();
    }

    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    public void writeTex(String texto, By locator) {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(texto);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public Boolean isDisplayed(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public void visit(String link) {
        driver.get(link);
    }

    public void esperar (int segundos) throws InterruptedException {
        int seg = segundos*1000;
        Thread.sleep(seg);
    }
}
