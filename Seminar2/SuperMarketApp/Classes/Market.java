package SuperMarketApp.Classes;

import SuperMarketApp.Interfaces.IActorBehaviour;
import SuperMarketApp.Interfaces.IMarketBehaviour;
import SuperMarketApp.Interfaces.IQueueBehaviour;

import java.util.ArrayList;
import java.util.List;

public class Market implements IMarketBehaviour, IQueueBehaviour {

    //Очередь клиентов в магазине
    private List<IActorBehaviour> queue;

    /**
     * Конструктор класса
     */
    public Market() {
        this.queue = new ArrayList<IActorBehaviour>();
    }

    /**
     * Метод пустить в магазин (реализация)
     *  @param actor - экземпляр класса 
     */    
    @Override
    public void acceptToMarket(IActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

   /**
     * Метод встать в очередь (реализация)
     * 
     * @param actor - экземпляр класса 
     */    
    @Override
    public void takeInQueue(IActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    /**
     * Метод выпустить из магазина (реализация)
     *  @param actors List<Actor> - коллекция экземляров класса Actor
     */    
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }
    }

    /**
     * Метод выполнить операции в магазине (реализация)
     */    
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    /**
     * Метод получить заказ (реализация)
     */
    @Override
    public void giveOrder() {
        for (IActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
            }
        }
    }

    /**
     * Метод уйти из очереди (реализация)
     */    
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (IActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }
        }
        releaseFromMarket(releaseActors);
    }

    /**
     * Метод сделать заказ (реализация)
     */
    @Override
    public void takeOrder() {
        for (IActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");
            }
        }
    }

}