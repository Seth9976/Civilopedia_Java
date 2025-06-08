package h;

import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.SystemClock;
import x2.w;

public abstract class f extends Drawable implements Drawable.Callback {
    public b i;
    public Rect j;
    public Drawable k;
    public Drawable l;
    public int m;
    public boolean n;
    public int o;
    public boolean p;
    public B.b q;
    public long r;
    public long s;
    public V.b t;
    public static final int u;

    public final void a(boolean z) {
        int v3;
        int v = 1;
        this.n = true;
        long v1 = SystemClock.uptimeMillis();
        Drawable drawable0 = this.k;
        if(drawable0 == null) {
            this.r = 0L;
            v3 = 0;
        }
        else {
            long v2 = this.r;
            if(v2 == 0L) {
                v3 = 0;
            }
            else if(v2 <= v1) {
                drawable0.setAlpha(this.m);
                this.r = 0L;
                v3 = 0;
            }
            else {
                drawable0.setAlpha((0xFF - ((int)((v2 - v1) * 0xFFL)) / this.i.y) * this.m / 0xFF);
                v3 = 1;
            }
        }
        Drawable drawable1 = this.l;
        if(drawable1 == null) {
            this.s = 0L;
            v = v3;
        }
        else {
            long v4 = this.s;
            if(v4 == 0L) {
                v = v3;
            }
            else if(v4 <= v1) {
                drawable1.setVisible(false, false);
                this.l = null;
                this.s = 0L;
                v = v3;
            }
            else {
                drawable1.setAlpha(((int)((v4 - v1) * 0xFFL)) / this.i.z * this.m / 0xFF);
            }
        }
        if(z && v != 0) {
            this.scheduleSelf(this.q, v1 + 16L);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme resources$Theme0) {
        b b0 = this.i;
        if(resources$Theme0 == null) {
            b0.getClass();
        }
        else {
            b0.c();
            int v = b0.h;
            Drawable[] arr_drawable = b0.g;
            for(int v1 = 0; v1 < v; ++v1) {
                Drawable drawable0 = arr_drawable[v1];
                if(drawable0 != null && drawable0.canApplyTheme()) {
                    arr_drawable[v1].applyTheme(resources$Theme0);
                    b0.e |= arr_drawable[v1].getChangingConfigurations();
                }
            }
            Resources resources0 = resources$Theme0.getResources();
            if(resources0 != null) {
                b0.b = resources0;
                int v2 = resources0.getDisplayMetrics().densityDpi;
                if(v2 == 0) {
                    v2 = 0xA0;
                }
                int v3 = b0.c;
                b0.c = v2;
                if(v3 != v2) {
                    b0.m = false;
                    b0.j = false;
                }
            }
        }
    }

    public final void b(Drawable drawable0) {
        if(this.t == null) {
            this.t = new V.b();
        }
        V.b b0 = this.t;
        b0.j = drawable0.getCallback();
        drawable0.setCallback(b0);
        try {
            if(this.i.y <= 0 && this.n) {
                drawable0.setAlpha(this.m);
            }
            b b1 = this.i;
            if(b1.C) {
                drawable0.setColorFilter(b1.B);
            }
            else {
                if(b1.F) {
                    drawable0.setTintList(b1.D);
                }
                b b2 = this.i;
                if(b2.G) {
                    drawable0.setTintMode(b2.E);
                }
            }
            drawable0.setVisible(this.isVisible(), true);
            drawable0.setDither(this.i.w);
            drawable0.setState(this.getState());
            drawable0.setLevel(this.getLevel());
            drawable0.setBounds(this.getBounds());
            if(Build.VERSION.SDK_INT >= 23) {
                drawable0.setLayoutDirection(this.getLayoutDirection());
            }
            drawable0.setAutoMirrored(this.i.A);
            Rect rect0 = this.j;
            if(rect0 != null) {
                drawable0.setHotspotBounds(rect0.left, rect0.top, rect0.right, rect0.bottom);
            }
        }
        finally {
            V.b b3 = this.t;
            Drawable.Callback drawable$Callback0 = (Drawable.Callback)b3.j;
            b3.j = null;
            drawable0.setCallback(drawable$Callback0);
        }
    }

    public final boolean c(int v) {
        if(v == this.o) {
            return false;
        }
        long v1 = SystemClock.uptimeMillis();
        if(this.i.z > 0) {
            Drawable drawable0 = this.l;
            if(drawable0 != null) {
                drawable0.setVisible(false, false);
            }
            Drawable drawable1 = this.k;
            if(drawable1 == null) {
                this.l = null;
                this.s = 0L;
            }
            else {
                this.l = drawable1;
                this.s = ((long)this.i.z) + v1;
            }
        }
        else {
            Drawable drawable2 = this.k;
            if(drawable2 != null) {
                drawable2.setVisible(false, false);
            }
        }
        if(v >= 0) {
            b b0 = this.i;
            if(v < b0.h) {
                Drawable drawable3 = b0.d(v);
                this.k = drawable3;
                this.o = v;
                if(drawable3 != null) {
                    int v2 = this.i.y;
                    if(v2 > 0) {
                        this.r = v1 + ((long)v2);
                    }
                    this.b(drawable3);
                }
            }
            else {
                this.k = null;
                this.o = -1;
            }
        }
        else {
            this.k = null;
            this.o = -1;
        }
        if(this.r != 0L || this.s != 0L) {
            B.b b1 = this.q;
            if(b1 == null) {
                this.q = new B.b(((e)this), 23);
            }
            else {
                this.unscheduleSelf(b1);
            }
            this.a(true);
        }
        this.invalidateSelf();
        return true;
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.i.canApplyTheme();
    }

    public abstract void d(b arg1);

    @Override  // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas0) {
        Drawable drawable0 = this.k;
        if(drawable0 != null) {
            drawable0.draw(canvas0);
        }
        Drawable drawable1 = this.l;
        if(drawable1 != null) {
            drawable1.draw(canvas0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.m;
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.i.getChangingConfigurations();
    }

    @Override  // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z;
        b b0 = this.i;
        synchronized(b0) {
            if(b0.u) {
                z = b0.v;
            }
            else {
                b0.c();
                z = true;
                b0.u = true;
                int v1 = b0.h;
                Drawable[] arr_drawable = b0.g;
                int v2 = 0;
                while(v2 < v1) {
                    if(arr_drawable[v2].getConstantState() == null) {
                        b0.v = false;
                        z = false;
                        goto label_24;
                    }
                    ++v2;
                }
                b0.v = true;
            }
        }
    label_24:
        if(z) {
            b b1 = this.i;
            b1.d = this.getChangingConfigurations();
            return this.i;
        }
        return null;
    }

    @Override  // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.k;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect0) {
        Rect rect1 = this.j;
        if(rect1 != null) {
            rect0.set(rect1);
            return;
        }
        super.getHotspotBounds(rect0);
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        b b0 = this.i;
        if(b0.l) {
            if(!b0.m) {
                b0.b();
            }
            return b0.o;
        }
        return this.k == null ? -1 : this.k.getIntrinsicHeight();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        b b0 = this.i;
        if(b0.l) {
            if(!b0.m) {
                b0.b();
            }
            return b0.n;
        }
        return this.k == null ? -1 : this.k.getIntrinsicWidth();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        b b0 = this.i;
        if(b0.l) {
            if(!b0.m) {
                b0.b();
            }
            return b0.q;
        }
        return this.k == null ? 0 : this.k.getMinimumHeight();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        b b0 = this.i;
        if(b0.l) {
            if(!b0.m) {
                b0.b();
            }
            return b0.p;
        }
        return this.k == null ? 0 : this.k.getMinimumWidth();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int v = -2;
        if(this.k != null && this.k.isVisible()) {
            b b0 = this.i;
            if(b0.r) {
                return b0.s;
            }
            b0.c();
            int v1 = b0.h;
            Drawable[] arr_drawable = b0.g;
            if(v1 > 0) {
                v = arr_drawable[0].getOpacity();
            }
            for(int v2 = 1; v2 < v1; ++v2) {
                v = Drawable.resolveOpacity(v, arr_drawable[v2].getOpacity());
            }
            b0.s = v;
            b0.r = true;
        }
        return v;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline0) {
        Drawable drawable0 = this.k;
        if(drawable0 != null) {
            drawable0.getOutline(outline0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect0) {
        b b0 = this.i;
        boolean z = false;
        Rect rect1 = null;
        if(!b0.i) {
            Rect rect2 = b0.k;
            if(rect2 != null || b0.j) {
                rect1 = rect2;
            }
            else {
                b0.c();
                Rect rect3 = new Rect();
                int v = b0.h;
                Drawable[] arr_drawable = b0.g;
                for(int v1 = 0; v1 < v; ++v1) {
                    if(arr_drawable[v1].getPadding(rect3)) {
                        if(rect1 == null) {
                            rect1 = new Rect(0, 0, 0, 0);
                        }
                        int v2 = rect3.left;
                        if(v2 > rect1.left) {
                            rect1.left = v2;
                        }
                        int v3 = rect3.top;
                        if(v3 > rect1.top) {
                            rect1.top = v3;
                        }
                        int v4 = rect3.right;
                        if(v4 > rect1.right) {
                            rect1.right = v4;
                        }
                        int v5 = rect3.bottom;
                        if(v5 > rect1.bottom) {
                            rect1.bottom = v5;
                        }
                    }
                }
                b0.j = true;
                b0.k = rect1;
            }
        }
        if(rect1 == null) {
            Drawable drawable0 = this.k;
            z = drawable0 == null ? super.getPadding(rect0) : drawable0.getPadding(rect0);
        }
        else {
            rect0.set(rect1);
            if((rect1.left | rect1.top | rect1.bottom | rect1.right) != 0) {
                z = true;
            }
        }
        if(this.i.A && w.g(this) == 1) {
            int v6 = rect0.left;
            rect0.left = rect0.right;
            rect0.right = v6;
        }
        return z;
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void invalidateDrawable(Drawable drawable0) {
        b b0 = this.i;
        if(b0 != null) {
            b0.r = false;
            b0.t = false;
        }
        if(drawable0 == this.k && this.getCallback() != null) {
            this.getCallback().invalidateDrawable(this);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.i.A;
    }

    @Override  // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        int v1;
        Drawable drawable0 = this.l;
        int v = 1;
        if(drawable0 == null) {
            v1 = 0;
        }
        else {
            drawable0.jumpToCurrentState();
            this.l = null;
            v1 = 1;
        }
        Drawable drawable1 = this.k;
        if(drawable1 != null) {
            drawable1.jumpToCurrentState();
            if(this.n) {
                this.k.setAlpha(this.m);
            }
        }
        if(this.s != 0L) {
            this.s = 0L;
            v1 = 1;
        }
        if(this.r == 0L) {
            v = v1;
        }
        else {
            this.r = 0L;
        }
        if(v != 0) {
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if(!this.p && super.mutate() == this) {
            b b0 = new b(((e)this).x, ((e)this), null);
            b0.I = b0.I.b();
            b0.J = b0.J.b();
            this.d(b0);
            this.p = true;
        }
        return this;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect0) {
        Drawable drawable0 = this.l;
        if(drawable0 != null) {
            drawable0.setBounds(rect0);
        }
        Drawable drawable1 = this.k;
        if(drawable1 != null) {
            drawable1.setBounds(rect0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int v) {
        b b0 = this.i;
        int v1 = this.o;
        int v2 = b0.h;
        Drawable[] arr_drawable = b0.g;
        boolean z = false;
        for(int v3 = 0; v3 < v2; ++v3) {
            Drawable drawable0 = arr_drawable[v3];
            if(drawable0 != null) {
                boolean z1 = Build.VERSION.SDK_INT < 23 ? false : drawable0.setLayoutDirection(v);
                if(v3 == v1) {
                    z = z1;
                }
            }
        }
        b0.x = v;
        return z;
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int v) {
        Drawable drawable0 = this.l;
        if(drawable0 != null) {
            return drawable0.setLevel(v);
        }
        return this.k == null ? false : this.k.setLevel(v);
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void scheduleDrawable(Drawable drawable0, Runnable runnable0, long v) {
        if(drawable0 == this.k && this.getCallback() != null) {
            this.getCallback().scheduleDrawable(this, runnable0, v);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setAlpha(int v) {
        if(!this.n || this.m != v) {
            this.n = true;
            this.m = v;
            Drawable drawable0 = this.k;
            if(drawable0 != null) {
                if(this.r == 0L) {
                    drawable0.setAlpha(v);
                    return;
                }
                this.a(false);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        b b0 = this.i;
        if(b0.A != z) {
            b0.A = z;
            Drawable drawable0 = this.k;
            if(drawable0 != null) {
                drawable0.setAutoMirrored(z);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter0) {
        b b0 = this.i;
        b0.C = true;
        if(b0.B != colorFilter0) {
            b0.B = colorFilter0;
            Drawable drawable0 = this.k;
            if(drawable0 != null) {
                drawable0.setColorFilter(colorFilter0);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        b b0 = this.i;
        if(b0.w != z) {
            b0.w = z;
            Drawable drawable0 = this.k;
            if(drawable0 != null) {
                drawable0.setDither(z);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f1) {
        Drawable drawable0 = this.k;
        if(drawable0 != null) {
            drawable0.setHotspot(f, f1);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int v, int v1, int v2, int v3) {
        Rect rect0 = this.j;
        if(rect0 == null) {
            this.j = new Rect(v, v1, v2, v3);
        }
        else {
            rect0.set(v, v1, v2, v3);
        }
        Drawable drawable0 = this.k;
        if(drawable0 != null) {
            drawable0.setHotspotBounds(v, v1, v2, v3);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList0) {
        b b0 = this.i;
        b0.F = true;
        if(b0.D != colorStateList0) {
            b0.D = colorStateList0;
            this.k.setTintList(colorStateList0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode porterDuff$Mode0) {
        b b0 = this.i;
        b0.G = true;
        if(b0.E != porterDuff$Mode0) {
            b0.E = porterDuff$Mode0;
            this.k.setTintMode(porterDuff$Mode0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z1) {
        boolean z2 = super.setVisible(z, z1);
        Drawable drawable0 = this.l;
        if(drawable0 != null) {
            drawable0.setVisible(z, z1);
        }
        Drawable drawable1 = this.k;
        if(drawable1 != null) {
            drawable1.setVisible(z, z1);
        }
        return z2;
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void unscheduleDrawable(Drawable drawable0, Runnable runnable0) {
        if(drawable0 == this.k && this.getCallback() != null) {
            this.getCallback().unscheduleDrawable(this, runnable0);
        }
    }
}

