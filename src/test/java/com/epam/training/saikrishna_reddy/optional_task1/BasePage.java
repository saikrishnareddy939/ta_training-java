package com.epam.training.saikrishna_reddy.optional_task1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(id = "postform-text")
    WebElement pasteTextArea;

    @FindBy(xpath = "(//span[@class='select2-selection__arrow'])[3]")
    WebElement pasteExpirationDropDown;

    @FindBy(xpath = "//li[text()='10 Minutes']")
    WebElement pasteExpirationOptions;

    @FindBy(id = "postform-name")
    WebElement pasteTitle;

    @FindBy(css = "button[class='btn -big']")
    WebElement createPasteRequest;

    public void createPaste(String content, String titleName){
        pasteTextArea.sendKeys(content);
        pasteExpirationDropDown.click();
        pasteExpirationOptions.click();
        pasteTitle.sendKeys(titleName);
        createPasteRequest.click();
    }

}
