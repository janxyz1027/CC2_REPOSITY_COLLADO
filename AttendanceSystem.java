import java.util.Scanner;

public class AttendanceSystem {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter total of students:");
        int numberOfStudents = sc.nextInt();
        
        int absent = 0;
        int present = 0;
        
        
        
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Is student "+ i +" (Y/N): ");
            char attendance = sc.next().charAt(0);
            
            if(attendance =='Y' || attendance =='y' ){
               present ++; 
            }else if (attendance =='N' || attendance =='n' ){
               absent ++; 
            }else{
                System.out.println("Invalid input please input Y or N: ");
            }
        }
        System.out.print("Total present:" +present);
        System.out.print("Total present:" +absent);
        
    }
    
}
