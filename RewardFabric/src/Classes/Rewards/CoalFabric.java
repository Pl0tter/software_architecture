package Classes.Rewards;

import Classes.IGameItem;
import Classes.ItemGenerator;

public class CoalFabric extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Coal();
    }

}
