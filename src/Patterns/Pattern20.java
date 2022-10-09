package Patterns;

public class Pattern20 {
    public void print(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            for(int j = 1 ; j <= (2*n - 2*i)  ; j++){
                System.out.print(" ");

            }

            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");

            }
            System.out.println();

        }
        for(int i = n-1 ; i > 0 ; i--){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            for(int j = 1 ; j <= (2*n - 2*i)  ; j++){
                System.out.print(" ");

            }

            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
