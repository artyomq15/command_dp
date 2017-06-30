package by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.command;

import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.player.Player;
import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.receiver.Receiver;

/**
 * Created by Lenovo on 06/27/2017.
 */
public abstract class AbstractCommand {
    private Receiver receiver;

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public abstract void execute(Player player);
}
