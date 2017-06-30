package by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.command;

import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.player.Player;
import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.receiver.IFightReceiver;
import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.receiver.Receiver;

/**
 * Created by Lenovo on 06/28/2017.
 */
public class AttackCommand extends AbstractCommand {
    public void execute(Player player) {
        Receiver receiver = getReceiver();
        receiver.action(CommandTypes.ATTACK, player);
    }
}
