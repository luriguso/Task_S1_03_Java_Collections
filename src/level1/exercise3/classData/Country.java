package level1.exercise3.classData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Country {
    HashMap<String, String> countries;

    public Country() {
        countries = new HashMap<String, String>();
    }

    public void addCountry(String country,  String capital) {
        this.countries.put(country, capital);
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

    public String removeCapital(String country) {
        return countries.remove(country);
    }
}
