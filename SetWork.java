package collection;

import java.util.HashSet;
import java.util.Set;

public class SetWork {

    public static void main(String[] args) {
        Set<Simple> set = new HashSet<>();

        Simple s1 = new Simple(2, 3);
        Simple s2 = new Simple(8, 9);
        Simple s3 = new Simple(2, 3);

        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(set.size());

        Simple s = new Simple(8, 9);
        System.out.println(set.contains(s));
    }

}
