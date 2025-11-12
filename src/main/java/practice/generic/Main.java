package practice.generic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        String s = (String) list.get(0);
        Integer a = (Integer) list.get(0); // 컴파일 시 오류 발생
    }
}
