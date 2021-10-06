import java.util.Scanner;


public class exercise2 {

  public static void main(String[] args) {
    //Scanner
    Scanner in = new Scanner(System.in);
    final double PI = 3.14159265359;

    System.out.print("Enter the radius and length of a cylinder: ");
    double radius = in.nextDouble();
    double length = in.nextDouble();
    double area = radius * radius * PI;
    double volume = area * length;

    System.out.println("The area is" + area);
    System.out.println("The volume is" + volume);

    //in.close();
  }


}
