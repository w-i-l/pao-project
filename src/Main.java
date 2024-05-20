import database.Connector;
import services.*;
import services.menu.MenuService;
import tests.DriverDatabaseTest;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RestaurantService restaurantService = new RestaurantService();
        DriverService driverService = new DriverService();
        CustomerService customerService = new CustomerService();
        OrderService orderService = new OrderService();


        MenuService menuService = MenuService.init(
                restaurantService,
                orderService,
                customerService,
                driverService,
                scanner
        );
        menuService.initMenuItems();
//        menuService.mainLoop();
        Connector.init();
        DriverDatabaseTest.test();
        Connector.closeConnection(false);
    }
}