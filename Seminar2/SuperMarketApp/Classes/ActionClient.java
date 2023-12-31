package SuperMarketApp.Classes;

public class ActionClient extends Actor {

    // Поля класса
    private String actionName;
    private int idClient;
    private static int countOfClient;

    /**
     * Конструктор класса
     * 
     * @param name String - имя клиента
     * @param number int - клиента
     * @param actionName String - наименование акции
     */
    public ActionClient(String name, int number, String actionName) {
        super(name);
        this.actionName = actionName;
        this.idClient = number;
        countOfClient += 1;
    }

    // Геттеры и сеттеры
    public static int getCountOfClient() {
        return countOfClient;
    }

    public String getActionName() {
        return this.actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public int getNumber() {
        return idClient;
    }

    public void setNumber(int idClient) {
        this.idClient = idClient;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
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
     * Метод возврата товара акционного клиента (реализация)
     */
    public void refund() {
        System.out.println(name + " акционный клиент вернул товары");        
    }

}