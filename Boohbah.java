/**
 * Ayah Abdalla
 * Java I
 * 10/29/2025
 *
 * Constructor class that builds the boohbahs
 */
public class Boohbah {
    private String name;
    private String danceMove;

    // main constructor for the boohbahs to define name and dance move
    Boohbah(String name, String danceMove){
        this.name = name;
        this.danceMove = danceMove;
    }
    // getter for dance moves
    public String getDanceMove() {
        return danceMove;
    }
    // getter for name
    public String getName() {
        return name;
    }
    // PreformRoutine preforms the routines of the boobahs based on the actual name
    public String performsRoutine(){return (this.name + " performs " + this.danceMove);}
}
