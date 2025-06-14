package practice.lamda;

@FunctionalInterface
public interface MyLamda {
    int max(int a, int b);


    static int min(int a, int b) {
        return a < b ? a : b;
    }

    default int sum(int a, int b) {
        return a + b;
    }
}
