package Classes.Rewards;

import Classes.IGameItem;

public class Silver implements IGameItem {

    @Override
    public void open() {
        System.out.println("Silver!");
    }

}
