/*
 * Exercise 1: Loop Control
 * Goal: Prevent infinite loops by managing counters.
 * Author: BinSaleh (lusker1)
 */
public class InfiniteLoopBug {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            System.out.println("Number: " + i );
            ++i; //wee use i++ to stop Infinite 
            
            
        }
    }
}
