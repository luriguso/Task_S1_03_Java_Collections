package level2.exercise2.main;

import level2.exercise2.classManagement.RestaurantManagement;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RestaurantManagement restaurantManagement = new RestaurantManagement();
        restaurantManagement.menu(input);
    }
}
