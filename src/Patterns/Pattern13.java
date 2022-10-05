package Patterns;

public class Pattern13 {
    public void print(int n){
        int prev = 1;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print(prev + " ");
                prev++;
            }
            System.out.println();
        }
    }

}
