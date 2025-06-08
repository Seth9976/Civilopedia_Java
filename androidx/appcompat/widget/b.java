package androidx.appcompat.widget;

import Z1.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import com.google.android.gms.internal.ads.l5;
import e.a;
import l.E;
import l.F;
import l.G;
import l.J;
import l.K;
import l.o;

public final class b extends Spinner {
    public final o i;
    public final Context j;
    public final E k;
    public SpinnerAdapter l;
    public final boolean m;
    public final K n;
    public int o;
    public final Rect p;
    public static final int[] q;

    static {
        b.q = new int[]{0x10102F1};
    }

    public b(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0, 0x7F020138);  // attr:spinnerStyle
        TypedArray typedArray2;
        TypedArray typedArray1;
        int v1;
        this.p = new Rect();
        int[] arr_v = a.v;
        B1.a a0 = B1.a.A(context0, attributeSet0, arr_v, 0x7F020138);  // attr:spinnerStyle
        this.i = new o(this);
        TypedArray typedArray0 = (TypedArray)a0.k;
        int v = typedArray0.getResourceId(4, 0);
        this.j = v == 0 ? context0 : new j.b(context0, v);
        try {
            v1 = -1;
            typedArray1 = null;
            typedArray2 = null;
            typedArray2 = context0.obtainStyledAttributes(attributeSet0, b.q, 0x7F020138, 0);  // attr:spinnerStyle
            goto label_18;
        }
        catch(Exception exception0) {
            goto label_22;
        }
        catch(Throwable throwable0) {
        }
        goto label_27;
        try {
            try {
            label_18:
                if(typedArray2.hasValue(0)) {
                    v1 = typedArray2.getInt(0, 0);
                    goto label_30;
                }
                else {
                    goto label_32;
                }
            }
            catch(Exception exception0) {
            label_22:
                Log.i("AppCompatSpinner", "Could not read android:spinnerMode", exception0);
                if(typedArray2 != null) {
                    goto label_30;
                }
            }
            goto label_33;
        }
        catch(Throwable throwable0) {
            typedArray1 = typedArray2;
        }
    label_27:
        if(typedArray1 != null) {
            typedArray1.recycle();
        }
        throw throwable0;
    label_30:
        typedArray2.recycle();
        goto label_33;
    label_32:
        typedArray2.recycle();
    label_33:
        switch(v1) {
            case 0: {
                F f0 = new F(this);
                this.n = f0;
                f0.k = typedArray0.getString(2);
                break;
            }
            case 1: {
                J j0 = new J(this, this.j, attributeSet0);
                B1.a a1 = B1.a.A(this.j, attributeSet0, arr_v, 0x7F020138);  // attr:spinnerStyle
                this.o = ((TypedArray)a1.k).getLayoutDimension(3, -2);
                j0.g(a1.o(1));
                j0.K = typedArray0.getString(2);
                a1.C();
                this.n = j0;
                this.k = new E(this, this, j0);
            }
        }
        CharSequence[] arr_charSequence = typedArray0.getTextArray(0);
        if(arr_charSequence != null) {
            ArrayAdapter arrayAdapter0 = new ArrayAdapter(context0, 0x1090008, arr_charSequence);
            arrayAdapter0.setDropDownViewResource(0x7F0A006A);  // layout:support_simple_spinner_dropdown_item
            this.setAdapter(arrayAdapter0);
        }
        a0.C();
        this.m = true;
        SpinnerAdapter spinnerAdapter0 = this.l;
        if(spinnerAdapter0 != null) {
            this.setAdapter(spinnerAdapter0);
            this.l = null;
        }
        this.i.d(attributeSet0, 0x7F020138);  // attr:spinnerStyle
    }

    public final int a(SpinnerAdapter spinnerAdapter0, Drawable drawable0) {
        int v = 0;
        if(spinnerAdapter0 == null) {
            return 0;
        }
        int v1 = View.MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0);
        int v2 = View.MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0);
        int v3 = Math.max(0, this.getSelectedItemPosition());
        int v4 = Math.min(spinnerAdapter0.getCount(), v3 + 15);
        int v5 = Math.max(0, v4 - 15);
        View view0 = null;
        int v6 = 0;
        while(v5 < v4) {
            int v7 = spinnerAdapter0.getItemViewType(v5);
            if(v7 != v) {
                view0 = null;
                v = v7;
            }
            view0 = spinnerAdapter0.getView(v5, view0, this);
            if(view0.getLayoutParams() == null) {
                view0.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view0.measure(v1, v2);
            v6 = Math.max(v6, view0.getMeasuredWidth());
            ++v5;
        }
        if(drawable0 != null) {
            drawable0.getPadding(this.p);
            return v6 + (this.p.left + this.p.right);
        }
        return v6;
    }

    @Override  // android.view.ViewGroup
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o o0 = this.i;
        if(o0 != null) {
            o0.a();
        }
    }

    @Override  // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        return this.n == null ? super.getDropDownHorizontalOffset() : this.n.a();
    }

    @Override  // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        return this.n == null ? super.getDropDownVerticalOffset() : this.n.n();
    }

    @Override  // android.widget.Spinner
    public int getDropDownWidth() {
        return this.n == null ? super.getDropDownWidth() : this.o;
    }

    public final K getInternalPopup() {
        return this.n;
    }

    @Override  // android.widget.Spinner
    public Drawable getPopupBackground() {
        return this.n == null ? super.getPopupBackground() : this.n.d();
    }

    @Override  // android.widget.Spinner
    public Context getPopupContext() {
        return this.j;
    }

    @Override  // android.widget.Spinner
    public CharSequence getPrompt() {
        return this.n == null ? super.getPrompt() : this.n.o();
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.i == null ? null : this.i.b();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.i == null ? null : this.i.c();
    }

    @Override  // android.widget.Spinner
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        K k0 = this.n;
        if(k0 != null && k0.b()) {
            k0.dismiss();
        }
    }

    @Override  // android.widget.Spinner
    public final void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(this.n != null && View.MeasureSpec.getMode(v) == 0x80000000) {
            this.setMeasuredDimension(Math.min(Math.max(this.getMeasuredWidth(), this.a(this.getAdapter(), this.getBackground())), View.MeasureSpec.getSize(v)), this.getMeasuredHeight());
        }
    }

    @Override  // android.widget.Spinner
    public final void onRestoreInstanceState(Parcelable parcelable0) {
        super.onRestoreInstanceState(((AppCompatSpinner.SavedState)parcelable0).getSuperState());
        if(((AppCompatSpinner.SavedState)parcelable0).i) {
            ViewTreeObserver viewTreeObserver0 = this.getViewTreeObserver();
            if(viewTreeObserver0 != null) {
                viewTreeObserver0.addOnGlobalLayoutListener(new f(this, 3));
            }
        }
    }

    @Override  // android.widget.Spinner
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new AppCompatSpinner.SavedState(super.onSaveInstanceState());  // 初始化器: Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V
        parcelable0.i = this.n != null && this.n.b();
        return parcelable0;
    }

    @Override  // android.widget.Spinner
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        return this.k == null || !this.k.onTouch(this, motionEvent0) ? super.onTouchEvent(motionEvent0) : true;
    }

    @Override  // android.widget.Spinner
    public final boolean performClick() {
        K k0 = this.n;
        if(k0 != null) {
            if(!k0.b()) {
                int v = this.getTextDirection();
                int v1 = this.getTextAlignment();
                this.n.m(v, v1);
            }
            return true;
        }
        return super.performClick();
    }

    @Override  // android.widget.Spinner
    public void setAdapter(Adapter adapter0) {
        this.setAdapter(((SpinnerAdapter)adapter0));
    }

    @Override  // android.widget.Spinner
    public void setAdapter(SpinnerAdapter spinnerAdapter0) {
        if(!this.m) {
            this.l = spinnerAdapter0;
            return;
        }
        super.setAdapter(spinnerAdapter0);
        K k0 = this.n;
        if(k0 != null) {
            Resources.Theme resources$Theme0 = (this.j == null ? this.getContext() : this.j).getTheme();
            G g0 = new G();  // 初始化器: Ljava/lang/Object;-><init>()V
            g0.i = spinnerAdapter0;
            if(spinnerAdapter0 instanceof ListAdapter) {
                g0.j = (ListAdapter)spinnerAdapter0;
            }
            if(resources$Theme0 != null && Build.VERSION.SDK_INT >= 23 && l5.A(spinnerAdapter0) && ((ThemedSpinnerAdapter)spinnerAdapter0).getDropDownViewTheme() != resources$Theme0) {
                ((ThemedSpinnerAdapter)spinnerAdapter0).setDropDownViewTheme(resources$Theme0);
            }
            k0.p(g0);
        }
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

    @Override  // android.widget.Spinner
    public void setDropDownHorizontalOffset(int v) {
        K k0 = this.n;
        if(k0 != null) {
            k0.k(v);
            k0.l(v);
            return;
        }
        super.setDropDownHorizontalOffset(v);
    }

    @Override  // android.widget.Spinner
    public void setDropDownVerticalOffset(int v) {
        K k0 = this.n;
        if(k0 != null) {
            k0.i(v);
            return;
        }
        super.setDropDownVerticalOffset(v);
    }

    @Override  // android.widget.Spinner
    public void setDropDownWidth(int v) {
        if(this.n != null) {
            this.o = v;
            return;
        }
        super.setDropDownWidth(v);
    }

    @Override  // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable0) {
        K k0 = this.n;
        if(k0 != null) {
            k0.g(drawable0);
            return;
        }
        super.setPopupBackgroundDrawable(drawable0);
    }

    @Override  // android.widget.Spinner
    public void setPopupBackgroundResource(int v) {
        this.setPopupBackgroundDrawable(g.b.c(this.getPopupContext(), v));
    }

    @Override  // android.widget.Spinner
    public void setPrompt(CharSequence charSequence0) {
        K k0 = this.n;
        if(k0 != null) {
            k0.f(charSequence0);
            return;
        }
        super.setPrompt(charSequence0);
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
}

