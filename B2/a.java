package b2;

import I2.b;
import J2.j;
import J2.l;
import android.graphics.PointF;
import c2.c;
import w2.k;

public final class a extends l implements b {
    public final int i;
    public final float j;
    public final Object k;

    public a(float f, Object object0, int v) {
        this.i = v;
        this.j = f;
        this.k = object0;
        super(1);
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        if(this.i != 0) {
            j.f(((c)object0), "$this$applyUpdate");
            ((c)object0).a = this.j;
            ((c)object0).b = true;
            ((c)object0).d = null;
            ((c)object0).c = (Z1.a)this.k;
            ((c)object0).e = false;
            ((c)object0).f = true;
            ((c)object0).i = false;
            return k.a;
        }
        j.f(((c)object0), "$this$applyUpdate");
        ((c)object0).a = this.j;
        ((c)object0).b = true;
        Float float0 = ((PointF)this.k).x;
        Float float1 = ((PointF)this.k).y;
        ((c)object0).g = float0;
        ((c)object0).h = float1;
        ((c)object0).f = true;
        ((c)object0).i = false;
        return k.a;
    }
}

