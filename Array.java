// Array 

import java.util.Scanner;
class Array {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the Size of array: ");            // Take the Length of array
        int size=sc.nextInt();
        int[] a=new int[size];                                      // Declaring the array

        System.out.print("Enter the array elements: ");          // Ask user to enter elements

        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Array elements are: ");

        for(int i=0;i<size;i++){
            System.out.println(a[i]);
        }
        sc.close();

    }
    
}
