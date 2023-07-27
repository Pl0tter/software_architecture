package Classes.Rewards;

import Classes.IGameItem;

public class Ore implements IGameItem {

    @Override
    public void open() {
        System.out.println("Ore!");
    }

}
