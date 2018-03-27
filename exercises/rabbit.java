public class rabbit {
    public static void main(String []args) {
        System.out.println("111111");
        System.out.println("111111");

        long arr[] = new long[36];
        arr[0] = arr[1] = 1;

        for (int i = 2; i <= 35; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.println(arr[i]);
        }
    }
}