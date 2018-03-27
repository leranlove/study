public class daffodil {
    public static void main(String []args) {
        for (int i = 100; i <= 999; ++i) {
            int n = 0, j = 0, k = 0;
            n = i / 100;
            j = i % 100 / 10;
            k = i % 10;
            if (n * n * n + j * j *j + k * k * k == i) {
                System.out.println(i);
            }
        }
    }
}