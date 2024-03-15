// Taking User Input                  String should always be written above the Integer Input
import java.util.*;

class User_Input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);                     //User input using Scanner class

        System.out.print("Enter the String: ");               //Input from a String
        String ab =sc.nextLine();
        System.out.println("The String you enter is: "+ab);

        System.out.print("Enter the Number: ");
        int num=sc.nextInt();                                     //Input from a Interger 
        System.out.println("The Number you enter is: "+num);        
        sc.close();
        
    }
}
