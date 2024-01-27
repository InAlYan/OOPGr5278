package MVCStudentApp;

import MVCStudentApp.Controller.ControllerClass;
import MVCStudentApp.Controller.Interfaces.IGetModel;
import MVCStudentApp.Controller.Interfaces.IGetView;
import MVCStudentApp.Model.Domain.Student;
import MVCStudentApp.Model.ModelClass;
import MVCStudentApp.Model.ModelClassHash;
import MVCStudentApp.View.ViewClass;
import MVCStudentApp.View.ViewClassEng;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {

    public static void main(String[] args) {

        // Создали студентов
        Student student1 = new Student("Сергей", 19);   //3 группа//
        Student student2 = new Student("Анастасия", 21);//2 группа//
//        Student student3  = new Student("Матвей", 19);   //4 группа//
//        Student student4  = new Student("Евгений", 19);  //1 группа//
        Student student5 = new Student("Сергей", 20);   //3 группа//
        Student student6 = new Student("Игнат", 19);    //2 группа//
        Student student7 = new Student("Любовь", 19);   //3 группа//
        Student student8 = new Student("Марк", 18);     //2 группа//
        Student student9 = new Student("Олег", 17);     //2 группа//
//        Student student10 = new Student("Василий", 20);  //1 группа//
        Student student11 = new Student("Мария", 25);    //3 группа//
//        Student student12 = new Student("Ольга", 19);    //1 группа//
//        Student student13 = new Student("Виктор", 20);   //4 группа//
        Student student14 = new Student("Юлия", 20);     //3 группа//
        Student student15 = new Student("Сергей", 19);   //3 группа//
//        Student student16 = new Student("Анна", 25);     //1 группа//
//        Student student17 = new Student("Алексей", 19);  //1 группа//
//        Student student18 = new Student("Карл", 18);     //4 группа//
        Student student19 = new Student("Макар", 21);    //2 группа//
        Student student20 = new Student("Юрий", 20);     //3 группа//
        Student student21 = new Student("Наталья", 19);  //2 группа//
//        Student student22 = new Student("Корней", 22);   //5 группа//
//        Student student23 = new Student("Зиновий", 22);  //5 группа//
//        Student student24 = new Student("Зиновий", 22);  //5 группа//

        // Список листов студентов на зачисление
//        List<Student> group1 =new ArrayList<>(); //5 студентов в лист для группы 1
//        List<Student> group2 =new ArrayList<>(); //6 студентов в лист для группы 2
        List<Student> group3 = new ArrayList<>(); //7 студентов в лист для группы 3
//        List<Student> group4 =new ArrayList<>(); //3 студентов в лист для группы 4
//        List<Student> group5 =new ArrayList<>(); //3 студентов в лист для группы 5

        // Перемешиваем студентов (не по порядку) в списках на зачисление
//        group1.add(student17);
//        group1.add(student12);
//        group1.add(student16);
//        group1.add(student10);
//        group1.add(student4);

//        group2.add(student21);
//        group2.add(student19);
//        group2.add(student6);
//        group2.add(student9);
//        group2.add(student8);
//        group2.add(student2);

        group3.add(student14);
        group3.add(student5);
        group3.add(student20);
        group3.add(student11);
        group3.add(student15);
        group3.add(student1);
        group3.add(student7);

//        group4.add(student18);
//        group4.add(student13);
//        group4.add(student3);

//        group5.add(student24);
//        group5.add(student23);
//        group5.add(student22);

        // СТАРЫЙ ВАРИАНТ С КЛАССАМИ ModelClass и ViewClass
        IGetModel mc = new ModelClass(group3);
        IGetView vc = new ViewClass();

        // Создали класс контроллер ControllerClass
        ControllerClass cc = new ControllerClass(mc, vc);

        // НОВЫЙ ВАРИАНТ С ДОБАВЛЕННЫМИ КЛАССАМИ ModelClassHash и ViewClassEng
        HashMap<Integer, Student> hmStudents = new HashMap<>();
        hmStudents.put(0, student2);
        hmStudents.put(1, student6);
        hmStudents.put(2, student8);
        hmStudents.put(3, student9);
        hmStudents.put(4, student19);
        hmStudents.put(5, student21);

        IGetModel mcHashMap = new ModelClassHash(hmStudents);
        cc.addModel(mcHashMap);

        IGetView vcEng = new ViewClassEng();
        cc.addView(vcEng);

        cc.run();

    }
}
