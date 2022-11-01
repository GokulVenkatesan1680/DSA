package BasicMaths;

import CommonUtil.CustomInput;
import CommonUtil.Rerun;

//Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
public class ReverseInteger {
    public static void main(String[] args) {
        boolean rerun = true;
        while(rerun) {

            CustomInput input = new CustomInput();
            int num = (int) input.getCustomInput("Enter the number : ", "int");
            System.out.println(reverse(num));
            rerun =new Rerun().rerun() == 1;
        }
    }

    public static int reverse(int x) {
        int sign = 1;
        if( x < 0) {
            sign = -1;
        }
        int y = Math.abs(x);
        int rem = 0;
        while(y>0){
            rem = rem+(y % 10);
            rem=rem*10;

            y = y / 10;

        }
        rem = (rem/10) * sign;
        return rem;
    }

}
