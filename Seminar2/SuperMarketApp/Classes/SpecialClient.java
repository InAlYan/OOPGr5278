package SuperMarketApp.Classes;

public class SpecialClient extends Actor {

    //Поля класса
    private int vipId;

    /**
     * Конструктор класса
     */
    public SpecialClient(String name, int number) {
        super(name);
        this.vipId = number;
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

    public int getVipId() {
        return vipId;
    }

    public void setVipId(int vipId) {
        this.vipId = vipId;
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
     * Метод возврата товара особо важного клиента (реализация)
     */
    public void refund() {
        System.out.println(name + " особо важный клиент вернул товары");        
    }

}
