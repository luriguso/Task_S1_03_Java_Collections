package level1.exercise2.classManagement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.ListIterator;

public class ListsManagement {
    private ArrayList<Integer> list1;
    private ArrayList<Integer> list2;
    public ListsManagement(){
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        add_number_list1();
        add_number_list2_inverse(list1);
    }

    public void add_number_list1(){
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int number : numbers){
            list1.add(number);
        }

        System.out.println(list1.toString());
    }

    public void add_number_list2_inverse(ArrayList<Integer> list){
        ListIterator<Integer> numbers = list.listIterator(list.size());
        while (numbers.hasPrevious()){
            list2.add(numbers.previous());
        }
        System.out.println(list2.toString());
    }
}
