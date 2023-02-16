// package Assignment2;
//convert Binary to decimal
import java.util.Scanner;

public class Case8 {
  public static int getDecimal() {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter your binary number:");
      int binary = input.nextInt();

      int decimal = 0;
      int n = 0;
      while (true) {
        if (binary == 0) {

          break;
        } else {

          int temp = binary % 10;
          decimal += temp * Math.pow(2, n);
          binary = binary / 10;
          n++;
        }


      }
      return decimal;
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    }
    return 0;
  }

  public static void main(String args[]) {
    
    System.out.println("To decimal = " + getDecimal());

  }
}