package l;

import C1.d;
import V.q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p.b;
import p.e;
import p.l;
import v.j;
import x2.w;

public final class m0 {
    public WeakHashMap a;
    public b b;
    public l c;
    public final WeakHashMap d;
    public TypedValue e;
    public boolean f;
    public d g;
    public static final PorterDuff.Mode h;
    public static m0 i;
    public static final l0 j;

    static {
        m0.h = PorterDuff.Mode.SRC_IN;
        m0.j = new l0(6);  // 初始化器: Lp/f;-><init>(I)V
    }

    public m0() {
        this.d = new WeakHashMap(0);
    }

    public final void a(String s, k0 k00) {
        if(this.b == null) {
            this.b = new b();  // 初始化器: Lp/k;-><init>()V
        }
        this.b.put(s, k00);
    }

    public final void b(Context context0, long v, Drawable drawable0) {
        synchronized(this) {
            Drawable.ConstantState drawable$ConstantState0 = drawable0.getConstantState();
            if(drawable$ConstantState0 != null) {
                e e0 = (e)this.d.get(context0);
                if(e0 == null) {
                    e0 = new e();
                    this.d.put(context0, e0);
                }
                e0.e(v, new WeakReference(drawable$ConstantState0));
            }
        }
    }

    public final Drawable c(Context context0, int v) {
        if(this.e == null) {
            this.e = new TypedValue();
        }
        Drawable drawable0 = null;
        TypedValue typedValue0 = this.e;
        context0.getResources().getValue(v, typedValue0, true);
        long v1 = ((long)typedValue0.assetCookie) << 0x20 | ((long)typedValue0.data);
        Drawable drawable1 = this.e(context0, v1);
        if(drawable1 != null) {
            return drawable1;
        }
        if(this.g != null && v == 0x7F060011) {  // drawable:abc_cab_background_top_material
            drawable0 = new LayerDrawable(new Drawable[]{this.f(context0, 0x7F060010), this.f(context0, 0x7F060012)});  // drawable:abc_cab_background_internal_bg
        }
        if(drawable0 != null) {
            drawable0.setChangingConfigurations(typedValue0.changingConfigurations);
            this.b(context0, v1, drawable0);
        }
        return drawable0;
    }

    public static m0 d() {
        synchronized(m0.class) {
            if(m0.i == null) {
                m0 m00 = new m0();
                m0.i = m00;
                if(Build.VERSION.SDK_INT < 24) {
                    m00.a("vector", new k0(2));
                    m00.a("animated-vector", new k0(1));
                    m00.a("animated-selector", new k0(0));
                }
            }
            return m0.i;
        }
    }

    public final Drawable e(Context context0, long v) {
        synchronized(this) {
            e e0 = (e)this.d.get(context0);
            if(e0 == null) {
                return null;
            }
            WeakReference weakReference0 = (WeakReference)e0.d(v, null);
            if(weakReference0 != null) {
                Drawable.ConstantState drawable$ConstantState0 = (Drawable.ConstantState)weakReference0.get();
                if(drawable$ConstantState0 != null) {
                    return drawable$ConstantState0.newDrawable(context0.getResources());
                }
                int v2 = p.d.b(e0.j, e0.l, v);
                if(v2 >= 0) {
                    Object[] arr_object = e0.k;
                    Object object0 = e.m;
                    if(arr_object[v2] != object0) {
                        arr_object[v2] = object0;
                        e0.i = true;
                    }
                }
            }
            return null;
        }
    }

    public final Drawable f(Context context0, int v) {
        synchronized(this) {
            return this.g(context0, v, false);
        }
    }

    public final Drawable g(Context context0, int v, boolean z) {
        synchronized(this) {
            if(!this.f) {
                this.f = true;
                Drawable drawable0 = this.f(context0, 0x7F060056);  // drawable:abc_vector_test
                if(drawable0 == null || !(drawable0 instanceof q) && !"android.graphics.drawable.VectorDrawable".equals(drawable0.getClass().getName())) {
                    this.f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            Drawable drawable1 = this.j(context0, v);
            if(drawable1 == null) {
                drawable1 = this.c(context0, v);
            }
            if(drawable1 == null) {
                drawable1 = j.getDrawable(context0, v);
            }
            if(drawable1 != null) {
                drawable1 = this.m(context0, v, z, drawable1);
            }
            if(drawable1 != null) {
                W.b(drawable1);
            }
            return drawable1;
        }
    }

    public static PorterDuffColorFilter h(int v, PorterDuff.Mode porterDuff$Mode0) {
        synchronized(m0.class) {
            l0 l00 = m0.j;
            l00.getClass();
            int v2 = (v + 0x1F) * 0x1F;
            PorterDuffColorFilter porterDuffColorFilter0 = (PorterDuffColorFilter)l00.get(((int)(porterDuff$Mode0.hashCode() + v2)));
            if(porterDuffColorFilter0 == null) {
                porterDuffColorFilter0 = new PorterDuffColorFilter(v, porterDuff$Mode0);
                PorterDuffColorFilter porterDuffColorFilter1 = (PorterDuffColorFilter)l00.put(((int)(porterDuff$Mode0.hashCode() + v2)), porterDuffColorFilter0);
            }
            return porterDuffColorFilter0;
        }
    }

    public final ColorStateList i(Context context0, int v) {
        ColorStateList colorStateList1;
        synchronized(this) {
            WeakHashMap weakHashMap0 = this.a;
            ColorStateList colorStateList0 = null;
            if(weakHashMap0 == null) {
                colorStateList1 = null;
            }
            else {
                l l0 = (l)weakHashMap0.get(context0);
                colorStateList1 = l0 == null ? null : ((ColorStateList)l0.d(v, null));
            }
            if(colorStateList1 == null) {
                d d0 = this.g;
                if(d0 != null) {
                    colorStateList0 = d0.w(context0, v);
                }
                if(colorStateList0 != null) {
                    if(this.a == null) {
                        this.a = new WeakHashMap();
                    }
                    l l1 = (l)this.a.get(context0);
                    if(l1 == null) {
                        l1 = new l();
                        this.a.put(context0, l1);
                    }
                    l1.a(v, colorStateList0);
                }
                colorStateList1 = colorStateList0;
            }
            return colorStateList1;
        }
    }

    public final Drawable j(Context context0, int v) {
        if(this.b != null && !this.b.isEmpty()) {
            l l0 = this.c;
            if(l0 == null) {
                this.c = new l();
            }
            else {
                String s = (String)l0.d(v, null);
                if("appcompat_skip_skip".equals(s) || s != null && this.b.getOrDefault(s, null) == null) {
                    return null;
                }
            }
            if(this.e == null) {
                this.e = new TypedValue();
            }
            TypedValue typedValue0 = this.e;
            Resources resources0 = context0.getResources();
            resources0.getValue(v, typedValue0, true);
            long v1 = ((long)typedValue0.assetCookie) << 0x20 | ((long)typedValue0.data);
            Drawable drawable0 = this.e(context0, v1);
            if(drawable0 != null) {
                return drawable0;
            }
            if(typedValue0.string != null && typedValue0.string.toString().endsWith(".xml")) {
                try {
                    XmlResourceParser xmlResourceParser0 = resources0.getXml(v);
                    AttributeSet attributeSet0 = Xml.asAttributeSet(xmlResourceParser0);
                    do {
                        int v2 = xmlResourceParser0.next();
                    }
                    while(v2 != 1 && v2 != 2);
                    if(v2 != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    String s1 = xmlResourceParser0.getName();
                    this.c.a(v, s1);
                    k0 k00 = (k0)this.b.getOrDefault(s1, null);
                    if(k00 != null) {
                        drawable0 = k00.a(context0, xmlResourceParser0, attributeSet0, context0.getTheme());
                    }
                    if(drawable0 != null) {
                        drawable0.setChangingConfigurations(typedValue0.changingConfigurations);
                        this.b(context0, v1, drawable0);
                    }
                    goto label_34;
                }
                catch(Exception exception0) {
                }
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", exception0);
            }
        label_34:
            if(drawable0 == null) {
                this.c.a(v, "appcompat_skip_skip");
            }
            return drawable0;
        }
        return null;
    }

    public final void k(Context context0) {
        synchronized(this) {
            e e0 = (e)this.d.get(context0);
            if(e0 != null) {
                int v1 = e0.l;
                Object[] arr_object = e0.k;
                for(int v2 = 0; v2 < v1; ++v2) {
                    arr_object[v2] = null;
                }
                e0.l = 0;
                e0.i = false;
            }
        }
    }

    public final void l(d d0) {
        synchronized(this) {
            this.g = d0;
        }
    }

    public final Drawable m(Context context0, int v, boolean z, Drawable drawable0) {
        PorterDuffColorFilter porterDuffColorFilter0;
        boolean z2;
        int v2;
        int v1;
        ColorStateList colorStateList0 = this.i(context0, v);
        PorterDuff.Mode porterDuff$Mode0 = null;
        if(colorStateList0 != null) {
            if(W.a(drawable0)) {
                drawable0 = drawable0.mutate();
            }
            drawable0 = w.B(drawable0);
            drawable0.setTintList(colorStateList0);
            if(this.g != null && v == 0x7F060046) {  // drawable:abc_switch_thumb_material
                porterDuff$Mode0 = PorterDuff.Mode.MULTIPLY;
            }
            if(porterDuff$Mode0 != null) {
                drawable0.setTintMode(porterDuff$Mode0);
                return drawable0;
            }
            return drawable0;
        }
        if(this.g != null) {
            switch(v) {
                case 0x7F060039:   // drawable:abc_ratingbar_indicator_material
                case 0x7F06003A:   // drawable:abc_ratingbar_material
                case 0x7F06003B: {  // drawable:abc_ratingbar_small_material
                    d.F(((LayerDrawable)drawable0).findDrawableByLayerId(0x1020000), A0.a(context0, 0x7F02005C), t.b);  // attr:colorControlNormal
                    d.F(((LayerDrawable)drawable0).findDrawableByLayerId(0x102000F), A0.b(context0, 0x7F02005A), t.b);  // attr:colorControlActivated
                    d.F(((LayerDrawable)drawable0).findDrawableByLayerId(0x102000D), A0.b(context0, 0x7F02005A), t.b);  // attr:colorControlActivated
                    return drawable0;
                }
                case 0x7F060043: {  // drawable:abc_seekbar_track_material
                    d.F(((LayerDrawable)drawable0).findDrawableByLayerId(0x1020000), A0.b(context0, 0x7F02005C), t.b);  // attr:colorControlNormal
                    d.F(((LayerDrawable)drawable0).findDrawableByLayerId(0x102000F), A0.b(context0, 0x7F02005C), t.b);  // attr:colorControlNormal
                    d.F(((LayerDrawable)drawable0).findDrawableByLayerId(0x102000D), A0.b(context0, 0x7F02005A), t.b);  // attr:colorControlActivated
                    return drawable0;
                }
            }
        }
        d d0 = this.g;
        boolean z1 = false;
        if(d0 != null) {
            PorterDuff.Mode porterDuff$Mode1 = t.b;
            if(d.n(((int[])d0.i), v)) {
                v1 = 0x7F02005C;  // attr:colorControlNormal
                v2 = -1;
                z2 = true;
            }
            else if(d.n(((int[])d0.k), v)) {
                v1 = 0x7F02005A;  // attr:colorControlActivated
                v2 = -1;
                z2 = true;
            }
            else if(d.n(((int[])d0.l), v)) {
                porterDuff$Mode1 = PorterDuff.Mode.MULTIPLY;
                v1 = 0x1010031;
                v2 = -1;
                z2 = true;
            }
            else {
                switch(v) {
                    case 0x7F060014: {  // drawable:abc_dialog_material_background
                        v1 = 0x1010031;
                        v2 = -1;
                        z2 = true;
                        break;
                    }
                    case 0x7F06002C: {
                        v2 = 41;
                        v1 = 0x1010030;
                        z2 = true;
                        break;
                    }
                    default: {
                        v1 = 0;
                        v2 = -1;
                        z2 = false;
                    }
                }
            }
            if(z2) {
                Drawable drawable1 = W.a(drawable0) ? drawable0.mutate() : drawable0;
                int v3 = A0.b(context0, v1);
                synchronized(t.class) {
                    porterDuffColorFilter0 = m0.h(v3, porterDuff$Mode1);
                }
                drawable1.setColorFilter(porterDuffColorFilter0);
                if(v2 != -1) {
                    drawable1.setAlpha(v2);
                }
                z1 = true;
            }
        }
        return z1 || !z ? drawable0 : null;
    }
}

