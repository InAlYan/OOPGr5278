package MVCStudentApp.Model;

import MVCStudentApp.Controller.Interfaces.IGetModel;
import MVCStudentApp.Model.Domain.Student;

import java.util.List;

public class ModelClass extends AbstractModel implements IGetModel {

    // Поле список студентов
    private List<Student> students;

    /**
     * Конструктор
     *
     * @param students List<Student> список студентов
     */
    public ModelClass(List<Student> students) {
        this.students = students;
        super.modelName = "listModel";
    }

    // Геттеры
    public List<Student> getStudents() {
        return students;
    }
    @Override
    public String getModelName() {
        return modelName;
    }

    /**
     * Реализация метода удалить студента по идентификатору
     *
     * @param studentId int - идентификатор студента
     * @return Student - удаляемый студент
     */
    @Override
    public Student removeStudent(int studentId) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == studentId) {
                return students.remove(i);
            }
        }
        return null;
    }

}
