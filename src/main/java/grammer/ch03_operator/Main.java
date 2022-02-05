package grammer.ch03_operator;

import static java.lang.String.valueOf;
import static utils.PrintUtils.println;

public class Main {

  public static void main(String[] args) {

    int num1 = 51;
    int num2 = 5;

    // 사칙연산자
    println(valueOf(num1 + num2));
    println(valueOf(num1 - num2));
    println(valueOf(num1 * num2));
    println(valueOf(num1 / num2));
    println(valueOf(num1 % num2));

    // 비교 연산자
    println(valueOf(num1 > num2));
    println(valueOf(num1 < num2));
    println(valueOf(num1 >= num2));
    println(valueOf(num1 <= num2));
    println(valueOf(num1 == num2));
    println(valueOf(num1 != num2));

    // 논리 연산자 : && , ||

    // 증감 연산자
    // 1. 전위 연산자
    int num3 = 5;
    println(valueOf(++num3));
    println(valueOf(num3));
    // 2. 후위 연산자
    println(valueOf(num3++));
    println(valueOf(num3));

    // 삼항 연산자
    int num4 = 10;
    num4 = num4 > 11 ? 5 : 11; // 조건식 ? 참일경우 할당값 : 거짓일경우 할당값

  }

}
