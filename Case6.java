// package Assignment2;
import java.util.Scanner;
public class Case6 {
  public static void HexNum(String j){
    int n = j.length();
    for(int i=0; i<n; i++){
        char com = j.charAt(i);

        // check for existing value
        if((com < '0' || com > '9') 
            && (com < 'A' || com > 'F')){
            System.out.println("This is not hexadecimal number!!!");
            return;
        }
    }
    System.out.println("Thank You");
  }

  public static void main(String[] args){
    String Number;
    
    // user input number
    System.out.println("Enter Number :  ");
    Scanner Input = new Scanner(System.in);
    Number = Input.next();

    // check for condition
    if(Number.contains("   ")){
        String Num[] = Number.split("  ");
        HexNum(Num[0]);
        HexNum(Num[1]);
    }
    else{
        HexNum(Number);
    }
  }
}