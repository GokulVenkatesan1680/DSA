package Patterns;

import CommonUtil.CodeTimer;
import CommonUtil.CustomInput;

public class Pattern {

    public static void main(String[] args) {
        CustomInput input = new CustomInput();
        int n = (int) input.getCustomInput("Enter number of lines : " , "int");
        CodeTimer timer = new CodeTimer();

        timer.startTime();
        Pattern1 p1 = new Pattern1();
        p1.print(n);
        timer.endTime();

        timer.startTime();
        Pattern2 p2 = new Pattern2();
        p2.print(n);
        timer.endTime();

        timer.startTime();
        Pattern3 p3 = new Pattern3();
        p3.print(n);
        timer.endTime();

        timer.startTime();
        Pattern4 p4 = new Pattern4();
        p4.print(n);
        timer.endTime();

        timer.startTime();
        Pattern5 p5 = new Pattern5();
        p5.print(n);
        timer.endTime();

        timer.startTime();
        Pattern6 p6 = new Pattern6();
        p6.print(n);
        timer.endTime();

        timer.startTime();
        Pattern7 p7 = new Pattern7();
        p7.print(n);
        timer.endTime();

        timer.startTime();
        Pattern9 p9 = new Pattern9();
        p9.print(n);
        timer.endTime();

        timer.startTime();
        Pattern10 p10 = new Pattern10();
        p10.print(n);
        timer.endTime();

        timer.startTime();
        Pattern11 p11 = new Pattern11();
        p11.print(n);
        timer.endTime();

        timer.startTime();
        Pattern12 p12 = new Pattern12();
        p12.print(n);
        timer.endTime();

        timer.startTime();
        Pattern13 p13 = new Pattern13();
        p13.print(n);
        timer.endTime();

        timer.startTime();
        Pattern14 p14 = new Pattern14();
        p14.print(n);
        timer.endTime();

        timer.startTime();
        Pattern15 p15 = new Pattern15();
        p15.print(n);
        timer.endTime();

        timer.startTime();
        Pattern16 p16 = new Pattern16();
        p16.print(n);
        timer.endTime();

        timer.startTime();
        Pattern17 p17 = new Pattern17();
        p17.print(n);
        timer.endTime();

        timer.startTime();
        Pattern18 p18 = new Pattern18();
        p18.print(n);
        timer.endTime();

        timer.startTime();
        Pattern19 p19 = new Pattern19();
        p19.print(n);
        timer.endTime();

        timer.startTime();
        Pattern20 p20 = new Pattern20();
        p20.print(n);
        timer.endTime();

        timer.startTime();
        Pattern21 p21 = new Pattern21();
        p21.print(n);
        timer.endTime();
    }
}
