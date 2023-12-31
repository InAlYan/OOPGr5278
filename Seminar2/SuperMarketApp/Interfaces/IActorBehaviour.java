package SuperMarketApp.Interfaces;

import SuperMarketApp.Classes.Actor;

public interface IActorBehaviour {

    /**
     * Абстрактный метод сделан ли заказ (без реализации)
     */
    public boolean isTakeOrder();

    /**
     * Абстрактный метод получен ли заказ (без реализации)
     */
    public boolean isMakeOrder();

    /**
     * Абстрактный метод установить статус поля сделан ли заказ (без реализации)
     * @param val boolean - значение 
     */
    public void setTakeOrder(boolean val);

    /**
     * Абстрактный метод установить статус поля получен ли заказ (без реализации)
     * @param val boolean - значение 
     */
    public void setMakeOrder(boolean val);

    /**
     * Абстрактный метод получить ссылку на клиента (без реализации)
     */
    public Actor getActor();

}
