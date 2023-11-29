import java.util.Map;
import java.util.TreeMap;

public class Algorithm_2 {
    public static void main(String[] args) {
        System.out.println(countWord("asdhjifgasuiodfghiafjhgiagafgadfgethaadv"));
        System.out.println(countWord("aaaaffffeeeettttt"));

    }
    public static Map<String, Integer> countWord (String str){
        Map<String, Integer> mapString = new TreeMap<>();
        while (!str.equals("")){
            String word = str.charAt(0) + "";
            int length = str.length();
            str = str.replaceAll(word, "");
            mapString.put(word, length - str.length());
        }
        return mapString;
    }
}
