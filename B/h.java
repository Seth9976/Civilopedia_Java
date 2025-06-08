package B;

import java.util.ArrayList;
import p.k;

public final class h {
    public final int a;
    public final Object b;

    public h(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    public final void a(Object object0) {
        ArrayList arrayList0;
        if(this.a != 0) {
            synchronized(j.c) {
                k k0 = j.d;
                arrayList0 = (ArrayList)k0.getOrDefault(((String)this.b), null);
                if(arrayList0 == null) {
                    return;
                }
                k0.remove(((String)this.b));
            }
            for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
                ((h)arrayList0.get(v1)).a(((i)object0));
            }
            return;
        }
        ((c)this.b).D(((i)object0));
    }
}

