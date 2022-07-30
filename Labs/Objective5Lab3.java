import java.util.Scanner;

public class Objective5Lab3 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int userNum;

    System.out.println("Please enter a whole number: ");
    userNum = scanner.nextInt();

    if(userNum < 0){
      System.out.println(userNum + " is negative.");
    }
    else if(userNum == 0){
      System.out.println(userNum + " is zero.");
    }
    else{
      System.out.println(userNum + " is positive.");
    }
    scanner.close();
  }
}
