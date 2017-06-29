package by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.command;

import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.player.Player;
import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.receiver.Receiver;

/**
 * Created by Lenovo on 06/27/2017.
 */
public class RepickCommand extends AbstractCommand {

    public void execute(Player player){
        Receiver receiver = getReceiver();
        receiver.action(CommandTypes.REPICK_HERO, player); //"repickHero"
    }
}
