package restaurant.product;

public class RestaurantProduct {

    private int id;
    private String mealName;
    private double price;

    public RestaurantProduct(String mealName, double price) {
        this.mealName = mealName;
        this.price = price;
    }

    public RestaurantProduct(int id, String mealName, double price) {
        this.id = id;
        this.mealName = mealName;
        this.price = price;
    }

    public String getMealName() {
        return mealName;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}