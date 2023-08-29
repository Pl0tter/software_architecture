package View;

import java.util.List;

import Controller.IGetController;
import Controller.IGetView;
import Model.Domain.Student;

public class View implements IGetView {
    public IGetController controller;

    @Override
    public void printAllStudents(List<Student> students) {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    @Override
    public void setController(IGetController controller) {
        this.controller = controller;
    }

}