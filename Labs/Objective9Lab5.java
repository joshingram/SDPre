import java.util.Scanner;

public class Objective9Lab5 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      double num1, num2;
      int choice = 0;
      boolean keepGoing = true;
      double answer = 0.0;

      System.out.println("Please enter a number: ");
      num1 = scanner.nextDouble();

      System.out.println("Please enter a second number: ");
      num2 = scanner.nextDouble();

      while (keepGoing) {
        printMenu();
        System.out.print("Which would you like to do? ");
        choice = scanner.nextInt();
        keepGoing = (choice != 4);

        switch (choice) {
        case 1:
          answer = findSum(num1, num2);
          System.out.println(num1 + " + " + num2 + " = " + answer);
          break;
        case 2:
          answer = findAverage(num1, num2);
          System.out.println("The average of " + num1 + " and " + num2 + " is " + answer);
          break;
        case 3:
          answer = calcTax(num1, num2);
          System.out.println("The amount in tax to be collected from a purchase of " + num1 + " and " + num2 + " is " + answer);
          break;
        case 4:
          System.out.println("You've chosen to quit.");
          break;
        default:
          System.out.println("Invalid entry.  Please try again");
        }
      }
      scanner.close();
}
      public static void printMenu() {
        System.out.println();
        System.out.println("========= MENU =========");
        System.out.println("|                      |");
        System.out.println("|   1. Add Numbers     |");
        System.out.println("|   2. Find Average    |");
        System.out.println("|   3. Calculate Tax   |");
        System.out.println("|   4. Exit            |");
        System.out.println("|                      |");
        System.out.println("========================");
      }
      public static double findSum(double x, double y) {
        double sum = x + y;
        return sum;
      }
      public static double findAverage(double x, double y) {
        double average = (x + y) / 2;
        return average;
      }
      public static double calcTax(double x, double y) {
        double taxAmount = (x + y) * 0.083;
        return taxAmount;
      }
  }
