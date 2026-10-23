import java.util.Scanner;

public class runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("I [verb] with the [adjective] [noun]. Each [noun] was amazing, and I [second verb] with them a lot.");
            String[] words = Bao_MadLibs.collectWords(sc);
            String story = MadLibs.createStory(sc, words[0], words[1], words[2]);
            System.out.println(story);
    }
}
