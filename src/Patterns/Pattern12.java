package Patterns;

public class Pattern12 {
    public void print(int n){

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= 2*n ; j++){
                if(j <= i ){
                    System.out.print(j + " ");
                }
                else if( j > 2*n - i){
                    System.out.print(2*n-j+1 + " ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }

    }

}
