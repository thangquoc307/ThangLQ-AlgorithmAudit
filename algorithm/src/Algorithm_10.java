public class Algorithm_10 {
    public static void main(String[] args) {
        Long number1 = 856695215562959206L;
        Long number2 = 123456789L;
        System.out.println(reverseNumber(number1));
        System.out.println(reverseNumber(number2));
    }
    public static Long reverseNumber (Long number){
        Long result = 0L;
        while (number >= 1){
            result *= 10;
            result += number % 10;
            number /= 10;
        }
        return result;
    }
}
