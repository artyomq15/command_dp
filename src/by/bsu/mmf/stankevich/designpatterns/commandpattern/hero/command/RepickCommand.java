package by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.command;

import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.player.Player;

/**
 * Created by Lenovo on 06/27/2017.
 */
public class RepickCommand extends AbstractCommand {

    public void execute(Player player){
        //super.getReceiver().repickHero(player);
        super.getReceiver().action(CommandTypes.REPICK_HERO, player); //"repickHero"
    }
}
