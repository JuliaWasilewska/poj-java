package Lab10.Ex1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.addAll(Arrays.asList(5,1,23,5,2,1,1));

        System.out.println(numbers);
        System.out.println(showDuplicates(numbers));
        deleteDuplicates(numbers);
        System.out.println(numbers);
    }

    static private String showDuplicates(List list){
        List onetime = new ArrayList();
        List duplicates = new ArrayList();
        for (int i = 0; i < list.size();i++){
            if(onetime.contains(list.get(i))){
                duplicates.add(list.get(i));
            }
            else {
                onetime.add(list.get(i));
            }
        }
        return duplicates.toString();
    }

    static private void deleteDuplicates(List list){
        List onetime = new ArrayList();
        for (int i = 0; i < list.size();i++){
            if(onetime.contains(list.get(i))){
                list.remove(i);
                i--;
            }
            else {
                onetime.add(list.get(i));
            }
        }
    }
}
