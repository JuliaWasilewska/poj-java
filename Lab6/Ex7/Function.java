package Lab6.Ex7;

public class Function {
    public int function(int[]... tabs){
        int temp = 0;
        for (int[] tab: tabs) {
            for (int number:tab) {
                temp += number;
            }
        }
        return temp;
    }
}
