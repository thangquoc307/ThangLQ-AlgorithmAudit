import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithm_9 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{8,9,6,1,3}));
        sumNumber(list);

    }
    public static void sumNumber(List<Integer> list){
        int sum = 0;
        int max = list.get(0);
        int min = list.get(0);
        for (Integer number : list){
            sum += number;
            if (max < number) {
                max = number;
            }
            if (min > number) {
                min = number;
            }
        }
        System.out.println("Tổng 4 số lớn nhất là : " + (sum - min));
        System.out.println("Tổng 4 số nhỏ nhất là : " + (sum - max));
    }
}
