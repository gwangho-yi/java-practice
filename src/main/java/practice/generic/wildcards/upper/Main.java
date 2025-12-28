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

}
