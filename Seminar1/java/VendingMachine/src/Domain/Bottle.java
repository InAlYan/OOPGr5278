package Domain;

public class Bottle extends Product {
    
    private float bottleVolume;

    /**
     * Конструктор класса
     * @param int price - цена
     * @param int place - положение в автомате
     * @param String name - наименование
     * @param long id - идентификатор продукта
     * @param float bottleVolume - объем
     */
    public Bottle(int price, int place, String name, long id, float bottleVolume) {
        super(price, place, name, id);
        this.bottleVolume = bottleVolume;
    }

    // Геттеры и сеттеры
    public float getBottleVolume() {
        return bottleVolume;
    }

    public void setBottleVolume(float bottleVolume) {
        this.bottleVolume = bottleVolume;
    }

    /**
     * Переопрелеляем метод toString для нового поля объем
     * @return String строка описывающая экземпляр класса
     */
    @Override
    public String toString() {
        return super.toString() + "Volume=" + bottleVolume + "\n";
    }

}
