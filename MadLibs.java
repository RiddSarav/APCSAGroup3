import java.util.Scanner;

public class MadLibs {
    public static String askReceive(String ask, Scanner sc) {
        System.out.println(ask);
        String result = sc.nextLine(); 
        return result;
    }
       
    public static String createStory(Scanner sc, String firstVerb,
                                     String firstAdj, String secondVerb) {
        // Verbs and the adjective come from Bao_MadLibs; only ask for nouns here.
        String firstnoun = askReceive("Enter a noun:", sc);
        String secondnoun = askReceive("Enter a noun:", sc);
        return "I " + firstVerb + " with the " + firstAdj + " " + firstnoun + ". Each " + secondnoun + " was amazing, and I " + secondVerb + " with them a lot.";
    }
}
