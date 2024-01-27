package MVCStudentApp.Controller.Interfaces;

import MVCStudentApp.Model.Domain.Student;

import java.util.List;

public interface IGetView {

    /**
     * Вывести на печать всех студентов
     *
     * @param students - List<Student> лист студентов
     */
    public void printAllStudents(List<Student> students);

    /**
     * Ввести с консоли строку
     *
     * @param msg - String подсказка пользователю о вводимом им параметре
     * @return String
     */
    public String prompt(String msg);

    /**
     * Вывести сообщение о выходе из программы
     */
    public void exitMessage();

    /**
     * Получить язык объекта класса View
     *
     * @return String
     */
    public String getLang();

    /**
     * Выбрать класс View с нужным языком
     *
     * @return String
     */
    public String selectLang();

    /**
     * Сообщить об удаляемом студенту
     *
     * @param student типа Student
     */
    public void removedStudent(Student student);

    /**
     * Ввести команду с консоли
     *
     * @return String - команда строкой
     */
    public String inputCommand();

    /**
     * Ввести номер (идентификатор) студента с консоли для дальнейших манипуляций со студентом
     *
     * @return int
     */
    public int getStudentNumber();

    /**
     * Сообщить о некорректной введенной команде
     */
    public void incorrectCommand();
}
