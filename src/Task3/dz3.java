package Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dz3 {
    public static void main(String[] args) {
        List <avto> car=new ArrayList<>(List.of(
              new avto("reno","2222",600000,"черный",2.0),
              new avto("lada","2222",1600000,"красный",2.0),
              new avto("gasel","2220",500000,"черный",3.0),
                new avto("kamaz","2220",1500000,"красный",3.0)

        ));



        String bb= car.stream()
                .filter(avto -> avto.getObiem()==2.0).toString();
        System.out.println(bb);





    }
}
