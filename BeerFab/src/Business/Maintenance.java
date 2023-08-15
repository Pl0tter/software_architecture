package Business;

import Models.Sensor;
import Services.SensorRepository;

public class Maintenance {
    public static boolean powerOn(SensorRepository sr) {
        for (Sensor sensor : sr) {
            if (!sensor.checkStatus())
                sensor.switchStatus();
        }
        return true;
    }

    public static boolean powerOff(SensorRepository sr) {
        for (Sensor sensor : sr) {
            if (sensor.checkStatus())
                sensor.switchStatus();
        }
        return true;
    }

}
