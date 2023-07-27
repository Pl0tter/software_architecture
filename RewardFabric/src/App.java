import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Classes.ItemGenerator;
import Classes.Rewards.CoalFabric;
import Classes.Rewards.GemFabric;
import Classes.Rewards.GoldFabric;
import Classes.Rewards.OreFabric;
import Classes.Rewards.SilverFabric;
import Classes.Rewards.WaterFabric;
import Classes.Rewards.WoodFabric;

public class App {
    public static void main(String[] args) throws Exception {
        ItemGenerator fab1 = new GoldFabric();
        // fab1.openReward();
        ItemGenerator fab2 = new GemFabric();
        // fab2.openReward();
        ItemGenerator fab3 = new CoalFabric();
        ItemGenerator fab4 = new OreFabric();
        ItemGenerator fab5 = new SilverFabric();
        ItemGenerator fab6 = new WaterFabric();
        ItemGenerator fab7 = new WoodFabric();

        Random rnd = ThreadLocalRandom.current();
        List<ItemGenerator> fabList = new ArrayList<>();
        fabList.add(fab1);
        fabList.add(fab2);
        fabList.add(fab3);
        fabList.add(fab4);
        fabList.add(fab5);
        fabList.add(fab6);
        fabList.add(fab7);
        for (int i = 0; i < 10; i++) {
            // int index = Math.abs(rnd.nextInt() % 2 == 0 ? 0 : 1);
            int index = rnd.nextInt(7);
            fabList.get(index).openReward();
        }
    }
}
