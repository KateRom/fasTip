package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/*Created by katr on 24.06.2017.
 */
public class MainPage extends BasePage{

    private String tipPercentage;
    private String totalAmount;

    @AndroidFindBy(id = "menu_settings")
    private MobileElement goToSettingsButton;

    @AndroidFindBy(id = "billAmtEditText")
    private MobileElement textBillAmount;

    @AndroidFindBy(id = "calcTipButton")
    private MobileElement calcTipButton;

    @AndroidFindBy(id = "tipAmtTextView")
    private MobileElement culcTipAmount;

    @AndroidFindBy(id = "totalAmtTextView")
    private MobileElement totalWithTip;

    public MainPage(AppiumDriver<MobileElement> driver){
        super(driver);
    }

    public SettingsPage goToSettingsPage(){
        goToSettingsButton.click();
        return new SettingsPage(driver);
    }

    public void setBillAmount(String bill){
        textBillAmount.sendKeys(bill);
    }

    public void clickCulcTip(){
        calcTipButton.click();
    }

    public String checkTipAmount(){
        return this.tipPercentage = culcTipAmount.getText();
    }

    public String checkTotalBill(){
        return this.totalAmount = totalWithTip.getText();
    }
}
