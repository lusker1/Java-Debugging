/*
===================================================
   ســـبحـان الله بحمده ســــبحـان الله الـعـظـيـم
===================================================
 Exercise   : Exercise 3 - Syntax Challenge
 Author     : BinSaleh (lusker1)
 Date       : 2026-03-16
===================================================
*/
public class Exercise3 {
    public static void main(String[] args) {
        
        // int 1stNumber = 100;  you can't begin inetger (name) numbers like : 1stNumber that's will be The Type is : Syntax Error 
        int number1st = 100 ; //correct Syntax  

        // double price = 19.99 , , , forgeting semicolon (;) , the Type is Syntax Error 
        double price = 19.99 ; // correct Syntax         

        // int total = price * 2 ;   cannot be used (int) bcz price Equal = 19.99 (.99) that's why cannot be use int 
        double total = price * 2 ;

        System.out.println("Total: " + total);
    }
}