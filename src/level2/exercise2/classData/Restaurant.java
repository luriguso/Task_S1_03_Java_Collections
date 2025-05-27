package level2.exercise2.classData;

import java.util.*;

public class Restaurant {
    private String name;
    private int score;

    public Restaurant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Restaurant)) return false;
        Restaurant other = (Restaurant) obj;
        return Objects.equals(name, other.name) && score == other.score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public String toString() {
        return name + " (" + score + ")";
    }

    public static List<Restaurant> convertList(HashSet<Restaurant> restaurants) {
        return new ArrayList<>(restaurants);
    }

    public static Comparator<Restaurant> descendingComparator() {
        return  Comparator.comparing(Restaurant::getName)
                .thenComparing(Comparator.comparingInt(Restaurant::getScore).reversed());
    }
}
