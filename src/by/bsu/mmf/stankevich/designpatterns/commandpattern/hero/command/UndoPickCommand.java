package by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.command;

import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.player.Player;
import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.receiver.IPickReceiver;
import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.receiver.Receiver;

/**
 * Created by Lenovo on 06/27/2017.
 */
public class UndoPickCommand extends AbstractCommand {

    public void execute(Player player) {
        Receiver receiver = getReceiver();
        receiver.action(CommandTypes.UNDO_PICK, player);//this   "undoPick"
    }
}
