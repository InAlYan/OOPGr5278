package SuperMarketApp.Classes;

public class OrdinaryClient extends Actor {

    //Поля класса
    private int number;

    /**
     * Конструктор класса
     */
    public OrdinaryClient (String name, int number) {
        super(name);
        this.number = number;
    }

    //Геттеры и сеттеры    
    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Метод сделан ли заказ (реализация)
     */
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * Метод получен ли заказ (реализация)
     */
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * Метод установить статус поля сделан ли заказ (реализация)
     * @param val boolean - значение 
     */    
    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }

    /**
     * Метод установить статус поля получен ли заказ (реализация)
     * @param val boolean - значение 
     */    
    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;
    }

    /**
     * Метод получить ссылку на клиента (реализация)
     */
    public Actor getActor() {
        return this;
    }

    /**
     * Метод возврата товара обычного клиента (реализация)
     */
    public void refund() {
        System.out.println(name + " обычный клиент вернул товары");        
    }

}
