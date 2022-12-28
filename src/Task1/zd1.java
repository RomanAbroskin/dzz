package Task1;

import java.io.InputStream;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class zd1 {
    public static void main(String[] args) {
int u=0;
       Random ran=new Random();
        List<Integer> list= Stream.generate(()->ran.nextInt(100))
                .limit(100)
                .collect(Collectors.toList());
        System.out.println(list);

       long  namber = list.stream()
               .filter(n->n%2==0)
               .count();
        System.out.println(namber);

        long  namber2 = list.stream()
                .filter(n->n%3==0)
                .count();
        System.out.println(namber2);

        long  namber3 = list.stream()
                .filter(n->n==0)
                .count();
        System.out.println(namber3);

        Scanner s = new Scanner(System.in);
        System.out.println("Введите значение");
        int b=s.nextInt();

        long  namber4 = list.stream()
                .filter(n->n.equals(b))
                .count();
        System.out.println(namber4);


    }
}
