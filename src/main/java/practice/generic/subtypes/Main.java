package practice.generic.subtypes;

import practice.generic.Box;

public class Main {

    public static void main(String[] args) {

        Box<Integer> box = new Box<>();
        Box<Number> box2 = new Box<>();

        // boxTest(box); 컴파일 에러
        boxTest(box2);

    }

    public static void boxTest(Box<Number> n) { /* ... */ }

}
