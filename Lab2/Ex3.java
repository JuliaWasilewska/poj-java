package Lab2;

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args){

        int[] tab1 = {1,2,3,4};
        int[] tab2 = {5,6,7,8};

        System.out.println(Arrays.toString(addTabs(tab1,tab2)));
    }

    public static int[] addTabs(int[] tab1, int[] tab2){
        if (tab1.length == tab2.length){
            int[] temptab = new int[tab1.length];
            for (int i = 0; i < temptab.length; i++) {
                temptab[i] = tab1[i] + tab2[i];
            }
            return temptab;
        }
        else {
            return new int[0];
        }
    }

}
