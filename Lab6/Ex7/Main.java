package Lab6.Ex7;

public class Main {
    public static void main(String[] args) {
        Function function = new Function();
        System.out.println(function.function(new int[] {1,2,3}));
        System.out.println(function.function(new int[] {1,2,3},new int[]{4,5}));
        System.out.println(function.function(new int[] {1,2,3},new int[]{4,5},new int[]{6}));
    }
}
