package Models;

import java.util.Random;

public class Sensor implements ISensor {
    private static int index = 0;
    private int id;
    private boolean status;
    private double data;
    private TypeSensor type;

    public Sensor(TypeSensor type) {
        id = index;
        index = index + 1;
        this.status = false;
        this.data = 0;
        this.type = type;
    }

    public void switchStatus() {
        status = !status;
    }

    @Override
    public boolean checkStatus() {
        return status;
    }

    @Override
    public double getData() {
        Random random = new Random();
        data = random.nextDouble();
        return data;
    }

    public int getId() {
        return id;
    }

}
