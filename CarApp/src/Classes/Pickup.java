package Classes;

import java.awt.Color;

/**
 * Создать конкретный автомобиль путём наследования класса «Car».
 */

public class Pickup extends Car implements IRefueling, IWip {
    private int loadCapacity;

    public Pickup(String manufacturer, String model, Color color, Body bodyType, int numberWheels, TypeFuel fuel,
            TypeGearbox gearbox, float engineCapacity, int loadCapacity) {
        super(manufacturer, model, color, bodyType, numberWheels, fuel, gearbox, engineCapacity);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public int gearShift() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'gearShift'");
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void fuel() {
        System.out.println("Заправка");
    }

    @Override
    public void wipWindshield() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wipWindshield'");
    }

    @Override
    public void wipHeadlights() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wipHeadlights'");
    }

    @Override
    public void wipMirrors() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wipMirrors'");
    }

}
