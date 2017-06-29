package by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.command;

import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.player.Player;

/**
 * Created by Lenovo on 06/28/2017.
 */
public class AttackCommand extends AbstractCommand {

    public void execute(Player player){
        getReceiver().action(CommandTypes.ATTACK, player);
    }
}
