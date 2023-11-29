import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithm_4 {
    public static void main(String[] args) {
        System.out.println(sortString("afdhnaehssfgdfgyysdg"));

    }
    public static String sortString(String str){
        String[] stringArray = str.split("");
        List<String> list = new ArrayList<>(Arrays.asList(stringArray));
        Collections.sort(list);

        String result = "";
        for(String word : list){
            result += word;
        }
        return result;
    }
}
