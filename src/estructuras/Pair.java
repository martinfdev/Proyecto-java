package estructuras;

/**
 *
 * @author pedro
 * @param <FIRST>
 * @param <SECOND>
 */
public class Pair<FIRST, SECOND> implements Comparable<Pair<FIRST, SECOND>> {

    public FIRST first;
    public SECOND second;

    Pair(FIRST first, SECOND second) {
        this.first = first;
        this.second = second;
    }

    public static <FIRST, SECOND> Pair<FIRST, SECOND> of(FIRST first, SECOND second) {
        return new Pair<>(first, second);
    }

    @Override
//    public int compareTo(Pair<FIRST, SECOND> o) {
//        int cmp = compare(first, o.first);
//        return cmp == 0 ? compare(second, o.second) : cmp;
//    }
    
    public int compareTo(Pair<FIRST, SECOND> b){
        return  (int)b.second;
    }

    // todo move this to a helper class.
    private static int compare(Object o1, Object o2) {
        return o1 == null ? o2 == null ? 0 : -1 : o2 == null ? +1
                : ((Comparable) o1).compareTo(o2);
    }

    @Override
    public int hashCode() {
        return 31 * hashcode(first) + hashcode(second);
    }

    // todo move this to a helper class.
    private static int hashcode(Object o) {
        return o == null ? 0 : o.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return equal(first, ((Pair) obj).first)
                && equal(second, ((Pair) obj).second);
    }

    // todo move this to a helper class.
    private boolean equal(Object o1, Object o2) {
        return o1 == null ? o2 == null : (o1 == o2 || o1.equals(o2));
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ')';
    }
}
