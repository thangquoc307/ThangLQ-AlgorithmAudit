import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class draft {
    public static void main(String[] args) {

        String[] arr = {"A", "B", "C", "D"};
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + "");
            if (arr[i].equals("C")){
                continue;
            }
            System.out.println("ok");
            break;
        }



    }


}
