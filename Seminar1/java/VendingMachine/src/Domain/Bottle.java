package Domain;

public class Bottle extends Product {
    
    private float bottleVolume;

    /**
     * Конструктор класса
     * @param price int - цена
     * @param place int - положение в автомате
     * @param name String - наименование
     * @param id long - идентификатор продукта
     * @param bottleVolume float - объем
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
     * @return строка описывающая экземпляр класса
     */
    @Override
    public String toString() {
        return super.toString() + "Volume=" + bottleVolume + "\n";
    }

}
