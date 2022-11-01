package BasicMaths;

import CommonUtil.CustomInput;
//Given a number n. Count the number of digits in n which evenly divides n.
public class CountDigits {
    public static void main(String[] args) {
        CustomInput input = new CustomInput();
        int num = (int) input.getCustomInput("Enter the number : " , "int");
        CountDigits cd = new CountDigits();
        cd.countDigits(num);
    }
    public void countDigits(int n){
        int digits = 0;
        int num = n;
        while(n>0){
            int temp = n%10;
            if(temp!= 0 && num % temp == 0){
                digits++;
            }
            n = n/10;
        }
        System.out.println(digits);
    }
}
