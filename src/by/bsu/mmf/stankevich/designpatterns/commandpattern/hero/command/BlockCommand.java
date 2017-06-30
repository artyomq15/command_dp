package by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.command;

import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.player.Player;
import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.receiver.IFightReceiver;
import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.receiver.Receiver;

/**
 * Created by Lenovo on 06/30/2017.
 */
public class BlockCommand extends AbstractCommand {

    public void execute(Player player) {
        Receiver receiver = getReceiver();
        receiver.action(CommandTypes.BLOCK, player);
    }
}
