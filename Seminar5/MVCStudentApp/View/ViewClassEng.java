package MVCStudentApp.View;

import MVCStudentApp.Controller.Interfaces.IGetView;
import MVCStudentApp.Model.Domain.Student;

import java.util.List;
import java.util.Scanner;

public class ViewClassEng extends AbstractView implements IGetView {

    /**
     * Конструктор
     */
    public ViewClassEng() {
        super.lang = "ENG";
    }


    /**
     * Реализация метода напечатать всех студентов
     *
     * @param students - List<Student> лист студентов
     */
    @Override
    public void printAllStudents(List<Student> students) {
        System.out.println("------------Begin list of students------------");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("------------End list of students------------");
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
        System.out.println("Exit from program...");
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
        return prompt("Select interface language: ");
    }

    /**
     * Реализация метода сообщить об удаляемом студенте
     *
     * @param student типа Student
     */
    @Override
    public void removedStudent(Student student) {
        if (student != null) {
            System.out.println("Student was deleted: " + student);
        } else {
            System.out.println("Such student not exist in this model: ");
        }
    }

    /**
     * Реализация метода ввода команды с консоли
     *
     * @return String - введенная команда
     */
    @Override
    public String inputCommand() {
        return prompt("Input command (exit, list, delete, lang): ");
    }

    /**
     * Реализация метода ввода идентификатора студента с консоли для дальнейших манипуляций со студентом
     *
     * @return int - номер студента
     */
    @Override
    public int getStudentNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input student number: ");
        return in.nextInt();
    }

    /**
     * Реализация метода о некорректно введенной команде
     */
    @Override
    public void incorrectCommand() {
        System.out.println("Incorrect command");
    }
}
