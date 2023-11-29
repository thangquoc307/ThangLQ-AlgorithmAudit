public class Algorithm_1 {
    public static void main(String[] args) {
        System.out.println(sumPrimeNumber(0, 100));

    }
    public static boolean isPrime(int number){
        if (number < 2){
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++){
                if (number % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
    public static int sumPrimeNumber(int start, int end){
        int sum = 0;
        for (int i = start; i <= end; i++){
            if (isPrime(i)){
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}
