public class Algorithm_19 {
    public static void main(String[] args) {
        String str = "gfdsbnyasghbs";
        System.out.println(reverseString(str));
    }
    private static String reverseString (String str){
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--){
            result += ("" + str.charAt(i));
        }
        return result;
    }
}
