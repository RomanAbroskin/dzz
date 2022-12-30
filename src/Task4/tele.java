package Task4;

public class tele {
    private  String name;
    private  String god;
    private  int cena;
    private  String Proisvoditel;
    private  int Diagonal;


    public tele(String name, String god, int cena, String proisvoditel, int diagonal) {
        this.name = name;
        this.god = god;
        this.cena = cena;
        Proisvoditel = proisvoditel;
        Diagonal = diagonal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGod(String god) {
        this.god = god;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void setProisvoditel(String proisvoditel) {
        Proisvoditel = proisvoditel;
    }

    public void setDiagonal(int diagonal) {
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
