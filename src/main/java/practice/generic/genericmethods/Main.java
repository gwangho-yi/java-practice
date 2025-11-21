package practice.generic.genericmethods;

import static practice.generic.genericmethods.Main.Util.compare;

/**
 * <h2>제네릭 메서드 (Generic Methods)</h2>
 * 도입부에 자신의 타입 매개변수를 선언한 메서드를 말한다.</br>
 * 제네릭 타입과 비슷하지만 타입 매개변수의 스코프는 메서드 범위에 제한된다.</br>
 *
 * </br>
 * 아래 메서드에 사용 가능하다.
 * <li>static 메서드</li>
 * <li>non-static 메서드</li>
 * <li>클래스 생성자</li>
 *
 * <h3>문법</h3>
 * <li>꺾쇠괄호 안에 타입 매개변수를 리스트 방식으로 넣는다.</li>
 * <li>리턴하는 타입 앞에 작성한다.</li>
 */
public class Main {
    public static void main(String[] args) {

        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(2, "pear");
        // <Integer, String>는 생략해도 컴파일러가 타입 추론 가능하다.
        boolean same = Util.<Integer, String>compare(p1, p2);

    }

    static class Util {

        public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
            return p1.getKey().equals(p2.getKey())
                && p1.getValue().equals(p2.getValue());
        }

        static <P> void print(P p) {
            System.out.println(p);
        }
    }

    static class Pair<K, V> {

        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
        public void setKey(K key) { this.key = key; }
        public void setValue(V value) { this.value = value; }
        public K getKey()   { return key; }
        public V getValue() { return value; }
    }




}


