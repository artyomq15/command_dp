package by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.command;

import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.player.Player;
import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.receiver.IPickReceiver;
import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.receiver.Receiver;


public class PickCommand extends AbstractCommand {

    public void execute(Player player) {
        Receiver receiver = getReceiver();
        receiver.action(CommandTypes.PICK_HERO, player);
    }
}
