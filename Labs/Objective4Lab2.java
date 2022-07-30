import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    java.util.Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter the first whole number you'd like to add.");
    int num1 = scanner.nextInt();

    System.out.println("Please enter the second whole number you'd like to add.");
    int num2 = scanner.nextInt();

    System.out.println("Please enter the third whole number you'd like to add.");
    int num3 = scanner.nextInt();

    System.out.println("Please enter the first decimal number you'd like to add.");
    double dub1 = scanner.nextDouble();

    System.out.println("Please enter the second decimal number you'd like to add.");
    double dub2 = scanner.nextDouble();

    System.out.println("Please enter the third decimal number you'd like to add.");
    double dub3 = scanner.nextDouble();

    int sumnum = num1 + num2 + num3;
    double sumdub = dub1 + dub2 + dub3;

    System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " = " + sumnum);
    System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + sumdub);

    scanner.close();
  }
}
