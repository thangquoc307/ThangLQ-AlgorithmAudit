public class Algorithm_18 {
    public static void main(String[] args) {
        int height = 5;
        for (int i = 0; i < height; i++){
            for (int j = 0; j < height + i; j++){
                if (j >= height - i - 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
