package Lab9.Ex4;

import java.util.Comparator;

public class NumberComparator implements Comparator<Competitor> {

    @Override
    public int compare(Competitor o1, Competitor o2) {
        int competitor1 =  ((Competitor) o1).getNumber();
        int competitor2 =  ((Competitor) o2).getNumber();
        return Integer.compare(competitor1, competitor2);
    }
}
