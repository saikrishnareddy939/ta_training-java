package com.epam.training.saikrishna_reddy.optional_task2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PastebinPage {
        private final WebDriver driver;

        PastebinPage(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver,this);
        }

        @FindBy( id = "postform-text")
        WebElement textInput ;

        @FindBy( xpath = "(//span[@class='select2-selection__arrow'])[2]")
        WebElement syntaxHighlightingDropDown ;

        @FindBy( xpath = "(//span[@class='select2-selection__arrow'])[3]")
        WebElement pasteExpirationDropDown;

        @FindBy( id = "postform-name")
        WebElement titleInput;

        @FindBy( xpath = "//button[@class='btn -big']")
        WebElement createPasteButton;

        public void createPaste(String text, String syntax, String expiration, String title) {

            textInput.sendKeys(text);

            syntaxHighlightingDropDown.click();
            WebElement syntaxHighlight = driver.findElement(By.xpath("//li[text()='"+ syntax +"']"));
            syntaxHighlight.click();

            pasteExpirationDropDown.click();
            WebElement pageExpiration = driver.findElement(By.xpath("//li[text()='"+ expiration +"']"));
            pageExpiration.click();

            titleInput.sendKeys(title);

            createPasteButton.click();

        }
    }
