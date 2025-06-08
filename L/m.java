package l;

import B1.a;
import G.b;
import G.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Locale;

public final class M {
    public final TextView a;
    public C0 b;
    public C0 c;
    public C0 d;
    public C0 e;
    public C0 f;
    public C0 g;
    public C0 h;
    public final P i;
    public int j;
    public int k;
    public Typeface l;
    public boolean m;

    public M(TextView textView0) {
        this.j = 0;
        this.k = -1;
        this.a = textView0;
        this.i = new P(textView0);
    }

    public final void a(Drawable drawable0, C0 c00) {
        if(drawable0 != null && c00 != null) {
            t.d(drawable0, c00, this.a.getDrawableState());
        }
    }

    public final void b() {
        TextView textView0 = this.a;
        if(this.b != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] arr_drawable = textView0.getCompoundDrawables();
            this.a(arr_drawable[0], this.b);
            this.a(arr_drawable[1], this.c);
            this.a(arr_drawable[2], this.d);
            this.a(arr_drawable[3], this.e);
        }
        if(this.f != null || this.g != null) {
            Drawable[] arr_drawable1 = textView0.getCompoundDrawablesRelative();
            this.a(arr_drawable1[0], this.f);
            this.a(arr_drawable1[2], this.g);
        }
    }

    public static C0 c(Context context0, t t0, int v) {
        ColorStateList colorStateList0;
        synchronized(t0) {
            colorStateList0 = t0.a.i(context0, v);
        }
        if(colorStateList0 != null) {
            C0 c00 = new C0();  // 初始化器: Ljava/lang/Object;-><init>()V
            c00.d = true;
            c00.a = colorStateList0;
            return c00;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet0, int v) {
        ColorStateList colorStateList3;
        boolean z2;
        String s1;
        String s;
        ColorStateList colorStateList2;
        ColorStateList colorStateList1;
        ColorStateList colorStateList0;
        boolean z1;
        boolean z;
        TextView textView0 = this.a;
        Context context0 = textView0.getContext();
        t t0 = t.a();
        a a0 = a.A(context0, attributeSet0, e.a.h, v);
        TypedArray typedArray0 = (TypedArray)a0.k;
        int v1 = typedArray0.getResourceId(0, -1);
        if(typedArray0.hasValue(3)) {
            this.b = M.c(context0, t0, typedArray0.getResourceId(3, 0));
        }
        if(typedArray0.hasValue(1)) {
            this.c = M.c(context0, t0, typedArray0.getResourceId(1, 0));
        }
        if(typedArray0.hasValue(4)) {
            this.d = M.c(context0, t0, typedArray0.getResourceId(4, 0));
        }
        if(typedArray0.hasValue(2)) {
            this.e = M.c(context0, t0, typedArray0.getResourceId(2, 0));
        }
        int v2 = Build.VERSION.SDK_INT;
        if(typedArray0.hasValue(5)) {
            this.f = M.c(context0, t0, typedArray0.getResourceId(5, 0));
        }
        if(typedArray0.hasValue(6)) {
            this.g = M.c(context0, t0, typedArray0.getResourceId(6, 0));
        }
        a0.C();
        TransformationMethod transformationMethod0 = textView0.getTransformationMethod();
        int[] arr_v = e.a.w;
        if(v1 == -1) {
            s1 = null;
            z1 = false;
            z = false;
            colorStateList0 = null;
            colorStateList1 = null;
            colorStateList2 = null;
            s = null;
        }
        else {
            TypedArray typedArray1 = context0.obtainStyledAttributes(v1, arr_v);
            a a1 = new a(context0, typedArray1);
            if(transformationMethod0 instanceof PasswordTransformationMethod || !typedArray1.hasValue(14)) {
                z1 = false;
                z = false;
            }
            else {
                z = typedArray1.getBoolean(14, false);
                z1 = true;
            }
            this.i(context0, a1);
            if(v2 < 23) {
                colorStateList0 = typedArray1.hasValue(3) ? a1.n(3) : null;
                colorStateList1 = typedArray1.hasValue(4) ? a1.n(4) : null;
                colorStateList2 = typedArray1.hasValue(5) ? a1.n(5) : null;
            }
            else {
                colorStateList0 = null;
                colorStateList1 = null;
                colorStateList2 = null;
            }
            s = typedArray1.hasValue(15) ? typedArray1.getString(15) : null;
            s1 = v2 < 26 || !typedArray1.hasValue(13) ? null : typedArray1.getString(13);
            a1.C();
        }
        TypedArray typedArray2 = context0.obtainStyledAttributes(attributeSet0, arr_v, v, 0);
        a a2 = new a(context0, typedArray2);
        if(transformationMethod0 instanceof PasswordTransformationMethod || !typedArray2.hasValue(14)) {
            z2 = z;
        }
        else {
            z2 = typedArray2.getBoolean(14, false);
            z1 = true;
        }
        if(v2 < 23) {
            if(typedArray2.hasValue(3)) {
                colorStateList0 = a2.n(3);
            }
            if(typedArray2.hasValue(4)) {
                colorStateList1 = a2.n(4);
            }
            if(typedArray2.hasValue(5)) {
                colorStateList2 = a2.n(5);
            }
        }
        if(typedArray2.hasValue(15)) {
            s = typedArray2.getString(15);
        }
        String s2 = v2 < 26 || !typedArray2.hasValue(13) ? s1 : typedArray2.getString(13);
        if(v2 >= 28 && typedArray2.hasValue(0) && typedArray2.getDimensionPixelSize(0, -1) == 0) {
            textView0.setTextSize(0, 0.0f);
        }
        this.i(context0, a2);
        a2.C();
        if(colorStateList0 != null) {
            textView0.setTextColor(colorStateList0);
        }
        if(colorStateList1 != null) {
            textView0.setHintTextColor(colorStateList1);
        }
        if(colorStateList2 != null) {
            textView0.setLinkTextColor(colorStateList2);
        }
        if(!(transformationMethod0 instanceof PasswordTransformationMethod) && z1) {
            textView0.setAllCaps(z2);
        }
        Typeface typeface0 = this.l;
        if(typeface0 != null) {
            if(this.k == -1) {
                textView0.setTypeface(typeface0, this.j);
            }
            else {
                textView0.setTypeface(typeface0);
            }
        }
        if(s2 != null) {
            textView0.setFontVariationSettings(s2);
        }
        if(s != null) {
            if(v2 >= 24) {
                textView0.setTextLocales(LocaleList.forLanguageTags(s));
            }
            else {
                textView0.setTextLocale(Locale.forLanguageTag(s.substring(0, s.indexOf(44))));
            }
        }
        int[] arr_v1 = e.a.i;
        P p0 = this.i;
        Context context1 = p0.j;
        TypedArray typedArray3 = context1.obtainStyledAttributes(attributeSet0, arr_v1, v, 0);
        if(typedArray3.hasValue(5)) {
            p0.a = typedArray3.getInt(5, 0);
        }
        float f = typedArray3.hasValue(4) ? typedArray3.getDimension(4, -1.0f) : -1.0f;
        float f1 = typedArray3.hasValue(2) ? typedArray3.getDimension(2, -1.0f) : -1.0f;
        float f2 = typedArray3.hasValue(1) ? typedArray3.getDimension(1, -1.0f) : -1.0f;
        if(typedArray3.hasValue(3)) {
            int v3 = typedArray3.getResourceId(3, 0);
            if(v3 > 0) {
                TypedArray typedArray4 = typedArray3.getResources().obtainTypedArray(v3);
                int v4 = typedArray4.length();
                int[] arr_v2 = new int[v4];
                if(v4 > 0) {
                    for(int v5 = 0; v5 < v4; ++v5) {
                        arr_v2[v5] = typedArray4.getDimensionPixelSize(v5, -1);
                    }
                    p0.f = P.b(arr_v2);
                    p0.i();
                }
                typedArray4.recycle();
            }
        }
        typedArray3.recycle();
        if(!p0.j()) {
            p0.a = 0;
        }
        else if(p0.a == 1) {
            if(!p0.g) {
                DisplayMetrics displayMetrics0 = context1.getResources().getDisplayMetrics();
                if(f1 == -1.0f) {
                    f1 = TypedValue.applyDimension(2, 12.0f, displayMetrics0);
                }
                if(f2 == -1.0f) {
                    f2 = TypedValue.applyDimension(2, 112.0f, displayMetrics0);
                }
                if(f == -1.0f) {
                    f = 1.0f;
                }
                p0.k(f1, f2, f);
            }
            p0.h();
        }
        if(b.a && p0.a != 0) {
            int[] arr_v3 = p0.f;
            if(arr_v3.length > 0) {
                if(((float)textView0.getAutoSizeStepGranularity()) == -1.0f) {
                    c0.b.s(textView0, arr_v3);
                }
                else {
                    c0.b.q(textView0, Math.round(p0.d), Math.round(p0.e), Math.round(p0.c));
                }
            }
        }
        TypedArray typedArray5 = context0.obtainStyledAttributes(attributeSet0, arr_v1);
        int v6 = typedArray5.getResourceId(8, -1);
        Drawable drawable0 = v6 == -1 ? null : t0.b(context0, v6);
        int v7 = typedArray5.getResourceId(13, -1);
        Drawable drawable1 = v7 == -1 ? null : t0.b(context0, v7);
        int v8 = typedArray5.getResourceId(9, -1);
        Drawable drawable2 = v8 == -1 ? null : t0.b(context0, v8);
        int v9 = typedArray5.getResourceId(6, -1);
        Drawable drawable3 = v9 == -1 ? null : t0.b(context0, v9);
        int v10 = typedArray5.getResourceId(10, -1);
        Drawable drawable4 = v10 == -1 ? null : t0.b(context0, v10);
        int v11 = typedArray5.getResourceId(7, -1);
        Drawable drawable5 = v11 == -1 ? null : t0.b(context0, v11);
        if(drawable4 != null || drawable5 != null) {
            Drawable[] arr_drawable2 = textView0.getCompoundDrawablesRelative();
            if(drawable4 == null) {
                drawable4 = arr_drawable2[0];
            }
            if(drawable1 == null) {
                drawable1 = arr_drawable2[1];
            }
            if(drawable5 == null) {
                drawable5 = arr_drawable2[2];
            }
            if(drawable3 == null) {
                drawable3 = arr_drawable2[3];
            }
            textView0.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable4, drawable1, drawable5, drawable3);
        }
        else if(drawable0 != null || drawable1 != null || drawable2 != null || drawable3 != null) {
            Drawable[] arr_drawable = textView0.getCompoundDrawablesRelative();
            Drawable drawable6 = arr_drawable[0];
            if(drawable6 != null || arr_drawable[2] != null) {
                if(drawable1 == null) {
                    drawable1 = arr_drawable[1];
                }
                Drawable drawable7 = arr_drawable[2];
                if(drawable3 == null) {
                    drawable3 = arr_drawable[3];
                }
                textView0.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable6, drawable1, drawable7, drawable3);
            }
            else {
                Drawable[] arr_drawable1 = textView0.getCompoundDrawables();
                if(drawable0 == null) {
                    drawable0 = arr_drawable1[0];
                }
                if(drawable1 == null) {
                    drawable1 = arr_drawable1[1];
                }
                if(drawable2 == null) {
                    drawable2 = arr_drawable1[2];
                }
                if(drawable3 == null) {
                    drawable3 = arr_drawable1[3];
                }
                textView0.setCompoundDrawablesWithIntrinsicBounds(drawable0, drawable1, drawable2, drawable3);
            }
        }
        if(typedArray5.hasValue(11)) {
            if(typedArray5.hasValue(11)) {
                int v12 = typedArray5.getResourceId(11, 0);
                if(v12 == 0) {
                    colorStateList3 = typedArray5.getColorStateList(11);
                }
                else {
                    colorStateList3 = g.b.b(context0, v12);
                    if(colorStateList3 == null) {
                        colorStateList3 = typedArray5.getColorStateList(11);
                    }
                }
            }
            else {
                colorStateList3 = typedArray5.getColorStateList(11);
            }
            if(Build.VERSION.SDK_INT >= 24) {
                textView0.setCompoundDrawableTintList(colorStateList3);
            }
            else if(textView0 instanceof g) {
                ((g)textView0).setSupportCompoundDrawablesTintList(colorStateList3);
            }
        }
        if(typedArray5.hasValue(12)) {
            PorterDuff.Mode porterDuff$Mode0 = W.c(typedArray5.getInt(12, -1), null);
            if(Build.VERSION.SDK_INT >= 24) {
                textView0.setCompoundDrawableTintMode(porterDuff$Mode0);
            }
            else if(textView0 instanceof g) {
                ((g)textView0).setSupportCompoundDrawablesTintMode(porterDuff$Mode0);
            }
        }
        int v13 = typedArray5.getDimensionPixelSize(14, -1);
        int v14 = typedArray5.getDimensionPixelSize(17, -1);
        int v15 = typedArray5.getDimensionPixelSize(18, -1);
        typedArray5.recycle();
        if(v13 != -1) {
            android.support.v4.media.session.a.N(textView0, v13);
        }
        if(v14 != -1) {
            android.support.v4.media.session.a.O(textView0, v14);
        }
        if(v15 != -1) {
            if(v15 < 0) {
                throw new IllegalArgumentException();
            }
            int v16 = textView0.getPaint().getFontMetricsInt(null);
            if(v15 != v16) {
                textView0.setLineSpacing(((float)(v15 - v16)), 1.0f);
            }
        }
    }

    public final void e(Context context0, int v) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(v, e.a.w);
        a a0 = new a(context0, typedArray0);
        boolean z = typedArray0.hasValue(14);
        TextView textView0 = this.a;
        if(z) {
            textView0.setAllCaps(typedArray0.getBoolean(14, false));
        }
        int v1 = Build.VERSION.SDK_INT;
        if(v1 < 23 && typedArray0.hasValue(3)) {
            ColorStateList colorStateList0 = a0.n(3);
            if(colorStateList0 != null) {
                textView0.setTextColor(colorStateList0);
            }
        }
        if(typedArray0.hasValue(0) && typedArray0.getDimensionPixelSize(0, -1) == 0) {
            textView0.setTextSize(0, 0.0f);
        }
        this.i(context0, a0);
        if(v1 >= 26 && typedArray0.hasValue(13)) {
            String s = typedArray0.getString(13);
            if(s != null) {
                textView0.setFontVariationSettings(s);
            }
        }
        a0.C();
        Typeface typeface0 = this.l;
        if(typeface0 != null) {
            textView0.setTypeface(typeface0, this.j);
        }
    }

    public final void f(int v, int v1, int v2, int v3) {
        P p0 = this.i;
        if(p0.j()) {
            DisplayMetrics displayMetrics0 = p0.j.getResources().getDisplayMetrics();
            p0.k(TypedValue.applyDimension(v3, ((float)v), displayMetrics0), TypedValue.applyDimension(v3, ((float)v1), displayMetrics0), TypedValue.applyDimension(v3, ((float)v2), displayMetrics0));
            if(p0.h()) {
                p0.a();
            }
        }
    }

    public final void g(int[] arr_v, int v) {
        P p0 = this.i;
        if(p0.j()) {
            if(arr_v.length > 0) {
                int[] arr_v1 = new int[arr_v.length];
                if(v == 0) {
                    arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
                }
                else {
                    DisplayMetrics displayMetrics0 = p0.j.getResources().getDisplayMetrics();
                    for(int v1 = 0; v1 < arr_v.length; ++v1) {
                        arr_v1[v1] = Math.round(TypedValue.applyDimension(v, ((float)arr_v[v1]), displayMetrics0));
                    }
                }
                p0.f = P.b(arr_v1);
                if(!p0.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(arr_v));
                }
            }
            else {
                p0.g = false;
            }
            if(p0.h()) {
                p0.a();
            }
        }
    }

    public final void h(int v) {
        P p0 = this.i;
        if(p0.j()) {
            switch(v) {
                case 0: {
                    p0.a = 0;
                    p0.d = -1.0f;
                    p0.e = -1.0f;
                    p0.c = -1.0f;
                    p0.f = new int[0];
                    p0.b = false;
                    return;
                }
                case 1: {
                    DisplayMetrics displayMetrics0 = p0.j.getResources().getDisplayMetrics();
                    p0.k(TypedValue.applyDimension(2, 12.0f, displayMetrics0), TypedValue.applyDimension(2, 112.0f, displayMetrics0), 1.0f);
                    if(p0.h()) {
                        p0.a();
                        return;
                    }
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unknown auto-size text type: " + v);
                }
            }
        }
    }

    public final void i(Context context0, a a0) {
        int v = this.j;
        TypedArray typedArray0 = (TypedArray)a0.k;
        this.j = typedArray0.getInt(2, v);
        int v1 = Build.VERSION.SDK_INT;
        if(v1 >= 28) {
            int v2 = typedArray0.getInt(11, -1);
            this.k = v2;
            if(v2 != -1) {
                this.j &= 2;
            }
        }
        int v3 = 10;
        boolean z = false;
        if(!typedArray0.hasValue(10) && !typedArray0.hasValue(12)) {
            if(typedArray0.hasValue(1)) {
                this.m = false;
                int v4 = typedArray0.getInt(1, 1);
                switch(v4) {
                    case 1: {
                        this.l = Typeface.SANS_SERIF;
                        break;
                    }
                    case 2: {
                        this.l = Typeface.SERIF;
                        return;
                    label_19:
                        if(v4 == 3) {
                            this.l = Typeface.MONOSPACE;
                            return;
                        }
                        break;
                    }
                    default: {
                        goto label_19;
                    }
                }
            }
            return;
        }
        this.l = null;
        if(typedArray0.hasValue(12)) {
            v3 = 12;
        }
        int v5 = this.k;
        int v6 = this.j;
        if(!context0.isRestricted()) {
            L l0 = new L(this, v5, v6);
            try {
                Typeface typeface0 = a0.q(v3, this.j, l0);
                if(typeface0 != null) {
                    this.l = v1 < 28 || this.k == -1 ? typeface0 : Typeface.create(Typeface.create(typeface0, 0), this.k, (this.j & 2) != 0);
                }
                this.m = this.l == null;
            }
            catch(UnsupportedOperationException | Resources.NotFoundException unused_ex) {
            }
        }
        if(this.l == null) {
            String s = typedArray0.getString(v3);
            if(s != null) {
                if(Build.VERSION.SDK_INT >= 28 && this.k != -1) {
                    Typeface typeface1 = Typeface.create(s, 0);
                    int v7 = this.k;
                    if((this.j & 2) != 0) {
                        z = true;
                    }
                    this.l = Typeface.create(typeface1, v7, z);
                    return;
                }
                this.l = Typeface.create(s, this.j);
            }
        }
    }
}

