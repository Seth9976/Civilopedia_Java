package U2;

import F3.j;
import I2.b;
import X2.e;
import a3.A;
import a3.a;
import a3.x;
import v3.c;
import w2.k;

public final class f implements b {
    public final int i;
    public final Object j;

    public f(Object object0, int v) {
        this.i = v;
        this.j = object0;
        super();
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        switch(this.i) {
            case 0: {
                A a0 = ((h)this.j).k();
                c c0 = n.l;
                j j0 = ((x)a0.m0(c0)).o;
                if(j0 != null) {
                    X2.h h0 = j0.f(((v3.f)object0), f3.b.i);
                    if(h0 == null) {
                        throw new AssertionError("Built-in class " + c0.c(((v3.f)object0)) + " is not found");
                    }
                    if(!(h0 instanceof e)) {
                        throw new AssertionError("Must be a class descriptor " + ((v3.f)object0) + ", but was " + h0);
                    }
                    return (e)h0;
                }
                h.a(11);
                throw null;
            }
            case 1: {
                ((N3.f)object0).getClass();
                J2.j.f(((a)this.j).j, "descriptor");
                return (M3.A)((a)this.j).j.j.invoke();
            }
            default: {
                if(((X2.c)object0) == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter \'descriptor\' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
                }
                ((h3.a)this.j).c.b(((X2.c)object0));
                return k.a;
            }
        }
    }
}

