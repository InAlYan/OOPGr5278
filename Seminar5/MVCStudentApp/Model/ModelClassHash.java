package MVCStudentApp.Model;

import MVCStudentApp.Controller.Interfaces.IGetModel;
import MVCStudentApp.Model.Domain.Student;

import java.util.*;

public class ModelClassHash extends AbstractModel implements IGetModel {

    // Поле hashMap со студентами
    private HashMap<Integer, Student> students;

    /**
     * Конструктор
     * @param students HashMap<Integer, Student> hashMap со студентами
     */
    public ModelClassHash(HashMap<Integer, Student> students) {
        this.students = students;
        super.modelName = "hashMapModel";
    }

    // Геттеры
    @Override
    public List<Student> getStudents() {
        return new ArrayList<Student>(students.values());
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
        int indexToDelete = -1;
        for (Map.Entry<Integer, Student> stududentEntry: students.entrySet()) {
            if (stududentEntry.getValue().getId() == studentId) {
                indexToDelete = stududentEntry.getKey();
            }
        }
        return (indexToDelete == -1) ? null : students.remove(indexToDelete);
    }

}
