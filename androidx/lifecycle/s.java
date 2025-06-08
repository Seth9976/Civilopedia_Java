package androidx.lifecycle;

import f2.J;

public abstract class s {
    public final J i;
    public boolean j;
    public int k;
    public final t l;

    public s(t t0, J j0) {
        this.l = t0;
        this.k = -1;
        this.i = j0;
    }

    public final void b(boolean z) {
        if(z == this.j) {
            return;
        }
        this.j = z;
        t t0 = this.l;
        int v = t0.c;
        t0.c = (z ? 1 : -1) + v;
        if(!t0.d) {
            t0.d = true;
            while(true) {
                int v1 = t0.c;
                if(v == v1) {
                    break;
                }
                v = v1;
            }
            t0.d = false;
        }
        if(this.j) {
            t0.c(this);
        }
    }
}

