package practice.lamda;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[5];
        Arrays.setAll(arr, (i) -> i * i);

        MyLamda lamda1 = new MyLamda() {
            @Override
            public int max(int a, int b) {
                return a > b ? a : b;
            }

        };

        lamda1.max(1, 2);

        MyLamda lamda2 = (a, b) -> a > b ? a : b;
        lamda2.max(1, 2);
    }
}
