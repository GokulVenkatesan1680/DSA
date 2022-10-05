package CommonUtil;

import java.util.Scanner;

public class CustomInput {
   public Object getCustomInput(String message , String type){
       Scanner scanner =  new Scanner(System.in);
       System.out.println(message);
       if(type == "String" ){
           return scanner.nextLine();
       }
       else if(type == "Integer" || type == "int" ){
           return scanner.nextInt();
       }
       return null;
   }
}
