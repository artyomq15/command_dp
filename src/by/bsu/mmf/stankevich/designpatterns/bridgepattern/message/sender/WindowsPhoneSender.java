package by.bsu.mmf.stankevich.designpatterns.bridgepattern.message.sender;

import by.bsu.mmf.stankevich.designpatterns.bridgepattern.message.sender.SmartphoneSender;

/**
 * Created by Lenovo on 06/28/2017.
 */
public class WindowsPhoneSender extends SmartphoneSender {
    public void sendMessage(){
        System.out.println("Sent from Windows Phone");
    }
}
