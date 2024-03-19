package Lab9.Ex4;

import java.util.Comparator;

public class NameComparator implements Comparator<Competitor> {
    @Override
    public int compare(Competitor o1, Competitor o2) {
        String competitor1 =  ((Competitor) o1).getName();
        String competitor2 =  ((Competitor) o2).getName();
        return competitor1.compareTo(competitor2);
    }
}
