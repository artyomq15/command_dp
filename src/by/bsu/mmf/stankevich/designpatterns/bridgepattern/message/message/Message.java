package by.bsu.mmf.stankevich.designpatterns.bridgepattern.message.message;
import by.bsu.mmf.stankevich.designpatterns.bridgepattern.message.sender.Sender;

/**
 * Created by Lenovo on 06/28/2017.
 */
public abstract class Message {
    private Sender sender;
    public Message(Sender sender){
        this.sender = sender;
    }
    public Sender getSender(){
        return sender;
    }
    public void setSender(Sender sender){
        this.sender = sender;
    }
    public abstract void sendMessage();

}
