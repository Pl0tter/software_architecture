package Controller;

import java.util.List;

import Model.Domain.Student;

public class Controller implements IGetController {
    private IGetModel model;
    private IGetView view;

    private List<Student> students;

    public Controller(IGetModel model, IGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(List<Student> students) {
        if (students.size() > 0)
            return true;
        else
            return false;
    }

    @Override
    public void update() {
        // MVP
        students = model.getAllStudents();

        if (testData(students))
            view.printAllStudents(students);
        else
            System.out.println("Список студентов пуст!");

        // MVC
        // view.printAllStudents(model.getAllStudents());
    }

}
