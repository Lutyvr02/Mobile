package testSuite;

import activities.clock.AddClockLabel;
import activities.clock.MainClock;
import activities.clock2.MainClock2;
import activities.clock2.Ringtone;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

public class ClockTest {
    MainClock mainClock = new MainClock();
    AddClockLabel addClockLabel = new AddClockLabel();
    Ringtone ringtone = new Ringtone();
    MainClock2 mainClock2 = new MainClock2();

    public void init(){
        mainClock.addClockButtom.click();
        mainClock.searchButton.click();
    }

    String ciudad1 = "New York";
    String ciudad2 = "Paris";
    String ciudad3 = "Albuquerque";

    @Test
    public void verifyClockTask(){

        init();
        mainClock.addTextCity.setText(ciudad1);
        mainClock.addNewYork.click();
        mainClock.retroceDe.click();
        init();
        mainClock.addTextCity.setText(ciudad2);
        mainClock.addParis.click();
        mainClock.retroceDe.click();
        init();
        mainClock.addTextCity.setText(ciudad3);
        mainClock.addAlaska.click();
        mainClock.retroceDe.click();



        Assertions.assertEquals(ciudad1, addClockLabel.Asser.getText(), "Error, ciudad no encontrada");
        Assertions.assertEquals(ciudad2, addClockLabel.Asser1.getText(), "Error, ciudad no encontrada");
        Assertions.assertEquals(ciudad3, addClockLabel.Asser2.getText(), "Error, ciudad no encontrada");
    }

    @Test
    public void verifyClockTaks2(){

        mainClock2.enterClock.click();

        mainClock2.addAlarm.click();
        mainClock2.putHour.click();
        mainClock2.putMin.click();
        mainClock2.okButton.click();

        ringtone.ringenter.click();
        ringtone.addring1.click();
        ringtone.mainClock2.click();

        mainClock2.addAlarm.click();
        mainClock2.putHour1.click();
        mainClock2.putMin1.click();
        mainClock2.okButton.click();

        Assertions.assertNotNull(mainClock2.addAlarm);
    }



    @AfterEach
    public void closeApp(){
        Session.getSession().closeApp();
    }



    //adb devices
    //adb -s device shell
    //dumpsys window windows | grep -E 'mCurrentFocus'
    //com.google.android.deskclock/com.android.deskclock.DeskClock
}