package Services;

import domains.PersonComparator;
import domains.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements IPersonService<Teacher> {

    // Поля
    private int count;
    private List<Teacher> teachers;

    /**
     * Конструктор
     */
    public TeacherService() {
        teachers = new ArrayList<>();
    }

    /**
     * Вернуть список учителей
     * Реализация интерфейса IPersonService
     * @return teachers типа List<Teacher>
     */
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    /**
     * Создать учителя
     * Реализация интерфейса IPersonService
     * @param name - (String) имя
     * @param age  - (int) возраст
     */
    @Override
    public void create(String name, int age) {
        teachers.add(new Teacher(name, age, "Высшая категория"));
        count++;
    }

    /**
     * Сортировать учителей по ФИО
     */
    public void sortByFIO() {
        PersonComparator<Teacher> pc = new PersonComparator<>();
        teachers.sort(pc);
    }

    // Переопределили метод toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Учителя: (" + count + " человек):\n");
        for (Teacher teacher: teachers) {
            String s = String.format("Имя: %-10s, возраст: %3d, ученая степень: %s",
                    teacher.getName(),teacher.getAge(), teacher.getAcademicDegree());
            sb.append(">>> ").append(s).append("\n");
        }
        return sb.toString();
    }
}
