package restaurant.order;

import restaurant.product.RestaurantProduct;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<RestaurantProduct> mainDishes = new ArrayList<>();
    private List<RestaurantProduct> desserts= new ArrayList<>();
    private List<RestaurantProduct> drinks= new ArrayList<>();
    private List<RestaurantProduct> drinkingSupplements = new ArrayList<>();

    public void showOrder(){
        double sum = 0;
        System.out.println("----------Your order----------");
        System.out.println("----------Main Dish----------");
        sum += countProduct(mainDishes);
        System.out.println("----------Desserts----------");
        sum+= countProduct(desserts);
        if(drinks.size() > 0) {
            System.out.println("----------Drinks---------- ");
            sum += countProduct(drinks);
            if(drinkingSupplements.size() > 0) {
                sum +=countProduct(drinkingSupplements);
            }
        }
        System.out.println("You have to pay: " + sum + " $");
    }

    public double countProduct(List<RestaurantProduct> products) {
        int sum = 0;
        for(RestaurantProduct product: products) {
            System.out.println(product.getMealName() + " " + product.getPrice() + " $");
            sum += product.getPrice();
        }
        return  sum;
    }

    public List<RestaurantProduct> getMainDishes() {
        return mainDishes;
    }

    public List<RestaurantProduct> getDesserts() {
        return desserts;
    }

    public List<RestaurantProduct> getDrinks() {
        return drinks;
    }

    public List<RestaurantProduct> getDrinkingSupplements() {
        return drinkingSupplements;
    }


}
