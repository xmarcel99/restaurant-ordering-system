package restaurant.menu;

import restaurant.product.RestaurantProduct;
import java.util.List;
import java.util.Map;

public class ShowMenu {

    public static void displayProducts(List<RestaurantProduct> restaurantProducts){
        for (int m = 0; m < restaurantProducts.size(); m++) {
            RestaurantProduct restaurantProduct = restaurantProducts.get(m);
            restaurantProduct.setId(m + 1);
            System.out.println(restaurantProduct.getId() + ". " + restaurantProduct.getMealName() + " " + restaurantProduct.getPrice() + " $");
        }
    }

    public static void showCountries(Map<Country, List<RestaurantProduct>> hashMap) {
        int i = 1;
        for (Map.Entry<Country, List<RestaurantProduct>> countryName : hashMap.entrySet()) {
            Country country = countryName.getKey();
            country.setId(i);
            System.out.println(country.getId() + ". " + country.getCountryName());
            i++;
        }
    }

    public static Map.Entry<Country,List<RestaurantProduct>> showDesserts(Map<Country,List<RestaurantProduct>> hashMap, String chosenCountry){
        Map.Entry<Country,List<RestaurantProduct>> dessertEntry = null;
        for (Map.Entry<Country, List<RestaurantProduct>> desserts : hashMap.entrySet()) {
            if (desserts.getKey().getCountryName().equals(chosenCountry)) {
                for (int k = 0; k < desserts.getValue().size(); k++) {
                    dessertEntry = desserts;
                    RestaurantProduct dessert = desserts.getValue().get(k);
                    dessert.setId(k + 1);
                    System.out.println(dessert.getId() + ". " + dessert.getMealName() + " " + dessert.getPrice() + " $");
                }
            }
        }
        return dessertEntry;
    }
}
