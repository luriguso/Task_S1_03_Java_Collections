package level2.exercise2.classManagement;

import level2.exercise2.classData.Restaurant;

import java.util.*;

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
                name = scanner.nextLine();
                break;
            }catch (InputMismatchException e){
                System.out.println("Ingrese un nombre valido");
                scanner.nextLine();
            }
        }
        while (score < 0 || score > 10) {
            try {
                System.out.println("Ingrese la puntuacion del restaurante: ");
                score = scanner.nextInt();
                if (score < 0 || score > 10) {
                    System.out.println("Error: La puntuación debe ser entre 0 y 10");
                }
                scanner.nextLine();
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

    public void viewRestaurant() {
        System.out.println("lista de restaurantes");
        for (Restaurant restaurant : restaurants) {
            System.out.println("Restaurante: " + restaurant.getName() + ", Puntuacion: " + restaurant.getScore());
        }
    }

    public void orderByNameAndScoreDesc() {
        System.out.println("lista de restaurantes por nombre");
        List<Restaurant> list = Restaurant.convertList(restaurants);
        list.sort(Restaurant.descendingComparator());

        for (Restaurant restaurant : list) {
            System.out.println(restaurant.getName() + ", Puntuacion: " + restaurant.getScore());
        }
    }

    public void menu(Scanner  scanner) {
        while (true) {
            System.out.println("MENU");
            System.out.println("1. Registrar restaurante");
            System.out.println("2. Mostrar restaurantes");
            System.out.println("3. Ordenar restaurante por nombre");
            System.out.println("0. Quit");
            try {
                int choice = scanner.nextInt();
                switch(choice){
                    case 1: this.formAddRestaurant(scanner);
                        break;
                    case 2: this.viewRestaurant();
                        break;
                    case 3: this.orderByNameAndScoreDesc();
                        break;
                    case 0: return;
                    default:System.out.println("Ingrese una opcion valida");
                }
            }catch (InputMismatchException e){
                System.out.println("Ingrese una opcion valida");
            }
        }
    }

    public void addDataInitial(){
        Restaurant restaurant_1 =  new Restaurant("Pollo koko",7);
        Restaurant restaurant_2 =  new Restaurant("Panchita",8);
        Restaurant restaurant_3 =  new Restaurant("Hamburgon",5);
        Restaurant restaurant_4 =  new Restaurant("Brasa Roja",7);
        Restaurant restaurant_5 =  new Restaurant("Pollo koko",8);
        Restaurant restaurant_6 =  new Restaurant("Panchita",7);
        Restaurant restaurant_7 =  new Restaurant("Hamburgon",4);
        Restaurant restaurant_8 =  new Restaurant("Brasa Roja",9);
        addRestaurant(restaurant_1);
        addRestaurant(restaurant_2);
        addRestaurant(restaurant_3);
        addRestaurant(restaurant_4);
        addRestaurant(restaurant_5);
        addRestaurant(restaurant_6);
        addRestaurant(restaurant_7);
        addRestaurant(restaurant_8);

        System.out.println("Restaurantes de ejemplo cargados exitosamente");
    }
}
