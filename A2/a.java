package a2;

import Z1.e;
import Z1.f;
import Z1.j;
import Z1.k;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import b2.d;
import c2.c;
import d2.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public final class a {
    public final f a;
    public int b;

    static {
        new M1.f(a.class.getSimpleName());
    }

    public a(f f0) {
        this.a = f0;
    }

    public final int a(MotionEvent motionEvent0) {
        new String("");
        if(this.b == 3) {
            return 2;
        }
        j j0 = (j)this.a.j;
        j0.k.getClass();
        boolean z = j0.k.e.onTouchEvent(motionEvent0);
        M1.f.f(0, Arrays.copyOf(new Object[]{"processTouchEvent:", "scaleResult:", Boolean.valueOf(z)}, 3));
        if(this.b != 2) {
            j0.j.getClass();
            z |= j0.j.d.onTouchEvent(motionEvent0);
            M1.f.f(0, Arrays.copyOf(new Object[]{"processTouchEvent:", "flingResult:", Boolean.valueOf(z)}, 3));
        }
        if(this.b == 1) {
            switch(motionEvent0.getActionMasked()) {
                case 1: 
                case 3: {
                    new String("");
                    d d0 = j0.j;
                    b b0 = d0.a;
                    if(!b0.k && !b0.l) {
                        d0.b.b(0);
                    }
                    else {
                        e e0 = b0.N0();
                        if(e0.a != 0.0f || e0.b != 0.0f) {
                            c c0 = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
                            c0.a = NaNf;
                            c0.i = true;
                            c0.d = e0;
                            c0.c = null;
                            c0.e = true;
                            c0.f = true;
                            c2.d d1 = new c2.d(NaNf, c0.b, null, c0.d, true, true, c0.g, c0.h, true);
                            d0.c.a(d1);
                        }
                        else {
                            d0.b.b(0);
                        }
                    }
                }
            }
        }
        if(z && this.b != 0) {
            new String("");
            return 2;
        }
        if(z) {
            new String("");
            return 1;
        }
        new String("");
        this.b(0);
        return 0;
    }

    public final boolean b(int v) {
        M1.f.f(0, Arrays.copyOf(new Object[]{"trySetState:", a.c(v)}, 2));
        j j0 = (j)this.a.j;
        if(!j0.i.h) {
            return false;
        }
        int v1 = this.b;
        if(v == v1 && v != 3) {
            return true;
        }
        switch(v) {
            case 0: {
                B.c c0 = j0.e;
                for(Object object0: ((ArrayList)c0.k)) {
                    j j1 = (j)c0.j;
                    switch(((k)object0).a) {
                        default: {
                            J2.j.f(j1, "engine");
                        }
                    }
                }
                break;
            }
            case 1: {
                if(v1 == 2 || v1 == 3) {
                    return false;
                }
                break;
            }
            case 2: {
                if(v1 == 3) {
                    return false;
                }
                break;
            }
            case 4: {
                if(v1 == 3) {
                    return false;
                }
            }
        }
        switch(v1) {
            case 3: {
                LinkedHashSet linkedHashSet0 = j0.i.o;
                for(Object object1: linkedHashSet0) {
                    ((ValueAnimator)object1).cancel();
                }
                linkedHashSet0.clear();
                break;
            }
            case 4: {
                j0.j.e.forceFinished(true);
            }
        }
        M1.f.f(1, Arrays.copyOf(new Object[]{"setState:", a.c(v)}, 2));
        this.b = v;
        return true;
    }

    public static String c(int v) {
        switch(v) {
            case 0: {
                return "IDLE";
            }
            case 1: {
                return "SCROLLING";
            }
            case 2: {
                return "PINCHING";
            }
            case 3: {
                return "ANIMATING";
            }
            case 4: {
                return "FLINGING";
            }
            default: {
                return "";
            }
        }
    }
}

