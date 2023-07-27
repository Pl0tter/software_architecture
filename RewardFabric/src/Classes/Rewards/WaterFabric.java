package Classes.Rewards;

import Classes.IGameItem;
import Classes.ItemGenerator;

public class WaterFabric extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Water();
    }

}
