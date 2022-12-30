package Task3;

import Task4.tele;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dz3 {
    public static void main(String[] args) {
        List<avto> Tel=new ArrayList<>(List.of(
                new avto("gazel",2223,500000,"yelow",4.0),
                new avto("reno",2222,1500000,"black",3.0),
                new avto("mers",2221,500000,"black",1.5),
                new avto("kamaz",2220,1500000,"black",3.0)
        ));
        System.out.println(Tel.get(1).getName());
        List<avto> car2= Tel.stream()
                .filter(a -> a.getColor() == "black").toList();
        for (int i =0; i<car2.size();i++) {
            String b = "Color="+car2.get(i).getColor() + " 'Name'=" + car2.get(i).getName() +  " 'Cena'=" + car2.get(i).getCena() + " 'Obiem'=" + car2.get(i).getObiem() + "'God'=" + car2.get(i).getGod();
        System.out.println(b);}


        List<avto> car3= Tel.stream()
                .filter(a -> a.getObiem() == 3.0).toList();
        for (int i =0; i<car3.size();i++) {
            String v ="2"+"Color="+car3.get(i).getColor() + " 'Name'=" + car3.get(i).getName() +  " 'Cena'=" + car3.get(i).getCena() + " 'Obiem'=" + car3.get(i).getObiem() + "'God'=" + car3.get(i).getGod();
            System.out.println(v);}



        List<avto> car4= Tel.stream()
                .filter(a -> a.getCena() > 1000000).toList();
        for (int i =0; i<car4.size();i++) {
            String v ="3"+"Color="+car4.get(i).getColor() + " 'Name'=" + car4.get(i).getName() +  " 'Cena'=" + car4.get(i).getCena() + " 'Obiem'=" + car4.get(i).getObiem() + "'God'=" + car4.get(i).getGod();
            System.out.println(v);}


        List<avto> car5= Tel.stream()
                .filter(a -> a.getGod()>2221&&a.getGod()<2223).toList();
        for (int i =0; i<car5.size();i++) {
            String v ="4"+"Color="+car5.get(i).getColor() + " 'Name'=" + car5.get(i).getName() +  " 'Cena'=" + car5.get(i).getCena() + " 'Obiem'=" + car5.get(i).getObiem() + "'God'=" + car5.get(i).getGod();
            System.out.println(v);}
    }
}
