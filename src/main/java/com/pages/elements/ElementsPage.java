package com.pages.elements;

import com.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class ElementsPage extends HomePage {

    private By textBoxMenuItem = By.xpath("//li[@id='item-0']/span[text()='Text Box']");
    private By webTablesMenuItem = By.xpath("//li[@id='item-3']/span[text()='Web Tables']");
    private By linksMenuItem = By.xpath("//li[@id='item-5']/span[text()='Links']");
    private By dynamicPropertiesMenuItem = By.xpath("//li[@id='item-8']/span[text()='Dynamic Properties']");

    public TextBoxPage clickTextBox() {
        scrollToElementJS(textBoxMenuItem);
        click(textBoxMenuItem);
        return new TextBoxPage();
    }

    public WebTablesPage clickWebTables() {
        scrollToElementJS(webTablesMenuItem);
        click(webTablesMenuItem);
        return new WebTablesPage();
    }

    public LinksPage clickLinks() {
        scrollToElementJS(linksMenuItem);
        click(linksMenuItem);
        return new LinksPage();
    }

    public DynamicPropertiesPage clickDynamicProperties() {
        scrollToElementJS(dynamicPropertiesMenuItem);
        click(dynamicPropertiesMenuItem);
        return new DynamicPropertiesPage();
    }
}
