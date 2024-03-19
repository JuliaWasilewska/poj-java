package Lab10.Ex3;

import java.util.HashMap;
import java.util.Map;

public class WordsCounter {
    public Map<String,Integer> zliczWystapieniaSlow(String text){
        String[] words = text.split(" ");
        Map<String,Integer> map = new HashMap<String,Integer>();
        for (String word: words) {
            if(map.containsKey(word)){
                map.replace(word,map.get(word) + 1);
            }
            else {
                map.put(word,1);
            }
        }
        return map;
    }
}
