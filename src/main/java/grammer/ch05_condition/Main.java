package grammer.ch05_condition;

import static utils.PrintUtils.*;

import java.util.Scanner;
import utils.PrintUtils;

public class Main {

  public static void main(String[] args) {

    boolean isTrue = true;
    boolean isFalse = false;

    // IF, IF-ELSE, IF-ELSE IF
    if (isTrue){
      println("[if] call!");
    }

    if (isFalse){

    } else {
      println("[else] call!");
    }

    if (isFalse){

    } else if (isTrue){
      println("[else if] call!");
    } else {

    }

    Scanner scanner = new Scanner(System.in);
    println("=============");
    println("input A, B, C : ");
    println("=============");
    System.out.println("> ");
    String caseVar = scanner.next();

    // switch - case
    switch (caseVar){
      case "A":
        println("A!");
        break;
      case "B":
        println("B!");
      case "C":
        println("C!");
        break;
      default:
        println("DEFAULT!");
    }

    scanner.close();
  }

}
