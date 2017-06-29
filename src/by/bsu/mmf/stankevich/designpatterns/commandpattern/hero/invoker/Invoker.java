package by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.invoker;

import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.command.AbstractCommand;
import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.player.Player;

/**
 * Created by Lenovo on 06/27/2017.
 */
public class Invoker {
    private AbstractCommand command;
    public Invoker(AbstractCommand command){
        this.command = command;
    }
    public void invokeCommand(Player player){
        command.execute(player);
    }
}
