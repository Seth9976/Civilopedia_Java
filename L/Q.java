package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import g.b;

public final class q extends CheckBox {
    public final s i;
    public final o j;
    public final M k;

    public q(Context context0, AttributeSet attributeSet0) {
        B0.a(context0);
        super(context0, attributeSet0, 0x7F02004F);  // attr:checkboxStyle
        s s0 = new s(this);
        this.i = s0;
        s0.b(attributeSet0, 0x7F02004F);  // attr:checkboxStyle
        o o0 = new o(this);
        this.j = o0;
        o0.d(attributeSet0, 0x7F02004F);  // attr:checkboxStyle
        M m0 = new M(this);
        this.k = m0;
        m0.d(attributeSet0, 0x7F02004F);  // attr:checkboxStyle
    }

    @Override  // android.widget.CompoundButton
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o o0 = this.j;
        if(o0 != null) {
            o0.a();
        }
        M m0 = this.k;
        if(m0 != null) {
            m0.b();
        }
    }

    @Override  // android.widget.CompoundButton
    public int getCompoundPaddingLeft() {
        int v = super.getCompoundPaddingLeft();
        s s0 = this.i;
        if(s0 != null) {
            s0.getClass();
        }
        return v;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.j == null ? null : this.j.b();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.j == null ? null : this.j.c();
    }

    public ColorStateList getSupportButtonTintList() {
        return this.i == null ? null : this.i.b;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        return this.i == null ? null : this.i.c;
    }

    @Override  // android.view.View
    public void setBackgroundDrawable(Drawable drawable0) {
        super.setBackgroundDrawable(drawable0);
        o o0 = this.j;
        if(o0 != null) {
            o0.e();
        }
    }

    @Override  // android.view.View
    public void setBackgroundResource(int v) {
        super.setBackgroundResource(v);
        o o0 = this.j;
        if(o0 != null) {
            o0.f(v);
        }
    }

    @Override  // android.widget.CompoundButton
    public void setButtonDrawable(int v) {
        this.setButtonDrawable(b.c(this.getContext(), v));
    }

    @Override  // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable0) {
        super.setButtonDrawable(drawable0);
        s s0 = this.i;
        if(s0 != null) {
            if(s0.f) {
                s0.f = false;
                return;
            }
            s0.f = true;
            s0.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList0) {
        o o0 = this.j;
        if(o0 != null) {
            o0.h(colorStateList0);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode porterDuff$Mode0) {
        o o0 = this.j;
        if(o0 != null) {
            o0.i(porterDuff$Mode0);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList0) {
        s s0 = this.i;
        if(s0 != null) {
            s0.b = colorStateList0;
            s0.d = true;
            s0.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode porterDuff$Mode0) {
        s s0 = this.i;
        if(s0 != null) {
            s0.c = porterDuff$Mode0;
            s0.e = true;
            s0.a();
        }
    }
}

