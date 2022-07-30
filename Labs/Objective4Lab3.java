import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;
    currentYear = 2022;

    java.util.Scanner scanner = new Scanner(System.in);

    System.out.println("How old are you?");
    age = scanner.nextInt();

    birthYear = currentYear - age;

    System.out.println("Assuming that you have not yet had your birthday this year, you were born in " + birthYear);

    scanner.close();
  }
}
