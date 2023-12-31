package SuperMarketApp.Classes;

import SuperMarketApp.Interfaces.IActorBehaviour;
import SuperMarketApp.Interfaces.IReturnOrder;

public abstract class Actor implements IActorBehaviour, IReturnOrder {

    // Поля класса
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;


    /**
     *  Конструктор класса
     * 
     * @param name String - имя клиента
     */
    public Actor (String name) {
        this.name = name;
    }

    // Абстрактные геттеры и сеттеры для поля name (без реализации)
    public abstract String getName();
    public abstract void setName(String name);

}
