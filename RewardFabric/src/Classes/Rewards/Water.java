package Classes.Rewards;

import Classes.IGameItem;

public class Water implements IGameItem {

    @Override
    public void open() {
        System.out.println("Water!");
    }

}
