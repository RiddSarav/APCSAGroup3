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
}
