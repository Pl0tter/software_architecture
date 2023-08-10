package Classes;

import java.awt.Color;

/**
 * 1. Спроектировать абстрактный класс «Car» у которого должны быть свойства:
 * марка, модель, цвет, тип кузова, число колёс, тип топлива, тип коробки
 * передач, объём двигателя; методы: движение, обслуживание, переключение
 * передач, включение фар, включение дворников.
 * 
 * 2. Создать конкретный автомобиль путём наследования класса «Car».
 * 
 * 3. Расширить абстрактный класс «Car», добавить метод: подметать улицу.
 * Создать
 * конкретный автомобиль путём наследования класса «Car». Провести проверку
 * принципа SRP.
 * 
 * 4. Расширить абстрактный класс «Car», добавить метод: подметать улицу.
 * Создать конкретный автомобиль путём наследования класса «Car». Провести
 * проверку принципа SRP.
 * 
 * 5. Создать конкретный автомобиль путём наследования класса «Car», определить
 * число колёс = 3. Провести проверку принципа LSP.
 * 
 * 6. Создать конкретный автомобиль путём наследования класса «Car», определить
 * метод «движение» - «полёт». Провести проверку принципа LSP.
 * 
 * 7. Создать интерфейс «Заправочная станция», создать метод: заправка топливом.
 * 
 * 8. Имплементировать метод интерфейса «Заправочная станция» в конкретный класс
 * «Pickup».
 * 
 * 9. Добавить в интерфейс «Заправочная станция» методы: протирка лобового
 * стекла, протирка фар, протирка зеркал.
 * 
 * 10. Имплементировать все методы интерфейса «Заправочная станция» в конкретный
 * класс «Car». Провести проверку принципа ISP. Создать дополнительный/е
 * интерфейсы и имплементировать их в конкретный класс «Car». Провести проверку
 * принципа ISP.
 * 
 * 11. Создать путём наследования класса «Car» два автомобиля: с бензиновым и
 * дизельным двигателями, имплементировать метод «Заправка топливом» интерфейса
 * «Заправочная станция». Реализовать заправку каждого автомобиля подходящим
 * топливом. Провести проверку принципа DIP.
 * 
 */

public abstract class Car {
    private String manufacturer;
    private String model;
    private Color color;
    private Body bodyType;
    private int numberWheels;
    private TypeFuel fuel;
    private TypeGearbox gearbox;
    private float engineCapacity;

    public Car(String manufacturer, String model, Color color, Body bodyType, int numberWheels, TypeFuel fuel,
            TypeGearbox gearbox, float engineCapacity) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.numberWheels = numberWheels;
        this.fuel = fuel;
        this.gearbox = gearbox;
        this.engineCapacity = engineCapacity;
    }

    public void move() {
        System.out.println("Движение");
    }

    public void maintenance() {
        System.out.println("Обслуживание");
    }

    public abstract int gearShift();

    public void switchHeadlights() {
        System.out.println("Включение фар");
    };

    public void switchWipers() {
        System.out.println("Включение дворников");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Body getBodyType() {
        return bodyType;
    }

    public void setBodyType(Body bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public TypeFuel getFuel() {
        return fuel;
    }

    public void setFuel(TypeFuel fuel) {
        this.fuel = fuel;
    }

    public TypeGearbox getGearbox() {
        return gearbox;
    }

    public void setGearbox(TypeGearbox gearbox) {
        this.gearbox = gearbox;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

}
