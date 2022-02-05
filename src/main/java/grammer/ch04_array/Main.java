package grammer.ch04_array;

import static utils.PrintUtils.*;

import utils.PrintUtils;

public class Main {

  public static void main(String[] args) {

    // - 배열을 선언하고 할당하는 방식은 아래 두가지 방식이 있다.
    // - 배열 초기화시 할당한 크기 만큼만 원소를 저장할 수 있다.
    int[] intArr = new int[5];
    int[] intArr2 = {1,2,3,4,5};

    // - 배열의 원소에 접근할 땐 접근하려는 원소의 인덱스를 사용한다.
    println("" +intArr2[4]);
    intArr2[0] = 0;
    println(""+intArr2[4]);

    println("");
    println("==== 반복문으로 배열의 원소에 접근 ====");
    for (int i = 0; i < intArr.length; i++) {
      println("["+i+"] : " + intArr2[i]);
    }

  }

}

