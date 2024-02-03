package ComplexCalculatorApp;


import ComplexCalculatorApp.Interfaces.IComplexCalculable;
import ComplexCalculatorApp.Model.ComplexCalculator;
import ComplexCalculatorApp.View.ViewComplexCalculator;


public class App {

    public static void main(String[] args) {

        // Создаем объект класса калькулятор комплексных чисел
        ComplexCalculator complexCalc = new ComplexCalculator();
        // Создаем объект класса логгер для логирования действий в файл
        Logger logger = new Logger("log.txt");
        // Создаем объект класса декоратор, осуществляющего вычисление и логирование
        IComplexCalculable decorator = new Decorator(complexCalc, logger);
        // Создаем объект класса ViewComplexCalculator, осуществляющего взаимодействие с пользователем
        // и классами калькулятора комплексных чисел и логгером
        ViewComplexCalculator calculatorView = new ViewComplexCalculator(decorator);
        // Запускаем на исполнение объект класса ViewComplexCalculator
        calculatorView.operate();

    }

}
