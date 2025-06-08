package a3;

import J2.j;
import K3.x;
import M3.K;
import U2.h;
import java.util.Collection;
import java.util.List;

public final class e implements K {
    public final f a;

    public e(f f0) {
        this.a = f0;
    }

    @Override  // M3.K
    public final h m() {
        return C3.e.e(this.a);
    }

    @Override  // M3.K
    public final List o() {
        List list0 = ((x)this.a).x;
        if(list0 != null) {
            return list0;
        }
        j.l("typeConstructorParameters");
        throw null;
    }

    @Override  // M3.K
    public final boolean p() {
        return true;
    }

    @Override  // M3.K
    public final X2.h q() {
        return this.a;
    }

    @Override  // M3.K
    public final Collection r() {
        Collection collection0 = ((x)this.a).O0().H0().r();
        j.e(collection0, "getSupertypes(...)");
        return collection0;
    }

    @Override
    public final String toString() {
        return "[typealias " + this.a.getName().b() + ']';
    }
}

