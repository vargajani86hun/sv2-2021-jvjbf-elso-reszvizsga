package cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private String name;
    private int maxPrice;
    private List<Car> cars = new ArrayList<>();

    public CarShop(String name, int maxPrice) {
        this.name = name;
        this.maxPrice = maxPrice;
    }

    public boolean addCar(Car car) {
        boolean isCheap = maxPrice >= car.getPrice();

        if (isCheap) {
            cars.add(car);
        }

        return isCheap;
    }

    public int sumCarPrice() {
        int sum = 0;

        for (Car c : cars) {
            sum += c.getPrice();
        }

        return sum;
    }

    public int numberOfCarsCheaperThan(int price) {
        int amount = 0;

        for (Car c : cars) {
            if (price >= c.getPrice()){
                amount ++;
            }
        }

        return amount;
    }

    public String getName() {
        return name;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public List<Car> getCars() {
        return new ArrayList<>(cars);
    }
}
