package Application;

import Models.Sensor;
import Services.SensorRepository;

public class View {
    public static void printStatus(SensorRepository sr) {
        for (Sensor sensor : sr) {
            System.out.println("Датчик ID: " + sensor.getId() + ". Текущее состояние: " + sensor.checkStatus());
        }
    }

    public static void warning(boolean status) {
        if (!status)
            System.out.println("АВАРИЯ!");
    }
}
