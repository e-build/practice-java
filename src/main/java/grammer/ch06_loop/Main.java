package grammer.ch06_loop;

import static utils.PrintUtils.println;

public class Main {

  public static void main(String[] args) {

    // for
    String[] stringArr = new String[10];
    for (int i = 0; i < 10; i++) {
      stringArr[i] = i + "";
    }
    println(stringArr[stringArr.length - 1]);
    println("=============================================");

    // for-each
    for (String str : stringArr) {
      println(str);
    }
    println("=============================================");

    // while
    int idx = 0;
    while (idx < stringArr.length) {
      println(stringArr[idx]);
      idx++;
    }
    println("=============================================");

    // do-while
    int idx2 = 0;
    do {
      println(stringArr[idx2]);
      idx2++;
    } while (idx2 < stringArr.length);

  }

}
