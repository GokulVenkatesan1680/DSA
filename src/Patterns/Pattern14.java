package Patterns;

public class Pattern14 {
    public void print(int n){
        for(int i=0 ; i < n ; i++){
            for(int j=0; j<=i; j++){
                char c = (char) (j+65);
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
