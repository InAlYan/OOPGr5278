package MVCStudentApp.View;

import MVCStudentApp.Controller.Interfaces.IGetView;
import MVCStudentApp.Model.Domain.Student;

import java.util.List;
import java.util.Scanner;

public class ViewClass extends AbstractView implements IGetView {

    /**
     * Конструктор
     */
    public ViewClass() {
        super.lang = "RUS";
    }

    /**
     * Реализация метода напечатать всех студентов
     *
     * @param students - List<Student> лист студентов
     */
    @Override
    public void printAllStudents(List<Student> students) {
        System.out.println("------------Начало списка студентов------------");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("------------Конец Списка студентов------------");
    }

    /**
     * Реализация метода ввода строки с консоли
     *
     * @param msg - String подсказка пользователю о вводимом им параметре
     * @return String
     */
    @Override
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }

    /**
     * Реализация метода сообщить о выходе из программы
     */
    @Override
    public void exitMessage() {
        System.out.println("Выход из программы...");
    }

    /**
     * Реализация метода получения языка объекта класса ViewClass
     *
     * @return String - строка идентифицирующая язык
     */
    public String getLang() {
        return super.lang;
    }

    /**
     * Реализация метода установки параметра текущего нужного языка
     *
     * @return String - строка идентифицирующая язык
     */
    @Override
    public String selectLang() {
        return prompt("Выберите язык интерфейса: ");
    }

    /**
     * Реализация метода сообщить об удаляемом студенте
     *
     * @param student типа Student
     */
    @Override
    public void removedStudent(Student student) {
        if (student != null) {
            System.out.println("Был удален студент: " + student);
        } else {
            System.out.println("Такого студента нет в этой модели: ");
        }
    }

    /**
     * Реализация метода ввода команды с консоли
     *
     * @return String - введенная команда
     */
    @Override
    public String inputCommand() {
        return prompt("Введите команду (exit, list, delete, lang): ");
    }

    /**
     * Реализация метода ввода идентификатора студента с консоли для дальнейших манипуляций со студентом
     *
     * @return int - номер студента
     */
    @Override
    public int getStudentNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер студента: ");
        return in.nextInt();
    }

    /**
     * Реализация метода о некорректно введенной команде
     */
    @Override
    public void incorrectCommand() {
        System.out.println("Некорректная команда");
    }
}
