package level1.exercise3.main;

import level1.exercise3.classData.Country;
import level1.exercise3.classManagement.GameManagement;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GameManagement gameManagement = new GameManagement(sc);
        while(true){
            System.out.println("1) New Game");
            System.out.println("2) View classifications");
            System.out.println("3) exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:{
                    gameManagement.startGame(sc);
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
