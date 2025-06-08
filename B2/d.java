package b2;

import J2.j;
import M1.f;
import Z1.e;
import a2.a;
import android.content.Context;
import android.view.GestureDetector.OnGestureListener;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.OverScroller;
import c2.c;
import com.otaliastudios.zoom.ZoomLayout;
import d2.b;
import java.util.Arrays;

public final class d implements GestureDetector.OnGestureListener {
    public final b a;
    public final a b;
    public final c2.b c;
    public final GestureDetector d;
    public final OverScroller e;
    public final d2.a f;
    public final d2.a g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    static {
        new f(d.class.getSimpleName());
    }

    public d(Context context0, b b0, a a0, c2.b b1) {
        this.a = b0;
        this.b = a0;
        this.c = b1;
        GestureDetector gestureDetector0 = new GestureDetector(context0, this);
        gestureDetector0.setOnDoubleTapListener(null);
        this.d = gestureDetector0;
        this.e = new OverScroller(context0);
        this.f = new d2.a();  // 初始化器: Ljava/lang/Object;-><init>()V
        this.g = new d2.a();  // 初始化器: Ljava/lang/Object;-><init>()V
        this.h = true;
        this.i = true;
        this.j = true;
        this.k = true;
        this.l = true;
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public final boolean onDown(MotionEvent motionEvent0) {
        j.f(motionEvent0, "e");
        this.e.forceFinished(true);
        return true;
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public final boolean onFling(MotionEvent motionEvent0, MotionEvent motionEvent1, float f, float f1) {
        if(!this.h) {
            return false;
        }
        b b0 = this.a;
        boolean z = b0.m;
        if(!z && !b0.n) {
            return false;
        }
        float f2 = z ? f : 0.0f;
        float f3 = b0.n ? f1 : 0.0f;
        b0.M0(true, this.f);
        b0.M0(false, this.g);
        int v = this.f.a;
        int v1 = this.f.b;
        int v2 = this.f.c;
        int v3 = this.g.a;
        int v4 = this.g.b;
        int v5 = this.g.c;
        if(!this.m && (this.f.d || this.g.d)) {
            return false;
        }
        if(v >= v2 && v3 >= v5 && !b0.k && !b0.l) {
            return false;
        }
        if(!this.b.b(4)) {
            return false;
        }
        this.d.setIsLongpressEnabled(false);
        float f4 = b0.k ? b0.O0() : 0.0f;
        float f5 = b0.l ? b0.P0() : 0.0f;
        f.f(1, Arrays.copyOf(new Object[]{"startFling", "velocityX:", ((int)f2), "velocityY:", ((int)f3)}, 5));
        f.f(1, Arrays.copyOf(new Object[]{"startFling", "flingX:", "min:", v, "max:", v2, "start:", v1, "overScroll:", f5}, 10));
        f.f(1, Arrays.copyOf(new Object[]{"startFling", "flingY:", "min:", v3, "max:", v5, "start:", v4, "overScroll:", f4}, 10));
        this.e.fling(v1, v4, ((int)f2), ((int)f3), v, v2, v3, v5, ((int)f4), ((int)f5));
        B.b b1 = new B.b(this, 22);
        ZoomLayout zoomLayout0 = ((Z1.j)this.c.d.j).c;
        if(zoomLayout0 != null) {
            zoomLayout0.post(b1);
            return true;
        }
        j.l("container");
        throw null;
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public final void onLongPress(MotionEvent motionEvent0) {
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent0, MotionEvent motionEvent1, float f, float f1) {
        boolean z2;
        boolean z1;
        boolean z;
        if(!this.i) {
            return false;
        }
        if(motionEvent1 == null) {
            z = false;
        }
        else if(motionEvent1.getPointerCount() == 1) {
            z = true;
        }
        else {
            z = false;
        }
        if(motionEvent1 == null) {
            z1 = false;
        }
        else if(motionEvent1.getPointerCount() == 2) {
            z1 = true;
        }
        else {
            z1 = false;
        }
        if(motionEvent1 == null) {
            z2 = false;
        }
        else if(motionEvent1.getPointerCount() == 3) {
            z2 = true;
        }
        else {
            z2 = false;
        }
        if(!this.j && z) {
            return false;
        }
        if(!this.k && z1) {
            return false;
        }
        if(!this.l && z2) {
            return false;
        }
        b b0 = this.a;
        if(!b0.m && !b0.n) {
            return false;
        }
        if(!this.b.b(1)) {
            return false;
        }
        e e0 = new e(-f, -f1);
        e e1 = b0.N0();
        float f2 = e1.a;
        if(f2 < 0.0f && e0.a > 0.0f || f2 > 0.0f && e0.a < 0.0f) {
            float f3 = (1.0f - ((float)Math.pow(Math.abs(f2) / b0.O0(), 0.4))) * 0.6f;
            f.f(1, Arrays.copyOf(new Object[]{"onScroll", "applying friction X:", f3}, 3));
            e0.a *= f3;
        }
        float f4 = e1.b;
        if(f4 < 0.0f && e0.b > 0.0f || f4 > 0.0f && e0.b < 0.0f) {
            float f5 = (1.0f - ((float)Math.pow(Math.abs(f4) / b0.P0(), 0.4))) * 0.6f;
            f.f(1, Arrays.copyOf(new Object[]{"onScroll", "applying friction Y:", f5}, 3));
            e0.b *= f5;
        }
        if(!b0.m) {
            e0.a = 0.0f;
        }
        if(!b0.n) {
            e0.b = 0.0f;
        }
        if(e0.a != 0.0f || e0.b != 0.0f) {
            c c0 = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
            c0.a = NaNf;
            c0.i = true;
            c0.d = e0;
            c0.c = null;
            c0.e = true;
            c0.f = true;
            c2.d d0 = new c2.d(NaNf, c0.b, null, c0.d, true, true, c0.g, c0.h, true);
            this.c.b(d0);
        }
        return true;
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public final void onShowPress(MotionEvent motionEvent0) {
    }

    @Override  // android.view.GestureDetector$OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent0) {
        return false;
    }
}

