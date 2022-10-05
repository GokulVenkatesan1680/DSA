package Patterns;

public class Pattern11 {
    public void print(int n){
        int prev = 0;
        int row_prev = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <= i ; j++){
                if(j == 0){
                    prev = toggle(row_prev);
                    row_prev = prev;
                }
                System.out.print(prev + " ");
                prev = toggle(prev);
            }
            System.out.println();
        }

    }

    int toggle(int n){
        if(n == 0) return 1;
        else return 0;
    }

}
