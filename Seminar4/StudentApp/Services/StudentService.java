package Services;

import java.util.ArrayList;
import java.util.List;

import domains.PersonComparator;
import domains.Student;

public class StudentService implements IPersonService<Student> {

    // Поля
    private int count;
    private List<Student> students;


    /**
     * Констуктор
     */
    public StudentService() {
        students = new ArrayList<>();
    }

    /**
     * Вернуть список студентов
     * Реализация интерфейса IPersonService
     * @return students типа List<Student>
     */
    @Override
    public List<Student> getAll() {
        return students;
    }

    /**
     * Создать студента
     * Реализация интерфейса IPersonService*
     * @param name - (String) имя
     * @param age  - (int) возраст
     */
    @Override
    public void create(String name, int age) {
        Student stud = new Student(name, age);
        count++;
        students.add(stud);
        sortByFIO();
    }

    /**
     * Сортировать студентов по ФИО
     */
    public void sortByFIO() {
        PersonComparator<Student> studComp = new PersonComparator<>();
        students.sort(studComp);
    }

}
