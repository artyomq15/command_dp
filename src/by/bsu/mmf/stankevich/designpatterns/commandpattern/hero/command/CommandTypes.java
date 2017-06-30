package by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.command;

import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.player.Player;
import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.receiver.IFightReceiver;
import by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.receiver.IPickReceiver;

public enum CommandTypes {
    PICK_HERO(new PickCommand()) {
        @Override
        public void doLogic(Player player) {
            IPickReceiver r = (IPickReceiver) getCommand().getReceiver();
            r.pickHero(player);
        }
    }, REPICK_HERO(new RepickCommand()) {
        @Override
        public void doLogic(Player player) {
            IPickReceiver r = (IPickReceiver) getCommand().getReceiver();
            r.repickHero(player);
        }
    }, UNDO_PICK(new UndoPickCommand()) {
        @Override
        public void doLogic(Player player) {
            IPickReceiver r = (IPickReceiver) getCommand().getReceiver();
            r.undoPick(player);
        }
    },
    ATTACK(new AttackCommand()) {
        @Override
        public void doLogic(Player player) {
            IFightReceiver r = (IFightReceiver) getCommand().getReceiver();
            r.attack(player);
        }
    }, BLOCK(new BlockCommand()) {
        @Override
        public void doLogic(Player player) {
            IFightReceiver r = (IFightReceiver) getCommand().getReceiver();
            r.block(player);
        }
    };
    private AbstractCommand command;

    CommandTypes(AbstractCommand command) {
        this.command = command;
    }

    public AbstractCommand getCommand() {
        return command;
    }

    public abstract void doLogic(Player player);
}
