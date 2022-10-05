package Patterns;

public class Pattern3 {

    public void print(int n){
        for(int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }

}
