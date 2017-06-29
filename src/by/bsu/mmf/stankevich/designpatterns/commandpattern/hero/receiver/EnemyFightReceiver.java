package by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.receiver;

import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.command.CommandTypes;
import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.player.Player;


/**
 * Created by Lenovo on 06/28/2017.
 */
public class EnemyFightReceiver extends IFightReceiver {

    public void attack(Player player){
        System.out.println("ENEMY ATTACK!!");
    }
    public void action(CommandTypes cmd, Player player){
        switch (cmd){
            case ATTACK:
                attack(player);
                break;
        }

    }

}
