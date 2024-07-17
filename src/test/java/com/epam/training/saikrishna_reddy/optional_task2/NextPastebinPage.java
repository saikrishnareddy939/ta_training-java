package com.epam.training.saikrishna_reddy.optional_task2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NextPastebinPage {

    NextPastebinPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName = "h1")
    WebElement title;

    @FindBy(xpath = "//a[@class='btn -small h_800']")
    WebElement syntaxHighlighting;

    @FindBy(tagName = "ol")
    WebElement paragraph;

    public String getPageTitle() {
        return title.getText();
    }

    public String getSyntax() {
        return syntaxHighlighting.getText();
    }

    public String getParagraph() {
        return paragraph.getText();
    }
}

