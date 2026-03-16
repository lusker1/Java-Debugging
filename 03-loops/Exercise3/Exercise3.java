/*
===================================================
   ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Exercise   : Exercise 3 - LoopBugs (Ghost Loop)
 Author     : BinSaleh (lusker1)
 Date       : 2026-03-16
 Description: Fixed the logic bug by removing the extra 
              semicolon (;) at the end of the for-loop 
              statement to allow the loop to correctly 
              sum numbers from 1 to 5.
===================================================
*/

public class Exercise3 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 5; i++)
        {
            sum += i;
        }

        System.out.println("Total Sum: " + sum);
    }
}

/*
    Analysis:
  - Iteration 1: i = 1, sum = 0 + 1 = 1
  - Iteration 2: i = 2, sum = 1 + 2 = 3
  - Iteration 3: i = 3, sum = 3 + 3 = 6
  - Iteration 4: i = 4, sum = 6 + 4 = 10
  - Iteration 5: i = 5, sum = 10 + 5 = 15
  - Final Result: sum = 15
*/