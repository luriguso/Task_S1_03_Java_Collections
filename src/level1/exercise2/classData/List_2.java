package level1.exercise2.classData;

import java.util.ArrayList;

public class List_2 {
    ArrayList<Integer> numbers;

    public List_2(){
        this.numbers = new ArrayList<>();
    }

    public ArrayList<Integer> getNumbers(){
        return numbers;
    }

    public int getLength(){
        return numbers.size();
    }

    public void addNumber(int number){
        this.numbers.add(number);
    }

    @Override
    public String toString() {
        return "List_2{" +
                "numbers=" + numbers +
                '}';
    }
}
