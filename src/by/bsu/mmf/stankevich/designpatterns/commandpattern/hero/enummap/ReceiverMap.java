package by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.enummap;

import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.command.CommandTypes;
import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.receiver.Receiver;
import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.receiver.ReceiverTypes;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Optional;
import java.util.Set;

/**
 * Created by Lenovo on 06/28/2017.
 */
public class ReceiverMap {
    private final EnumMap<ReceiverTypes, EnumSet<CommandTypes>> map = new EnumMap<ReceiverTypes, EnumSet<CommandTypes>>(ReceiverTypes.class);

    public ReceiverMap() {
        EnumSet<CommandTypes> pickSet = EnumSet.of(CommandTypes.PICK_HERO, CommandTypes.REPICK_HERO, CommandTypes.UNDO_PICK);
        EnumSet<CommandTypes> fightSet = EnumSet.of(CommandTypes.ATTACK, CommandTypes.BLOCK);
        map.put(ReceiverTypes.PICK, pickSet);
        map.put(ReceiverTypes.FIGHT, fightSet);
    }

    public ReceiverTypes getKey(CommandTypes value) {
        ReceiverTypes receiverEnum = null;

        receiverEnum = map.entrySet().stream()
                .filter(entry -> entry.getValue().contains(value))
                .findFirst().get().getKey();

        return receiverEnum;
    }

    public Receiver getReceiver(CommandTypes value) {
        return getKey(value).getReceiver();
    }
}
