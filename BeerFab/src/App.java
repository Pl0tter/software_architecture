import Application.View;
import Business.Maintenance;
import Business.Monitoring;
import Models.Sensor;
import Models.TypeSensor;
import Services.DataRepository;
import Services.SensorRepository;

public class App {
    public static void main(String[] args) throws Exception {

        // Создаем репозиторий с датчиками и добавляем датчики
        SensorRepository sr = new SensorRepository();
        sr.add(new Sensor(TypeSensor.PRESSURE));
        sr.add(new Sensor(TypeSensor.TEMPERATURE));
        sr.add(new Sensor(TypeSensor.PRESSURE));
        sr.add(new Sensor(TypeSensor.TEMPERATURE));

        // Создаем хранилище с измерениями
        DataRepository dr = new DataRepository(sr);

        // Проверка состояния вкл/выкл
        System.out.println(">>> Завод не работает");
        View.printStatus(sr);

        // Включение датчиков
        Maintenance.powerOn(sr);

        // Проверка состояния вкл/выкл
        System.out.println(">>> Завод начинает работать");
        View.printStatus(sr);

        // Сбор данных с датчиков с шагом 1 миллисекунда
        Monitoring mon = new Monitoring();
        System.out.println(">>> Собираем данные с датчиков");
        for (int i = 0; i < 3; i++) {
            mon.collectData(sr, dr);
            View.warning(mon.checkWarning(dr));
            Thread.sleep(1000);
            System.out.println("Проход № " + i);
        }

    }
}
