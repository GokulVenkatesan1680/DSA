package Patterns;

public class Pattern12 {
    public void print(int n){

        for(int i = 1 ; i <= n ; i++){  // i = 1
            for(int j = 1 ; j <= 2*n ; j++){ // j= 8
                if(j <= i ){                // 2 <= 1
                    System.out.print(j + " ");  // 1
                }
                else if( j > 2*n - i){      // 8 > 7
                    System.out.print(2*n-j+1 + " ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }

    }

}
