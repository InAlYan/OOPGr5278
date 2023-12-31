package SuperMarketApp.Classes;

import SuperMarketApp.Interfaces.IActorBehaviour;

public class TaxInspector implements IActorBehaviour {

    //Поля класса
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;

    /**
     * Конструктор класса
     */
    public TaxInspector() {
        this.name = "Налоговый инспектор";
    }

    /**
     * Геттер поля name
     */    
    public String getName() {
        return this.name;
    }

    /**
     * Метод сделан ли заказ (реализация)
     */
    @Override
    public boolean isTakeOrder() {
        return this.isTakeOrder;
    }

    /**
     * Метод получен ли заказ (реализация)
     */
    @Override
    public boolean isMakeOrder() {
        return this.isMakeOrder;
    }

    /**
     * Метод установить статус поля сделан ли заказ (реализация)
     * @param val boolean - значение 
     */    
    @Override
    public void setTakeOrder(boolean val) {
        this.isTakeOrder = val;
    }

    /**
     * Метод установить статус поля получен ли заказ (реализация)
     * @param val boolean - значение 
     */    
    @Override
    public void setMakeOrder(boolean val) {
        this.isMakeOrder = val;
    }

    /**
     * Метод получить ссылку на клиента (реализация)
     */
    @Override
    public Actor getActor() {
        return new OrdinaryClient("Тайный покупатель", 4);
    }
}
