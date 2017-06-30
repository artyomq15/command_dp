package by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.receiver;

import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.player.Player;

/**
 * Created by Lenovo on 06/29/2017.
 */
public abstract class IFightReceiver  implements Receiver {
    public abstract void attack(Player player);
    public abstract void block(Player player);
}
