package level1.exercise1.classManagement;

import level1.exercise1.classData.Month;

import java.util.ArrayList;

public class MonthManagement {
    private ArrayList<Month> months;

    public MonthManagement() {
        this.months = new ArrayList<>();
        add_initial_data();
        addMonthAugust();
        addMonthDuplicate();
    }

    public void add_initial_data(){
        String[] months_initials = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "September",
                "October",
                "November",
                "December"
        };

        for (String month : months_initials) {
            Month m = new Month(month);
            addMonth(m);
        }
    }

    public void addMonth(Month m) {
        try {
            if (!Month.equals(m, this.months)){
                this.months.add(m);
            }

            System.out.println(months);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void addMonthAugust(){
        Month m = new Month("August");
        this.months.add(7,m);
        System.out.println(months);
    }

    public void addMonthDuplicate(){
        Month m = new Month("December");
        addMonth(m);
    }
}
