package SuperMarketApp.Interfaces;

public interface IQueueBehaviour {

    /**
     * Абстрактный метод встать в очередь (без реализации)
     * 
     * @param actor
     */
    public void takeInQueue(IActorBehaviour actor);

    /**
     * Абстрактный метод уйти из очереди (без реализации)
     */
    public void releaseFromQueue();

    /**
     * Абстрактный метод сделать заказ (без реализации)
     */
    public void takeOrder();

    /**
     * Абстрактный метод получить заказ (без реализации)
     */
    public void giveOrder();

}
