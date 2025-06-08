package w3;

import java.io.Serializable;
import java.util.Collections;

public abstract class o extends b implements Serializable {
    public static n g(l l0, o o0, int v, J j0, Class class0) {
        return new n(l0, Collections.emptyList(), o0, new m(v, j0, true), class0);
    }

    public static n h(l l0, Serializable serializable0, o o0, int v, L l1, Class class0) {
        return new n(l0, serializable0, o0, new m(v, l1, false), class0);
    }
}

