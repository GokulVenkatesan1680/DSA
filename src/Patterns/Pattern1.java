package Patterns;

public class Pattern1 {
    public void print(int n){
        for(int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= n ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
