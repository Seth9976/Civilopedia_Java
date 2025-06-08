package l;

import B1.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import g.b;

public final class x extends MultiAutoCompleteTextView {
    public final o i;
    public final M j;
    public static final int[] k;

    static {
        x.k = new int[]{0x1010176};
    }

    public x(Context context0, AttributeSet attributeSet0) {
        B0.a(context0);
        super(context0, attributeSet0, 0x7F020031);  // attr:autoCompleteTextViewStyle
        a a0 = a.A(this.getContext(), attributeSet0, x.k, 0x7F020031);  // attr:autoCompleteTextViewStyle
        if(((TypedArray)a0.k).hasValue(0)) {
            this.setDropDownBackgroundDrawable(a0.o(0));
        }
        a0.C();
        o o0 = new o(this);
        this.i = o0;
        o0.d(attributeSet0, 0x7F020031);  // attr:autoCompleteTextViewStyle
        M m0 = new M(this);
        this.j = m0;
        m0.d(attributeSet0, 0x7F020031);  // attr:autoCompleteTextViewStyle
        m0.b();
    }

    @Override  // android.widget.TextView
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o o0 = this.i;
        if(o0 != null) {
            o0.a();
        }
        M m0 = this.j;
        if(m0 != null) {
            m0.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.i == null ? null : this.i.b();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.i == null ? null : this.i.c();
    }

    @Override  // android.widget.TextView
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo0) {
        InputConnection inputConnection0 = super.onCreateInputConnection(editorInfo0);
        o1.a.J(inputConnection0, editorInfo0, this);
        return inputConnection0;
    }

    @Override  // android.view.View
    public void setBackgroundDrawable(Drawable drawable0) {
        super.setBackgroundDrawable(drawable0);
        o o0 = this.i;
        if(o0 != null) {
            o0.e();
        }
    }

    @Override  // android.view.View
    public void setBackgroundResource(int v) {
        super.setBackgroundResource(v);
        o o0 = this.i;
        if(o0 != null) {
            o0.f(v);
        }
    }

    @Override  // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int v) {
        this.setDropDownBackgroundDrawable(b.c(this.getContext(), v));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList0) {
        o o0 = this.i;
        if(o0 != null) {
            o0.h(colorStateList0);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode porterDuff$Mode0) {
        o o0 = this.i;
        if(o0 != null) {
            o0.i(porterDuff$Mode0);
        }
    }

    @Override  // android.widget.TextView
    public final void setTextAppearance(Context context0, int v) {
        super.setTextAppearance(context0, v);
        M m0 = this.j;
        if(m0 != null) {
            m0.e(context0, v);
        }
    }
}

