package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        List<Double> list = new ArrayList<>(Arrays.asList(5.0, 5.9, 10.9, 0.0, -9.8));

        Collections.sort(list);
        System.out.println(list);

        double min = Collections.min(list);
        double max = Collections.max(list);
        System.out.println("Min " + min + " Max " + max);

    }
}
