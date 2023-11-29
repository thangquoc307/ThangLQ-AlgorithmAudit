import java.util.*;

public class Algorithm_17 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{1,1,8,5,6,23,21,7,56,99,99,98}));
        secondLargestNumber(list);

    }
    public static void secondLargestNumber(List<Integer> list){
        Set<Integer> integerSet = new TreeSet<>();
        for (Integer number : list){
            integerSet.add(number);
        }
        if (integerSet.size() < 2){
            System.out.println("Không có số lớn thứ 2");
        } else {
            List<Integer> result = new ArrayList<>(integerSet);
            System.out.println("Số lớn thứ 2 là " + result.get(result.size() - 2));
        }
    }
}
