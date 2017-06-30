package by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.receiver;

import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.command.CommandTypes;
import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.player.Player;


/**
 * Created by Lenovo on 06/28/2017.
 */
public class FightReceiver extends IFightReceiver {

    public void attack(Player player) {
        System.out.println("ATTACK!!");
    }

    public void block(Player player) {
        System.out.println("BLOCK AN ATTACK");
    }

}
