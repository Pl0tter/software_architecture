package InMemoryModel;

import java.util.List;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

public class ModelStore implements IModelChanger {
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<IModelChangeObserver> changeObservers;

    public Scene getScene(int sceneNumber) {
        return new Scene();
    }

    public void notifyChange(IModelChanger change) {

    }
}
