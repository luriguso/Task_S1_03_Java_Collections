package level2.exercise1.classManagement;

import level2.exercise1.classData.Restaurant;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RestaurantManagement {
    HashSet<Restaurant> restaurants;

    public RestaurantManagement() {
        restaurants = new HashSet<Restaurant>();
        addDataInitial();
    }
    public void formAddRestaurant(Scanner scanner) throws InputMismatchException {
        String name = "";
        int score = -1;
        while (true) {
            try {
                System.out.println("Ingrese el nombre del restaurante: ");
                name = scanner.next();
                break;
            }catch (InputMismatchException e){
                System.out.println("Ingrese un nombre valido");
                scanner.nextLine();
            }
        }
        while (true) {
            try {
                System.out.println("Ingrese la puntuacion del restaurante: ");
                score = scanner.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("Ingrese una puntuacion valida");
                scanner.nextLine();
            }
        }

        addRestaurant(new Restaurant(name,score));
    }
    public void addRestaurant(Restaurant restaurant) {
        if(restaurants.contains(restaurant)){
            System.out.println("Restaurante existente");
        }else {
            restaurants.add(restaurant);
            System.out.println("Restaurante registrado");
        }
    }

    public boolean equals(Restaurant restaurant) {
        return restaurants.contains(restaurant);
    }

    public void viewRestaurant() {
        System.out.println("lista de restaurantes");
        for (Restaurant restaurant : restaurants) {
            System.out.println("Restaurante: " + restaurant.getName() + ", Puntuacion: " + restaurant.getScore());
        }
    }

    public void menu(Scanner  scanner) {
        while (true) {
            System.out.println("MENU");
            System.out.println("1. Add restaurante");
            System.out.println("2. List restaurantes");
            System.out.println("3. Quit");
            int choice = scanner.nextInt();
            switch(choice){
                case 1: this.formAddRestaurant(scanner);
                    break;
                case 2: this.viewRestaurant();
                break;
                case 3: return;
                default:System.out.println("Ingrese una opcion valida");
            }
        }
    }

    public void addDataInitial(){
        Restaurant restaurant_1 =  new Restaurant("Pollo koko",7);
        Restaurant restaurant_2 =  new Restaurant("Panchita",8);
        Restaurant restaurant_3 =  new Restaurant("Hamburgon",5);
        Restaurant restaurant_4 =  new Restaurant("Brasa Roja",7);
        addRestaurant(restaurant_1);
        addRestaurant(restaurant_2);
        addRestaurant(restaurant_3);
        addRestaurant(restaurant_4);
        System.out.println("Restaurantes de ejemplo cargados exitosamente");
    }
}
