package l;

import B1.a;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import x2.w;

public final class D extends z {
    public final C d;
    public Drawable e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public boolean h;
    public boolean i;

    public D(C c0) {
        super(c0);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.d = c0;
    }

    @Override  // l.z
    public final void a(AttributeSet attributeSet0, int v) {
        super.a(attributeSet0, 0x7F02012C);  // attr:seekBarStyle
        C c0 = this.d;
        a a0 = a.A(c0.getContext(), attributeSet0, e.a.g, 0x7F02012C);  // attr:seekBarStyle
        Drawable drawable0 = a0.p(0);
        if(drawable0 != null) {
            c0.setThumb(drawable0);
        }
        Drawable drawable1 = a0.o(1);
        Drawable drawable2 = this.e;
        if(drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.e = drawable1;
        if(drawable1 != null) {
            drawable1.setCallback(c0);
            w.w(drawable1, c0.getLayoutDirection());
            if(drawable1.isStateful()) {
                drawable1.setState(c0.getDrawableState());
            }
            this.c();
        }
        c0.invalidate();
        TypedArray typedArray0 = (TypedArray)a0.k;
        if(typedArray0.hasValue(3)) {
            this.g = W.c(typedArray0.getInt(3, -1), this.g);
            this.i = true;
        }
        if(typedArray0.hasValue(2)) {
            this.f = a0.n(2);
            this.h = true;
        }
        a0.C();
        this.c();
    }

    public final void c() {
        Drawable drawable0 = this.e;
        if(drawable0 != null && (this.h || this.i)) {
            Drawable drawable1 = w.B(drawable0.mutate());
            this.e = drawable1;
            if(this.h) {
                drawable1.setTintList(this.f);
            }
            if(this.i) {
                this.e.setTintMode(this.g);
            }
            if(this.e.isStateful()) {
                this.e.setState(this.d.getDrawableState());
            }
        }
    }

    public final void d(Canvas canvas0) {
        if(this.e != null) {
            C c0 = this.d;
            int v = c0.getMax();
            int v1 = 1;
            if(v > 1) {
                int v2 = this.e.getIntrinsicWidth();
                int v3 = this.e.getIntrinsicHeight();
                int v4 = v2 < 0 ? 1 : v2 / 2;
                if(v3 >= 0) {
                    v1 = v3 / 2;
                }
                this.e.setBounds(-v4, -v1, v4, v1);
                int v5 = c0.getWidth();
                int v6 = c0.getPaddingLeft();
                int v7 = c0.getPaddingRight();
                int v8 = canvas0.save();
                canvas0.translate(((float)c0.getPaddingLeft()), ((float)(c0.getHeight() / 2)));
                for(int v9 = 0; v9 <= v; ++v9) {
                    this.e.draw(canvas0);
                    canvas0.translate(((float)(v5 - v6 - v7)) / ((float)v), 0.0f);
                }
                canvas0.restoreToCount(v8);
            }
        }
    }
}

