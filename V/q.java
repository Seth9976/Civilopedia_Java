package V;

import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayDeque;
import o2.C;
import o2.G;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p.b;
import x2.w;

public final class q extends h {
    public o j;
    public PorterDuffColorFilter k;
    public ColorFilter l;
    public boolean m;
    public boolean n;
    public final float[] o;
    public final Matrix p;
    public final Rect q;
    public static final PorterDuff.Mode r;

    static {
        q.r = PorterDuff.Mode.SRC_IN;
    }

    public q() {
        this.n = true;
        this.o = new float[9];
        this.p = new Matrix();
        this.q = new Rect();
        o o0 = new o();  // 初始化器: Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V
        o0.c = null;
        o0.d = q.r;
        o0.b = new n();
        this.j = o0;
    }

    public q(o o0) {
        this.n = true;
        this.o = new float[9];
        this.p = new Matrix();
        this.q = new Rect();
        this.j = o0;
        this.k = this.a(o0.c, o0.d);
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList0, PorterDuff.Mode porterDuff$Mode0) {
        return colorStateList0 == null || porterDuff$Mode0 == null ? null : new PorterDuffColorFilter(colorStateList0.getColorForState(this.getState(), 0), porterDuff$Mode0);
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable0 = this.i;
        if(drawable0 != null) {
            drawable0.canApplyTheme();
        }
        return false;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas0) {
        Paint paint0;
        Drawable drawable0 = this.i;
        if(drawable0 != null) {
            drawable0.draw(canvas0);
            return;
        }
        Rect rect0 = this.q;
        this.copyBounds(rect0);
        if(rect0.width() > 0 && rect0.height() > 0) {
            ColorFilter colorFilter0 = this.l;
            if(colorFilter0 == null) {
                colorFilter0 = this.k;
            }
            canvas0.getMatrix(this.p);
            this.p.getValues(this.o);
            float f = Math.abs(this.o[0]);
            float f1 = Math.abs(this.o[4]);
            if(Math.abs(this.o[1]) != 0.0f || Math.abs(this.o[3]) != 0.0f) {
                f = 1.0f;
                f1 = 1.0f;
            }
            int v = Math.min(0x800, ((int)(((float)rect0.width()) * f)));
            int v1 = Math.min(0x800, ((int)(((float)rect0.height()) * f1)));
            if(v > 0 && v1 > 0) {
                int v2 = canvas0.save();
                canvas0.translate(((float)rect0.left), ((float)rect0.top));
                if(this.isAutoMirrored() && w.g(this) == 1) {
                    canvas0.translate(((float)rect0.width()), 0.0f);
                    canvas0.scale(-1.0f, 1.0f);
                }
                rect0.offsetTo(0, 0);
                o o0 = this.j;
                if(o0.f == null || v != o0.f.getWidth() || v1 != o0.f.getHeight()) {
                    o0.f = Bitmap.createBitmap(v, v1, Bitmap.Config.ARGB_8888);
                    o0.k = true;
                }
                if(!this.n) {
                    o o1 = this.j;
                    o1.f.eraseColor(0);
                    Canvas canvas1 = new Canvas(o1.f);
                    o1.b.a(o1.b.g, n.p, canvas1, v, v1);
                }
                else if(this.j.k || this.j.g != this.j.c || this.j.h != this.j.d || this.j.j != this.j.e || this.j.i != this.j.b.getRootAlpha()) {
                    o o2 = this.j;
                    o2.f.eraseColor(0);
                    Canvas canvas2 = new Canvas(o2.f);
                    o2.b.a(o2.b.g, n.p, canvas2, v, v1);
                    o o3 = this.j;
                    o3.g = o3.c;
                    o3.h = o3.d;
                    o3.i = o3.b.getRootAlpha();
                    o3.j = o3.e;
                    o3.k = false;
                }
                o o4 = this.j;
                if(o4.b.getRootAlpha() < 0xFF || colorFilter0 != null) {
                    if(o4.l == null) {
                        Paint paint1 = new Paint();
                        o4.l = paint1;
                        paint1.setFilterBitmap(true);
                    }
                    o4.l.setAlpha(o4.b.getRootAlpha());
                    o4.l.setColorFilter(colorFilter0);
                    paint0 = o4.l;
                }
                else {
                    paint0 = null;
                }
                canvas0.drawBitmap(o4.f, null, rect0, paint0);
                canvas0.restoreToCount(v2);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.i == null ? this.j.b.getRootAlpha() : this.i.getAlpha();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable0 = this.i;
        return drawable0 == null ? super.getChangingConfigurations() | this.j.getChangingConfigurations() : drawable0.getChangingConfigurations();
    }

    @Override  // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.i == null ? this.l : this.i.getColorFilter();
    }

    @Override  // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if(this.i != null && Build.VERSION.SDK_INT >= 24) {
            return new p(this.i.getConstantState());
        }
        o o0 = this.j;
        o0.a = this.getChangingConfigurations();
        return this.j;
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.i == null ? ((int)this.j.b.i) : this.i.getIntrinsicHeight();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.i == null ? ((int)this.j.b.h) : this.i.getIntrinsicWidth();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.i == null ? -3 : this.i.getOpacity();
    }

    @Override  // android.graphics.drawable.Drawable
    public final void inflate(Resources resources0, XmlPullParser xmlPullParser0, AttributeSet attributeSet0) {
        Drawable drawable0 = this.i;
        if(drawable0 != null) {
            drawable0.inflate(resources0, xmlPullParser0, attributeSet0);
            return;
        }
        this.inflate(resources0, xmlPullParser0, attributeSet0, null);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void inflate(Resources resources0, XmlPullParser xmlPullParser0, AttributeSet attributeSet0, Resources.Theme resources$Theme0) {
        Paint.Join paint$Join3;
        Paint.Cap paint$Cap2;
        Paint.Join paint$Join1;
        n n2;
        int v5;
        Drawable drawable0 = this.i;
        if(drawable0 != null) {
            drawable0.inflate(resources0, xmlPullParser0, attributeSet0, resources$Theme0);
            return;
        }
        o o0 = this.j;
        o0.b = new n();
        TypedArray typedArray0 = G.q(resources0, resources$Theme0, attributeSet0, a.a);
        o o1 = this.j;
        n n0 = o1.b;
        int v = G.o(xmlPullParser0, "tintMode") ? typedArray0.getInt(6, -1) : -1;
        PorterDuff.Mode porterDuff$Mode0 = PorterDuff.Mode.SRC_IN;
        switch(v) {
            case 3: {
                porterDuff$Mode0 = PorterDuff.Mode.SRC_OVER;
                break;
            }
            case 9: {
                porterDuff$Mode0 = PorterDuff.Mode.SRC_ATOP;
                break;
            }
            case 14: {
                porterDuff$Mode0 = PorterDuff.Mode.MULTIPLY;
                break;
            }
            case 15: {
                porterDuff$Mode0 = PorterDuff.Mode.SCREEN;
                break;
            }
            case 16: {
                porterDuff$Mode0 = PorterDuff.Mode.ADD;
            }
        }
        o1.d = porterDuff$Mode0;
        ColorStateList colorStateList0 = null;
        if(G.o(xmlPullParser0, "tint")) {
            TypedValue typedValue0 = new TypedValue();
            typedArray0.getValue(1, typedValue0);
            int v1 = typedValue0.type;
            if(v1 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue0);
            }
            if(v1 < 28 || v1 > 0x1F) {
                Resources resources1 = typedArray0.getResources();
                int v2 = typedArray0.getResourceId(1, 0);
                try {
                    colorStateList0 = w.a.a(resources1, resources1.getXml(v2), resources$Theme0);
                }
                catch(Exception exception0) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", exception0);
                }
            }
            else {
                colorStateList0 = ColorStateList.valueOf(typedValue0.data);
            }
        }
        if(colorStateList0 != null) {
            o1.c = colorStateList0;
        }
        boolean z = o1.e;
        o1.e = G.o(xmlPullParser0, "autoMirrored") ? typedArray0.getBoolean(5, z) : o1.e;
        float f = n0.j;
        n0.j = G.o(xmlPullParser0, "viewportWidth") ? typedArray0.getFloat(7, f) : n0.j;
        float f1 = n0.k;
        f1 = G.o(xmlPullParser0, "viewportHeight") ? typedArray0.getFloat(8, f1) : n0.k;
        n0.k = f1;
        if(n0.j <= 0.0f) {
            throw new XmlPullParserException(typedArray0.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if(f1 <= 0.0f) {
            throw new XmlPullParserException(typedArray0.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        n0.h = typedArray0.getDimension(3, n0.h);
        float f2 = typedArray0.getDimension(2, n0.i);
        n0.i = f2;
        if(n0.h <= 0.0f) {
            throw new XmlPullParserException(typedArray0.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if(f2 <= 0.0f) {
            throw new XmlPullParserException(typedArray0.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float f3 = n0.getAlpha();
        if(G.o(xmlPullParser0, "alpha")) {
            f3 = typedArray0.getFloat(4, f3);
        }
        n0.setAlpha(f3);
        String s = typedArray0.getString(0);
        if(s != null) {
            n0.m = s;
            n0.o.put(s, n0);
        }
        typedArray0.recycle();
        o0.a = this.getChangingConfigurations();
        o0.k = true;
        o o2 = this.j;
        n n1 = o2.b;
        ArrayDeque arrayDeque0 = new ArrayDeque();
        arrayDeque0.push(n1.g);
        int v3 = xmlPullParser0.getEventType();
        int v4 = xmlPullParser0.getDepth() + 1;
        boolean z1 = true;
        while(v3 != 1 && (xmlPullParser0.getDepth() >= v4 || v3 != 3)) {
            if(v3 == 2) {
                String s1 = xmlPullParser0.getName();
                k k0 = (k)arrayDeque0.peek();
                v5 = v4;
                b b0 = n1.o;
                if("path".equals(s1)) {
                    j j0 = new j();  // 初始化器: LV/m;-><init>()V
                    j0.e = 0.0f;
                    j0.g = 1.0f;
                    j0.h = 1.0f;
                    j0.i = 0.0f;
                    j0.j = 1.0f;
                    j0.k = 0.0f;
                    Paint.Cap paint$Cap0 = Paint.Cap.BUTT;
                    j0.l = paint$Cap0;
                    Paint.Join paint$Join0 = Paint.Join.MITER;
                    j0.m = paint$Join0;
                    n2 = n1;
                    j0.n = 4.0f;
                    TypedArray typedArray1 = G.q(resources0, resources$Theme0, attributeSet0, a.c);
                    if(G.o(xmlPullParser0, "pathData")) {
                        String s2 = typedArray1.getString(0);
                        if(s2 != null) {
                            j0.b = s2;
                        }
                        String s3 = typedArray1.getString(2);
                        if(s3 != null) {
                            j0.a = C.e(s3);
                        }
                        j0.f = G.l(typedArray1, xmlPullParser0, resources$Theme0, "fillColor", 1);
                        float f4 = j0.h;
                        j0.h = G.o(xmlPullParser0, "fillAlpha") ? typedArray1.getFloat(12, f4) : j0.h;
                        int v6 = G.o(xmlPullParser0, "strokeLineCap") ? typedArray1.getInt(8, -1) : -1;
                        Paint.Cap paint$Cap1 = j0.l;
                        if(v6 == 0) {
                            paint$Join1 = paint$Join0;
                            paint$Cap2 = paint$Cap0;
                        }
                        else {
                            paint$Join1 = paint$Join0;
                            switch(v6) {
                                case 1: {
                                    paint$Cap2 = Paint.Cap.ROUND;
                                    break;
                                }
                                case 2: {
                                    paint$Cap2 = Paint.Cap.SQUARE;
                                    break;
                                }
                                default: {
                                    paint$Cap2 = paint$Cap1;
                                }
                            }
                        }
                        j0.l = paint$Cap2;
                        int v7 = G.o(xmlPullParser0, "strokeLineJoin") ? typedArray1.getInt(9, -1) : -1;
                        Paint.Join paint$Join2 = j0.m;
                        switch(v7) {
                            case 0: {
                                paint$Join3 = paint$Join1;
                                break;
                            }
                            case 1: {
                                paint$Join3 = Paint.Join.ROUND;
                                break;
                            }
                            case 2: {
                                paint$Join3 = Paint.Join.BEVEL;
                                break;
                            }
                            default: {
                                paint$Join3 = paint$Join2;
                            }
                        }
                        j0.m = paint$Join3;
                        float f5 = j0.n;
                        j0.n = G.o(xmlPullParser0, "strokeMiterLimit") ? typedArray1.getFloat(10, f5) : j0.n;
                        j0.d = G.l(typedArray1, xmlPullParser0, resources$Theme0, "strokeColor", 3);
                        float f6 = j0.g;
                        j0.g = G.o(xmlPullParser0, "strokeAlpha") ? typedArray1.getFloat(11, f6) : j0.g;
                        float f7 = j0.e;
                        j0.e = G.o(xmlPullParser0, "strokeWidth") ? typedArray1.getFloat(4, f7) : j0.e;
                        float f8 = j0.j;
                        j0.j = G.o(xmlPullParser0, "trimPathEnd") ? typedArray1.getFloat(6, f8) : j0.j;
                        float f9 = j0.k;
                        j0.k = G.o(xmlPullParser0, "trimPathOffset") ? typedArray1.getFloat(7, f9) : j0.k;
                        float f10 = j0.i;
                        j0.i = G.o(xmlPullParser0, "trimPathStart") ? typedArray1.getFloat(5, f10) : j0.i;
                        int v8 = j0.c;
                        j0.c = G.o(xmlPullParser0, "fillType") ? typedArray1.getInt(13, v8) : j0.c;
                    }
                    typedArray1.recycle();
                    k0.b.add(j0);
                    if(j0.getPathName() != null) {
                        b0.put(j0.getPathName(), j0);
                    }
                    o2.a = o2.a;
                    z1 = false;
                }
                else {
                    n2 = n1;
                    if("clip-path".equals(s1)) {
                        i i0 = new i();  // 初始化器: LV/m;-><init>()V
                        if(G.o(xmlPullParser0, "pathData")) {
                            TypedArray typedArray2 = G.q(resources0, resources$Theme0, attributeSet0, a.d);
                            String s4 = typedArray2.getString(0);
                            if(s4 != null) {
                                i0.b = s4;
                            }
                            String s5 = typedArray2.getString(1);
                            if(s5 != null) {
                                i0.a = C.e(s5);
                            }
                            i0.c = G.o(xmlPullParser0, "fillType") ? typedArray2.getInt(2, 0) : 0;
                            typedArray2.recycle();
                        }
                        k0.b.add(i0);
                        if(i0.getPathName() != null) {
                            b0.put(i0.getPathName(), i0);
                        }
                        o2.a = o2.a;
                    }
                    else if("group".equals(s1)) {
                        k k1 = new k();
                        TypedArray typedArray3 = G.q(resources0, resources$Theme0, attributeSet0, a.b);
                        float f11 = k1.c;
                        k1.c = G.o(xmlPullParser0, "rotation") ? typedArray3.getFloat(5, f11) : k1.c;
                        k1.d = typedArray3.getFloat(1, k1.d);
                        k1.e = typedArray3.getFloat(2, k1.e);
                        float f12 = k1.f;
                        k1.f = G.o(xmlPullParser0, "scaleX") ? typedArray3.getFloat(3, f12) : k1.f;
                        float f13 = k1.g;
                        k1.g = G.o(xmlPullParser0, "scaleY") ? typedArray3.getFloat(4, f13) : k1.g;
                        float f14 = k1.h;
                        k1.h = G.o(xmlPullParser0, "translateX") ? typedArray3.getFloat(6, f14) : k1.h;
                        float f15 = k1.i;
                        k1.i = G.o(xmlPullParser0, "translateY") ? typedArray3.getFloat(7, f15) : k1.i;
                        String s6 = typedArray3.getString(0);
                        if(s6 != null) {
                            k1.k = s6;
                        }
                        k1.c();
                        typedArray3.recycle();
                        k0.b.add(k1);
                        arrayDeque0.push(k1);
                        if(k1.getGroupName() != null) {
                            b0.put(k1.getGroupName(), k1);
                        }
                        o2.a = o2.a;
                    }
                }
            }
            else {
                n2 = n1;
                v5 = v4;
                if(v3 == 3 && "group".equals(xmlPullParser0.getName())) {
                    arrayDeque0.pop();
                }
            }
            v3 = xmlPullParser0.next();
            v4 = v5;
            n1 = n2;
        }
        if(z1) {
            throw new XmlPullParserException("no path defined");
        }
        this.k = this.a(o0.c, o0.d);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable0 = this.i;
        if(drawable0 != null) {
            drawable0.invalidateSelf();
            return;
        }
        super.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.i == null ? this.j.e : this.i.isAutoMirrored();
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable0 = this.i;
        if(drawable0 != null) {
            return drawable0.isStateful();
        }
        if(!super.isStateful()) {
            o o0 = this.j;
            if(o0 == null) {
                return false;
            }
            n n0 = o0.b;
            if(n0.n == null) {
                n0.n = Boolean.valueOf(n0.g.a());
            }
            if(!n0.n.booleanValue()) {
                ColorStateList colorStateList0 = this.j.c;
                return colorStateList0 != null && colorStateList0.isStateful();
            }
        }
        return true;
    }

    @Override  // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable0 = this.i;
        if(drawable0 != null) {
            drawable0.mutate();
            return this;
        }
        if(!this.m && super.mutate() == this) {
            o o0 = this.j;
            o o1 = new o();  // 初始化器: Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V
            o1.c = null;
            o1.d = q.r;
            if(o0 != null) {
                o1.a = o0.a;
                n n0 = new n(o0.b);
                o1.b = n0;
                if(o0.b.e != null) {
                    n0.e = new Paint(o0.b.e);
                }
                if(o0.b.d != null) {
                    n n1 = o1.b;
                    n1.d = new Paint(o0.b.d);
                }
                o1.c = o0.c;
                o1.d = o0.d;
                o1.e = o0.e;
            }
            this.j = o1;
            this.m = true;
        }
        return this;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect0) {
        Drawable drawable0 = this.i;
        if(drawable0 != null) {
            drawable0.setBounds(rect0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] arr_v) {
        boolean z;
        Drawable drawable0 = this.i;
        if(drawable0 != null) {
            return drawable0.setState(arr_v);
        }
        o o0 = this.j;
        ColorStateList colorStateList0 = o0.c;
        if(colorStateList0 == null) {
            z = false;
        }
        else {
            PorterDuff.Mode porterDuff$Mode0 = o0.d;
            if(porterDuff$Mode0 == null) {
                z = false;
            }
            else {
                this.k = this.a(colorStateList0, porterDuff$Mode0);
                this.invalidateSelf();
                z = true;
            }
        }
        n n0 = o0.b;
        if(n0.n == null) {
            n0.n = Boolean.valueOf(n0.g.a());
        }
        if(n0.n.booleanValue()) {
            boolean z1 = o0.b.g.b(arr_v);
            o0.k |= z1;
            if(z1) {
                this.invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable0, long v) {
        Drawable drawable0 = this.i;
        if(drawable0 != null) {
            drawable0.scheduleSelf(runnable0, v);
            return;
        }
        super.scheduleSelf(runnable0, v);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setAlpha(int v) {
        Drawable drawable0 = this.i;
        if(drawable0 != null) {
            drawable0.setAlpha(v);
            return;
        }
        if(this.j.b.getRootAlpha() != v) {
            this.j.b.setRootAlpha(v);
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable0 = this.i;
        if(drawable0 != null) {
            drawable0.setAutoMirrored(z);
            return;
        }
        this.j.e = z;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter0) {
        Drawable drawable0 = this.i;
        if(drawable0 != null) {
            drawable0.setColorFilter(colorFilter0);
            return;
        }
        this.l = colorFilter0;
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setTint(int v) {
        Drawable drawable0 = this.i;
        if(drawable0 != null) {
            w.x(drawable0, v);
            return;
        }
        this.setTintList(ColorStateList.valueOf(v));
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList0) {
        Drawable drawable0 = this.i;
        if(drawable0 != null) {
            drawable0.setTintList(colorStateList0);
            return;
        }
        o o0 = this.j;
        if(o0.c != colorStateList0) {
            o0.c = colorStateList0;
            this.k = this.a(colorStateList0, o0.d);
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode porterDuff$Mode0) {
        Drawable drawable0 = this.i;
        if(drawable0 != null) {
            drawable0.setTintMode(porterDuff$Mode0);
            return;
        }
        o o0 = this.j;
        if(o0.d != porterDuff$Mode0) {
            o0.d = porterDuff$Mode0;
            this.k = this.a(o0.c, porterDuff$Mode0);
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z1) {
        Drawable drawable0 = this.i;
        return drawable0 == null ? super.setVisible(z, z1) : drawable0.setVisible(z, z1);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable0) {
        Drawable drawable0 = this.i;
        if(drawable0 != null) {
            drawable0.unscheduleSelf(runnable0);
            return;
        }
        super.unscheduleSelf(runnable0);
    }
}

