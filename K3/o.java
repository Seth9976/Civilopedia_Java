package k3;

import D3.c;
import I2.a;
import J2.l;
import c3.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import x2.k;
import x2.r;
import x2.w;

public final class o extends l implements a {
    public final int i;
    public final p j;

    public o(p p0, int v) {
        this.i = v;
        this.j = p0;
        super(0);
    }

    @Override  // I2.a
    public final Object invoke() {
        String s1;
        switch(this.i) {
            case 0: {
                j3.a a0 = (j3.a)this.j.p.j;
                this.j.m.b();
                a0.l.getClass();
                return w.z(new ArrayList());
            }
            case 1: {
                HashMap hashMap0 = new HashMap();
                for(Object object0: ((Map)android.support.v4.media.session.a.A(this.j.q, p.u[0])).entrySet()) {
                    String s = (String)((Map.Entry)object0).getKey();
                    b b0 = (b)((Map.Entry)object0).getValue();
                    c c0 = c.d(s);
                    P1.a a1 = b0.b;
                    p3.a a2 = (p3.a)a1.d;
                    switch(a2.ordinal()) {
                        case 2: {
                            hashMap0.put(c0, c0);
                            continue;
                        }
                        case 5: {
                            s1 = a2 == p3.a.q ? a1.b : null;
                            if(s1 != null) {
                                break;
                            }
                            continue;
                        }
                        default: {
                            continue;
                        }
                    }
                    hashMap0.put(c0, c.d(s1));
                }
                return hashMap0;
            }
            default: {
                this.j.o.getClass();
                return new ArrayList(k.E(r.i));
            }
        }
    }
}

