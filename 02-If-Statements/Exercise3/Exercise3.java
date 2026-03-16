/*
===================================================
   ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Exercise   : Exercise 3 - Logic Solution
 Author     : BinSaleh (lusker1)
 Date       : 2026-03-16
 Description: Fixed the logic by checking if the 
              score is 90 or more first. This makes 
              sure "Excellent" shows before "Pass".
===================================================
*/
public class Exercise3 {
    public static void main(String[] args) {
        int score = 95;

        if (score >= 90) { // wee inverse all (if Statement) bcz wee begin the biggist number then smaller 
            System.out.println("Excellent");

        }
        if (score >= 60) {
            System.out.println("Pass");

        }
    }
}