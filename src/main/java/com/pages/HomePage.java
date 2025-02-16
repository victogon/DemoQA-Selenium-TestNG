package com.pages;

import com.base.BasePage;
import com.pages.alerts_frames_windows.AlertsFramesWindowsPage;
import com.pages.book_store_application.BookStoreApplicationPage;
import com.pages.elements.ElementsPage;
import com.pages.forms.FormsPage;
import com.pages.widgets.WidgetsPage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage  extends BasePage {

    private By elementsCard = By.xpath("//div[@id='app']//h5[text()='Elements']");
    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    private By alertsFrameWindowsCard = By.xpath("//div[@id='app']//h5[text()='Alerts, Frame & Windows']");
    private By widgetsCard = By.xpath("//div[@id='app']//h5[text()='Widgets']");
    private By bookStoreApplicationCard = By.xpath("//div[@id='app']//h5[text()='Book Store Application']");

    public ElementsPage goToElements() {
        scrollToElementJS(elementsCard);
        click(elementsCard);
        return new ElementsPage();
    }

    public FormsPage goToForms() {
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }

    public AlertsFramesWindowsPage goToAlertFramesWindows() {
        scrollToElementJS(alertsFrameWindowsCard);
        click(alertsFrameWindowsCard);
        return new AlertsFramesWindowsPage();
    }

    public WidgetsPage goToWidgets() {
        scrollToElementJS(widgetsCard);
        click(widgetsCard);
        return new WidgetsPage();
    }

    public BookStoreApplicationPage goToBookStoreApplication() {
        scrollToElementJS(bookStoreApplicationCard);
        click(bookStoreApplicationCard);
        return new BookStoreApplicationPage();
    }
}
