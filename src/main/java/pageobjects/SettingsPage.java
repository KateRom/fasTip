package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/*Created by katr on 24.06.2017.
 */
public class SettingsPage extends BasePage {

    @AndroidFindBy(id = "tipPercentageEditText")
    private MobileElement textTipPercentage;

    @AndroidFindBy(id = "saveSettingsButton")
    private MobileElement saveTipPercentageBatton;

    public SettingsPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void setTextTipPercentage(String tipPercentage){
        if(Double.valueOf(tipPercentage)>=0 &&
                Double.valueOf(tipPercentage)<=100){
            textTipPercentage.clear();
            textTipPercentage.sendKeys(tipPercentage);
        }
    }

    public void saveTipPercentage(){
        saveTipPercentageBatton.click();
    }
}
