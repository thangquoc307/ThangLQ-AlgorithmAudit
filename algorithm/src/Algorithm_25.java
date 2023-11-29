import java.util.*;

public class Algorithm_25 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{1,1,8,5,6,23,21,7,56,99,99,98}));
        thirdLargestNumber(list);

    }
    public static void thirdLargestNumber(List<Integer> list){
        Set<Integer> integerSet = new TreeSet<>();
        for (Integer number : list){
            integerSet.add(number);
        }
        if (integerSet.size() < 3){
            System.out.println("Không có số lớn thứ 3");
        } else {
            List<Integer> result = new ArrayList<>(integerSet);
            System.out.println("Số lớn thứ 3 là " + result.get(result.size() - 3));
        }
    }
}
