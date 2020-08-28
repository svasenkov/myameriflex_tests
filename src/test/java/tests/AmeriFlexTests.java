package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AmeriFlexTests extends TestBase {

    @Test
    @DisplayName("Main page successfully open and has label \"Your journey to simple...\"")
    public void mainPageOpensTest() {
        open("http://www.myameriflex.com/");

        $(".page-hero-title").shouldHave(text("Your journey to simple, more affordable benefits starts here."));
    }

    @Test
    @DisplayName("Request proposal page successfully opens")
    public void requestProposalPageOpensFromMainPageTest() {
        open("http://www.myameriflex.com/");

        $(".page-hero-action").click();

        $(".page-heading").shouldHave(text("Complete the form below and one of our team members will be in touch with you soon."));
    }

    @Test
    @DisplayName("About page successfully opens")
    public void aboutPageOpensFromMainPageTest() {
        open("http://www.myameriflex.com/");

        $("#responsiveNavbarDropdown-90").click();

        $("html").shouldHave(text("Ameriflex is recognized as one of the nation’s largest independent"));
    }


}
