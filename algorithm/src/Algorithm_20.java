import java.util.Arrays;
import java.util.List;

public class Algorithm_20 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list3 = Arrays.asList(1, 2, 3, 3, 2, 1);
        List<Integer> list4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> list5 = Arrays.asList(1, -2, 3, 3, -2, 1);
        List<Integer> list6 = Arrays.asList();

        System.out.println(checkSymmetric(list1));
        System.out.println(checkSymmetric(list2));
        System.out.println(checkSymmetric(list3));
        System.out.println(checkSymmetric(list4));
        System.out.println(checkSymmetric(list5));
        System.out.println(checkSymmetric(list6));
    }
    public static Boolean checkSymmetric (List<Integer> list){
        for (int i = 0; i < list.size() / 2; i++){
            if (list.get(i) != list.get(list.size() - i - 1)){
                return false;
            }
        }
        return true;
    }
}
