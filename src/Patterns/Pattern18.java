package Patterns;

public class Pattern18 {
    public void print(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                char c = (char) (65 + n - j);
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
