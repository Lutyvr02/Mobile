package activities.clock2;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class Ringtone {

    public Button ringenter = new Button(By.id("com.google.android.deskclock:id/choose_ringtone"));

    public Button addring1 = new Button(By.xpath("//android.support.v7.widget.RecyclerView[@resource-id='com.google.android.deskclock:id/ringtone_content']/android.widget.FrameLayout[4]/android.widget.LinearLayout/android.widget.RelativeLayout"));

    public Button mainClock2 = new Button(By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']"));



}
