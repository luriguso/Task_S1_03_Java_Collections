package level1.exercise3.classData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Country {
    HashMap<String, String> countries;

    public Country() {
        countries = new HashMap<String, String>();
        addCountryFromFile();
    }

    public void addCountryFromFile() {
        FileReader file;
        BufferedReader reader;
        try {
            file = new FileReader("src/level1/exercise3/files/countries.txt");
            if(file.ready()) {
                reader = new BufferedReader(file);
                String linea;
                while ((linea = reader.readLine()) != null) {
                    String[] data = linea.split(" ");
                    String name = data[0];
                    String capital = data[1];
                    this.countries.put(name, capital);
                }
            }
        }catch (Exception e) {
            System.out.println("Error al cargar el archivo");
        }
    }

    public String getRamdomCountry() {
        List<String> keys = new ArrayList<>(countries.keySet());

        Random random = new Random();
        String country = keys.get(random.nextInt(keys.size()));
        return country;
    }

    public String getCapital(String country) {
        return countries.get(country);
    }
}
