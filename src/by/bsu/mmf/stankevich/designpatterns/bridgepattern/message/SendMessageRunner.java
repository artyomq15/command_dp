package by.bsu.mmf.stankevich.designpatterns.bridgepattern.message;

import by.bsu.mmf.stankevich.designpatterns.bridgepattern.message.message.Message;
import by.bsu.mmf.stankevich.designpatterns.bridgepattern.message.message.TextMessage;
import by.bsu.mmf.stankevich.designpatterns.bridgepattern.message.sender.AndroidSender;
import by.bsu.mmf.stankevich.designpatterns.bridgepattern.message.sender.IPhoneSender;
import by.bsu.mmf.stankevich.designpatterns.bridgepattern.message.sender.Sender;
import by.bsu.mmf.stankevich.designpatterns.bridgepattern.message.sender.WindowsPhoneSender;


public class SendMessageRunner {
    public static void main(String[] args) {
        Sender sender = new AndroidSender();
        Message msg = new TextMessage(sender);
        msg.sendMessage();

        sender = new IPhoneSender();
        msg.setSender(sender);
        msg.sendMessage();

        msg.setSender(new WindowsPhoneSender());
        msg.sendMessage();


    }
}
