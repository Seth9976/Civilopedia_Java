package X2;

import I2.b;
import J2.j;
import X3.f;
import X3.l;
import a3.C;
import java.util.ArrayList;
import java.util.Collection;
import v3.c;
import x2.i;

public final class H implements I {
    public final ArrayList a;

    public H(ArrayList arrayList0) {
        this.a = arrayList0;
    }

    @Override  // X2.I
    public final void a(c c0, ArrayList arrayList0) {
        j.f(c0, "fqName");
        for(Object object0: this.a) {
            if(j.a(((C)(((F)object0))).m, c0)) {
                arrayList0.add(object0);
            }
        }
    }

    @Override  // X2.I
    public final boolean b(c c0) {
        j.f(c0, "fqName");
        ArrayList arrayList0 = this.a;
        if(!arrayList0.isEmpty()) {
            for(Object object0: arrayList0) {
                if(j.a(((C)(((F)object0))).m, c0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    @Override  // X2.I
    public final Collection h(c c0, b b0) {
        j.f(c0, "fqName");
        return l.y0(new f(l.w0(i.L(this.a), s.k), true, new G(c0, 0)));
    }
}

