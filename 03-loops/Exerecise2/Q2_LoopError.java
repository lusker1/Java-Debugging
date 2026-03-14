/*
===================================================
   ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Exercise   : Exercise 2 - Infinite Loop Fixed
 Author     : BinSaleh (lusker1)
 Date       : 2026-03-15
 Description: This code is supposed to print numbers 
              from 1 to 5. Why it never stops?
===================================================
*/

public class Q2_LoopError {
    public static void main(String[] args) {
        
        int count = 1;

        System.out.println("--- Loop Start ---");

        while (count <= 5) {
            System.out.println("Count is: " + count);
            
        }

        System.out.println("--- Loop End ---");
    }
}