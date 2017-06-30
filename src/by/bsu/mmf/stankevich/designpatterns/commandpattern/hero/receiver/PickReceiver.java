package by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.receiver;

import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.command.CommandTypes;
import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.command.PickCommand;
import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.command.RepickCommand;
import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.command.UndoPickCommand;
import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.player.Player;

/**
 * Created by Lenovo on 06/28/2017.
 */
public class PickReceiver extends IPickReceiver {
    private Player player;

    public void setPlayer(Player player) {
        this.player = player;
    }

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
    /*public void action(PickCommand command, Player player){
        pickHero(player);
    }
    public void action(RepickCommand command, Player player){
        repickHero(player);
    }
    public void action(UndoPickCommand command, Player player){
        undoPick(player);
    }*/
    public void action(CommandTypes cmd, Player player) {
        switch (cmd) {
            case PICK_HERO:
                pickHero(player);
                break;
            case REPICK_HERO:
                repickHero(player);
                break;
            case UNDO_PICK:
                undoPick(player);
                break;
        }

        /* with reflection
        Method m = null;
        try{
            m = this.getClass().getMethod(method, Player.class);

        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }
        try{
            m.invoke(this, player);
        }catch (InvocationTargetException exception){
            exception.printStackTrace();
        }catch (IllegalAccessException ex){
            ex.printStackTrace();
        }*/

    }

}
