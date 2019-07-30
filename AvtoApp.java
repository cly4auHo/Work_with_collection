package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AvtoApp {

    public static void main(String[] args) {
        List<Avto> coll = new ArrayList<>();

        Avto avto1 = new Avto("Lanos", 100_000, new StringBuilder("Black"));
        Avto avto2 = new Avto("Jigyli", 200_000, new StringBuilder("Red"));
        Avto avto3 = new Avto("Ford", 30_000, new StringBuilder("Grey"));

        coll.add(avto1);
        coll.add(avto2);
        coll.add(avto3);

        Avto avto = Collections.max(coll);
        System.out.println(avto);

        avto = Collections.min(coll);
        System.out.println(avto);

        Collections.sort(coll);
        System.out.println(coll);
    }

}
