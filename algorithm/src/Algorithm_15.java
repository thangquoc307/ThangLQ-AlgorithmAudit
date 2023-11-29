import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithm_15 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{4,5,9,5,6,8,5,2,1,5}));
        System.out.println(checkSumNumber(list, 10));

    }
    public static List<List<Integer>> checkSumNumber (List<Integer> list, int number) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == number) {
                    List<Integer> position = new ArrayList<>();
                    position.add(i);
                    position.add(j);
                    result.add(position);
                }
            }
        }
        return result;
    }
}
