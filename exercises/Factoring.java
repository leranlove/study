/*
 * 将一个正整数分解质因数。例如：输入90,打印出90 = 2 * 3 * 3 * 5
 */

import java.util.Scanner;

public class Factoring {
    public int AnalysisPrimeNumber(int num) {
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                return num / i;
            }
        }

        return -1;
    }
    public static void main(String []args) {
        Factoring fa = new Factoring();
        Scanner in = new Scanner(System.in);
        System.out.print("place input a number:");
        int n = in.nextInt();
        String str = n + " = 1 * ";
        while (true) {
            int m = n;
            n = fa.AnalysisPrimeNumber(n);
            if (n == -1) {
                return;
            }

            str += m / n + (n == 1 ? "" : " * ");
            if (n == 1) {
                System.out.println(str);
            }
        }
    }
}