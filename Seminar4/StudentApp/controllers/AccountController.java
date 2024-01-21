package controllers;

import domains.*;

import java.util.List;

public class AccountController {

    /**
     * Выплата заработной платы
     * @param person - кому (типа T)
     * @param salar - сколько (типа V)
     * @param <T>
     * @param <V>
     */
    public <T extends Worker, V> void paySalary(T person, V salar) {
        System.out.println(person.getName() + " выплачена зарплата: " + salar);
    }

    /**
     * Средний возраст
     * @param persons - список (типа T) людей, у которых вычисляется средний возраст
     * @param <T>
     */
    public static <T extends Person> void averageAge (List<T> persons) {
        double count = 0, sumOfAges= 0; // count можно убрать заменив на persons.size
        for (T person: persons) {
            count++;
            sumOfAges += person.getAge();
        }
        double averAge = (count == 0) ? 0 : sumOfAges / count;
        System.out.printf("Средний возраст %3.2f\n", averAge);
    }

}
