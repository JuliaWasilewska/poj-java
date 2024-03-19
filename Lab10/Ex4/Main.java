package Lab10.Ex4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(skorowidzLiterowy("Hello"));
    }
    
    static private Map<String,Set<Integer>> skorowidzLiterowy(String string){
        String[] letters = string.split("");
        Map<String,Set<Integer>> map = new HashMap<>();
        for(int i = 0; i < letters.length;i++){
            if(map.containsKey(letters[i])){
                map.get(letters[i]).add(i);
            }
            else{
                map.put(letters[i],new HashSet<>());
                map.get(letters[i]).add(i);
            }
        }
        return map;
    }
}
