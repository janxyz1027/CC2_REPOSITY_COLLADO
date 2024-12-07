import java.util.Scanner;

public class Password {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Password. ");
    String password = sc.nextLine();
    
    while (true) {
            //nested if, if 
            if (password.length() >= 8 && password.matches(".*[0-9].*") && password.matches(".*[A-Z].*")) {
              System.out.println("Valid");
              break;
            }else{
            System.out.println("invalid, enter valid password, password must contain: \n-More than 8 characters\n-with a lower and uppercase\n-and a combination of numbers");
            password = sc.nextLine();
          }
    }
  }

}
