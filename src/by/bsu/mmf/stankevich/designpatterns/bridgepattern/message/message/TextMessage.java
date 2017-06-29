package by.bsu.mmf.stankevich.designpatterns.bridgepattern.message.message;

import by.bsu.mmf.stankevich.designpatterns.bridgepattern.message.sender.Sender;

/**
 * Created by Lenovo on 06/28/2017.
 */
public class TextMessage extends Message {
    private String text;
    public TextMessage(Sender sender){
        super(sender);
    }
    public void setText(String text){
        this.text = text;
    }
    public String getText(){
        return text;
    }
    public void sendMessage(){
        getSender().sendMessage();
    }
}
