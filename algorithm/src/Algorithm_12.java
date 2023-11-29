public class Algorithm_12 {
    public static void main(String[] args) {
        isPrime(-2);
        isPrime(3);
        isPrime(4);
        isPrime(5);
        isPrime(6);
        isPrime(7);

    }
    public static boolean isPrime(int number){
        if (number < 2){
            System.out.println(number + " không phải số nguyên tố");
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++){
                if (number % i == 0){
                    System.out.println(number + " không phải số nguyên tố");
                    return false;
                }
            }
            System.out.println(number + " là số nguyên tố");
            return true;
        }
    }
}
