package Classes.Rewards;

import Classes.IGameItem;

public class Coal implements IGameItem {

    @Override
    public void open() {
        System.out.println("Coal!");
    }

}
