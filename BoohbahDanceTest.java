/**
 * Ayah Abdalla
 * Java I
 * 10/29/2025
 *
 * Initialization class that shows and displays the boohbahs dance routine
 */
public class BoohbahDanceTest {
    public static void main(String[] args) {
        // Start of ChatGPT Code, got stuck but it was just spelling mistake :)
        Boohbah[] team = {
                new Boohbah("Zing Zing Zingbah", "a twirl"),
                new Boohbah("Jumbah", "a spin"),
                new Boohbah("Humbah", "a jump")
        };
        // End of ChatGPT Code
        DanceRoutine routine = new DanceRoutine(team); // creates a new instance of their dance routine

        System.out.println("Original Routine");
        System.out.println(routine.buildRoutine());
        System.out.println("Modified Routine");
        System.out.println(routine.modifyRoutine());
        System.out.println("Remixed Routine");
        System.out.print(routine.remixRoutine());

    }
}
