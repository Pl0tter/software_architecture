package Services;

import java.util.ArrayList;
import java.util.Iterator;

import Models.Sensor;

public class SensorRepository implements ISensorRepository, Iterable<Sensor> {
    private ArrayList<Sensor> sensors;

    public SensorRepository() {
        sensors = new ArrayList<>(10);
    }

    @Override
    public void add(Sensor sensor) {
        sensors.add(sensor.getId(), sensor);
    }

    @Override
    public Sensor get(int id) {
        return sensors.get(id);
    }

    @Override
    public void update(Sensor sensor) {
        sensors.remove(sensor.getId());
        sensors.add(sensor.getId(), sensor);
    }

    @Override
    public void delete(int id) {
        sensors.remove(id);
    }

    @Override
    public Iterator<Sensor> iterator() {
        Iterator<Sensor> iter = sensors.iterator();
        return iter;
    }

}
