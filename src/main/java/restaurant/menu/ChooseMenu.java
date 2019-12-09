package restaurant.menu;

import restaurant.product.RestaurantProduct;
import java.util.List;
import java.util.Map;

public class ChooseMenu {

    public static Map.Entry<Country,List<RestaurantProduct>> chooseKitchen(Map<Country,List<RestaurantProduct>> hashMap, int userInputNumber) {
        Map.Entry<Country,List<RestaurantProduct>> mainDishEntry = null;
        for (Map.Entry<Country, List<RestaurantProduct>> entry : hashMap.entrySet()) {
            if (entry.getKey().getId() == userInputNumber) {
                mainDishEntry = entry;
                System.out.println("You typed " + entry.getKey().getCountryName() + " restaurant");
            }
        }
        return mainDishEntry;
    }

    public static RestaurantProduct  chooseProduct(List<RestaurantProduct> products, int userInputNumber){
        for (RestaurantProduct product : products) {
            if (product.getId() == userInputNumber) {
                System.out.println("You typed " + product.getMealName());
                return product;
            }
        }
        return new RestaurantProduct("Can't find",0.0);
    }
}
