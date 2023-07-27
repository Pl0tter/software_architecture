package Classes.Rewards;

import Classes.IGameItem;

public class Wood implements IGameItem {

    @Override
    public void open() {
        System.out.println("Wood!");
    }

}
