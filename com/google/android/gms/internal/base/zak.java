package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import b1.b;
import b1.c;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

public final class zak extends Drawable implements Drawable.Callback {
    public int i;
    public long j;
    public int k;
    public int l;
    public int m;
    public int n;
    public final boolean o;
    public boolean p;
    public final c q;
    public final Drawable r;
    public final Drawable s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;

    public zak(Drawable drawable0, Drawable drawable1) {
        this(null);
        if(drawable0 == null) {
            drawable0 = b.a;
        }
        this.r = drawable0;
        drawable0.setCallback(this);
        int v = this.q.b;
        this.q.b = drawable0.getChangingConfigurations() | v;
        if(drawable1 == null) {
            drawable1 = b.a;
        }
        this.s = drawable1;
        drawable1.setCallback(this);
        int v1 = this.q.b;
        this.q.b = drawable1.getChangingConfigurations() | v1;
    }

    public zak(c c0) {
        this.i = 0;
        this.l = 0xFF;
        this.n = 0;
        this.o = true;
        c c1 = new c();  // 初始化器: Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V
        if(c0 != null) {
            c1.a = c0.a;
            c1.b = c0.b;
        }
        this.q = c1;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas0) {
        boolean z1;
        boolean z = false;
        switch(this.i) {
            case 1: {
                this.j = SystemClock.uptimeMillis();
                this.i = 2;
                z1 = false;
                break;
            }
            case 2: {
                if(this.j >= 0L) {
                    float f = ((float)(SystemClock.uptimeMillis() - this.j)) / ((float)this.m);
                    z1 = f >= 1.0f;
                    if(z1) {
                        this.i = 0;
                    }
                    this.n = (int)(((float)this.k) * Math.min(f, 1.0f) + 0.0f);
                }
                else {
                    z1 = true;
                }
                break;
            }
            default: {
                z1 = true;
            }
        }
        int v = this.n;
        boolean z2 = this.o;
        Drawable drawable0 = this.r;
        Drawable drawable1 = this.s;
        if(z1) {
            if(!z2) {
                drawable0.draw(canvas0);
            }
            else if(v == 0) {
                drawable0.draw(canvas0);
                v = 0;
            }
            int v1 = this.l;
            if(v == v1) {
                drawable1.setAlpha(v1);
                drawable1.draw(canvas0);
            }
            return;
        }
        if(z2) {
            drawable0.setAlpha(this.l - v);
            z = true;
        }
        drawable0.draw(canvas0);
        if(z) {
            drawable0.setAlpha(this.l);
        }
        if(v > 0) {
            drawable1.setAlpha(v);
            drawable1.draw(canvas0);
            drawable1.setAlpha(this.l);
        }
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.q.a | this.q.b;
    }

    @Override  // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if(this.zac()) {
            this.q.a = this.getChangingConfigurations();
            return this.q;
        }
        return null;
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.r.getIntrinsicHeight(), this.s.getIntrinsicHeight());
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.r.getIntrinsicWidth(), this.s.getIntrinsicWidth());
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if(!this.v) {
            this.w = Drawable.resolveOpacity(this.r.getOpacity(), this.s.getOpacity());
            this.v = true;
        }
        return this.w;
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void invalidateDrawable(Drawable drawable0) {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 != null) {
            drawable$Callback0.invalidateDrawable(this);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    @CanIgnoreReturnValue
    public final Drawable mutate() {
        if(!this.p && super.mutate() == this) {
            if(!this.zac()) {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            this.r.mutate();
            this.s.mutate();
            this.p = true;
            return this;
        }
        return this;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect0) {
        this.r.setBounds(rect0);
        this.s.setBounds(rect0);
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void scheduleDrawable(Drawable drawable0, Runnable runnable0, long v) {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 != null) {
            drawable$Callback0.scheduleDrawable(this, runnable0, v);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setAlpha(int v) {
        if(this.n == this.l) {
            this.n = v;
        }
        this.l = v;
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter0) {
        this.r.setColorFilter(colorFilter0);
        this.s.setColorFilter(colorFilter0);
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void unscheduleDrawable(Drawable drawable0, Runnable runnable0) {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 != null) {
            drawable$Callback0.unscheduleDrawable(this, runnable0);
        }
    }

    public final Drawable zaa() {
        return this.s;
    }

    public final void zab(int v) {
        this.k = this.l;
        this.n = 0;
        this.m = 0xFA;
        this.i = 1;
        this.invalidateSelf();
    }

    public final boolean zac() {
        boolean z = false;
        if(!this.t) {
            if(this.r.getConstantState() != null && this.s.getConstantState() != null) {
                z = true;
            }
            this.u = z;
            this.t = true;
        }
        return this.u;
    }
}

