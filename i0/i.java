package i0;

import E1.d;
import Y.m;
import Z.k;
import androidx.work.impl.WorkDatabase;

public final class i implements Runnable {
    public final k i;
    public final String j;
    public final boolean k;
    public static final String l;

    static {
        i.l = "WM-StopWorkRunnable";
    }

    public i(k k0, String s, boolean z) {
        this.i = k0;
        this.j = s;
        this.k = z;
    }

    @Override
    public final void run() {
        boolean z1;
        WorkDatabase workDatabase0 = this.i.m;
        d d0 = workDatabase0.n();
        workDatabase0.c();
        try {
            synchronized(this.i.p.s) {
                boolean z = this.i.p.n.containsKey(this.j);
            }
            if(this.k) {
                z1 = this.i.p.j(this.j);
            }
            else {
                if(!z && d0.i(this.j) == 2) {
                    d0.s(1, new String[]{this.j});
                }
                z1 = this.i.p.k(this.j);
            }
            m.d().a("WM-StopWorkRunnable", "StopWorkRunnable for " + this.j + "; Processor.stopWork = " + z1, new Throwable[0]);
            workDatabase0.h();
        }
        finally {
            workDatabase0.f();
        }
    }
}

