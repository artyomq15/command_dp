package by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.player;

/**
 * Created by Lenovo on 06/27/2017.
 */
public class Player {
    private String playerName;
    private boolean heroIsPicked;


    public Player(String playerName) {
        this.playerName = playerName;
        heroIsPicked = false;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public boolean getHeroPickingState() {
        return heroIsPicked;
    }

    public void setHeroPickingState (boolean state) {
        this.heroIsPicked = state;
    }
}
