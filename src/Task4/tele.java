package Task4;

public class tele {
    private final String name;
    private final String god;
    private final int cena;
    private final String Proisvoditel;
    private final int Diagonal;


    public tele(String name, String god, int cena, String proisvoditel, int diagonal) {
        this.name = name;
        this.god = god;
        this.cena = cena;
        Proisvoditel = proisvoditel;
        Diagonal = diagonal;
    }

    public String getName() {
        return name;
    }

    public String getGod() {
        return god;
    }

    public int getCena() {
        return cena;
    }

    public String getProisvoditel() {
        return Proisvoditel;
    }

    public int getDiagonal() {
        return Diagonal;
    }
}
