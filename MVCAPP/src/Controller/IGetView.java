package Controller;

import java.util.List;

import Model.Domain.Student;

public interface IGetView {
    public void printAllStudents(List<Student> students);

    public void setController(IGetController controller);
}
