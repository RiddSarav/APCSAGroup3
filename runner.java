import java.util.Scanner;

public class runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String template = " I [verb] with the [adjective] [noun]. Each [noun] was amazing, and I [second verb] with them a lot.";
        System.out.println(template);
        String CompletedMadlib = template;
        CompletedMadlib = Bao_MadLibs.replacePlaceHolder(CompletedMadlib,sc);
        CompletedMadlib = Bao_MadLibs.replacePlaceHolder(CompletedMadlib,sc);
        CompletedMadlib = Kamat_MadLibs.askReceive(CompletedMadlib,sc);
        CompletedMadlib = Kamat_MadLibs.askReceive(CompletedMadlib,sc);
        CompletedMadlib = Bao_MadLibs.replacePlaceHolder(CompletedMadlib,sc);
        System.out.print(CompletedMadlib);
    }
}
