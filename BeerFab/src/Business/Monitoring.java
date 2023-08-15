package Business;

import java.util.Date;
import Models.Sensor;
import Services.DataRepository;
import Services.SensorRepository;

public class Monitoring {
    private Date date;
    private double criticalValue = 0.95;

    public boolean collectData(SensorRepository sr, DataRepository dr) {
        date = new Date();
        for (Sensor sensor : sr) {

            dr.add(sensor.getId(), date.getTime(), sensor.getData());
        }

        return true;
    }

    public boolean checkWarning(DataRepository dr) {
        for (int i = 0; i < dr.sizeOf(); i++) {
            if (dr.read(i).get(date.getTime()) > criticalValue) {
                return false;
            }
        }
        return true;
    }

}
