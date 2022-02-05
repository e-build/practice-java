package grammer.ch01_variable;

import static utils.PrintUtils.println;

public class Main {

  public static void main(String[] args) {
    String key; // 1. 선언 & 초기화
    key = "value"; // 1-1. 할당

    String key2 = "value2"; // 2. 선언 및 할당

    final String key3 = "value3"; // 3. final 키워드로 선언된 변수는 재할당 불가

    println(key);
    key = "VALUE";
    println(key);
    println(key2);
    println(key3);

  }



}
