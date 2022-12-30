package Task3;

public class avto {

   private  String name;
   private  int god;
   private  int cena;
   private  String color;
   private  double obiem;

    public avto(String name, int god, int cena, String color, double obiem) {
        this.name = name;
        this.god = god;
        this.cena = cena;
        this.color = color;
        this.obiem = obiem;
    }



    public String getName() {
        return name;
    }

    public int getGod() {
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
