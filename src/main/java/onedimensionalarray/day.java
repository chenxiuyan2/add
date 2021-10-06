package onedimensionalarray;

import java.util.Scanner;

public class day {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter a number for day,0-6");
    int number1 = input.nextInt();
    switch (number1) {
      case 0:
        System.out.println("sunday");
        break;

      case 1:
        System.out.println("monday");
        break;
      case 2:
        System.out.println("tuesday");
        break;
      case 3:
        System.out.println("wednesday");
        break;
      case 4:
        System.out.println("thursday");
        break;
      case 5:
        System.out.println("friday");
        break;
      case 6:
        System.out.println("saturday");



    }
    System.out.println("you want to know day for nub");
    int number2 = input.nextInt();
    int a = (number1 + number2) % 7;
    switch (a) {
      case 0:
        System.out.println("sunday");
        break;

      case 1:
        System.out.println("monday");
        break;
      case 2:
        System.out.println("tuesday");
        break;
      case 3:
        System.out.println("wednesday");
        break;
      case 4:
        System.out.println("thursday");
        break;
      case 5:
        System.out.println("friday");
        break;
      case 6:
        System.out.println("saturday");


    }

  }

}
