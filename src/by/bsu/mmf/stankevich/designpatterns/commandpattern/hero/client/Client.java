package by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.client;

import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.command.*;
import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.enummap.ReceiverMap;

/**
 * Created by Lenovo on 06/27/2017.
 */
public class Client {
    public AbstractCommand initCommand(String cmd) {
        AbstractCommand command = null;
        try {
            CommandTypes cmdEnum = CommandTypes.valueOf(cmd.toUpperCase());
            command = cmdEnum.getCommand();
            command.setReceiver(new ReceiverMap().getReceiver(cmdEnum));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return command;
    }
}
