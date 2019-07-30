package collection;

import java.util.Comparator;

public class AvtoComparator implements Comparator<Avto> {

    @Override
    public int compare(Avto o1, Avto o2) {
        if (o1.getModel().compareTo(o2.getModel()) < 0) {
            return -1;
        } else {
            if (o1.getModel().compareTo(o2.getModel()) == 0) {
                return 0;
            } else {
                return -1;
            }
        }
    }

}
