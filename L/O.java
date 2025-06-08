package l;

import B1.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;

public final class o {
    public final View a;
    public final t b;
    public int c;
    public C0 d;
    public C0 e;
    public C0 f;

    public o(View view0) {
        this.c = -1;
        this.a = view0;
        this.b = t.a();
    }

    public final void a() {
        View view0 = this.a;
        Drawable drawable0 = view0.getBackground();
        if(drawable0 != null) {
            int v = Build.VERSION.SDK_INT;
            if(v <= 21) {
                if(v == 21) {
                label_8:
                    if(this.f == null) {
                        this.f = new C0();  // 初始化器: Ljava/lang/Object;-><init>()V
                    }
                    C0 c00 = this.f;
                    c00.a = null;
                    c00.d = false;
                    c00.b = null;
                    c00.c = false;
                    ColorStateList colorStateList0 = view0.getBackgroundTintList();
                    if(colorStateList0 != null) {
                        c00.d = true;
                        c00.a = colorStateList0;
                    }
                    PorterDuff.Mode porterDuff$Mode0 = view0.getBackgroundTintMode();
                    if(porterDuff$Mode0 != null) {
                        c00.c = true;
                        c00.b = porterDuff$Mode0;
                    }
                    if(c00.d || c00.c) {
                        t.d(drawable0, c00, view0.getDrawableState());
                        return;
                    }
                }
            }
            else if(this.d != null) {
                goto label_8;
            }
            C0 c01 = this.e;
            if(c01 != null) {
                t.d(drawable0, c01, view0.getDrawableState());
                return;
            }
            C0 c02 = this.d;
            if(c02 != null) {
                t.d(drawable0, c02, view0.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        return this.e == null ? null : this.e.a;
    }

    public final PorterDuff.Mode c() {
        return this.e == null ? null : this.e.b;
    }

    public final void d(AttributeSet attributeSet0, int v) {
        ColorStateList colorStateList0;
        View view0 = this.a;
        a a0 = a.A(view0.getContext(), attributeSet0, e.a.z, v);
        TypedArray typedArray0 = (TypedArray)a0.k;
        boolean z = false;
        try {
            if(typedArray0.hasValue(0)) {
                this.c = typedArray0.getResourceId(0, -1);
                t t0 = this.b;
                Context context0 = view0.getContext();
                synchronized(t0) {
                    colorStateList0 = t0.a.i(context0, this.c);
                }
                if(colorStateList0 != null) {
                    this.g(colorStateList0);
                }
            }
            if(typedArray0.hasValue(1)) {
                ColorStateList colorStateList1 = a0.n(1);
                int v2 = Build.VERSION.SDK_INT;
                view0.setBackgroundTintList(colorStateList1);
                if(v2 == 21) {
                    Drawable drawable0 = view0.getBackground();
                    if(drawable0 != null && (view0.getBackgroundTintList() != null || view0.getBackgroundTintMode() != null)) {
                        if(drawable0.isStateful()) {
                            drawable0.setState(view0.getDrawableState());
                        }
                        view0.setBackground(drawable0);
                    }
                }
            }
            if(typedArray0.hasValue(2)) {
                PorterDuff.Mode porterDuff$Mode0 = W.c(typedArray0.getInt(2, -1), null);
                int v3 = Build.VERSION.SDK_INT;
                view0.setBackgroundTintMode(porterDuff$Mode0);
                if(v3 == 21) {
                    Drawable drawable1 = view0.getBackground();
                    if(view0.getBackgroundTintList() != null || view0.getBackgroundTintMode() != null) {
                        z = true;
                    }
                    if(drawable1 != null && z) {
                        if(drawable1.isStateful()) {
                            drawable1.setState(view0.getDrawableState());
                        }
                        view0.setBackground(drawable1);
                    }
                }
            }
        }
        finally {
            a0.C();
        }
    }

    public final void e() {
        this.c = -1;
        this.g(null);
        this.a();
    }

    public final void f(int v) {
        ColorStateList colorStateList0;
        this.c = v;
        t t0 = this.b;
        if(t0 == null) {
            colorStateList0 = null;
        }
        else {
            Context context0 = this.a.getContext();
            synchronized(t0) {
                colorStateList0 = t0.a.i(context0, v);
            }
        }
        this.g(colorStateList0);
        this.a();
    }

    public final void g(ColorStateList colorStateList0) {
        if(colorStateList0 == null) {
            this.d = null;
        }
        else {
            if(this.d == null) {
                this.d = new C0();  // 初始化器: Ljava/lang/Object;-><init>()V
            }
            this.d.a = colorStateList0;
            this.d.d = true;
        }
        this.a();
    }

    public final void h(ColorStateList colorStateList0) {
        if(this.e == null) {
            this.e = new C0();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        this.e.a = colorStateList0;
        this.e.d = true;
        this.a();
    }

    public final void i(PorterDuff.Mode porterDuff$Mode0) {
        if(this.e == null) {
            this.e = new C0();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        this.e.b = porterDuff$Mode0;
        this.e.c = true;
        this.a();
    }
}

