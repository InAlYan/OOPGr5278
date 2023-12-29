package Domain;

public class HotDrink extends Product {
    
    /**
     * Температура горячего напитка
     */
    private float temperature;

    /**
     * Констуктор класса
     * @param price int - цена бутылки
     * @param place int - положение в автомате
     * @param name String - наименование
     * @param id long - идентификатор продукта
     * @param temperature float - температура напитка
     */
    public HotDrink (int price, int place, String name, long id, float temperature) {
        super(price, place, name, id);
        this.temperature = temperature;
    }

    /**
     * Получить температуру напитка
     * @return float temperature - температура продукта
     */
    public float getTemperature() {
        return temperature;
    }

    /**
     * Установить температуру напитка
     * @param float temperature - температура продукта
     */
    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    /**
     * Переопрелеляем метод toString для нового поля temperature
     * @return String строка описывающая экземпляр класса
     */
    @Override
    public String toString() {
        return super.toString() + "Temperature=" + temperature + "\n";
    }

}
