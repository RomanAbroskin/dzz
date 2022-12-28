package Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class zd2 {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("Питер");
        list.add("Новосибирск");
        list.add("Саратов");
        list.add("Питер");
        list.add("Новосибирск");
        list.add("Саратов");
        System.out.println(list);

        Long one=list.stream()
                .filter(n->n.length()<=6)
                .count();

        System.out.println(one);
        Scanner s = new Scanner(System.in);
        System.out.println("Введите значение");
        String b=s.next();
        Long thoo=list.stream()
                .filter(n->n.equals(b))
                .count();

        System.out.println(thoo);

        System.out.println("Введите значение");
        String bb=s.next();
        String bbb=bb.toLowerCase();
        Long three=list.stream()
                .filter(n->n.startsWith(bbb))
                .count();
        System.out.println(three);
    }
}
