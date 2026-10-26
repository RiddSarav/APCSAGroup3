// Tiger Bao and Vandhith Ande
import java.util.Scanner;

public class Bao_MadLibs {
    public static String askReceive(String ask, Scanner sc){
        // function to ask user for an input, returns said input.
        // string ask is the prompt the user is asked, sc is scanner object used
        System.out.println(ask);
        String result = sc.nextLine(); 
        return result;
    }
    
    public static String[] collectWords(Scanner sc) {
        // ask for all required input
        String firstVerb = askReceive("Enter a verb: ", sc);
        String firstAdj = askReceive("Enter an adjective: ", sc);
        String secondVerb = askReceive("Enter a verb: ", sc);
        return new String[] {firstVerb, firstAdj, secondVerb};
    }
    public static String replacePlaceHolder(String ask, Scanner sc) {
        int bracket1 = ask.indexOf("[");
        int bracket2 = ask.indexOf("]", bracket1);
        String whatType = ask.substring(bracket1 + 1, bracket2);
        String result = askReceive("What is your " + whatType, sc);
        String beforeInput = ask.substring(0, bracket1);
        String afterInput = ask.substring(bracket2 + 1);
        return beforeInput + result + afterInput;
    }
}
