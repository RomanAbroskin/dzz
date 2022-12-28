package Task4;

import Task3.avto;

import java.util.ArrayList;
import java.util.List;

public class zd4 {
    public static void main(String[] args) {


    List<tele> Tel=new ArrayList<>(List.of(
            new tele("Pg100","2222",600000,"LG",40),
            new tele("ld200","2222",1500000,"Samsung",200),
            new tele("gl300","2220",500000,"LG",150),
            new tele("kz400","2220",1600000,"Samsung",30)

    ));
        System.out.println(Tel);
    }
}
