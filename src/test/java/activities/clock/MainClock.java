package activities.clock;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class MainClock {
    //evento en el calendario
    public Button addClockButtom = new Button(By.id("com.google.android.deskclock:id/fab"));

    public Button searchButton = new Button(By.id("com.google.android.deskclock:id/search_button"));
    public TextBox addTextCity = new TextBox(By.id("com.google.android.deskclock:id/search_src_text"));
    public Button addNewYork = new Button(By.xpath("//android.widget.TextView[@text='New York']"));

    public Button addParis = new Button(By.xpath("//android.widget.TextView[@text='Paris']"));
    public Button addAlaska = new Button(By.xpath("//android.widget.TextView[@text='Albuquerque']"));

    public Button retroceDe = new Button(By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']"));

}
