package level_1.exercise_2.classManagement;

import level_1.exercise_2.classData.List_1;
import level_1.exercise_2.classData.List_2;

import java.util.ListIterator;

public class ListsManagement {
    private List_1 list1;
    private List_2 list2;
    public ListsManagement(){
        list1 = new List_1();
        list2 = new List_2();
        add_number_list1();
        add_number_list2_inverse(list1);
    }

    public void add_number_list1(){
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int number : numbers){
            list1.add_number(number);
        }

        System.out.println(list1.toString());
    }

    public void add_number_list2_inverse(List_1 list){
        ListIterator<Integer> numbers = list.getNumbers().listIterator(list.getNumbers().size());
        while (numbers.hasPrevious()){
            list2.addNumber(numbers.previous());
        }
        System.out.println(list2.toString());
    }
}
