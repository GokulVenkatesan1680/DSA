package Patterns;

public class Pattern15 {
    public void print(int n){

        for(int i=n ; i > 0 ; i--){
            for(int j=0; j<i; j++){
                char c = (char) (j+65);
                System.out.print(c+" ");
            }
            System.out.println();
        }

    }
}
