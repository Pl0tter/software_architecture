package Classes.Rewards;

import Classes.IGameItem;
import Classes.ItemGenerator;

public class SilverFabric extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Silver();
    }

}
