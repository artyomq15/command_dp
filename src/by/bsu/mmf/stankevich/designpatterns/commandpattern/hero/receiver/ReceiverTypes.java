package by.bsu.mmf.stankevich.designpatterns.commandpattern.hero.receiver;

/**
 * Created by Lenovo on 06/28/2017.
 */
public enum ReceiverTypes {
    PICK(new PickReceiver()), FIGHT(new EnemyFightReceiver());
    Receiver receiver;

    ReceiverTypes(Receiver receiver) {
        this.receiver = receiver;
    }

    public Receiver getReceiver() {
        return receiver;
    }
}
