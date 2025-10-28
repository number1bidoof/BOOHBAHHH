public class Boohbah {
    private String name;
    private String danceMove;

    Boohbah(String name, String danceMove){
        this.name = name;
        this.danceMove = danceMove;
    }

    public String getDanceMove() {
        return danceMove;
    }

    public void setDanceMove(String danceMove) {
        this.danceMove = danceMove;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void preformMove(){System.out.println(this.name + " performs " + this.danceMove);}
}
