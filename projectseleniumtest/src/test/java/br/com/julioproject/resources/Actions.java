package br.com.julioproject.resources;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.com.julioproject.utils.DriverActions;

public class Actions {

    private WebDriver driver;

    /*
     * @Before
     * public void instanceDriver(String browser) {
     * if (browser.equalsIgnoreCase("chrome")) {
     * driver = new ChromeDriver();
     * return;
     * }
     * if (browser.equalsIgnoreCase("firefox")) {
     * driver = new FirefoxDriver();
     * return;
     * }
     * 
     * }
     */

    @Test
    public void fillForm() {
        driver = new ChromeDriver();

        driver.get("file:///D:/Desenvolvimento/selenium_cicd/projectseleniumtest/index.html");

        driver.quit();

        driver.findElement(By.name("nome")).sendKeys("Jose da Silva");
        driver.findElement(By.name("email")).sendKeys("Jose@gmail");
        driver.findElement(By.name("cep")).sendKeys("123456");
        driver.findElement(By.name("estado")).sendKeys("São paulo");

        driver.findElement(By.xpath("/html/body/form/input[5]")).click();

    }

}
