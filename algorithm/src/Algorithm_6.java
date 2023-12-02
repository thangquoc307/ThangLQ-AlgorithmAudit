import java.util.HashMap;
import java.util.Map;

public class Algorithm_6 {
    public static void main(String[] args) {
        String str = "ADSGTHZXDFGATNSZFMSHMSRTE";
        stringanalyze(str);
    }
    public static void stringanalyze(String str){
        Map<String, Integer> map = new HashMap<>();
        String uniqueString = "";
        while (!str.equals("")){
            String word = str.charAt(0) + "";
            int length = str.length();
            str = str.replaceAll(word, "");
            uniqueString += word;
            map.put(word, length - str.length());
        }
        System.out.println("Từ sau khi bỏ trùng lặp là : " + uniqueString);
        System.out.println("Tần suất xuất hiện của các từ");
        System.out.println(map);
    }
}
