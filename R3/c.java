package R3;

import J2.j;
import M3.F;
import M3.K;
import M3.L;
import M3.N;
import M3.a0;
import z3.b;

public final class c extends L {
    @Override  // M3.L
    public final N g(K k0) {
        j.f(k0, "key");
        b b0 = k0 instanceof b ? ((b)k0) : null;
        if(b0 == null) {
            return null;
        }
        return b0.a().c() ? new F(b0.a().b(), a0.m) : b0.a();
    }
}

