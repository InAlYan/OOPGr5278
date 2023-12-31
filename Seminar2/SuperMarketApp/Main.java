package SuperMarketApp;

import SuperMarketApp.Classes.*;
import SuperMarketApp.Interfaces.IActorBehaviour;

//1) Добавить класс, описывающий акционного клиента. Включить поле название акции, id клиента и количество участников в акции (поле статическое)
//2) Добавить интерфейс iReturnOrder возврата товара. Продумать какие методы могут понадобиться и подключить интерфейс к классам клиентов.
//3) Добавить комментарии(javadoc) ко всем методам и интерфейсам.

public class Main {

    public static void main(String[] args) {

        //Создаем экземпляр класса Market
        Market magnit = new Market();

        //Создаем экземпляры класса обычного клиента
        Actor client1 = new OrdinaryClient("Борис", 1);
        Actor client2 = new OrdinaryClient("Ольга", 2);
        //Создаем экземпляр класса VIP клиента
        Actor client3 = new SpecialClient("Полип Фарфоров", 1);
        //Создаем экземпляры класса налогового инспектора
        IActorBehaviour client4 = new TaxInspector();
        //Создаем экземпляры класса акционного клиента
        Actor client5 = new ActionClient("Сигизмунд", 1, "Ночь скидок");
        Actor client6 = new ActionClient("Клавдия", 2, "Ночь скидок");
        Actor client7 = new ActionClient("Григорий", 3, "Ночь скидок");

        //Запускаем всех клиентов в магазин
        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);
        magnit.acceptToMarket(client6);
        magnit.acceptToMarket(client7);
        //Пропускаем всех клиентов через магазин
        magnit.update();

        //Клиенты 1, 3, 6 вернули товар
        client1.refund();
        client3.refund();
        client6.refund();

    }
}
