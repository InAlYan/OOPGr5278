import java.util.ArrayList;
import java.util.List;

import Domain.Bottle;
import Domain.HotDrink;
import Domain.Product;
import Services.CoinDispenser;
import Services.Display;
import Services.Holder;
import Services.VendingMachine;

// Создать наследника Product реализовать класс ГорячийНапиток(Hot Drink) с дополнительным полем int температура.
// Для класса ГорячихНапитков(Hot Drink) написать конструктор и переопределить метод toString()
// В main добавить в автомат несколько ГорячихНапитков(Hot Drink) и воспроизвести логику заложенную в программе
// Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

// Подписать фамилию и номер группы

public class App {
    public static void main(String[] args) throws Exception {

        //Создаем экземпляры класса продукт
        Product prod1 = new Product(100, 12, "Lays", 1234);
        Product prod2 = new Product(120, 14, "Nuts", 1235);
        Product prod3 = new Product(90, 16, "Chips", 1236);
        Product prod4 = new Product(20, 17, "Milka", 1237);
        Product prod5 = new Product(60, 1, "3korochki", 1238);
        Product prod6 = new Product(150, 2, "Snickers", 1239);

        //Создаем экземпляр класса бутылка
        Product prod7 = new Bottle(150, 3, "Cola", 1240, 0.5f);

        //Создаем экземпляры класса горячие напитки
        Product prod8 = new HotDrink(77, 11, "Capuccino", 1241, 55);
        Product prod9 = new HotDrink(10, 13, "Chamomile tea", 1242, 60);        
        Product prod10 = new HotDrink(77, 15, "Mulled wine", 1243, 50);

        //Создаем экземпляры классов, присутствующих в качестве полей в классе Vending machine
        Holder hold = new Holder();
        CoinDispenser coin = new CoinDispenser();
        Display disp = new Display();
        List<Product> listProd = new ArrayList<Product>();

        //Заполняем ассортимент продуктов для Vending machine
        listProd.add(prod1);
        listProd.add(prod2);
        listProd.add(prod3);
        listProd.add(prod4);
        listProd.add(prod5);
        listProd.add(prod6);
        listProd.add(prod7);
        listProd.add(prod8);
        listProd.add(prod9);
        listProd.add(prod10);

        //Создаем экземпляр класса Vending machine
        VendingMachine vm = new VendingMachine(hold, coin, disp, listProd);

        //Выводим список продуктов из  Vending machine
        for (Product product : vm.getAssort()) {
            System.out.println(product);
        }

    }
}
