package practice.generic.boundedtypeparameters;

import practice.generic.Box;

/**
 * <h2>제한된 타입 매개변수 (Bounded Type Parameters)</h2>
 *
 */
public class Main {

    public static void main(String[] args) {

        NaturalNumber<Number> naturalNumber = new NaturalNumber<>(10.1);
        boolean isEven = naturalNumber.isEven();
        System.out.println("isEven = " + isEven);
    }

    class A{}
    interface B{}
    interface C{}

    class D <T extends A & B & C>{}

    public static <T extends Comparable<T>> int countGreaterThan(T[] array, T elem) {
        int count = 0;
        for (T item : array) {
            if (item.compareTo(elem) > 0) {
                count++;
            }
        }
        return count;
    }

}
