package br.com.julioproject;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

    @Test
    public void SearchGoogle() {
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        /*
         * driver.findElement(By.xpath(
         * "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).
         * click();
         * driver.findElement(By.xpath(
         * "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea"))
         * .sendKeys("Redit", Keys.ENTER);
         * driver.findElement(By.xpath(
         * "/html/body/div[6]/div/div[13]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div[1]/a"
         * ))
         * .click();
         */

        driver.close();
    }
}
