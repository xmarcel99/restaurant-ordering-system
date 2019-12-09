package restaurant;


import restaurant.order.OrderProcessorFacade;

public class Main {
    public static void main(String[] args) {

        OrderProcessorFacade facade = new OrderProcessorFacade();
        facade.orderProcessor().showOrder();
    }
}
