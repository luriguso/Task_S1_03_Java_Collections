package level1.exercise3.main;

import level1.exercise3.classData.Country;
import level1.exercise3.classManagement.GameManagement;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = "src/level1/exercise3/files/countries.txt";
        GameManagement gameManagement = new GameManagement(sc);
        while(true){
            System.out.println("1) Juego Nuevo");
            System.out.println("2) Ver calificaciones");
            System.out.println("3) Salir");
            System.out.println("Selecciona una opcion: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:{
                    gameManagement.startGame(sc, path);
                }
                break;
                case 2:gameManagement.viewClassifications();
                break;
                case 3: return;
                default:System.out.println("Wrong choice");
            }
        }
    }
}
