package restaurant.menu;

import restaurant.product.RestaurantProduct;
import java.util.*;

public class RestaurantMenu {

    private Map<Country, List<RestaurantProduct>> mainDishes = new HashMap<>();
    private Map<Country, List<RestaurantProduct>> desserts = new HashMap<>();
    private List<RestaurantProduct> drinks = new ArrayList<>();
    private List<RestaurantProduct> drinkingSupplements = new ArrayList<>();

    public RestaurantMenu() {
        List<RestaurantProduct> polishDishes = new ArrayList<>(Arrays.asList(new RestaurantProduct("Pierogi",22), new RestaurantProduct("Bigos",32)));
        List<RestaurantProduct> mexicanDishes = new ArrayList<>(Arrays.asList(new RestaurantProduct("Classic Sweet Potato Casserole",12), new RestaurantProduct("Levain Bakery Has Nothing On Our Cookies",32)));
        List<RestaurantProduct> italianDishes = new ArrayList<>(Arrays.asList(new RestaurantProduct("Pizza",60), new RestaurantProduct("Lasagna",54)));
        mainDishes.put(new Country("Polish"), polishDishes);
        mainDishes.put(new Country("Mexican"), mexicanDishes);
        mainDishes.put(new Country("Italian"), italianDishes);

        List<RestaurantProduct> polishDesserts = new ArrayList<>(Arrays.asList(new RestaurantProduct("Popcorn",10), new RestaurantProduct("IceCream",8)));
        List<RestaurantProduct> mexicanDesserts = new ArrayList<>(Arrays.asList(new RestaurantProduct("Honey with chilli",14), new RestaurantProduct("Spicy IceCream",15)));
        List<RestaurantProduct> italianDesserts = new ArrayList<>(Arrays.asList(new RestaurantProduct("Cheese",11), new RestaurantProduct("Applce cake",11)));
        desserts.put(new Country("Polish"), polishDesserts);
        desserts.put(new Country("Mexican"), mexicanDesserts);
        desserts.put(new Country("Italian"), italianDesserts);

        drinks.addAll(Arrays.asList(new RestaurantProduct("Cosmopolitan",20), new RestaurantProduct("Coconut",20)));
        drinkingSupplements.addAll(Arrays.asList(new RestaurantProduct("Lemon",5),new RestaurantProduct("Ice",5)));
    }

    public Map<Country, List<RestaurantProduct>> getMainDishes() {
        return mainDishes;
    }

    public Map<Country, List<RestaurantProduct>> getDesserts() {
        return desserts;
    }

    public List<RestaurantProduct> getDrinks() {
        return drinks;
    }

    public List<RestaurantProduct> getDrinkingSupplements() {
        return drinkingSupplements;
    }
}