package Patterns;

public class Pattern10 {
    public void print(int n){
        for(int i = 0 ; i < n ; i++){
            for (int j = 0 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = n-1 ; i >= 0 ; i--){
            for (int j = 0 ; j < i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
