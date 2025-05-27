package level1.exercise2.classData;

import java.util.ArrayList;

public class List_1 {
    ArrayList<Integer> numbers;

    public List_1() {
        this.numbers = new  ArrayList<>();
    }

    public ArrayList<Integer> getNumbers() {
        return this.numbers;
    }

    public int getLength(){
        return numbers.size();
    }

    public void add_number(int number){
        this.numbers.add(number);
    }

    @Override
    public String toString() {
        return "List_1{" +
                "numbers=" + numbers +
                '}';
    }
}
