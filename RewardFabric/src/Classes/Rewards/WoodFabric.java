package Classes.Rewards;

import Classes.IGameItem;
import Classes.ItemGenerator;

public class WoodFabric extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Wood();
    }

}
