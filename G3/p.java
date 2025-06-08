package g3;

import J2.j;
import U2.h;
import X2.b;
import X2.c;
import X2.u;
import a3.m;
import android.support.v4.media.session.a;
import o2.I;
import v3.f;
import y3.e;
import z1.a0;

public final class p implements e {
    @Override  // y3.e
    public final int a(b b0, b b1, X2.e e0) {
        j.f(b0, "superDescriptor");
        j.f(b1, "subDescriptor");
        if(b0 instanceof c && b1 instanceof u && !h.z(b1)) {
            f f0 = ((m)(((u)b1))).getName();
            j.e(f0, "getName(...)");
            if(g3.f.b(f0)) {
            label_9:
                c c0 = a.y(((c)b0));
                u u0 = b0 instanceof u ? ((u)b0) : null;
                if((u0 == null || ((u)b1).f0() != u0.f0()) && (c0 == null || !((u)b1).f0())) {
                    return 3;
                }
                if(e0 instanceof i3.c && ((u)b1).y() == null && c0 != null && !a.C(e0, c0)) {
                    if(!(c0 instanceof u) || !(b0 instanceof u) || g3.f.a(((u)c0)) == null) {
                        return 3;
                    }
                    String s = I.h(((u)b1), 2);
                    u u1 = ((u)b0).a();
                    j.e(u1, "getOriginal(...)");
                    if(!s.equals(I.h(u1, 2))) {
                        return 3;
                    }
                }
            }
            else {
                f f1 = ((m)(((u)b1))).getName();
                j.e(f1, "getName(...)");
                if(G.j.contains(f1)) {
                    goto label_9;
                }
            }
        }
        return a0.n(b0, b1) ? 3 : 4;
    }

    @Override  // y3.e
    public final int b() {
        return 1;
    }
}

