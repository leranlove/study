public class primeNumber {
    public static void main(String []args) {
        for (int i = 101; i <= 200; ++i) {
            int m = 0;
            for (int j =  1; j <= i; j++) {
                if (i % j == 0) {
                    m++;
                }
            }

            if (m == 2) {
                System.out.println("质数" + i);
            }
        }
    }
}