package network;

import java.util.Scanner;

public class exercise04 {

  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);

    final double POUNDS_PER_KILOGRAMS=0.454;
    System.out.println("Enter a number in pounds");
    double pounds=input.nextDouble();
    double kilograms=pounds*POUNDS_PER_KILOGRAMS;
    System.out.println(pounds+"pounds is"+kilograms+"kilograms");

  }


}
