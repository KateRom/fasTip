import org.junit.Assert;
import org.testng.annotations.Test;
import pageobjects.MainPage;
import pageobjects.SettingsPage;

/*Created by katr on 24.06.2017.
 */
public class MainScenarioTest extends BaseTest{
    @Test
    public void mainScenarioTest(){
        MainPage mainPage = new MainPage(driver);
        SettingsPage settingsPage = mainPage.goToSettingsPage();
        settingsPage.setTextTipPercentage("5.0");
        settingsPage.saveTipPercentage();
        mainPage.setBillAmount("100");
        mainPage.clickCulcTip();
        Assert.assertEquals("5.00", mainPage.checkTipAmount()
                .replace("[","")
                .replace("]","")
                .replace("$",""));
        Assert.assertEquals("105.00", mainPage.checkTotalBill()
                .replace("[","")
                .replace("]","")
                .replace("$",""));
    }
}
