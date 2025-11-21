package practice.generic.generictypes;

import practice.generic.Box;

/**
 * <h3>제니릭 타입 (Generic Types) </h3>
 * 타입이 매개변수화 된 클래스나 인터페이스.
 *
 * @see Box
 * */
public class Main {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();

        box.set(10);
        // box.set("string"); // 컴파일 에러
    }


}
