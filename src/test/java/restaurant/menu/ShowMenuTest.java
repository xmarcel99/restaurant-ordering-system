package restaurant.menu;

import org.junit.Test;
import restaurant.product.RestaurantProduct;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;


public class ShowMenuTest {

    @Test
    public void showDesserts() {
        //Given
        Country  poland = new Country(1,"Poland");
        Country  germany = new Country(2,"Germany");
        List<RestaurantProduct> products1 = Arrays.asList(new RestaurantProduct(1,"IceCream",23.6));
        List<RestaurantProduct> products2 = Arrays.asList(new RestaurantProduct(1,"Chocolate",20));
        Map<Country,List<RestaurantProduct>> hashMap = new HashMap<>();
        hashMap.put(poland,products1);
        hashMap.put(germany,products2);
        //When
        Map.Entry<Country,List<RestaurantProduct>> resultEntry = ShowMenu.showDesserts(hashMap,"Poland");
        //Then
        assertEquals(resultEntry.getValue().size(),1);
        assertEquals(resultEntry.getKey().getCountryName(),"Poland");
        assertEquals(resultEntry.getValue().get(0).getMealName(),"IceCream");
    }
}