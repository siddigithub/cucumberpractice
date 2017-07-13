package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by usachary on 13/07/2017.
 */
public class LoginPage {

    public LoginPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }

    @FindBy(how = How.NAME, using="UserName")
    public WebElement txtusername;

    @FindBy(how = How.NAME, using = "Password")
    public WebElement txtpassword;

    @FindBy(how = How.NAME, using = "Login")
    public WebElement btnLogin;

    public void Login(String username, String password){
        txtusername.sendKeys(username);
        txtpassword.sendKeys(password);
    }

    public void ClickLogin(){
        btnLogin.submit();
    }
}

