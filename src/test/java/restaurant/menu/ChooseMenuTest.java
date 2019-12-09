package restaurant.menu;

import org.junit.Test;
import restaurant.product.RestaurantProduct;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class ChooseMenuTest {

    @Test
    public void chooseKitchen() {
        //Given
        Country  poland = new Country(1,"Poland");
        Country  germany = new Country(2,"Germany");
        List<RestaurantProduct> products1 = Arrays.asList(new RestaurantProduct(1,"Bigos",23.6));
        List<RestaurantProduct> products2 = Arrays.asList(new RestaurantProduct(1,"Hamburger",20));
        Map<Country,List<RestaurantProduct>> hashMap = new HashMap<>();
        hashMap.put(poland,products1);
        hashMap.put(germany,products2);
        //When
        Map.Entry<Country,List<RestaurantProduct>> result = ChooseMenu.chooseKitchen(hashMap,1);
        //Then
        assertEquals("Poland",result.getKey().getCountryName());
        assertEquals(1,result.getValue().size());
        assertEquals("Bigos",result.getValue().get(0).getMealName());
    }

    @Test
    public void chooseProduct() {
        //Given
        List<RestaurantProduct> products = Arrays.asList(new RestaurantProduct(1,"Bigos",23.6)
                ,new RestaurantProduct(2,"Hamburger",20));
        //When
        RestaurantProduct resultProduct = ChooseMenu.chooseProduct(products,2);
        //Then
        assertEquals("Hamburger",resultProduct.getMealName());
        assertEquals(2,resultProduct.getId());
        assertEquals(20.0,00,resultProduct.getPrice());
    }
}