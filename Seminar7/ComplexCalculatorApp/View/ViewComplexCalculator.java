package ComplexCalculatorApp.View;

import ComplexCalculatorApp.Model.Domains.ComplexNumber;
import ComplexCalculatorApp.Interfaces.IComplexCalculable;

import java.util.Scanner;

public class ViewComplexCalculator {

    private IComplexCalculable complexCalculator;

    /**
     * Конструктор
     * @param complexCalculator необходимый для работы объект типа IComplexCalculable
     */
    public ViewComplexCalculator(IComplexCalculable complexCalculator) {
        this.complexCalculator = complexCalculator;
    }

    /**
     * Ввести строку с клавиатуры
     * @param message String сообщение для пользователя при вводе
     * @return String введенная пользователем строка
     */
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    /**
     * Ввести число с клавиатуры
     * @param message String сообщение для пользователя при вводе
     * @return double введенное пользователем число
     */
    private double inputNumber(String message) {
        // Возможна ошибка, делаем тут цикл пока не будет введена строка которую можно преобразовать к Double и ругаемся
        boolean notSuccess = true;
        double result = 0;
        while (notSuccess) {
            try {
                result = Double.parseDouble(prompt(message));
                notSuccess = false;
            } catch (Exception e) {
                System.out.println("Некорректное число... Попробуйте еще раз...");
                notSuccess = true;
            }
        }
        return result;
    }

    /**
     * Ввести комплексное число с клавиатуры
     * @return ComplexNumber полученное комплексное число
     */
    private ComplexNumber inputComplexNumber() {
        return new ComplexNumber(inputNumber("Введите вещественную часть комплексного числа: "),
                                 inputNumber("Введите мнимую часть комплексного числа: "));
    }

    /**
     * Функция запуска и взаимодействия с калькулятором
     */
    public void operate() {

        // Первичная инициализация калькулятора прибавление к 0 комплексного числа complexNumber с присвоением значения результату калькулятора
        complexCalculator.sum(complexCalculator.result(), inputComplexNumber());

        boolean continueCalculations = true;
        while (continueCalculations) {

            String operation = prompt("Введите команду (+ , - , * , / , =, q): ");
            switch (operation) {
                case "+":
                    complexCalculator.sum(complexCalculator.result(), inputComplexNumber());
                    break;
                case "-":
                    complexCalculator.diff(complexCalculator.result(), inputComplexNumber());
                    break;
                case "*":
                    complexCalculator.mult(complexCalculator.result(), inputComplexNumber());
                    break;
                case "/":
                    complexCalculator.div(complexCalculator.result(), inputComplexNumber());
                    break;
                case "=":
                    complexCalculator.result();
                    break;
                case "q":
                    System.out.println("Завершение работы...");
                    continueCalculations = false;
                    break;
                default:
                    System.out.println("Неизвестная команда...");
                    break;
            }
        }
    }

}
