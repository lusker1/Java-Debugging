/*
  Exercise 1: Syntax Fix
  Goal: Fix missing semicolons and logical operators.
  Author: BinSaleh (lusker1)
 */

import java.util.Scanner;

public class RectAngleBug {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter length: ");
        int length = in.nextInt() ; 
        
        System.out.print("Enter width: ");
        int width = in.nextInt();
        
        int area = length * width; 
        
        System.out.println("The area is: " + area);

        in.close(); 
    }
}
