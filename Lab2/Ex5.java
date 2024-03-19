package Lab2;

import java.util.Random;

public class Ex5 {

    public static void main(String[] args){

        int columnsTab1 = 5;
        int columnsTab2 = 5;

        int rowsTab1 = 5;
        int rowsTab2 = 5;

        int[][] tab1 = new int[columnsTab1][rowsTab1];
        int[][] tab2 = new int[columnsTab2][rowsTab2];

        fillTab(tab1);
        fillTab(tab2);

        System.out.println("Pierwsza tablica:");
        print2DTab(tab1);
        System.out.println("Druga tablica:");
        print2DTab(tab2);
        System.out.println("Suma tablic:");
        print2DTab(addTabs(tab1,tab2));
    }

    private static int[][] addTabs(int[][] tab1, int[][] tab2){
        if(tab1.length == tab2.length && tab1[0].length == tab2[0].length){
            int[][] sumTab = new int[tab1.length][tab1[0].length];
            for(int i = 0; i < tab1.length; i++){
                for(int j = 0; j < tab1[0].length; j++){
                    sumTab[i][j] = tab1[i][j] + tab2[i][j];
                }
            }
            return  sumTab;
        }
        else {
            System.out.println("Nie można dodać macierzy różnej wieklość!!!");
            return new int[0][0];
        }
    }

    private static void print2DTab(int[][] tab){
        for(int i = 0; i < tab.length; i++){
            System.out.print("|\t");
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + "\t");
            }
            System.out.print("|\n");
        }
    }

    private static void fillTab(int[][] tab){
        Random random = new Random();
        for(int i = 0; i < tab.length; i++){
            for (int j = 0; j < tab[i].length; j++){
                tab[i][j] = random.nextInt(100) + 1;
            }
        }
    }
}
