package practice.generic;

/**
 * 제네릭 타입
 * @param <T>
 */
public class Box<T> {

    private T object;

    public void set(T object) {
        this.object = object;
    }

    public T get() {
        return object;
    }

}
