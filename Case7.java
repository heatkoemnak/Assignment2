// package Assignment2;
import java.util.Scanner;

public class Case7 {
    public static int toBinary() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your decimal number:");
            int decimal = input.nextInt();
            int []binary = new int[40];
            int index = 0;
            //Store index into array
            while (decimal >=1) {

                binary[index] = decimal % 2;
                decimal = decimal / 2;
                index++;

            }
            System.out.print("To Binary = ");
            // printing binary array in reverse order
            for (int i = index-1 ; i >= 0;i-=1) {
                System.out.print(binary[i]);
            }
            return decimal;




        } catch (Exception e) {
            System.out.println("Something went wrong. Your number is not match to 'interger'. Please try again!'");
        }
        return 0;
    }

    public static void main(String args[]) {
        toBinary();




    }
}