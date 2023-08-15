package Services;

import Models.Sensor;

public interface ISensorRepository {
    public void add(Sensor sensor);

    public Sensor get(int id);

    public void update(Sensor sensor);

    public void delete(int id);
}
