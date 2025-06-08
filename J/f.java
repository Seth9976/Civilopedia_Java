package j;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import k.n;
import k.o;
import k.s;
import z.a;

public final class f {
    public CharSequence A;
    public CharSequence B;
    public ColorStateList C;
    public PorterDuff.Mode D;
    public final g E;
    public final Menu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public o z;

    public f(g g0, Menu menu0) {
        this.E = g0;
        this.C = null;
        this.D = null;
        this.a = menu0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = true;
        this.g = true;
    }

    public final Object a(String s, Class[] arr_class, Object[] arr_object) {
        try {
            Constructor constructor0 = Class.forName(s, false, this.E.c.getClassLoader()).getConstructor(arr_class);
            constructor0.setAccessible(true);
            return constructor0.newInstance(arr_object);
        }
        catch(Exception exception0) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + s, exception0);
            return null;
        }
    }

    public final void b(MenuItem menuItem0) {
        boolean z = false;
        menuItem0.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int v = this.v;
        if(v >= 0) {
            menuItem0.setShowAsAction(v);
        }
        g g0 = this.E;
        if(this.y != null) {
            if(g0.c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if(g0.d == null) {
                g0.d = g.a(g0.c);
            }
            Object object0 = g0.d;
            String s = this.y;
            e e0 = new e();  // 初始化器: Ljava/lang/Object;-><init>()V
            e0.a = object0;
            Class class0 = object0.getClass();
            try {
                e0.b = class0.getMethod(s, e.c);
            }
            catch(Exception exception0) {
                InflateException inflateException0 = new InflateException("Couldn\'t resolve menu item onClick handler " + s + " in class " + class0.getName());
                inflateException0.initCause(exception0);
                throw inflateException0;
            }
            menuItem0.setOnMenuItemClickListener(e0);
        }
        if(menuItem0 instanceof n) {
            n n0 = (n)menuItem0;
        }
        if(this.r >= 2) {
            if(menuItem0 instanceof n) {
                ((n)menuItem0).x |= 4;
            }
            else if(menuItem0 instanceof s) {
                s s1 = (s)menuItem0;
                a a0 = s1.c;
                try {
                    if(s1.d == null) {
                        s1.d = a0.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    s1.d.invoke(a0, Boolean.TRUE);
                    goto label_39;
                }
                catch(Exception exception1) {
                }
                Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", exception1);
            }
        }
    label_39:
        String s2 = this.x;
        if(s2 != null) {
            menuItem0.setActionView(((View)this.a(s2, g.e, g0.a)));
            z = true;
        }
        int v1 = this.w;
        if(v1 > 0) {
            if(z) {
                Log.w("SupportMenuInflater", "Ignoring attribute \'itemActionViewLayout\'. Action view already specified.");
            }
            else {
                menuItem0.setActionView(v1);
            }
        }
        o o0 = this.z;
        if(o0 != null) {
            if(menuItem0 instanceof a) {
                ((a)menuItem0).b(o0);
            }
            else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence0 = this.A;
        if(menuItem0 instanceof a) {
            ((a)menuItem0).setContentDescription(charSequence0);
        }
        else if(Build.VERSION.SDK_INT >= 26) {
            menuItem0.setContentDescription(charSequence0);
        }
        CharSequence charSequence1 = this.B;
        if(menuItem0 instanceof a) {
            ((a)menuItem0).setTooltipText(charSequence1);
        }
        else if(Build.VERSION.SDK_INT >= 26) {
            menuItem0.setTooltipText(charSequence1);
        }
        int v2 = this.n;
        int v3 = this.o;
        if(menuItem0 instanceof a) {
            ((a)menuItem0).setAlphabeticShortcut(((char)v2), v3);
        }
        else if(Build.VERSION.SDK_INT >= 26) {
            menuItem0.setAlphabeticShortcut(((char)v2), v3);
        }
        int v4 = this.p;
        int v5 = this.q;
        if(menuItem0 instanceof a) {
            ((a)menuItem0).setNumericShortcut(((char)v4), v5);
        }
        else if(Build.VERSION.SDK_INT >= 26) {
            menuItem0.setNumericShortcut(((char)v4), v5);
        }
        PorterDuff.Mode porterDuff$Mode0 = this.D;
        if(porterDuff$Mode0 != null) {
            if(menuItem0 instanceof a) {
                ((a)menuItem0).setIconTintMode(porterDuff$Mode0);
            }
            else if(Build.VERSION.SDK_INT >= 26) {
                menuItem0.setIconTintMode(porterDuff$Mode0);
            }
        }
        ColorStateList colorStateList0 = this.C;
        if(colorStateList0 != null) {
            if(menuItem0 instanceof a) {
                ((a)menuItem0).setIconTintList(colorStateList0);
                return;
            }
            if(Build.VERSION.SDK_INT >= 26) {
                menuItem0.setIconTintList(colorStateList0);
            }
        }
    }
}

