package Lab9.Ex4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Competitor competitor1 = new Competitor("Adam","Zielinski",2,10);
        Competitor competitor2 = new Competitor("Zdzislaw","Dekiel",1,12);
        Competitor competitor3 = new Competitor("Bartosz","Dekiel",3,11);

        Competitor[] competitorsArray = {competitor1,competitor2,competitor3};

        NameComparator nameComparator = new NameComparator();
        SurnameComparator surnameComparator = new SurnameComparator();
        NumberComparator numberComparator = new NumberComparator();
        MaxSpeedComparator maxSpeedComparator = new MaxSpeedComparator();

        System.out.println("Unsorted: " + Arrays.toString(competitorsArray));
        Arrays.sort(competitorsArray,nameComparator);
        System.out.println("Sorted by name: " + Arrays.toString(competitorsArray));
        Arrays.sort(competitorsArray,surnameComparator);
        System.out.println("Sorted by surname: " + Arrays.toString(competitorsArray));
        Arrays.sort(competitorsArray,numberComparator);
        System.out.println("Sorted by number: " + Arrays.toString(competitorsArray));
        Arrays.sort(competitorsArray,maxSpeedComparator);
        System.out.println("Sorted by max speed: " + Arrays.toString(competitorsArray));
    }
}
