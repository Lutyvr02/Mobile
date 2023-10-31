package activities.clock2;

import control.Button;
import org.openqa.selenium.By;

public class MainClock2 {

    public Button enterClock = new Button(By.xpath("//android.widget.HorizontalScrollView[@resource-id='com.google.android.deskclock:id/tabs']/android.widget.LinearLayout/we[1]"));
    public Button addAlarm = new Button(By.id("com.google.android.deskclock:id/fab"));

    public Button putHour = new Button(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='10']"));

    public Button putMin = new Button(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='25']"));

    public Button okButton = new Button(By.id("android:id/button1"));

    public Button putHour1 = new Button(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='8']"));
    public Button putMin1 = new Button(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='55']"));
}