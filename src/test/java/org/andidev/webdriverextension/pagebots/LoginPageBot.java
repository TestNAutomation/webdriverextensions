package org.andidev.webdriverextension.pagebots;

import static org.andidev.webdriverextension.bot.JUnitBot.*;
import org.andidev.webdriverextension.annotation.Generate;
import org.andidev.webdriverextension.pagemodels.LoginPageModel;
import org.andidev.webdriverextension.pagemodels.models.UserRow;

@Generate(name = "examplesPage2")
public class LoginPageBot extends LoginPageModel {

    @Override
    public void open() {
        getDriver().get("http://andidev.github.com/webdriver-extension/index.html");
    }

    @Override
    public void assertIsOpen() throws Error {
//        assertIsDisplayed(searchQuery);
//        assertIsDisplayed(search);
//        assertIsDisplayed(menu);
    }

    public UserRow findUserRowByFirstName(String firstName) {
        for (UserRow row : rows) {
            if (isText(firstName, row.firstName)) {
                return row;
            }
        }
        return null;
    }
}