import java.util.Scanner;

public class Madlib {
    public static String askReceive(String ask, Scanner sc) {
        System.out.println(ask);
        String result = sc.nextLine(); 
        return result;
    }
       
    public static void main(String[] args){
        // function to ask user for an input, returns said input.
        // string ask is the prompt the user is asked, sc is scanner object used
   

        Scanner sc = new Scanner(System.in);

        String Madlib = "I VERB with the ADJECTIVE NOUN. Each NOUN was amazing and I VERB2 with them a lot";
        System.out.println(Madlib);

        String nounCutOut1 = Madlib.substring(0,2);
        String nounCutOut2 = Madlib.substring(6,16);
        String nounCutOut3 = Madlib.substring(30, 37);
        String nounCutOut4 = Madlib.substring(41,60);
        String nounCutOut5 = Madlib.substring(65,81);
        
        // ask for all required input
        String firstnoun = askReceive("Enter a noun:", sc);
        String secondnoun = askReceive("Enter a noun:", sc);
        String firstVerb = askReceive("Enter a verb: ", sc);
        String firstAdj= askReceive("Enter a adjective: ", sc);
        String secondVerb = askReceive("Enter a verb: ", sc);

        String madlib_w_Noun = (nounCutOut1 + firstVerb  + nounCutOut2 + firstAdj + " " + firstnoun + nounCutOut3 + secondnoun + nounCutOut4 + secondVerb + nounCutOut5);
        System.out.println(madlib_w_Noun);


        //print out
        System.out.print("");
        sc.close();
    }
}
