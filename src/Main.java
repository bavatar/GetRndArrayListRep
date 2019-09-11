import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    // Use Eliza or any other assignment with an array or ArrayList.
    // Modify either assignment to use an ArrayList in place of an array where you need to get a random element.
    // How would you do this with an ArrayList?
    //
    //Stackoverflow is your friend. See how far you can get researching on your own.
    //
    //Can you move your code to a method that returns a random element?
    public static void main(String[] args) {
        ArrayList<String> movieArray = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        // randomly choose a word from actionItems
        Random rnd = new Random();
        String movie = "";

        movieArray.add("Star Wars");
        movieArray.add("Ninja Assassins");
        movieArray.add("Gone with the Wind");
        movieArray.add("Rocky 1");
        movieArray.add("First Blood");
        movieArray.add("Avatar");

        int randomInt = rnd.nextInt(movieArray.size());
        System.out.println("You might want to watch: " + movieArray.get(randomInt));
    }
}
