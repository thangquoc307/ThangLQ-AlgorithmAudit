import java.util.ArrayList;
import java.util.List;

public class Algorithm_11 {
    public static void main(String[] args) {
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        while (true){
            int i = fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2);
            if (i < 100) {
                fibonacci.add(i);
            } else {
                break;
            }
        }
        System.out.println(fibonacci);
    }
}
