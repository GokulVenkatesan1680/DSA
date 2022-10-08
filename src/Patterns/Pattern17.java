package Patterns;

public class Pattern17 {
    public void print(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                char c = (char) (j+64);
                System.out.print(c);
            }
            for(int j = i-1 ; j > 0 ; j--){
                char c = (char) (j+64);
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
