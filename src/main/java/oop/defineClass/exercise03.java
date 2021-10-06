package oop.defineClass;

import java.util.Scanner;

public class exercise03 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    final double METERS_PER_FEET = 0.305;
    System.out.print("Enter a value for feet");


    double feet =input.nextDouble();
    double meters = feet * METERS_PER_FEET;

    System.out.printf(feet + "feet is" + meters + "meters");


  }

}
