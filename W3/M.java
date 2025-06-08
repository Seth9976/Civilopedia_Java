package w3;

public final class m implements Comparable {
    public final int i;
    public final L j;
    public final boolean k;

    public m(int v, L l0, boolean z) {
        this.i = v;
        this.j = l0;
        this.k = z;
    }

    @Override
    public final int compareTo(Object object0) {
        return this.i - ((m)object0).i;
    }
}

