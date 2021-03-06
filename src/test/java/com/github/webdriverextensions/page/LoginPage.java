package com.github.webdriverextensions.page;

import java.util.List;
import static com.github.webdriverextensions.Bot.*;
import static com.github.webdriverextensions.ThreadDriver.*;
import com.github.webdriverextensions.WebPage;
import com.github.webdriverextensions.generator.annotations.Generate;
import com.github.webdriverextensions.page.components.HtmlComponent;
import com.github.webdriverextensions.page.components.Menu;
import com.github.webdriverextensions.page.components.MenuButtonGroup;
import com.github.webdriverextensions.page.components.UserRow;
import com.github.webdriverextensions.page.components.UserTableSearchContext;
import com.github.webdriverextensions.site.AnotherSite;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Generate(name = "examplesPage2")
public class LoginPage extends WebPage<AnotherSite> {

    // Section: WebElements
    @FindBy(css = "#search-query")
    public WebElement searchQuery;
    @FindBy(css = "#search")
    public WebElement search;
    // Section: Extended WebElements
    @FindBy(css = ".btn-group")
    public MenuButtonGroup menuButtonGroup;
    @FindBy(css = ".btn-group")
    public MenuButtonGroup menuButtonGroups;
    // Section: List with WebElements
    @FindBy(css = "#todo-list li")
    public List<WebElement> todos;
    // Section: List with Extended WebElements
    @FindBy(css = "#user-table tbody tr")
    public List<UserRow> rows;
    // Search Context Testing
    @FindBy(css = "#user-table")
    public UserTableSearchContext userTableSearchContext;
    // Wrapper Testing
    @FindBy(css = ".btn-group")
    public Menu menu;
//    @FindBy(css = "#user-table")
//    public UserTable userTable;
    @FindBy(css = "html")
    public HtmlComponent html;

    @Override
    public void open() {
        getDriver().get("http://webdriverextensions.github.com/webdriverextensions/model-test.html");
    }

    @Override
    public void assertIsOpen() throws AssertionError {
//        assertIsDisplayed(searchQuery);
//        assertIsDisplayed(search);
//        assertIsDisplayed(menu);
    }

    public UserRow findUserRowByFirstName(String firstName) {
        for (UserRow row : rows) {
            if (textEquals(firstName, row.firstName)) {
                return row;
            }
        }
        return null;
    }
}
