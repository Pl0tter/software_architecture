package Models;

import java.util.ArrayList;

/**
 * Модель перевозчика
 */
public class Carrier {
    private int id;
    private ArrayList<Integer> zones = new ArrayList<>();
    private long cardNumber;

    public Carrier(int id, long cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;
    }

    public int getId() {
        return id;
    }

    public long getCardNumber() {
        return cardNumber;
    }
}
