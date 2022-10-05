package Patterns;

import CommonUtil.CodeTimer;
import CommonUtil.CustomInput;

public class Pattern {

    public static void main(String[] args) {
        CustomInput input = new CustomInput();
        int n = (int) input.getCustomInput("Enter number of lines : " , "int");
        CodeTimer timer = new CodeTimer();
        timer.startTime();
//        Pattern1 p1 = new Pattern1();
//        p1.print(n);
//        Pattern2 p2 = new Pattern2();
//        p2.print(n);
//        Pattern3 p3 = new Pattern3();
//        p3.print(n);
//        Pattern4 p4 = new Pattern4();
//        p4.print(n);
//        Pattern5 p5 = new Pattern5();
//        p5.print(n);
//        Pattern6 p6 = new Pattern6();
//        p6.print(n);
//        Pattern7 p7 = new Pattern7();
//        p7.print(n);
//        Pattern9 p9 = new Pattern9();
//        p9.print(n);
//        Pattern10 p10 = new Pattern10();
//        p10.print(n);
//        Pattern11 p11 = new Pattern11();
//        p11.print(n);
//        Pattern12 p12 = new Pattern12();
//        p12.print(n);
//        Pattern13 p13 = new Pattern13();
//        p13.print(n);
//        Pattern14 p14 = new Pattern14();
//        p14.print(n);

        Pattern15 p15 = new Pattern15();
        p15.print(n);

        timer.endTime();
    }
}
