package Patterns;

public class Pattern19 {
    public void print(int n){
        for(int i = n ; i > 0 ; i--){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            for(int j = 1 ; j <= (n-i)*2; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            for(int j = 1 ; j <= (n-i)*2; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
