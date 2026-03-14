/*
===================================================
   ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Exercise   : Exercise 2 - Logical Error Fixed
 Author     : BinSaleh (lusker1)
 Date       : 2026-03-14
 Description: Fixed the logical error by removing the 
              misplaced semicolon after the if-statement.
===================================================
*/

public class LogicalError {
    public static void main(String[] args) {
        
        int degree = 40;

        if (degree >= 50) 
        {
            System.out.println("-------------------------");
            System.out.println("Result: You Passed!");
            System.out.println("-------------------------");
        }
        
        if (degree < 50) {
            System.out.println("Result: Better luck next time.");
        }

    }
}