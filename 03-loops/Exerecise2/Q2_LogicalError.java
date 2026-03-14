/*
===================================================
   ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Exercise   : Exercise 2 - Logical Thinking
 Author     : BinSaleh (lusker1)
 Date       : 2026-03-15
 Description: A tricky logical error. Can you find 
              why the output is "You Passed" even 
              if the condition is FALSE?
===================================================
*/
public class Q2_LogicalError {
    public static void main(String[] args) {

        int x = 5;

        if (x >= 50)
            ;
        {
            System.out.println("-------------------------");
            System.out.println("Result: You Passed!");
            System.out.println("-------------------------");
        }

    }
}