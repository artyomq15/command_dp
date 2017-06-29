package by.bsu.mmf.stankevich.designpatterns.commandpattern.hero;

import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.client.Client;
import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.command.AbstractCommand;
import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.invoker.Invoker;
import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.player.Player;

/**
 * Created by Lenovo on 06/27/2017.
 */
public class RunnerHero {
    public static void main(String[] args) {
        Player qqq = new Player("QQQ");
        Player www = new Player("WWW");

        Client client = new Client();

        AbstractCommand pickCommand = client.initCommand("PICK_HERO");
        Invoker pickInvoker = new Invoker(pickCommand);

        AbstractCommand repickCommand = client.initCommand("REPICK_HERO");
        Invoker repickInvoker = new Invoker(repickCommand);

        AbstractCommand undoPickCommand = client.initCommand("UNDO_PICK");
        Invoker undoPickInvoker = new Invoker(undoPickCommand);

        AbstractCommand attackCommand = client.initCommand("ATTACK");
        Invoker attackInvoker = new Invoker(attackCommand);


        pickInvoker.invokeCommand(qqq);
        pickInvoker.invokeCommand(www);

        repickInvoker.invokeCommand(qqq);
        repickInvoker.invokeCommand(www);

        undoPickInvoker.invokeCommand(www);

        attackInvoker.invokeCommand(www);


    }
}
