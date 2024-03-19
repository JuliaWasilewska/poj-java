package Lab9.Ex4;

import java.util.Comparator;

public class MaxSpeedComparator implements Comparator<Competitor> {
    @Override
    public int compare(Competitor o1, Competitor o2) {
        long competitor1 =  ((Competitor) o1).getMaxSpeed();
        long competitor2 =  ((Competitor) o2).getMaxSpeed();
        return Long.compare(competitor1, competitor2);
    }
}
