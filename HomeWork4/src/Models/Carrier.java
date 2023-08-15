package Models;

import java.util.ArrayList;

/**
 * Модель перевозчика
 */
public class Carrier {
    private int id;
    private ArrayList<Integer> zones;
    private long cardNumber;

    public Carrier(int id, long cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;
        zones = new ArrayList<>();
        zones.add(0);
        zones.add(1);
    }

    public int getId() {
        return id;
    }

    public long getCardNumber() {
        return cardNumber;
    }
}
