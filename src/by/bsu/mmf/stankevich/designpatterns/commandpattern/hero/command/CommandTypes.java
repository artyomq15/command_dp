package by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.command;

/**
 * Created by Lenovo on 06/27/2017.
 */
public enum CommandTypes {
    PICK_HERO(new PickCommand()), REPICK_HERO(new RepickCommand()), UNDO_PICK(new UndoPickCommand()),
    ATTACK(new AttackCommand());
    private AbstractCommand command;
    CommandTypes(AbstractCommand command){
        this.command = command;
    }
    public AbstractCommand getCommand(){
        return command;
    }
}
