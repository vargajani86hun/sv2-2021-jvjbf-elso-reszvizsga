package cars;

public class Car {
    private String brand;
    private double engineSize;
    private CarColors color;
    private int price;

    public Car(String brand, double engineSize, CarColors color, int price) {
        this.brand = brand;
        this.engineSize = engineSize;
        this.color = color;
        this.price = price;
    }

    public void decreasePrice(int percent) {
        price = price * (100 - percent) / 100;
    }

    public String getBrand() {
        return brand;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public CarColors getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }
}
