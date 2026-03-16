/*
===================================================
ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Exercise   : Exercise 3 - LoopBugs (Ghost Loop)
 Author     : BinSaleh (lusker1)
 Date       : 2026-03-16
 Description: This program should sum numbers from 1 to 5.
              But there is a "Ghost" in the logic!
===================================================
*/
public class Q3_Exercise3 {
    public static void main(String[] args) {
        int sum = 0;

        
        for (int i = 1; i <= 5; i++);  
        {
            sum += i;
        }

        System.out.println("Total Sum: " + sum);
    }
}