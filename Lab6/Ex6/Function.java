package Lab6.Ex6;

public class Function {
    public String function(int n,String... strings){
        String temp = "";
        for(int i = 1; i <= strings.length; i++){
            if(i % n != 0){
                temp = temp.concat(strings[i-1] + " ");
            }
        }
        return temp;
    }
}
