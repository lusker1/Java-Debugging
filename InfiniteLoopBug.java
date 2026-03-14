public class InfiniteLoopBug {
    public static void main(String[] args) {
        int i = 1;

        // المفروض يطبع من 1 إلى 5 ويوقف
        while (i <= 5) {
            System.out.println("Number: " + i );
            ++i; 
            
                // اللغم هنا
            // نسينا شي يخلي الـ i تزيد؟ 
            
        }
    }
}