package n3;

import I2.b;
import J2.l;
import w2.k;

public final class j extends l implements b {
    public final int i;
    public final String j;
    public final String k;

    public j(String s, String s1, int v) {
        this.i = v;
        this.j = s;
        this.k = s1;
        super(1);
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        k k0 = k.a;
        String s = this.k;
        String s1 = this.j;
        switch(this.i) {
            case 0: {
                J2.j.f(((n)object0), "$this$function");
                ((n)object0).a(s1, new d[]{n3.k.b});
                ((n)object0).a(s, new d[]{n3.k.b, n3.k.b, n3.k.a, n3.k.a});
                ((n)object0).c(s1, new d[]{n3.k.a});
                return k0;
            }
            case 1: {
                J2.j.f(((n)object0), "$this$function");
                ((n)object0).a(s1, new d[]{n3.k.b});
                ((n)object0).a(s, new d[]{n3.k.b, n3.k.b, n3.k.b});
                ((n)object0).c(s1, new d[]{n3.k.b});
                return k0;
            }
            case 2: {
                J2.j.f(((n)object0), "$this$function");
                ((n)object0).a(s1, new d[]{n3.k.b});
                ((n)object0).a(s, new d[]{n3.k.b, n3.k.b, n3.k.c, n3.k.a});
                ((n)object0).c(s1, new d[]{n3.k.a});
                return k0;
            }
            case 3: {
                J2.j.f(((n)object0), "$this$function");
                ((n)object0).a(s1, new d[]{n3.k.b});
                ((n)object0).a(s1, new d[]{n3.k.c});
                ((n)object0).a(s, new d[]{n3.k.b, n3.k.c, n3.k.c, n3.k.a});
                ((n)object0).c(s1, new d[]{n3.k.a});
                return k0;
            }
            case 4: {
                J2.j.f(((n)object0), "$this$function");
                ((n)object0).a(s1, new d[]{n3.k.c});
                ((n)object0).c(s, new d[]{n3.k.b, n3.k.c});
                return k0;
            }
            default: {
                J2.j.f(((n)object0), "$this$function");
                ((n)object0).a(s1, new d[]{n3.k.a});
                ((n)object0).c(s, new d[]{n3.k.b, n3.k.c});
                return k0;
            }
        }
    }
}

