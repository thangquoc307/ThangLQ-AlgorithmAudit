import java.util.HashMap;
import java.util.Map;

public class Algorithm_16 {
    public static void main(String[] args) {
        System.out.println(coverNumber("iv"));
        System.out.println(coverNumber("ix"));
        System.out.println(coverNumber("xiv"));
        System.out.println(coverNumber("m"));

    }
    public static int coverNumber(String s) {
        s = s.toUpperCase();
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        map1.put("IV", "4 ");
        map1.put("IX", "9 ");
        map1.put("XL", "40 ");
        map1.put("XC", "90 ");
        map1.put("CD", "400 ");
        map1.put("CM", "900 ");
        map2.put("I", "1 ");
        map2.put("V", "5 ");
        map2.put("X", "10 ");
        map2.put("L", "50 ");
        map2.put("C", "100 ");
        map2.put("D", "500 ");
        map2.put("M", "1000 ");

        for (String string : map1.keySet()){
            s = s.replaceAll(string, map1.get(string));
        }
        for (String string : map2.keySet()){
            s = s.replaceAll(string, map2.get(string));
        }
        s = s.trim();
        int result = 0;
        String[] strings = s.split(" ");
        for (String string : strings){
            result += Integer.parseInt(string);
        }
        return result;
    }
}
