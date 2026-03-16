/*
===================================================
   ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Exercise   : Exercise 3 - Logic Debugging
 Author     : BinSaleh (lusker1)
 Date       : 2026-03-16
 Description: This program has a logic bug. It prints 
              "Pass" instead of "Excellent" for a score 
              of 95 due to incorrect if-statement order.
===================================================
*/

public class Q3_Exercise3 {
    public static void main(String[] args) {
        int score = 95;

        if (score >= 60) {
            System.out.println("Pass");
        } else if (score >= 90) {
            System.out.println("Excellent");
        }
    }
}