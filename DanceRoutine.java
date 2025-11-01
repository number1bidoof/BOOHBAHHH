/**
 * Ayah Abdalla
 * Java I
 * 10/29/2025
 *
 * Constructor class that builds the dances of each boohbah
 */
public class DanceRoutine {
    private Boohbah[] boohbahs; // creates an array of the boohbahs

    public DanceRoutine(Boohbah[] boohbahs){
        this.boohbahs = boohbahs;
    }
    public String buildRoutine(){
        StringBuilder routine = new StringBuilder();
        for(Boohbah b: boohbahs){
            routine.append(b.performsRoutine()).append("\n"); // displays the routines of the boohbahs from preformRoutine
        }
        // returns the original routine of the boohbahs
        return routine.toString();
    }
    public String modifyRoutine(){
        StringBuilder moded = new StringBuilder();
        for(Boohbah b: boohbahs){ // iterates through each boohbah in the array
            String line = b.performsRoutine().replace("performs", "dances to"); // replaces performs to dances to in each routine
            moded.append(line).append("\n");
        }
        // returns the modified string of the boohbahs
        return moded.toString();
    }
    public String remixRoutine(){
        Stringbuilder og = new StringBuilder();
        Stringbuilder remixVersion = new StringBuilder(og);
        if (remixVersion.charAt(remixVersion.length() - 1) == '\n') {
            remixVersion.delete(remixVersion.length() - 1, remixVersion.length());
        }
        remixVersion.reversed();
        remixVersion.insert(0, "--- REMIX ---\n");
        remixVersion.append("\n(Backwards Boohbah Shuffle!)");
        
        return remixed.toString();
    }

}
