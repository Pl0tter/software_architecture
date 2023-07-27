package Classes.Rewards;

import Classes.IGameItem;
import Classes.ItemGenerator;

public class OreFabric extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Ore();
    }

}
