package practice.generic.wildcards.upper;

import java.util.ArrayList;
import java.util.List;
import practice.generic.wildcards.Child;
import practice.generic.wildcards.Parent;

public class Main {

    public static void main(String[] args) {

        List<Child> childList = new ArrayList<>();

        List<Parent> parentList = new ArrayList<>();

        parentList.add(new Child()); // Child는 Parent 타입이기 때문에 가능

        method(childList);

    }

    static void method(List<? extends Parent> list) {}

    void test() {
        List<Integer> list = new ArrayList<>();
        List<Number> list2 = new ArrayList<>();

        list2.add(112.0);
        list.add(220);

        List<? extends Number> list3 = new ArrayList<>();
        List<? super Integer> list4 = new ArrayList<>();

        list4.add(11);


    }
}
