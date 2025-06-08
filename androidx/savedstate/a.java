package androidx.savedstate;

import java.util.HashSet;
import n.f;

public final class a {
    public final HashSet a;

    public a(c c0) {
        Object object0;
        this.a = new HashSet();
        f f0 = c0.a;
        n.c c1 = f0.a("androidx.savedstate.Restarter");
        if(c1 == null) {
            n.c c2 = new n.c("androidx.savedstate.Restarter", this);
            ++f0.l;
            n.c c3 = f0.j;
            if(c3 == null) {
                f0.i = c2;
            }
            else {
                c3.k = c2;
                c2.l = c3;
            }
            f0.j = c2;
            object0 = null;
        }
        else {
            object0 = c1.j;
        }
        if(((a)object0) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }
}

