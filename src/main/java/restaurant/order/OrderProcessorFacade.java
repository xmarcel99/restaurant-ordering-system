package restaurant.order;

import restaurant.menu.ChooseMenu;
import restaurant.menu.Country;
import restaurant.menu.RestaurantMenu;
import restaurant.menu.ShowMenu;
import restaurant.product.RestaurantProduct;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OrderProcessorFacade {

    private Order order = new Order();
    private RestaurantMenu restaurantMenu = new RestaurantMenu();
    private Map.Entry<Country, List<RestaurantProduct>> mainDishEntry = null;
    private Map.Entry<Country, List<RestaurantProduct>> dessertEntry = null;
    private String chosenCountry = "";
    private Scanner userInput = new Scanner(System.in);

    public Order orderProcessor() {
        boolean isOrderFinished;
        do{
            System.out.println("Which type of cuisine are you interested in today?");
            ShowMenu.showCountries(restaurantMenu.getMainDishes());
            int userInputNumber = userInput.nextInt();
            mainDishEntry = ChooseMenu.chooseKitchen(restaurantMenu.getMainDishes(), userInputNumber);
            chosenCountry = mainDishEntry.getKey().getCountryName();
            System.out.println("Choose what main course would you like to eat?");
            ShowMenu.displayProducts(mainDishEntry.getValue());
            userInputNumber = userInput.nextInt();
            order.getMainDishes().add(ChooseMenu.chooseProduct(mainDishEntry.getValue(), userInputNumber));
            System.out.println("Choose what dessert would you like to eat?");
            dessertEntry = ShowMenu.showDesserts(restaurantMenu.getDesserts(), chosenCountry);
            userInputNumber = userInput.nextInt();
            order.getDesserts().add(ChooseMenu.chooseProduct(dessertEntry.getValue(), userInputNumber));
            System.out.println("Would you like to something to drink ?");
            System.out.println("1.Yes");
            System.out.println("2.No");
            userInputNumber = userInput.nextInt();
            drinkValidator(userInputNumber);
            order.showOrder();
            System.out.println("Would you like to order more meals ? ");
            System.out.println("1.Yes");
            System.out.println("2.No");
            userInputNumber = userInput.nextInt();
            isOrderFinished = isOrderFinishedValidator(userInputNumber);
        } while (!isOrderFinished);
        return  order;
    }

    private boolean isOrderFinishedValidator(int userInputNumber){
        return userInputNumber != 1;
    }

    private void drinkValidator(int userInputNumber){
        if (userInputNumber == 1) {
            System.out.println("Choose what drink would you like ?");
            ShowMenu.displayProducts(restaurantMenu.getDrinks());
            userInputNumber = userInput.nextInt();
            order.getDrinks().add(ChooseMenu.chooseProduct(restaurantMenu.getDrinks(), userInputNumber));
            System.out.println("Would you like lemon or ice to drink? ");
            ShowMenu.displayProducts(restaurantMenu.getDrinkingSupplements());
            userInputNumber = userInput.nextInt();
            order.getDrinkingSupplements().add(ChooseMenu.chooseProduct(restaurantMenu.getDrinkingSupplements(), userInputNumber));
        }
    }
}