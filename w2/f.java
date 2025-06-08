package W2;

import I2.b;
import J2.j;
import J2.l;
import J3.c;
import X2.A;
import a3.x;
import android.support.v4.media.session.a;
import java.util.ArrayList;
import java.util.List;
import x2.i;

public final class f extends l implements b {
    public static final f i;

    static {
        f.i = new f(1);  // 初始化器: LJ2/l;-><init>(I)V
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        j.f(((A)object0), "module");
        Iterable iterable0 = (List)a.A(((x)((A)object0).m0(g.f)).m, x.p[0]);
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: iterable0) {
            if(object1 instanceof c) {
                arrayList0.add(object1);
            }
        }
        return (c)i.S(arrayList0);
    }
}

