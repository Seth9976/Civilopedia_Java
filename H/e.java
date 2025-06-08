package h;

import V.q;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import l.m0;
import o2.G;
import org.xmlpull.v1.XmlPullParserException;
import y.a;
import z1.a0;

public final class e extends f implements a {
    public int A;
    public boolean B;
    public b v;
    public boolean w;
    public b x;
    public a0 y;
    public int z;

    public e(b b0, Resources resources0) {
        this.m = 0xFF;
        this.o = -1;
        this.z = -1;
        this.A = -1;
        this.d(new b(b0, this, resources0));
        this.onStateChange(this.getState());
        this.jumpToCurrentState();
    }

    @Override  // h.f
    public final void applyTheme(Resources.Theme resources$Theme0) {
        super.applyTheme(resources$Theme0);
        this.onStateChange(this.getState());
    }

    @Override  // h.f
    public final void d(b b0) {
        this.i = b0;
        int v = this.o;
        if(v >= 0) {
            Drawable drawable0 = b0.d(v);
            this.k = drawable0;
            if(drawable0 != null) {
                this.b(drawable0);
            }
        }
        this.l = null;
        this.v = b0;
        this.x = b0;
    }

    public static e e(Context context0, Resources resources0, XmlResourceParser xmlResourceParser0, AttributeSet attributeSet0, Resources.Theme resources$Theme0) {
        String s = xmlResourceParser0.getName();
        if(!s.equals("animated-selector")) {
            throw new XmlPullParserException(xmlResourceParser0.getPositionDescription() + ": invalid animated-selector tag " + s);
        }
        e e0 = new e(null, null);
        TypedArray typedArray0 = G.q(resources0, resources$Theme0, attributeSet0, i.a.a);
        e0.setVisible(typedArray0.getBoolean(1, true), true);
        b b0 = e0.x;
        b0.d |= typedArray0.getChangingConfigurations();
        b0.i = typedArray0.getBoolean(2, b0.i);
        b0.l = typedArray0.getBoolean(3, b0.l);
        b0.y = typedArray0.getInt(4, b0.y);
        b0.z = typedArray0.getInt(5, b0.z);
        e0.setDither(typedArray0.getBoolean(0, b0.w));
        b b1 = e0.i;
        if(resources0 == null) {
            b1.getClass();
        }
        else {
            b1.b = resources0;
            int v = resources0.getDisplayMetrics().densityDpi;
            if(v == 0) {
                v = 0xA0;
            }
            int v1 = b1.c;
            b1.c = v;
            if(v1 != v) {
                b1.m = false;
                b1.j = false;
            }
        }
        typedArray0.recycle();
        int v2 = xmlResourceParser0.getDepth();
        while(true) {
            int v3 = xmlResourceParser0.next();
            if(v3 == 1) {
                e0.onStateChange(e0.getState());
                return e0;
            }
            int v4 = xmlResourceParser0.getDepth();
            if(v4 < v2 + 1 && v3 == 3) {
                e0.onStateChange(e0.getState());
                return e0;
            }
            if(v3 != 2 || v4 > v2 + 1) {
            }
            else if(xmlResourceParser0.getName().equals("item")) {
                TypedArray typedArray1 = G.q(resources0, resources$Theme0, attributeSet0, i.a.b);
                int v5 = typedArray1.getResourceId(0, 0);
                int v6 = typedArray1.getResourceId(1, -1);
                Drawable drawable0 = v6 <= 0 ? null : m0.d().f(context0, v6);
                typedArray1.recycle();
                int v7 = attributeSet0.getAttributeCount();
                int[] arr_v = new int[v7];
                int v8 = 0;
                for(int v9 = 0; v9 < v7; ++v9) {
                    int v10 = attributeSet0.getAttributeNameResource(v9);
                    if(v10 != 0 && v10 != 0x10100D0 && v10 != 0x1010199) {
                        if(!attributeSet0.getAttributeBooleanValue(v9, false)) {
                            v10 = -v10;
                        }
                        arr_v[v8] = v10;
                        ++v8;
                    }
                }
                int[] arr_v1 = StateSet.trimStateSet(arr_v, v8);
                if(drawable0 == null) {
                alab1:
                    while(true) {
                        switch(xmlResourceParser0.next()) {
                            case 2: {
                                if(xmlResourceParser0.getName().equals("vector")) {
                                    drawable0 = new q();
                                    ((q)drawable0).inflate(resources0, xmlResourceParser0, attributeSet0, resources$Theme0);
                                }
                                else {
                                    drawable0 = Drawable.createFromXmlInner(resources0, xmlResourceParser0, attributeSet0, resources$Theme0);
                                }
                                break alab1;
                            }
                            case 4: {
                                break;
                            }
                            default: {
                                throw new XmlPullParserException(xmlResourceParser0.getPositionDescription() + ": <item> tag requires a \'drawable\' attribute or child tag defining a drawable");
                            }
                        }
                    }
                }
                if(drawable0 == null) {
                    throw new XmlPullParserException(xmlResourceParser0.getPositionDescription() + ": <item> tag requires a \'drawable\' attribute or child tag defining a drawable");
                }
                b b2 = e0.x;
                int v11 = b2.a(drawable0);
                b2.H[v11] = arr_v1;
                b2.J.e(v11, v5);
            }
            else if(xmlResourceParser0.getName().equals("transition")) {
                TypedArray typedArray2 = G.q(resources0, resources$Theme0, attributeSet0, i.a.c);
                int v12 = typedArray2.getResourceId(2, -1);
                int v13 = typedArray2.getResourceId(1, -1);
                int v14 = typedArray2.getResourceId(0, -1);
                Drawable drawable1 = v14 <= 0 ? null : m0.d().f(context0, v14);
                boolean z = typedArray2.getBoolean(3, false);
                typedArray2.recycle();
                if(drawable1 == null) {
                alab2:
                    while(true) {
                        switch(xmlResourceParser0.next()) {
                            case 2: {
                                if(xmlResourceParser0.getName().equals("animated-vector")) {
                                    drawable1 = new V.e(context0);
                                    ((V.e)drawable1).inflate(resources0, xmlResourceParser0, attributeSet0, resources$Theme0);
                                }
                                else {
                                    drawable1 = Drawable.createFromXmlInner(resources0, xmlResourceParser0, attributeSet0, resources$Theme0);
                                }
                                break alab2;
                            }
                            case 4: {
                                break;
                            }
                            default: {
                                throw new XmlPullParserException(xmlResourceParser0.getPositionDescription() + ": <transition> tag requires a \'drawable\' attribute or child tag defining a drawable");
                            }
                        }
                    }
                }
                if(drawable1 == null) {
                    throw new XmlPullParserException(xmlResourceParser0.getPositionDescription() + ": <transition> tag requires a \'drawable\' attribute or child tag defining a drawable");
                }
                if(v12 == -1 || v13 == -1) {
                    break;
                }
                b b3 = e0.x;
                int v15 = b3.a(drawable1);
                b3.I.a(((long)v12) << 0x20 | ((long)v13), ((long)(((long)v15) | (z ? 0x200000000L : 0L))));
                if(z) {
                    b3.I.a(((long)v13) << 0x20 | ((long)v12), ((long)(((long)v15) | 0x300000000L)));
                }
            }
        }
        throw new XmlPullParserException(xmlResourceParser0.getPositionDescription() + ": <transition> tag requires \'fromId\' & \'toId\' attributes");
    }

    public final Drawable f() {
        if(!this.w) {
            super.mutate();
            b b0 = this.v;
            b0.I = b0.I.b();
            b0.J = b0.J.b();
            this.w = true;
        }
        return this;
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override  // h.f
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        a0 a00 = this.y;
        if(a00 != null) {
            a00.O();
            this.y = null;
            this.c(this.z);
            this.z = -1;
            this.A = -1;
        }
    }

    @Override  // h.f
    public final Drawable mutate() {
        if(!this.B) {
            this.f();
            b b0 = this.x;
            b0.I = b0.I.b();
            b0.J = b0.J.b();
            this.B = true;
        }
        return this;
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] arr_v) {
        c c0;
        int v2;
        b b0 = this.x;
        int v = b0.e(arr_v);
        if(v < 0) {
            v = b0.e(StateSet.WILD_CARD);
        }
        int v1 = this.o;
        boolean z = false;
        if(v != v1) {
            a0 a00 = this.y;
            if(a00 == null) {
            label_21:
                this.y = null;
                this.A = -1;
                this.z = -1;
                b b1 = this.x;
                if(v1 < 0) {
                    b1.getClass();
                    v2 = 0;
                }
                else {
                    v2 = (int)(((Integer)b1.J.d(v1, 0)));
                }
                int v3 = v >= 0 ? ((int)(((Integer)b1.J.d(v, 0)))) : 0;
                if(v3 == 0 || v2 == 0) {
                label_54:
                    if(this.c(v)) {
                        z = true;
                    }
                }
                else {
                    long v4 = ((long)v3) | ((long)v2) << 0x20;
                    int v5 = (int)(((long)(((Long)b1.I.d(v4, -1L)))));
                    if(v5 >= 0) {
                        boolean z1 = (((long)(((Long)b1.I.d(v4, -1L)))) & 0x200000000L) != 0L;
                        this.c(v5);
                        Drawable drawable0 = this.k;
                        if(drawable0 instanceof AnimationDrawable) {
                            if((((long)(((Long)b1.I.d(v4, -1L)))) & 0x100000000L) != 0L) {
                                z = true;
                            }
                            c0 = new c(((AnimationDrawable)drawable0), z, z1);
                            goto label_48;
                        }
                        else if(drawable0 instanceof V.e) {
                            c0 = new h.a(((V.e)drawable0), 1);
                            goto label_48;
                        }
                        else {
                            if(drawable0 instanceof Animatable) {
                                c0 = new h.a(((Animatable)drawable0), 0);
                            label_48:
                                c0.N();
                                this.y = c0;
                                this.A = v1;
                                this.z = v;
                                z = true;
                                goto label_56;
                            }
                            goto label_54;
                        }
                    }
                    else {
                        goto label_54;
                    }
                }
            }
            else if(v == this.z) {
                z = true;
            }
            else if(v == this.A && a00.f()) {
                a00.K();
                this.z = this.A;
                this.A = v;
                z = true;
            }
            else {
                v1 = this.z;
                a00.O();
                goto label_21;
            }
        }
    label_56:
        Drawable drawable1 = this.k;
        return drawable1 != null ? z | drawable1.setState(arr_v) : z;
    }

    @Override  // h.f
    public final boolean setVisible(boolean z, boolean z1) {
        boolean z2 = super.setVisible(z, z1);
        a0 a00 = this.y;
        if(a00 != null && (z2 || z1)) {
            if(z) {
                a00.N();
                return z2;
            }
            this.jumpToCurrentState();
        }
        return z2;
    }
}

