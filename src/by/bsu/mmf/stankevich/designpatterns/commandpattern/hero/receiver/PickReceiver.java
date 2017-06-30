package by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.receiver;

import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.player.Player;

/**
 * Created by Lenovo on 06/28/2017.
 */
public class PickReceiver extends IPickReceiver {

    public void pickHero(Player player) {
        player.setHeroPickingState(true);
        System.out.println("==" + player.getPlayerName() + "== The hero has been picked");
    }

    public void repickHero(Player player) {
        player.setHeroPickingState(false);
        System.out.println("==" + player.getPlayerName() + "== Choose another hero");
        player.setHeroPickingState(true);
        System.out.println("==" + player.getPlayerName() + "== The hero has been re-picked");
    }

    public void undoPick(Player player) {
        player.setHeroPickingState(false);
        System.out.println("==" + player.getPlayerName() + "== The hero has been canceled from your pick");
    }
}
