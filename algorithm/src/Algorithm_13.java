public class Algorithm_13 {
    public static void main(String[] args) {
        System.out.println(convertNumber(2));
        System.out.println(convertNumber(3));
        System.out.println(convertNumber(8));
        System.out.println(convertNumber(16));
        System.out.println(convertNumber(17));
        System.out.println(convertNumber(18));
        System.out.println(convertNumber(800));
        System.out.println(convertNumber(0));

    }
    public static Integer convertNumber (Integer num) {
        if (num == 0) {
            return 0;
        }

        int result = 0;
        int count = 0;

        while (num > 0) {
            result = result + (num % 8) * (int) Math.pow(10, count);
            num /= 8;
            count++;
        }

        return result;
    }
}
