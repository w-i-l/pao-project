package services;
import models.product.ProductInterface;
import models.restaurant.Restaurant;

import java.util.*;


public class RestaurantService {
    private Set<Restaurant> restaurants;
    public RestaurantService(List<Restaurant> restaurants) {
        this.restaurants = new HashSet<Restaurant>();
        for (Restaurant restaurant : restaurants) {
            this.restaurants.add(restaurant);
        }
    }

    public RestaurantService() {
        this.restaurants = new HashSet<Restaurant>();
    }

    public void addRestaurant(Restaurant restaurant) {
        this.restaurants.add(restaurant);
    }

    public void removeRestaurant(Restaurant restaurant) {
        this.restaurants.remove(restaurant);
    }

    public Restaurant getRestaurantById(Integer id) {
        for (Restaurant restaurant : this.restaurants) {
            if (restaurant.getId().equals(id)) {
                return restaurant;
            }
        }
        return null;
    }

    public Set<Restaurant> getRestaurants() {
        return this.restaurants;
    }

    public void listAllRestaurants() {
        for (Restaurant restaurant : this.restaurants) {
            restaurant.showRestaurantDetails();
        }
    }

    public void viewMenuFromRestaurant(Integer id) {
        Restaurant restaurant = getRestaurantById(id);
        restaurant.showMenu();
    }

    public ProductInterface getProductFromRestaurant(Integer restaurantId, Integer productId) {
        Restaurant restaurant = getRestaurantById(restaurantId);
        List<ProductInterface> products = restaurant.getProducts();
        for (ProductInterface product : products) {
            if (product.getId() == productId) {
                return product;
            }
        }
        return null;
    }
}
