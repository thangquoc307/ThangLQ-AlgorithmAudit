import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithm_5 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(new Integer[]{1,7,7,5,2,444,22,65,89,52,32,66}));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(new Integer[]{88,99,7,5,2,22,65,89,52,52,32,66}));
        System.out.println(getNumberExists(list1, list2));
    }
    public static List<Integer> getNumberExists(List<Integer> list1, List<Integer> list2){
        List<Integer> result = new ArrayList<>();
        for (int i = list1.size() - 1; i >= 0; i--){
            int number = list1.get(i);
            if (list2.contains(number)){
                list1.remove(i);
                list2.remove(list2.indexOf(number));
                result.add(number);
            }
        }
        return result;
    }
}
