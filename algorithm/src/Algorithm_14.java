import java.time.LocalTime;

public class Algorithm_14 {
    public static void main(String[] args) {
        String a1 = "11:20:30";
        String a2 = "07:35:45";
        System.out.println(sumTime(a1, a2));

    }
    public static String sumTime(String a1, String a2){
        String[] arr1 = a1.split(":");
        String[] arr2 = a2.split(":");
        LocalTime time1 = LocalTime.of(Integer.parseInt(arr1[0]), Integer.parseInt(arr1[1]), Integer.parseInt(arr1[2]));
        LocalTime result = time1.plusHours(Long.parseLong(arr2[0])).plusMinutes(Long.parseLong(arr2[1])).plusSeconds(Long.parseLong(arr2[2]));
        return result + "";
    }
}
