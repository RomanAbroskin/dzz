package Task3;

public class avto {

   private final String name;
   private final String god;
   private final int cena;
   private final String color;
   private final double obiem;

    public avto(String name, String god, int cena, String color, double obiem) {
        this.name = name;
        this.god = god;
        this.cena = cena;
        this.color = color;
        this.obiem = obiem;
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

    public String getColor() {
        return color;
    }

    public double getObiem() {
        return obiem;
    }
}
