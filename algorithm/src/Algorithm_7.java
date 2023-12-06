import java.util.*;

public class Algorithm_7 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(new String[]{"A","B","C","A","A","D","A","F","B","R","S","B","A","F"});
        System.out.println(countFrequence(list));
    }
    public static Map<String, Integer> countFrequence(List<String> list){
        Map<String, Integer> result = new HashMap<>();
        for (String word : list){
            if (result.containsKey(word)) {
                result.put(word, result.get(word) + 1);
            } else {
                result.put(word, 1);
            }
        }
        return result;
    }
}
