import domains.Student;
import domains.StudentSteam;
import domains.StudentsGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("---!!!UNIVERSITY!!!---\n");

        // Список студентов
        Student student1  = new Student("Сергей", 19);   //3 группа//
        Student student2  = new Student("Анастасия", 21);//2 группа//
        Student student3  = new Student("Матвей", 19);   //4 группа//
        Student student4  = new Student("Евгений", 19);  //1 группа//
        Student student5  = new Student("Сергей", 20);   //3 группа//
        Student student6  = new Student("Игнат", 19);    //2 группа//
        Student student7  = new Student("Любовь", 19);   //3 группа//
        Student student8  = new Student("Марк", 18);     //2 группа//
        Student student9  = new Student("Олег", 17);     //2 группа//
        Student student10 = new Student("Василий", 20);  //1 группа//
        Student student11 = new Student("Мария", 25);    //3 группа//
        Student student12 = new Student("Ольга", 19);    //1 группа//
        Student student13 = new Student("Виктор", 20);   //4 группа//
        Student student14 = new Student("Юлия", 20);     //3 группа//
        Student student15 = new Student("Сергей", 19);   //3 группа//
        Student student16 = new Student("Анна", 25);     //1 группа//
        Student student17 = new Student("Алексей", 19);  //1 группа//
        Student student18 = new Student("Карл", 18);     //4 группа//
        Student student19 = new Student("Макар", 21);    //2 группа//
        Student student20 = new Student("Юрий", 20);     //3 группа//
        Student student21 = new Student("Наталья", 19);  //2 группа//
        Student student22 = new Student("Корней", 22);   //5 группа//
        Student student23 = new Student("Зиновий", 22);  //5 группа//
        Student student24 = new Student("Зиновий", 22);  //5 группа//

        // Список листов студентов на зачисление
        List<Student> group1 =new ArrayList<>(); //5 студентов в лист для группы 1
        List<Student> group2 =new ArrayList<>(); //6 студентов в лист для группы 2
        List<Student> group3 =new ArrayList<>(); //7 студентов в лист для группы 3
        List<Student> group4 =new ArrayList<>(); //3 студентов в лист для группы 4
        List<Student> group5 =new ArrayList<>(); //3 студентов в лист для группы 5

        // Перемешиваем студентов (не по порядку) в списках на зачисление
        group1.add(student17);
        group1.add(student12);
        group1.add(student16);
        group1.add(student10);
        group1.add(student4);

        group2.add(student21);
        group2.add(student19);
        group2.add(student6);
        group2.add(student9);
        group2.add(student8);
        group2.add(student2);

        group3.add(student14);
        group3.add(student5);
        group3.add(student20);
        group3.add(student11);
        group3.add(student15);
        group3.add(student1);
        group3.add(student7);

        group4.add(student18);
        group4.add(student13);
        group4.add(student3);

        group5.add(student24);
        group5.add(student23);
        group5.add(student22);

        // Создаем группы студентов не по порядку
        StudentsGroup stGroup1 = new StudentsGroup(group1, 4);
        StudentsGroup stGroup2 = new StudentsGroup(group2, 3);
        StudentsGroup stGroup3 = new StudentsGroup(group3, 1);
        StudentsGroup stGroup4 = new StudentsGroup(group4, 5);
        StudentsGroup stGroup5 = new StudentsGroup(group5, 2);

        // Зачисляем группы в поток
        StudentSteam steam = new StudentSteam("Поток 1");
        steam.addGroup(stGroup1);
        steam.addGroup(stGroup2);
        steam.addGroup(stGroup3);
        steam.addGroup(stGroup4);
        steam.addGroup(stGroup5);

        // Печатаем
        System.out.println("ГРУППЫ В ПОРЯДКЕ СОЗДАНИЯ И ЗАЧИСЛЕНИЯ СТУДЕНТОВ:\n");
        System.out.println(stGroup1);
        System.out.println(stGroup2);
        System.out.println(stGroup3);
        System.out.println(stGroup4);
        System.out.println(stGroup5);

        System.out.println("------------------------------------------");
        System.out.println("ПОТОК В ПОРЯДКЕ ЗАЧИСЛЕНИЯ СТУДЕНТОВ В ГРУППЫ И ЗАЧИСЛЕНИЯ ГРУПП В ПОТОК (ПЕЧАТАЕМ ЧЕРЕЗ toString класса ПотокСтудентов)");
        System.out.println(steam);

        System.out.println("------------------------------------------");
        System.out.println("ПОТОК В ПОРЯДКЕ ЗАЧИСЛЕНИЯ СТУДЕНТОВ В ГРУППЫ И ЗАЧИСЛЕНИЯ ГРУПП В ПОТОК (ПЕЧАТАЕМ ЧЕРЕЗ ИТЕРАЦИЮ ПО ПОТОКУ СТУДЕНТОВ)");
        for (StudentsGroup group: steam) {
            System.out.println(group);
        }

        //Сортировка по количеству студентов в группе, а потом по идентификатору группы
        Collections.sort(steam.getGroups());

        //Сортировка студентов в группе в группе по возрасту, а потом по идентификатору студента
        Collections.sort(stGroup1.getList());
        Collections.sort(stGroup2.getList());
        Collections.sort(stGroup3.getList());
        Collections.sort(stGroup4.getList());
        Collections.sort(stGroup5.getList());

        System.out.println("------------------------------------------");
        System.out.println("ПОТОК ОТСОРТИРОВАННЫЙ ПО КОЛИЧЕСТВУ СТУДЕНТОВ В ГРУППЕ И ПО ИДЕНТИФИКАТОРУ ГРУППЫ\nИ ПО ВОЗРАСТУ СТУДЕНТОВ В ПРЕДЕЛАХ ГРУППЫ И ПО ID СТУДЕНТА\n(ПЕЧАТАЕМ ЧЕРЕЗ toString класса ПотокСтудентов)\n");
        System.out.println(steam);

    }
}