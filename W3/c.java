package w3;

import java.util.Iterator;

public final class C implements Iterable {
    @Override
    public final Iterator iterator() {
        return D.a;
    }
}

