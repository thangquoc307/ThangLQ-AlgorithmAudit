import java.util.*;

public class Algorithm_5 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(new Integer[]{1,7,7,5,2,444,22,65,89,52,32,66}));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(new Integer[]{88,99,7,5,2,22,65,89,52,52,32,66}));
        System.out.println(getNumberExists(list1, list2));
    }
    public static Map<Integer, Integer> getNumberExists(List<Integer> list1, List<Integer> list2){
        Map<Integer, Integer> result = new HashMap<>();
        for (Integer number : list1){
            if (result.containsKey(number)){
                result.put(number, result.get(number) + 1);
            } else {
                result.put(number, 1);
            }
        }
        return result;
    }
}
