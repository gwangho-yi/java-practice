package practice.generic;

/**
 * <h3>제니릭 타입 (Generic Types) </h3>
 * 타입이 매개변수화 된 클래스나 인터페이스.
 *
 * </br>
 * Box 클래스의 필드와 메서드의 파라메터 타입을 결정한다.
 *
 *
 * </br>
 * Box의 타입에 T는 타입 자체를 매개변수로 사용할 수 있다.
 * Box의 필드와 메서드의 타입을 T로 고정할 수 있게 된다.
 * */
public class Box<T> {

    private T object;

    public void set(T object) {
        this.object = object;
    }

    public T get() {
        return object;
    }
}
