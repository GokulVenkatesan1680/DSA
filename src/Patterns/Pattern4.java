package Patterns;

public class Pattern4 {

    public void print(int n){
        for(int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= i ; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

}
