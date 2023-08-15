package Services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import Models.Sensor;

public class DataRepository implements Iterable<HashMap<Long, Double>> {
    private ArrayList<HashMap<Long, Double>> dr;

    public DataRepository(SensorRepository sr) {
        dr = new ArrayList<>();
        for (Sensor sensor : sr) {
            dr.add(sensor.getId(), new HashMap<>());
        }
    }

    public void add(int id, long date, double data) {
        // HashMap<Long, Double> map = new HashMap<>();
        // map = dr.get(id);
        // map.putIfAbsent(date, data);
        // dr.set(id, map);
        dr.get(id).putIfAbsent(date, data);
    }

    public HashMap<Long, Double> read(int id) {
        return dr.get(id);
    }

    public int sizeOf() {
        return dr.size();
    }

    @Override
    public Iterator<HashMap<Long, Double>> iterator() {
        Iterator<HashMap<Long, Double>> iter = dr.iterator();
        return iter;
    }

}
