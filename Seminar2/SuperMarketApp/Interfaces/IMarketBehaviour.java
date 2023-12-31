package SuperMarketApp.Interfaces;

import SuperMarketApp.Classes.Actor;

import java.util.List;

public interface IMarketBehaviour {

    /**
     * Абстрактный метод пустить в магазин (без реализации)
     * 
     * @param actor
     */
    public void acceptToMarket(IActorBehaviour actor);

    /**
     * Абстрактный метод выпустить из магазина (без реализации)
     * @param arrLst
     */
    public void releaseFromMarket(List<Actor> arrLst);

    /**
     * Абстрактный метод выполнить операции в магазине
     */
    public void update();

}
