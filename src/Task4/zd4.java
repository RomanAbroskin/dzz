package Task4;
import Task3.avto;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class zd4 {
    public static void main(String[] args) {
        List<String> Tel1 = new ArrayList<>();
        List<tele> Tel = new ArrayList<>(List.of(
                new tele("Pg100", "2222", 600000, "LG", 40),
                new tele("ld200", "2222", 1500000, "Samsung", 200),
                new tele("gl300", "2220", 500000, "LG", 150),
                new tele("kz400", "2220", 1600000, "Samsung", 30)

        ));


        List<tele> car5 = Tel.stream()
                .filter(a -> a.getDiagonal() == 40).toList();
        for (int i = 0; i < car5.size(); i++) {
            String v = "4" + "getDiagonal=" + car5.get(i).getDiagonal() + " 'Name'=" + car5.get(i).getName() + " 'Cena'=" + car5.get(i).getCena() + " 'Obiem'=" + car5.get(i).getProisvoditel() + "'God'=" + car5.get(i).getGod();
            System.out.println(v);
        }
        List<tele> car4 = Tel.stream()
                .filter(a -> a.getProisvoditel() == "LG").toList();
        for (int i = 0; i < car4.size(); i++) {
            String v = "3" + "getDiagonal=" + car4.get(i).getDiagonal() + " 'Name'=" + car4.get(i).getName() + " 'Cena'=" + car4.get(i).getCena() + " 'Obiem'=" + car4.get(i).getProisvoditel() + "'God'=" + car4.get(i).getGod();
            System.out.println(v);
        }
        List<tele> car3 = Tel.stream()
                .filter(a -> a.getGod() == "2220").toList();
        for (int i = 0; i < car3.size(); i++) {
            String v = "2" + "getDiagonal=" + car3.get(i).getDiagonal() + " 'Name'=" + car3.get(i).getName() + " 'Cena'=" + car3.get(i).getCena() + " 'Obiem'=" + car3.get(i).getProisvoditel() + "'God'=" + car3.get(i).getGod();
            System.out.println(v);
        }
        List<tele> car2 = Tel.stream()
                .filter(a -> a.getCena() < 1000000).toList();
        for (int i = 0; i < car2.size(); i++) {
            String v = "1" + "getDiagonal=" + car2.get(i).getDiagonal() + " 'Name'=" + car2.get(i).getName() + " 'Cena'=" + car2.get(i).getCena() + " 'Obiem'=" + car2.get(i).getProisvoditel() + "'God'=" + car2.get(i).getGod();
            System.out.println(v);
        }
        List<tele> car6 = Tel.stream()
                .filter(a->a.getCena()>=500000)
                .sorted(Comparator.comparing(tele::getCena).reversed())
                .collect(Collectors.toList());
        for (int i = 0; i < car6.size(); i++) {
            String v = "6" + "getDiagonal=" + car6.get(i).getDiagonal() + " 'Name'=" + car6.get(i).getName() + " 'Cena'=" + car6.get(i).getCena() + " 'Obiem'=" + car6.get(i).getProisvoditel() + "'God'=" + car6.get(i).getGod();
            System.out.println(v);
        }

        List<tele> car0 = Tel.stream()
                .filter(a->a.getCena()<=1600000)
                .sorted(Comparator.comparing(tele::getCena))
                .collect(Collectors.toList());
        for (int i = 0; i < car0.size(); i++) {
            String v = "0" + "getDiagonal=" + car0.get(i).getDiagonal() + " 'Name'=" + car0.get(i).getName() + " 'Cena'=" + car0.get(i).getCena() + " 'Obiem'=" + car0.get(i).getProisvoditel() + "'God'=" + car0.get(i).getGod();
            System.out.println(v);
        }


        List<tele> car7 = Tel.stream()
                .filter(a->a.getDiagonal()>=10)
                .sorted(Comparator.comparing(tele::getDiagonal))
                .collect(Collectors.toList());
        for (int i = 0; i < car7.size(); i++) {
            String v = "7" + "getDiagonal=" + car7.get(i).getDiagonal() + " 'Name'=" + car7.get(i).getName() + " 'Cena'=" + car7.get(i).getCena() + " 'Obiem'=" + car7.get(i).getProisvoditel() + "'God'=" + car7.get(i).getGod();
            System.out.println(v);
        }

        List<tele> car8 = Tel.stream()
                .filter(a->a.getDiagonal()>=10)
                .sorted(Comparator.comparing(tele::getDiagonal).reversed())
                .collect(Collectors.toList());
        for (int i = 0; i < car7.size(); i++) {
            String v = "8" + "getDiagonal=" + car8.get(i).getDiagonal() + " 'Name'=" + car8.get(i).getName() + " 'Cena'=" + car8.get(i).getCena() + " 'Obiem'=" + car8.get(i).getProisvoditel() + "'God'=" + car8.get(i).getGod();
            System.out.println(v);
        }

    }
}
