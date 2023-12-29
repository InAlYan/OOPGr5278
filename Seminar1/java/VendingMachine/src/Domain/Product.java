package Domain;

public class Product {
    // Поля
    private int price;
    private int place;
    private String name;
    private long id;

    // Конструктор
    public Product(int price, int place, String name, long id) {
        this.price = price;
        this.place = place;
        this.name = name;
        this.id = id;
    }

    // Методы
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
    }
    public int getPlace() {
        return place;
    }
    public void setPlace(int place) {
        this.place = place;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "\nPrice=" + this.price + 
        "\nPlace=" + this.place + 
        "\nName=" + name + 
        "\nId=" + id + "\n";
    }

    
}
