package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorApp {

    public static void main(String[] args) {
        AvtoComparator comp = new AvtoComparator();
        List<Avto> coll = new ArrayList<>();

        Avto avto1 = new Avto("Lanos", 100_000, new StringBuilder("Black"));
        Avto avto2 = new Avto("Avart", 200_000, new StringBuilder("Red"));
        Avto avto3 = new Avto("Ford", 30_000, new StringBuilder("Grey"));

        coll.add(avto1);
        coll.add(avto2);
        coll.add(avto3);

        Collections.sort(coll, comp);
        System.out.println(coll);

        Avto max = Collections.max(coll, comp);
        System.out.println(max);

        Avto min = Collections.min(coll, comp);
        System.out.println(min);
    }

}
