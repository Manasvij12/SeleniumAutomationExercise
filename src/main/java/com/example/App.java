package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://automationexercise.com/");
            driver.manage().window().maximize();

            // 1. Search for a product (e.g., "Dress")
            // Locate search input by placeholder attribute or CSS selector
            WebElement searchInput = driver.findElement(By.cssSelector("input[placeholder='Search Product']"));
            searchInput.sendKeys("Dress");

            // Locate and click search button (the magnifying glass button next to input)
            WebElement searchButton = driver.findElement(By.cssSelector("button.btn.btn-default.btn-sm"));
            searchButton.click();

            // Optional: Wait a few seconds to see search results
            Thread.sleep(5000);

            // Here you can add validation like checking product titles in results

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
