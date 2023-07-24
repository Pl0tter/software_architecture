package ModelElements;

import java.util.List;

import Stuff.Type;

public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public Type method1(Type object) {
        return new Type();
    }

    public Type method2(Type oblectA, Type objectB) {
        return new Type();
    }
}
