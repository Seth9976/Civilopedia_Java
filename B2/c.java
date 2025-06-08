package b2;

import J2.j;
import M1.f;
import Z1.e;
import a2.a;
import android.content.Context;
import android.graphics.PointF;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.ScaleGestureDetector;
import c2.d;
import d2.b;
import java.util.Arrays;

public final class c implements ScaleGestureDetector.OnScaleGestureListener {
    public final d2.c a;
    public final b b;
    public final a c;
    public final c2.b d;
    public final ScaleGestureDetector e;
    public final Z1.a f;
    public final Z1.a g;

    static {
        new f(c.class.getSimpleName());
    }

    public c(Context context0, d2.c c0, b b0, a a0, c2.b b1) {
        this.a = c0;
        this.b = b0;
        this.c = a0;
        this.d = b1;
        ScaleGestureDetector scaleGestureDetector0 = new ScaleGestureDetector(context0, this);
        this.e = scaleGestureDetector0;
        scaleGestureDetector0.setQuickScaleEnabled(false);
        this.f = new Z1.a(NaNf, NaNf);
        this.g = new Z1.a(0.0f, 0.0f);
    }

    @Override  // android.view.ScaleGestureDetector$OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector0) {
        j.f(scaleGestureDetector0, "detector");
        if(!this.a.q) {
            return false;
        }
        if(!this.c.b(2)) {
            return false;
        }
        PointF pointF0 = new PointF(-scaleGestureDetector0.getFocusX(), -scaleGestureDetector0.getFocusY());
        c2.b b0 = this.d;
        Z1.a a0 = e.a(new e(b0.e.left + pointF0.x, b0.e.top + pointF0.y), b0.f());
        Z1.a a1 = this.f;
        if(Float.isNaN(a1.a)) {
            a1.b(a0);
            f.f(1, Arrays.copyOf(new Object[]{"onScale:", "Setting initial focus:", a1}, 3));
        }
        else {
            float f = a1.a - a0.a;
            float f1 = a1.b - a0.b;
            this.g.getClass();
            this.g.c(f, f1);
            f.f(1, Arrays.copyOf(new Object[]{"onScale:", "Got focus offset:", this.g}, 3));
        }
        float f2 = b0.f();
        b0.b(android.support.v4.media.session.a.J(new b2.b(scaleGestureDetector0.getScaleFactor() * f2, this, scaleGestureDetector0, 1)));
        return true;
    }

    @Override  // android.view.ScaleGestureDetector$OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector0) {
        j.f(scaleGestureDetector0, "detector");
        return true;
    }

    @Override  // android.view.ScaleGestureDetector$OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector0) {
        float f9;
        float f7;
        PointF pointF0;
        j.f(scaleGestureDetector0, "detector");
        Z1.a a0 = this.f;
        d2.c c0 = this.a;
        f.f(1, Arrays.copyOf(new Object[]{"onScaleEnd:", "mInitialAbsFocusPoint.x:", a0.a, "mInitialAbsFocusPoint.y:", a0.b, "mOverZoomEnabled;", Boolean.valueOf(c0.r)}, 7));
        a a1 = this.c;
        b b0 = this.b;
        if(c0.r || b0.k || b0.l) {
            float f = c0.L0();
            float f1 = c0.M0();
            c2.b b1 = this.d;
            float f2 = c0.K0(b1.f(), false);
            f.f(1, Arrays.copyOf(new Object[]{"onScaleEnd:", "zoom:", b1.f(), "newZoom:", f2, "max:", f, "min:", f1}, 9));
            Z1.a a2 = e.a(b0.N0(), b1.f());
            if(a2.a != 0.0f || a2.b != 0.0f || Float.compare(f2, b1.f()) != 0) {
                if(b1.f() <= 1.0f) {
                    float f3 = b1.f.width();
                    float f4 = b1.f.height();
                    float f5 = b1.f();
                    e e0 = b1.e();
                    pointF0 = new PointF(-f3 / 2.0f * f5 - e0.a, -f4 / 2.0f * f5 - e0.b);
                    pointF0.set(-pointF0.x, -pointF0.y);
                }
                else {
                    float f6 = a2.a;
                    if(f6 > 0.0f) {
                        f7 = b1.j;
                    }
                    else {
                        f7 = f6 < 0.0f ? 0.0f : b1.j / 2.0f;
                    }
                    float f8 = a2.b;
                    if(f8 > 0.0f) {
                        f9 = b1.k;
                    }
                    else {
                        f9 = f8 < 0.0f ? 0.0f : b1.k / 2.0f;
                    }
                    pointF0 = new PointF(f7, f9);
                }
                Z1.a a3 = b1.c().a(a2);
                if(Float.compare(f2, b1.f()) != 0) {
                    Z1.a a4 = b1.c();
                    Z1.a a5 = new Z1.a(a4.a, a4.b);
                    float f10 = b1.f();
                    b1.b(android.support.v4.media.session.a.J(new b2.a(f2, pointF0, 0)));
                    Z1.a a6 = e.a(b0.N0(), b1.f());
                    a3.b(b1.c().a(a6));
                    b1.b(android.support.v4.media.session.a.J(new b2.a(f10, a5, 1)));
                    a2 = a6;
                }
                if(a2.a != 0.0f || a2.b != 0.0f) {
                    b1.a(android.support.v4.media.session.a.J(new b2.b(f2, a3, pointF0, 0)));
                }
                else {
                    c2.c c1 = new c2.c();  // 初始化器: Ljava/lang/Object;-><init>()V
                    c1.i = true;
                    c1.a = f2;
                    c1.b = true;
                    b1.a(new d(c1.a, true, c1.c, c1.d, c1.e, c1.f, c1.g, c1.h, true));
                }
            }
            else {
                a1.b(0);
            }
        }
        else {
            a1.b(0);
        }
        a0.c(NaNf, NaNf);
        this.g.c(0.0f, 0.0f);
    }
}

