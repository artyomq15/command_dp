package by.bsu.mmf.stankevich.designpatterns.bridgepattern.message.sender;

/**
 * Created by Lenovo on 06/28/2017.
 */
public class AndroidSender extends SmartphoneSender {
    public void sendMessage(){
        System.out.println("Sent from Android");
    }
}
