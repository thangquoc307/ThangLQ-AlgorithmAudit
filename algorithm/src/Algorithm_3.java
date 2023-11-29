public class Algorithm_3 {
    public static void main(String[] args) {
        System.out.println(countFrequency("abc", "ádfafbwrtebabcadfbrtbabcargqaevbabc"));
    }
    public static int countFrequency(String search, String str){
        return (str.length() - str.replaceAll(search, "").length()) / search.length();
    }
}
