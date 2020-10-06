import java.util.Scanner;
/**
 * ask the user for a number, tell them the multiplication table for 1 to 12 with that number
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    //initialize variables
    int number; //the number provided by the user
    int product; //the product of the the given number and the current value of "i" in the for loop

    //ask user for number
    System.out.println("Please enter an integer to create a multiplication table for");
    number = input.nextInt(); //store it in the variable

    //make a for loop to count 12 times to make the multiplication table
    for(int i = 1; i <= 12; i++){
      //find the product of both numbers
      product = number * i;
      //print the current line in the multiplication table
      System.out.println(i + " x " + number + " = " + product);
    }
    
  }
}
