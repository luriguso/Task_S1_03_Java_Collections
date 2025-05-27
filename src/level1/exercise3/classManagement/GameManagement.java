package level1.exercise3.classManagement;

import level1.exercise3.classData.Country;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GameManagement {
    private String name;
    private int score;
    private Country country;

    public GameManagement(Scanner sc) {
        this.country = new Country();
        this.score = 0;
    }

    public String addNamePlayer(Scanner scanner) throws InputMismatchException {
        try {
            System.out.println("Ingresa tu nombre: ");
            String name = scanner.nextLine();
            this.name = name;
            return name;
        }catch(InputMismatchException e) {
            System.out.println("Igrese un nombre valido");
            return null;
        }
    }

    public void startGame(Scanner scanner) {
        this.name = addNamePlayer(scanner);
        System.out.println("Bienvenido al juego de los paices");

        for (int i = 1; i <= 10; i++) {
            String countryRan = country.getRamdomCountry();
            String capitalRan = country.getCapital(countryRan);
            System.out.println("Jugador: " + this.name + "  Puntuacion: " + score);
            System.out.println(i + ") Ingresa la capital de: " + countryRan);
            String capital = scanner.nextLine();
            if (capital.equals(capitalRan)) {
                System.out.println("Correcto...");
                this.score++;
            }else {
                System.out.println("Incorrecto...La capital es: " + capitalRan);
            }
        }

        System.out.println("Fin del juego. Tu puntuacion es: " + score);
        saveScore(name, score);
    }

    public void saveScore(String name, int score) {
        String value = name + " " +  score + System.lineSeparator();

        try {
            FileWriter file = new FileWriter("src/level1/exercise3/files/classifications.txt", true);
            file.write(value);
            file.close();
            System.out.println("Los datos se registraron correctamente");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public void viewClassifications(){
        try {
            FileReader file = new FileReader("src/level1/exercise3/files/classifications.txt");
            if(file.ready()) {
                BufferedReader reader = new BufferedReader(file);
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] data = line.split(" ");
                    String name = data[0];
                    String score = data[1];
                    System.out.println("Player: " + name + ", Score: " + score);
                }
            }
        }catch (IOException e) {
            System.err.println("Error al leer en el archivo: " + e.getMessage());
        }
    }
}
