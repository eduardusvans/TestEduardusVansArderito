package demo.mobilePages;

import demo.Utils.ActionUtils.*;
import org.openqa.selenium.By;

import static demo.Utils.ActionUtils.waitABit;
import static demo.Utils.ActionUtils.waitElement;

public class homePage {
    public void isOnHomePage() {
        //return waitElement(assertProfilePage, 30).isDisplayed();
        waitABit(5000);
        waitElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.TextView[1]"),100).isDisplayed();
    }
}

//user di home by xpath : /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.TextView[1]