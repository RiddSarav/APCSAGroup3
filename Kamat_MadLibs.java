import java.util.Scanner;

public class MadLibs {
    public static String askReceive(String ask, Scanner sc) {


        int bracket1 = ask.indexOf("[");
        int bracket2=ask.indexOf("]", bracket1);
        String whatType = ask.substring(bracket1 + 1, bracket2);
        System.out.println("What is your " + whatType);
        String result = sc.nextLine(); 

        String beforeInput = ask.substring(0,bracket1);
        String afterInput = ask.substring(bracket2+1);
        return beforeInput + result + afterInput;

    }
}
