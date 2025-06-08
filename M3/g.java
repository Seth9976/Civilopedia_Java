package M3;

import J2.j;
import X2.T;
import X2.h;
import java.util.ArrayList;
import java.util.Map;

public final class G extends L {
    public final int c;
    public final Object d;

    public G(Object object0, int v) {
        this.c = v;
        this.d = object0;
        super();
    }

    @Override  // M3.Q
    public boolean a() {
        return this.c == 1 ? false : super.a();
    }

    @Override  // M3.Q
    public boolean e() {
        return this.c == 1 ? ((Map)this.d).isEmpty() : super.e();
    }

    @Override  // M3.L
    public final N g(K k0) {
        if(this.c != 0) {
            j.f(k0, "key");
            return (N)((Map)this.d).get(k0);
        }
        j.f(k0, "key");
        if(((ArrayList)this.d).contains(k0)) {
            h h0 = k0.q();
            j.d(h0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            return X.j(((T)h0));
        }
        return null;
    }
}

