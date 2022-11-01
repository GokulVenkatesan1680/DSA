package CommonUtil;

public class Rerun {
    public int rerun(){
        System.out.println("--------------------------------------------------------------------------------");
        CustomInput customInput = new CustomInput();
        int toRun = (int) customInput.getCustomInput("Do you want to rerun? (1-yes/0-no)","int");
        if(toRun == 0){
            System.out.println("Bye Bye!");
        }
        System.out.println("--------------------------------------------------------------------------------");
        return toRun;
    }
}
