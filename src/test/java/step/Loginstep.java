package step;

import Base.BaseUtil;
import Pages.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by usachary on 12/07/2017.
 */
public class Loginstep extends BaseUtil{

    private BaseUtil base;

    public Loginstep(BaseUtil base) {
        this.base = base;
    }

    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I should see the userform page");
        Assert.assertEquals(base.Driver.findElement(By.id("Initial")).isDisplayed(), true);
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions;
        base.Driver.navigate().to("http://www.executeautomation.com/demosite/Login.html");
    }

    @And("^I enter the username as admin and password as admin$")
    public void iEnterTheUsernameAsAdminAndPasswordAsAdmin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I enter the username as admin and password as admin");
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //base.Driver.findElement(By.name("Login")).submit();
        LoginPage loginPage = new LoginPage(base.Driver);
        loginPage.ClickLogin();
    }

    @And("^I enter the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iEnterTheUsernameAsAndPasswordAs(String username, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I enter the username as " + username + " and password as " + password);
    }

    @And("^I enter the details$")
    public void iEnterTheDetails(DataTable table) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //List<List<String>> data = table.raw();

//        System.out.println("Value of Dataable :-" + data.get(0).get(0).toString());
//        System.out.println("Value of Dataable :-" + data.get(0).get(1).toString());

        LoginPage loginPage = new LoginPage(base.Driver);

        List<User> users = new ArrayList<User>();

        users = table.asList(User.class);
        for (User user:users) {
            System.out.println("The username is :- " + user.username);
            System.out.println("The password is :- " + user.password);
            //base.Driver.findElement(By.name("UserName")).sendKeys(user.username);
            //base.Driver.findElement(By.name("Password")).sendKeys(user.password);
            loginPage.Login(user.username, user.password);
        }
    }

    @And("^I enter the ([^\"]*) and ([^\"]*) details$")
    public void iEnterTheUsernameAndPasswordDetails(String username, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("username:-" + username);
        System.out.println("password:-" + password);

        //throw new PendingException();
    }

    class User{

        public String username;
        public String password;

        public User(String userName, String passWord){
            username = userName;
            password = passWord;
        }
    }
}
