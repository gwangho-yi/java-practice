package practice.generic.rowtypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import practice.generic.Box;

/**
 * <h3>Row Types 원시 타입</h3>
 * - 인자가 없는 클래스나 인터페이스를 말한다.
 */
public class Main {


    public static void main(String[] args) {
        Box<String> box = new Box<>(); // Box<String>
        Box rowBox = box; // warning : 원시 타입

        /**
         * Box 원시 타입은 기본적으로 모든 타입을 허용한다.
         * Box에서 get으로 꺼내오는 값은 모두 Object로 꺼내온다.
         * 원시 타입은 타입 정보가 모두 지워진 상태니깐 말이다.
         * 자동으로 컴파일러 입장에서는 최상위인 Object를 사용할 수 밖에 없다.
         * Why?
         * 공식 문서에서는 5 버전 이전의 코드들은 Generic 이 없기 때문에 제한을 해버리면 컴파일 에러가 발생할 수 있기에 하위 지원으로 놔둔 상태.
         * Box -> 이제 사용 불가능합니다. 라고 해버리면 레거시 코드들은 모두 컴파일 불가능한 상태가 되어 버린다.
         * 여튼 원시 타입 Box는 Object를 던저 버리기 때문에 시대를 거스르는 행위니 사용하지 말자.
         */
        Box rawBox = new Box<>(); // 모든 타입 허용
        Box<Integer> intBox = rawBox; // warning

        List items = Arrays.asList("string", "string");
        List<Integer> numbers = items; // 와 이거 신기하네 원시 타입을 List<Integer>에 넣어도 작동이 되네

        Box<String> stringBox = new Box<>(); // Box<String>로 선언해도
        Box stringRowBox = stringBox; // 최종적으로 Row Type에 선언
        stringRowBox.set(8);

        System.out.println(numbers.get(0));
        System.out.println(stringRowBox.get());
    }
}
