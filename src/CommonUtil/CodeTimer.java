package CommonUtil;

public class CodeTimer {
    public static Long startTime;
    public void startTime(){
    startTime = System.nanoTime();
    }
    public void endTime(){
        Long endTime = System.nanoTime() - startTime;
        Double time= (double) endTime / 1000000.0;
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("This code has taken " + String.format("%.2f", time) + " milliseconds");
        System.out.println("--------------------------------------------------------------------------------");
    }
}
