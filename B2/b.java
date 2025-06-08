package b2;

import J2.j;
import J2.l;
import Z1.a;
import android.graphics.PointF;
import android.view.ScaleGestureDetector;
import c2.c;
import w2.k;

public final class b extends l implements I2.b {
    public final int i;
    public final float j;
    public final Object k;
    public final Object l;

    public b(float f, Object object0, Object object1, int v) {
        this.i = v;
        this.j = f;
        this.k = object0;
        this.l = object1;
        super(1);
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        if(this.i != 0) {
            j.f(((c)object0), "$this$applyUpdate");
            ((c)object0).a = this.j;
            ((c)object0).b = true;
            ((c)object0).d = null;
            ((c)object0).c = ((b2.c)this.k).g;
            ((c)object0).e = true;
            ((c)object0).f = true;
            Float float0 = ((ScaleGestureDetector)this.l).getFocusX();
            Float float1 = ((ScaleGestureDetector)this.l).getFocusY();
            ((c)object0).g = float0;
            ((c)object0).h = float1;
            return k.a;
        }
        j.f(((c)object0), "$this$animateUpdate");
        ((c)object0).a = this.j;
        ((c)object0).b = true;
        ((c)object0).d = null;
        ((c)object0).c = (a)this.k;
        ((c)object0).e = false;
        ((c)object0).f = true;
        Float float2 = ((PointF)this.l).x;
        Float float3 = ((PointF)this.l).y;
        ((c)object0).g = float2;
        ((c)object0).h = float3;
        return k.a;
    }
}

