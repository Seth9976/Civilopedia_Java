package c2;

import E0.d;
import J2.j;
import Z1.e;
import Z1.f;
import Z1.k;
import a2.a;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.otaliastudios.zoom.ZoomLayout;
import d2.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import r2.h;

public final class b {
    public final c a;
    public final d2.b b;
    public final a c;
    public final f d;
    public final RectF e;
    public final RectF f;
    public final Matrix g;
    public boolean h;
    public final Matrix i;
    public float j;
    public float k;
    public final e l;
    public final Z1.a m;
    public long n;
    public final LinkedHashSet o;
    public final d p;
    public static final AccelerateDecelerateInterpolator q;

    static {
        new M1.f(b.class.getSimpleName());
        b.q = new AccelerateDecelerateInterpolator();
    }

    public b(c c0, d2.b b0, a a0, f f0) {
        this.a = c0;
        this.b = b0;
        this.c = a0;
        this.d = f0;
        this.e = new RectF();
        this.f = new RectF();
        this.g = new Matrix();
        this.i = new Matrix();
        this.l = new e();
        this.m = new Z1.a();
        this.n = 280L;
        this.o = new LinkedHashSet();
        this.p = new d(this, 1);
    }

    public final void a(c2.d d0) {
        RectF rectF0 = this.e;
        if(!this.h) {
            return;
        }
        if(!this.c.b(3)) {
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        boolean z = d0.e;
        Z1.a a0 = d0.c;
        if(a0 == null) {
            e e0 = d0.d;
            if(e0 != null) {
                if(z) {
                    e e1 = this.e();
                    e0 = new e(e1.a + e0.a, e1.b + e0.b);
                }
                PropertyValuesHolder propertyValuesHolder2 = PropertyValuesHolder.ofFloat("panX", new float[]{rectF0.left, e0.a});
                j.e(propertyValuesHolder2, "ofFloat(\"panX\", scaledPanX, target.x)");
                arrayList0.add(propertyValuesHolder2);
                PropertyValuesHolder propertyValuesHolder3 = PropertyValuesHolder.ofFloat("panY", new float[]{rectF0.top, e0.b});
                j.e(propertyValuesHolder3, "ofFloat(\"panY\", scaledPanY, target.y)");
                arrayList0.add(propertyValuesHolder3);
            }
        }
        else {
            if(z) {
                a0 = this.c().a(a0);
            }
            PropertyValuesHolder propertyValuesHolder0 = PropertyValuesHolder.ofFloat("panX", new float[]{this.d(), a0.a});
            j.e(propertyValuesHolder0, "ofFloat(\"panX\", panX, target.x)");
            arrayList0.add(propertyValuesHolder0);
            PropertyValuesHolder propertyValuesHolder1 = PropertyValuesHolder.ofFloat("panY", new float[]{rectF0.top / this.f(), a0.b});
            j.e(propertyValuesHolder1, "ofFloat(\"panY\", panY, target.y)");
            arrayList0.add(propertyValuesHolder1);
        }
        float f = d0.a;
        if(!Float.isNaN(f)) {
            float f1 = this.a.K0(f, d0.b);
            PropertyValuesHolder propertyValuesHolder4 = PropertyValuesHolder.ofFloat("zoom", new float[]{this.f(), f1});
            j.e(propertyValuesHolder4, "ofFloat(\"zoom\", zoom, newZoom)");
            arrayList0.add(propertyValuesHolder4);
        }
        Object[] arr_object = arrayList0.toArray(new PropertyValuesHolder[0]);
        if(arr_object == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        ValueAnimator valueAnimator0 = ValueAnimator.ofPropertyValuesHolder(((PropertyValuesHolder[])Arrays.copyOf(((PropertyValuesHolder[])arr_object), ((PropertyValuesHolder[])arr_object).length)));
        valueAnimator0.setDuration(this.n);
        valueAnimator0.setInterpolator(b.q);
        valueAnimator0.addListener(this.p);
        valueAnimator0.addUpdateListener(new c2.a(this, d0));
        valueAnimator0.start();
        this.o.add(valueAnimator0);
    }

    public final void b(c2.d d0) {
        float f4;
        float f3;
        RectF rectF0 = this.f;
        RectF rectF1 = this.e;
        Matrix matrix0 = this.g;
        if(!this.h) {
            return;
        }
        boolean z = d0.e;
        Z1.a a0 = d0.c;
        if(a0 == null) {
            e e0 = d0.d;
            if(e0 != null) {
                if(!z) {
                    e e1 = this.e();
                    e0 = new e(e0.a - e1.a, e0.b - e1.b);
                }
                matrix0.postTranslate(e0.a, e0.b);
                matrix0.mapRect(rectF1, rectF0);
            }
        }
        else {
            if(!z) {
                Z1.a a1 = this.c();
                a0 = new Z1.a(a0.a - a1.a, a0.b - a1.b);
            }
            matrix0.preTranslate(a0.a, a0.b);
            matrix0.mapRect(rectF1, rectF0);
        }
        float f = d0.a;
        if(!Float.isNaN(f)) {
            float f1 = this.a.K0(f, d0.b);
            float f2 = this.f();
            boolean z1 = d0.j;
            Float float0 = d0.g;
            if(float0 == null) {
                f3 = z1 ? 0.0f : this.j / 2.0f;
            }
            else {
                f3 = (float)float0;
            }
            Float float1 = d0.h;
            if(float1 == null) {
                f4 = z1 ? 0.0f : this.k / 2.0f;
            }
            else {
                f4 = (float)float1;
            }
            matrix0.postScale(f1 / f2, f1 / f2, f3, f4);
            matrix0.mapRect(rectF1, rectF0);
        }
        float f5 = this.b.L0(true, d0.f);
        float f6 = this.b.L0(false, d0.f);
        if(f5 != 0.0f || f6 != 0.0f) {
            matrix0.postTranslate(f5, f6);
            matrix0.mapRect(rectF1, rectF0);
        }
        if(d0.i) {
            B.c c0 = ((Z1.j)this.d.j).e;
            for(Object object0: ((ArrayList)c0.k)) {
                k k0 = (k)object0;
                Z1.j j0 = (Z1.j)c0.j;
                j0.i.i.set(j0.i.g);
                j.f(j0, "engine");
                if(k0.a == 0) {
                    ((ZoomLayout)k0.b).a();
                }
                else {
                    h h0 = (h)k0.b;
                    if(!h0.K) {
                        continue;
                    }
                    h0.y();
                }
            }
        }
    }

    public final Z1.a c() {
        Float float0 = this.d();
        Float float1 = (float)(this.e.top / this.f());
        this.m.c(float0, float1);
        return this.m;
    }

    public final float d() {
        return this.e.left / this.f();
    }

    public final e e() {
        Float float0 = this.e.left;
        Float float1 = this.e.top;
        this.l.getClass();
        this.l.a = float0.floatValue();
        this.l.b = float1.floatValue();
        return this.l;
    }

    public final float f() {
        return this.e.width() / this.f.width();
    }

    public final void g(float f) {
        int v3;
        RectF rectF0 = this.f;
        this.g.mapRect(this.e, rectF0);
        if(rectF0.width() > 0.0f && rectF0.height() > 0.0f) {
            float f1 = this.j;
            if(f1 > 0.0f && this.k > 0.0f) {
                M1.f.f(2, Arrays.copyOf(new Object[]{"onSizeChanged:", "containerWidth:", f1, "containerHeight:", this.k, "contentWidth:", rectF0.width(), "contentHeight:", rectF0.height()}, 9));
                boolean z = this.h;
                this.h = true;
                Z1.j j0 = (Z1.j)this.d.j;
                c c0 = j0.h;
                M1.f.f(2, Arrays.copyOf(new Object[]{"onMatrixSizeChanged: firstTime:", Boolean.valueOf(!z), "oldZoom:", f, "transformation:", j0.a, "transformationZoom:", c0.k}, 8));
                j0.f.b(0);
                b b0 = j0.i;
                if(z) {
                    c0.k = Z1.j.a(j0);
                    b0.getClass();
                    c2.c c3 = new c2.c();  // 初始化器: Ljava/lang/Object;-><init>()V
                    c3.i = true;
                    c3.a = b0.f();
                    c3.b = false;
                    b0.b(new c2.d(c3.a, false, c3.c, c3.d, c3.e, c3.f, c3.g, c3.h, c3.i));
                }
                else {
                    c0.k = Z1.j.a(j0);
                    b0.getClass();
                    c2.c c1 = new c2.c();  // 初始化器: Ljava/lang/Object;-><init>()V
                    c1.a = c0.k;
                    c1.b = false;
                    c1.i = false;
                    b0.b(new c2.d(c1.a, false, c1.c, c1.d, c1.e, c1.f, c1.g, c1.h, false));
                    float f2 = b0.f.width();
                    float f3 = b0.f() * f2 - b0.j;
                    float f4 = b0.f.height();
                    float f5 = b0.f() * f4 - b0.k;
                    int v = j0.b;
                    d2.b b1 = j0.g;
                    if(v == 0) {
                        int v1 = b1.o;
                        int v2 = 16;
                        switch(v1 & 0xF0) {
                            case 16: {
                                v3 = 3;
                                break;
                            }
                            case 0x20: {
                                v3 = 5;
                                break;
                            }
                            default: {
                                v3 = 1;
                            }
                        }
                        switch(v1 & 0xFFFFFF0F) {
                            case 1: {
                                v2 = 0x30;
                                break;
                            }
                            case 2: {
                                v2 = 80;
                            }
                        }
                        v = v3 | v2;
                    }
                    b1.getClass();
                    e e0 = new e(-d2.b.K0(v, f3, true), -d2.b.K0(v, f5, false));
                    c2.c c2 = new c2.c();  // 初始化器: Ljava/lang/Object;-><init>()V
                    c2.a = NaNf;
                    c2.i = true;
                    c2.d = e0;
                    c2.c = null;
                    c2.e = false;
                    c2.f = false;
                    b0.b(new c2.d(NaNf, c2.b, null, c2.d, false, false, c2.g, c2.h, true));
                }
                M1.f.f(1, Arrays.copyOf(new Object[]{"onMatrixSizeChanged: newTransformationZoom:", c0.k, "newRealZoom:", b0.f(), "newZoom:", ((float)(b0.f() / c0.k))}, 6));
            }
        }
    }
}

