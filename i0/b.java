package i0;

import M0.l;
import Z.d;
import Z.k;
import androidx.work.impl.WorkDatabase;

public final class b extends l {
    public final int k;
    public final k l;

    public b(k k0, int v) {
        this.k = v;
        this.l = k0;
        super();
    }

    @Override  // M0.l
    public final void b() {
        if(this.k != 0) {
            k k0 = this.l;
            WorkDatabase workDatabase0 = k0.m;
            workDatabase0.c();
            try {
                for(Object object0: workDatabase0.n().j()) {
                    l.a(k0, ((String)object0));
                }
                workDatabase0.h();
            }
            finally {
                workDatabase0.f();
            }
            return;
        }
        k k1 = this.l;
        WorkDatabase workDatabase1 = k1.m;
        workDatabase1.c();
        try {
            for(Object object1: workDatabase1.n().k()) {
                l.a(k1, ((String)object1));
            }
            workDatabase1.h();
        }
        finally {
            workDatabase1.f();
        }
        d.a(k1.l, k1.m, k1.o);
    }
}

