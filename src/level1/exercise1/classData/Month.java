package level1.exercise1.classData;

import level1.exercise1.exception.Exception_Duplicate_Month;

import java.util.ArrayList;

public class Month {
    private String name;

    public Month(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static boolean equals(Month month, ArrayList<Month> months) throws Exception_Duplicate_Month{
        boolean result = false;
        for (Month m : months) {
            if (m.getName().equals(month.getName())) {
                result = true;
                throw new Exception_Duplicate_Month("Error: the entered month already exists");
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Month{" +
                "name='" + name + '\'' +
                '}';
    }
}
