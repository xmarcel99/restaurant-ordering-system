package restaurant.order;

import org.junit.Test;
import restaurant.product.RestaurantProduct;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class OrderTest {

    @Test
    public void countProduct() {
        //Given
        Order order = new Order();
        List<RestaurantProduct> products = Arrays.asList(new RestaurantProduct(1,"Bigos",10)
                , new RestaurantProduct(2,"Pierogi",10)
                ,new RestaurantProduct(3,"Pizza",10));
        order.getMainDishes().addAll(products);
        //When
        double resultPrice = order.countProduct(products);
        //Then
        assertEquals(30,resultPrice,0.00);
    }
}