package MVCStudentApp.Controller.Interfaces;

import MVCStudentApp.Model.Domain.Student;

import java.util.List;

public interface IGetModel {

    /**
     * Получить всех студентов из модели
     * @return List<Student> - лист студентов
     */
    public List<Student> getStudents();

    /**
     * Получить имя модели
     * @return String
     */
    public String getModelName();

    /**
     * Удалить студента из модели
     * @param studentId int - идентификатор студента
     * @return Student
     */
    public Student removeStudent (int studentId);
}
