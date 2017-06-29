package by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.receiver;

import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.player.Player;

/**
 * Created by Lenovo on 06/29/2017.
 */
public abstract class IPickReceiver implements Receiver{
    public abstract void pickHero(Player player);
    public abstract void repickHero(Player player);
    public abstract void undoPick(Player player);
}
