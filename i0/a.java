package i0;

import M0.l;
import Z.d;
import Z.k;
import java.util.UUID;

public final class a extends l {
    public final k k;
    public final UUID l;

    public a(k k0, UUID uUID0) {
        this.k = k0;
        this.l = uUID0;
        super();
    }

    @Override  // M0.l
    public final void b() {
        this.k.m.c();
        try {
            l.a(this.k, this.l.toString());
            this.k.m.h();
        }
        finally {
            this.k.m.f();
        }
        d.a(this.k.l, this.k.m, this.k.o);
    }
}

