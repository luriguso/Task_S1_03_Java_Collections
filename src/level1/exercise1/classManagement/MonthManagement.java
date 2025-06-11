package level1.exercise1.classManagement;

import level1.exercise1.classData.Month;
import java.util.*;

public class MonthManagement {
    private final ArrayList<Month> months = new ArrayList<>();
    private Set<Month> monthSet;

    public MonthManagement() {
        addInitialMonths();
        insertAugust();
        demonstrateOrder();
        convertToHashSet();
        demonstrateSet();
        traverseCollections();
    }

    private void addInitialMonths() {
        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "September", "October", "November", "December"
        };

        for (String name : monthNames) {
            months.add(new Month(name));
        }
        System.out.println("Month initials: " + months);
    }

    private void insertAugust() {
        months.add(7, new Month("August"));
        System.out.println("\nAfter inserting August: " + months);
    }

    private void demonstrateOrder() {
        System.out.println("\nCorrect order verified:");
        String[] correctOrder = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        for (int i = 0; i < correctOrder.length; i++) {
            String actual = months.get(i).getName();
            System.out.println(actual.equals(correctOrder[i])
                    ? "✓ " + actual
                    : "✗ Error in position " + i + ": Expected " + correctOrder[i] + ", Found " + actual);
        }
    }

    private void convertToHashSet() {
        monthSet = new HashSet<>(months);
        System.out.println("\nConverted to HashSet: " + monthSet);
    }

    private void demonstrateSet() {
        System.out.println("\nConvertedTrying to add duplicate 'December' to HashSet:");
        boolean added = monthSet.add(new Month("December"));
        System.out.println("¿Duplicate added? " + (added ? "Yes → Error" : "No → Correct"));
        System.out.println("Final elements in HashSet (" + monthSet.size() + "): " + monthSet);
    }

    private void traverseCollections() {
        System.out.println("\nWith for:");
        for (int i = 0; i < months.size(); i++) {
            System.out.print(months.get(i) + (i < months.size() - 1 ? ", " : ""));
        }

        System.out.println("\n\nWith iterador:");
        Iterator<Month> it = months.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + (it.hasNext() ? ", " : ""));
        }
    }
}
