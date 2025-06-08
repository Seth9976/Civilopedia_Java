package f;

import E.u;
import X2.h0;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater.Factory2;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window.Callback;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.n;
import com.google.android.gms.internal.ads.l5;
import com.google.android.gms.internal.ads.u9;
import e.a;
import j.g;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import l.B;
import l.C;
import l.E0;
import l.I0;
import l.M;
import l.N;
import l.Q;
import l.U;
import l.V;
import l.f;
import l.q;
import l.v;
import l.w;
import l.x;
import l1.d;
import o2.I;
import p.b;
import u.e;
import z1.a0;

public final class t extends j implements LayoutInflater.Factory2, k.j {
    public boolean A;
    public ViewGroup B;
    public TextView C;
    public View D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public s[] M;
    public s N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public final int S;
    public int T;
    public boolean U;
    public boolean V;
    public p W;
    public p X;
    public boolean Y;
    public int Z;
    public final k a0;
    public boolean b0;
    public Rect c0;
    public Rect d0;
    public AppCompatViewInflater e0;
    public static final b f0;
    public static final int[] g0;
    public static final boolean h0;
    public final Object k;
    public final Context l;
    public Window m;
    public o n;
    public final Object o;
    public A p;
    public g q;
    public CharSequence r;
    public U s;
    public l t;
    public m u;
    public h0 v;
    public ActionBarContextView w;
    public PopupWindow x;
    public k y;
    public u z;

    static {
        t.f0 = new b();  // 初始化器: Lp/k;-><init>()V
        t.g0 = new int[]{0x1010054};
        t.h0 = Build.VERSION.SDK_INT <= 25;
    }

    public t(Context context0, Window window0, i i0, Object object0) {
        h h0;
        this.z = null;
        this.S = -100;
        this.a0 = new k(this, 0);
        this.l = context0;
        this.k = object0;
        if(object0 instanceof Dialog) {
            while(true) {
                if(context0 != null) {
                    if(context0 instanceof h) {
                        h0 = (h)context0;
                        break;
                    }
                    if(context0 instanceof ContextWrapper) {
                        context0 = ((ContextWrapper)context0).getBaseContext();
                        continue;
                    }
                }
                h0 = null;
                break;
            }
            if(h0 != null) {
                this.S = ((t)h0.i()).S;
            }
        }
        if(this.S == -100) {
            b b0 = t.f0;
            Integer integer0 = (Integer)b0.getOrDefault(this.k.getClass(), null);
            if(integer0 != null) {
                this.S = (int)integer0;
                b0.remove(this.k.getClass());
            }
        }
        if(window0 != null) {
            this.j(window0);
        }
        l.t.c();
    }

    @Override  // f.j
    public final void a() {
        LayoutInflater layoutInflater0 = LayoutInflater.from(this.l);
        if(layoutInflater0.getFactory() == null) {
            layoutInflater0.setFactory2(this);
            return;
        }
        if(!(layoutInflater0.getFactory2() instanceof t)) {
            Log.i("AppCompatDelegate", "The Activity\'s LayoutInflater already has a Factory installed so we can not install AppCompat\'s");
        }
    }

    @Override  // f.j
    public final void b() {
        String s;
        this.P = true;
        this.i(false);
        this.q();
        Object object0 = this.k;
        if(object0 instanceof Activity) {
            try {
                Activity activity0 = (Activity)object0;
                try {
                    s = I.o(activity0, activity0.getComponentName());
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                    throw new IllegalArgumentException(packageManager$NameNotFoundException0);
                }
            }
            catch(IllegalArgumentException unused_ex) {
                s = null;
            }
            if(s != null) {
                A a0 = this.p;
                if(a0 == null) {
                    this.b0 = true;
                    return;
                }
                if(!a0.k) {
                    a0.k = true;
                    ((I0)a0.h).a(4 | ((I0)a0.h).b);
                }
            }
        }
    }

    @Override  // k.j
    public final boolean d(k.l l0, MenuItem menuItem0) {
        Window.Callback window$Callback0 = this.m.getCallback();
        if(window$Callback0 != null && !this.R) {
            k.l l1 = l0.k();
            s[] arr_s = this.M;
            int v = arr_s == null ? 0 : arr_s.length;
            for(int v1 = 0; v1 < v; ++v1) {
                s s0 = arr_s[v1];
                if(s0 != null && s0.h == l1) {
                    return s0 == null ? false : window$Callback0.onMenuItemSelected(s0.a, menuItem0);
                }
            }
            return false;
        }
        return false;
    }

    @Override  // k.j
    public final void e(k.l l0) {
        U u0 = this.s;
        if(u0 == null) {
        label_40:
            s s1 = this.s(0);
            s1.n = true;
            this.m(s1, false);
            this.v(s1, null);
        }
        else {
            ((ActionBarOverlayLayout)u0).k();
            Toolbar toolbar0 = ((I0)((ActionBarOverlayLayout)u0).m).a;
            if(toolbar0.getVisibility() != 0 || (toolbar0.i == null || !toolbar0.i.A)) {
                goto label_40;
            }
            else if(ViewConfiguration.get(this.l).hasPermanentMenuKey()) {
                ActionBarOverlayLayout actionBarOverlayLayout0 = (ActionBarOverlayLayout)this.s;
                actionBarOverlayLayout0.k();
                ActionMenuView actionMenuView0 = ((I0)actionBarOverlayLayout0.m).a.i;
                if(actionMenuView0 == null || (actionMenuView0.B == null || actionMenuView0.B.C == null && !actionMenuView0.B.h())) {
                    goto label_40;
                }
                else {
                    goto label_10;
                }
            }
            else {
            label_10:
                Window.Callback window$Callback0 = this.m.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout1 = (ActionBarOverlayLayout)this.s;
                actionBarOverlayLayout1.k();
                ActionMenuView actionMenuView1 = ((I0)actionBarOverlayLayout1.m).a.i;
                if(actionMenuView1 != null && (actionMenuView1.B != null && actionMenuView1.B.h())) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout)this.s;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((I0)actionBarOverlayLayout2.m).a.i;
                    if(actionMenuView2 != null) {
                        l.j j0 = actionMenuView2.B;
                        if(j0 != null) {
                            j0.e();
                        }
                    }
                    if(!this.R) {
                        window$Callback0.onPanelClosed(108, this.s(0).h);
                    }
                }
                else if(window$Callback0 != null && !this.R) {
                    if(this.Y && (1 & this.Z) != 0) {
                        this.m.getDecorView().removeCallbacks(this.a0);
                        this.a0.run();
                    }
                    s s0 = this.s(0);
                    if(s0.h != null && !s0.o && window$Callback0.onPreparePanel(0, s0.g, s0.h)) {
                        window$Callback0.onMenuOpened(108, s0.h);
                        ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout)this.s;
                        actionBarOverlayLayout3.k();
                        ActionMenuView actionMenuView3 = ((I0)actionBarOverlayLayout3.m).a.i;
                        if(actionMenuView3 != null) {
                            l.j j1 = actionMenuView3.B;
                            if(j1 != null) {
                                j1.l();
                            }
                        }
                    }
                }
            }
        }
    }

    @Override  // f.j
    public final boolean f(int v) {
        switch(v) {
            case 8: {
                Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
                v = 108;
                break;
            }
            case 9: {
                Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
                v = 109;
            }
        }
        if(this.K && v == 108) {
            return false;
        }
        if(this.G && v == 1) {
            this.G = false;
        }
        switch(v) {
            case 1: {
                this.y();
                this.K = true;
                return true;
            }
            case 2: {
                this.y();
                this.E = true;
                return true;
            }
            case 5: {
                this.y();
                this.F = true;
                return true;
            }
            case 10: {
                this.y();
                this.I = true;
                return true;
            }
            case 108: {
                this.y();
                this.G = true;
                return true;
            }
            case 109: {
                this.y();
                this.H = true;
                return true;
            }
            default: {
                return this.m.requestFeature(v);
            }
        }
    }

    @Override  // f.j
    public final void g(int v) {
        this.p();
        ViewGroup viewGroup0 = (ViewGroup)this.B.findViewById(0x1020002);
        viewGroup0.removeAllViews();
        LayoutInflater.from(this.l).inflate(v, viewGroup0);
        this.n.i.onContentChanged();
    }

    @Override  // f.j
    public final void h(CharSequence charSequence0) {
        this.r = charSequence0;
        U u0 = this.s;
        if(u0 != null) {
            u0.setWindowTitle(charSequence0);
            return;
        }
        A a0 = this.p;
        if(a0 == null) {
            TextView textView0 = this.C;
            if(textView0 != null) {
                textView0.setText(charSequence0);
            }
        }
        else {
            I0 i00 = (I0)a0.h;
            if(!i00.g) {
                i00.h = charSequence0;
                if((i00.b & 8) != 0) {
                    i00.a.setTitle(charSequence0);
                }
            }
        }
    }

    public final boolean i(boolean z) {
        Map map0;
        Object object3;
        Object object2;
        boolean z3;
        int v3;
        boolean z1 = false;
        if(this.R) {
            return false;
        }
        int v = this.S == -100 ? -100 : this.S;
        Context context0 = this.l;
        boolean z2 = true;
        int v1 = -1;
        switch(v) {
            case -100: {
                break;
            }
            case 0: {
                if(Build.VERSION.SDK_INT < 23 || ((UiModeManager)l5.q(context0)).getNightMode() != 0) {
                    v1 = this.r().e();
                }
                break;
            }
            case -1: 
            case 1: 
            case 2: {
                v1 = v;
                break;
            }
            case 3: {
                if(this.X == null) {
                    this.X = new p(this, context0);
                }
                v1 = this.X.e();
                break;
            }
            default: {
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        int v2 = context0.getApplicationContext().getResources().getConfiguration().uiMode & 0x30;
        switch(v1) {
            case 1: {
                v3 = 16;
                break;
            }
            case 2: {
                v3 = 0x20;
                break;
            }
            default: {
                v3 = v2;
            }
        }
        Object object0 = this.k;
        if(this.V || !(object0 instanceof Activity)) {
        label_36:
            this.V = true;
            z3 = this.U;
        }
        else {
            PackageManager packageManager0 = context0.getPackageManager();
            if(packageManager0 == null) {
                z3 = false;
            }
            else {
                try {
                    ActivityInfo activityInfo0 = packageManager0.getActivityInfo(new ComponentName(context0, object0.getClass()), 0);
                    this.U = activityInfo0 != null && (activityInfo0.configChanges & 0x200) != 0;
                    goto label_36;
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                }
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", packageManager$NameNotFoundException0);
                this.U = false;
                goto label_36;
            }
        }
        if((t.h0 || v3 != v2) && !z3 && !this.P && object0 instanceof ContextThemeWrapper) {
            Configuration configuration0 = new Configuration();
            configuration0.uiMode = configuration0.uiMode & -49 | v3;
            try {
                ((ContextThemeWrapper)object0).applyOverrideConfiguration(configuration0);
                z1 = true;
            }
            catch(IllegalStateException illegalStateException0) {
                Log.e("AppCompatDelegate", "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()", illegalStateException0);
            }
        }
        int v4 = context0.getResources().getConfiguration().uiMode & 0x30;
        if(!z1 && v4 != v3 && z && !z3 && this.P) {
            int v5 = Build.VERSION.SDK_INT;
            if(object0 instanceof Activity) {
                if(v5 >= 28) {
                    ((Activity)object0).recreate();
                }
                else if(v5 <= 23) {
                    new Handler(((Activity)object0).getMainLooper()).post(new d(((Activity)object0), 2));
                }
                else if(!e.a(((Activity)object0))) {
                    ((Activity)object0).recreate();
                }
                z1 = true;
            }
        }
        if(z1 || v4 == v3) {
            z2 = z1;
        }
        else {
            Resources resources0 = context0.getResources();
            Configuration configuration1 = new Configuration(resources0.getConfiguration());
            configuration1.uiMode = resources0.getConfiguration().uiMode & -49 | v3;
            Object object1 = null;
            resources0.updateConfiguration(configuration1, null);
            int v6 = Build.VERSION.SDK_INT;
            if(v6 < 26 && v6 < 28) {
                Class class0 = Resources.class;
                if(v6 >= 24) {
                    if(!a0.j) {
                        try {
                            Field field0 = class0.getDeclaredField("mResourcesImpl");
                            a0.i = field0;
                            field0.setAccessible(true);
                        }
                        catch(NoSuchFieldException noSuchFieldException0) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", noSuchFieldException0);
                        }
                        a0.j = true;
                    }
                    Field field1 = a0.i;
                    if(field1 != null) {
                        try {
                            object2 = field1.get(resources0);
                        }
                        catch(IllegalAccessException illegalAccessException0) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", illegalAccessException0);
                            object2 = null;
                        }
                        if(object2 != null) {
                            if(!a0.d) {
                                try {
                                    Field field2 = object2.getClass().getDeclaredField("mDrawableCache");
                                    a0.c = field2;
                                    field2.setAccessible(true);
                                }
                                catch(NoSuchFieldException noSuchFieldException1) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", noSuchFieldException1);
                                }
                                a0.d = true;
                            }
                            Field field3 = a0.c;
                            if(field3 != null) {
                                try {
                                    object1 = field3.get(object2);
                                }
                                catch(IllegalAccessException illegalAccessException1) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", illegalAccessException1);
                                }
                            }
                            if(object1 != null) {
                                a0.s(object1);
                            }
                        }
                    }
                }
                else if(v6 >= 23) {
                    if(!a0.d) {
                        try {
                            Field field4 = class0.getDeclaredField("mDrawableCache");
                            a0.c = field4;
                            field4.setAccessible(true);
                        }
                        catch(NoSuchFieldException noSuchFieldException2) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", noSuchFieldException2);
                        }
                        a0.d = true;
                    }
                    Field field5 = a0.c;
                    if(field5 == null) {
                        object3 = null;
                    }
                    else {
                        try {
                            object3 = field5.get(resources0);
                        }
                        catch(IllegalAccessException illegalAccessException2) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", illegalAccessException2);
                            object3 = null;
                        }
                    }
                    if(object3 != null) {
                        a0.s(object3);
                    }
                }
                else {
                    if(!a0.d) {
                        try {
                            Field field6 = class0.getDeclaredField("mDrawableCache");
                            a0.c = field6;
                            field6.setAccessible(true);
                        }
                        catch(NoSuchFieldException noSuchFieldException3) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", noSuchFieldException3);
                        }
                        a0.d = true;
                    }
                    Field field7 = a0.c;
                    if(field7 != null) {
                        try {
                            map0 = (Map)field7.get(resources0);
                        }
                        catch(IllegalAccessException illegalAccessException3) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", illegalAccessException3);
                            map0 = null;
                        }
                        if(map0 != null) {
                            map0.clear();
                        }
                    }
                }
            }
            int v7 = this.T;
            if(v7 != 0) {
                context0.setTheme(v7);
                if(Build.VERSION.SDK_INT >= 23) {
                    context0.getTheme().applyStyle(this.T, true);
                }
            }
            if(z3 && object0 instanceof Activity) {
                if(!(((Activity)object0) instanceof n)) {
                    if(this.Q) {
                        ((Activity)object0).onConfigurationChanged(configuration1);
                    }
                }
                else if(((androidx.lifecycle.p)((n)(((Activity)object0))).getLifecycle()).b.compareTo(androidx.lifecycle.h.l) >= 0) {
                    ((Activity)object0).onConfigurationChanged(configuration1);
                }
            }
        }
        if(z2 && object0 instanceof h) {
            h h0 = (h)object0;
        }
        if(v == 0) {
            this.r().h();
        }
        else {
            p p0 = this.W;
            if(p0 != null) {
                p0.c();
            }
        }
        if(v == 3) {
            if(this.X == null) {
                this.X = new p(this, context0);
            }
            this.X.h();
            return z2;
        }
        p p1 = this.X;
        if(p1 != null) {
            p1.c();
        }
        return z2;
    }

    public final void j(Window window0) {
        if(this.m != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback window$Callback0 = window0.getCallback();
        if(window$Callback0 instanceof o) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        o o0 = new o(this, window$Callback0);
        this.n = o0;
        window0.setCallback(o0);
        Context context0 = this.l;
        Drawable drawable0 = null;
        TypedArray typedArray0 = context0.obtainStyledAttributes(null, t.g0);
        if(typedArray0.hasValue(0)) {
            int v = typedArray0.getResourceId(0, 0);
            if(v != 0) {
                l.t t0 = l.t.a();
                synchronized(t0) {
                    drawable0 = t0.a.g(context0, v, true);
                }
            }
        }
        if(drawable0 != null) {
            window0.setBackgroundDrawable(drawable0);
        }
        typedArray0.recycle();
        this.m = window0;
    }

    public final void k(int v, s s0, k.l l0) {
        if(l0 == null) {
            if(s0 == null && v >= 0) {
                s[] arr_s = this.M;
                if(v < arr_s.length) {
                    s0 = arr_s[v];
                }
            }
            if(s0 != null) {
                l0 = s0.h;
            }
        }
        if(s0 != null && !s0.m) {
            return;
        }
        if(!this.R) {
            this.n.i.onPanelClosed(v, l0);
        }
    }

    public final void l(k.l l0) {
        if(this.L) {
            return;
        }
        this.L = true;
        ActionBarOverlayLayout actionBarOverlayLayout0 = (ActionBarOverlayLayout)this.s;
        actionBarOverlayLayout0.k();
        ActionMenuView actionMenuView0 = ((I0)actionBarOverlayLayout0.m).a.i;
        if(actionMenuView0 != null) {
            l.j j0 = actionMenuView0.B;
            if(j0 != null) {
                j0.e();
                f f0 = j0.B;
                if(f0 != null && f0.b()) {
                    f0.i.dismiss();
                }
            }
        }
        Window.Callback window$Callback0 = this.m.getCallback();
        if(window$Callback0 != null && !this.R) {
            window$Callback0.onPanelClosed(108, l0);
        }
        this.L = false;
    }

    public final void m(s s0, boolean z) {
        if(z && s0.a == 0) {
            U u0 = this.s;
            if(u0 != null) {
                ((ActionBarOverlayLayout)u0).k();
                ActionMenuView actionMenuView0 = ((I0)((ActionBarOverlayLayout)u0).m).a.i;
                if(actionMenuView0 != null && (actionMenuView0.B != null && actionMenuView0.B.h())) {
                    this.l(s0.h);
                    return;
                }
            }
        }
        WindowManager windowManager0 = (WindowManager)this.l.getSystemService("window");
        if(windowManager0 != null && s0.m) {
            r r0 = s0.e;
            if(r0 != null) {
                windowManager0.removeView(r0);
                if(z) {
                    this.k(s0.a, s0, null);
                }
            }
        }
        s0.k = false;
        s0.l = false;
        s0.m = false;
        s0.f = null;
        s0.n = true;
        if(this.N == s0) {
            this.N = null;
        }
    }

    public final boolean n(KeyEvent keyEvent0) {
        boolean z2;
        boolean z4;
        boolean z = true;
        if(this.k instanceof E.d || this.k instanceof f.g) {
            View view0 = this.m.getDecorView();
            if(view0 != null && O2.A.r(view0, keyEvent0)) {
                return true;
            }
        }
        if(keyEvent0.getKeyCode() == 82 && this.n.i.dispatchKeyEvent(keyEvent0)) {
            return true;
        }
        int v = keyEvent0.getKeyCode();
        if(keyEvent0.getAction() == 0) {
            switch(v) {
                case 4: {
                    goto label_11;
                }
                case 82: {
                    goto label_15;
                }
            }
            return false;
        label_11:
            if((keyEvent0.getFlags() & 0x80) == 0) {
                z = false;
            }
            this.O = z;
            return false;
        label_15:
            if(keyEvent0.getRepeatCount() == 0) {
                s s0 = this.s(0);
                if(!s0.m) {
                    this.x(s0, keyEvent0);
                    return true;
                }
            }
        }
        else {
            switch(v) {
                case 4: {
                    boolean z1 = this.O;
                    this.O = false;
                    s s1 = this.s(0);
                    if(!s1.m) {
                        h0 h00 = this.v;
                        if(h00 != null) {
                            h00.b();
                            return true;
                        }
                        this.t();
                        A a0 = this.p;
                        if(a0 != null) {
                            V v1 = a0.h;
                            if(v1 != null) {
                                E0 e00 = ((I0)v1).a.R;
                                if(e00 != null) {
                                    k.n n0 = e00.j;
                                    if(n0 != null) {
                                        if(e00 == null) {
                                            n0 = null;
                                        }
                                        if(n0 != null) {
                                            n0.collapseActionView();
                                            return true;
                                        }
                                        return true;
                                    }
                                }
                            }
                        }
                        return false;
                    }
                    else if(!z1) {
                        this.m(s1, true);
                        return true;
                    }
                    break;
                }
                case 82: {
                    if(this.v == null) {
                        s s2 = this.s(0);
                        U u0 = this.s;
                        Context context0 = this.l;
                        if(u0 == null) {
                        label_80:
                            boolean z3 = s2.m;
                            if(z3 || s2.l) {
                                this.m(s2, true);
                                z2 = z3;
                            }
                            else if(s2.k) {
                                if(s2.o) {
                                    s2.k = false;
                                    z4 = this.x(s2, keyEvent0);
                                }
                                else {
                                    z4 = true;
                                }
                                if(z4) {
                                    this.v(s2, keyEvent0);
                                    z2 = true;
                                }
                                else {
                                    z2 = false;
                                }
                            }
                            else {
                                z2 = false;
                            }
                        }
                        else {
                            ((ActionBarOverlayLayout)u0).k();
                            Toolbar toolbar0 = ((I0)((ActionBarOverlayLayout)u0).m).a;
                            if(toolbar0.getVisibility() != 0 || (toolbar0.i == null || !toolbar0.i.A || ViewConfiguration.get(context0).hasPermanentMenuKey())) {
                                goto label_80;
                            }
                            else {
                                ActionBarOverlayLayout actionBarOverlayLayout0 = (ActionBarOverlayLayout)this.s;
                                actionBarOverlayLayout0.k();
                                ActionMenuView actionMenuView0 = ((I0)actionBarOverlayLayout0.m).a.i;
                                if(actionMenuView0 != null && (actionMenuView0.B != null && actionMenuView0.B.h())) {
                                    ActionBarOverlayLayout actionBarOverlayLayout1 = (ActionBarOverlayLayout)this.s;
                                    actionBarOverlayLayout1.k();
                                    ActionMenuView actionMenuView1 = ((I0)actionBarOverlayLayout1.m).a.i;
                                    z2 = actionMenuView1 == null || (actionMenuView1.B == null || !actionMenuView1.B.e()) ? false : true;
                                }
                                else if(this.R || !this.x(s2, keyEvent0)) {
                                    z2 = false;
                                }
                                else {
                                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout)this.s;
                                    actionBarOverlayLayout2.k();
                                    ActionMenuView actionMenuView2 = ((I0)actionBarOverlayLayout2.m).a.i;
                                    z2 = actionMenuView2 == null || (actionMenuView2.B == null || !actionMenuView2.B.l()) ? false : true;
                                }
                            }
                        }
                        if(z2) {
                            AudioManager audioManager0 = (AudioManager)context0.getSystemService("audio");
                            if(audioManager0 != null) {
                                audioManager0.playSoundEffect(0);
                                return true;
                            }
                            Log.w("AppCompatDelegate", "Couldn\'t get audio manager");
                            return true;
                        }
                    }
                    break;
                }
                default: {
                    return false;
                }
            }
        }
        return true;
    }

    public final void o(int v) {
        s s0 = this.s(v);
        if(s0.h != null) {
            Bundle bundle0 = new Bundle();
            s0.h.t(bundle0);
            if(bundle0.size() > 0) {
                s0.p = bundle0;
            }
            s0.h.w();
            s0.h.clear();
        }
        s0.o = true;
        s0.n = true;
        if((v == 0 || v == 108) && this.s != null) {
            s s1 = this.s(0);
            s1.k = false;
            this.x(s1, null);
        }
    }

    @Override  // android.view.LayoutInflater$Factory2
    public final View onCreateView(View view0, String s, Context context0, AttributeSet attributeSet0) {
        View view3;
        View view2;
        int v = 4;
        View view1 = null;
        if(this.e0 == null) {
            String s1 = this.l.obtainStyledAttributes(a.j).getString(0x72);
            if(s1 == null || "androidx.appcompat.app.AppCompatViewInflater".equals(s1)) {
                this.e0 = new AppCompatViewInflater();
            }
            else {
                try {
                    this.e0 = (AppCompatViewInflater)Class.forName(s1).getDeclaredConstructor(null).newInstance(null);
                }
                catch(Throwable throwable0) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + s1 + ". Falling back to default.", throwable0);
                    this.e0 = new AppCompatViewInflater();
                }
            }
        }
        AppCompatViewInflater appCompatViewInflater0 = this.e0;
        appCompatViewInflater0.getClass();
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, a.y, 0, 0);
        int v1 = typedArray0.getResourceId(4, 0);
        if(v1 != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArray0.recycle();
        Context context1 = v1 == 0 || context0 instanceof j.b && ((j.b)context0).a == v1 ? context0 : new j.b(context0, v1);
        s.getClass();
        switch(s.hashCode()) {
            case 0x8BFB3116: {
                v = s.equals("RatingBar") ? 0 : -1;
                break;
            }
            case 0xA93FEA19: {
                v = s.equals("CheckedTextView") ? 1 : -1;
                break;
            }
            case 0xAFC55853: {
                v = s.equals("MultiAutoCompleteTextView") ? 2 : -1;
                break;
            }
            case 0xC808F992: {
                v = s.equals("TextView") ? 3 : -1;
                break;
            }
            case 0xC81FB44D: {
                if(!s.equals("ImageButton")) {
                    v = -1;
                }
                break;
            }
            case 0xD8BF9A5B: {
                v = s.equals("SeekBar") ? 5 : -1;
                break;
            }
            case 0xEBBF49F9: {
                v = s.equals("Spinner") ? 6 : -1;
                break;
            }
            case 0x2E46A6ED: {
                v = s.equals("RadioButton") ? 7 : -1;
                break;
            }
            case 0x2FA453C6: {
                v = s.equals("ToggleButton") ? 8 : -1;
                break;
            }
            case 0x431B5280: {
                v = s.equals("ImageView") ? 9 : -1;
                break;
            }
            case 0x5445F9BA: {
                v = s.equals("AutoCompleteTextView") ? 10 : -1;
                break;
            }
            case 0x5F7507C3: {
                v = s.equals("CheckBox") ? 11 : -1;
                break;
            }
            case 0x63577677: {
                v = s.equals("EditText") ? 12 : -1;
                break;
            }
            case 2001146706: {
                v = s.equals("Button") ? 13 : -1;
                break;
            }
            default: {
                v = -1;
            }
        }
        switch(v) {
            case 0: {
                view2 = new B(context1, attributeSet0);
                break;
            }
            case 1: {
                view2 = new l.r(context1, attributeSet0);
                break;
            }
            case 2: {
                view2 = new x(context1, attributeSet0);
                break;
            }
            case 3: {
                view2 = new N(context1, attributeSet0);
                break;
            }
            case 4: {
                view2 = new v(context1, attributeSet0, 0x7F0200AC);  // attr:imageButtonStyle
                break;
            }
            case 5: {
                view2 = new C(context1, attributeSet0);
                break;
            }
            case 6: {
                view2 = new androidx.appcompat.widget.b(context1, attributeSet0);
                break;
            }
            case 7: {
                view2 = new l.A(context1, attributeSet0);
                break;
            }
            case 8: {
                view2 = new Q(context1, attributeSet0, 0x101004B);  // 初始化器: Landroid/widget/ToggleButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
                new M(((TextView)view2)).d(attributeSet0, 0x101004B);
                break;
            }
            case 9: {
                view2 = new w(context1, attributeSet0, 0);
                break;
            }
            case 10: {
                view2 = new l.n(context1, attributeSet0);
                break;
            }
            case 11: {
                view2 = new q(context1, attributeSet0);
                break;
            }
            case 12: {
                view2 = new l.u(context1, attributeSet0);
                break;
            }
            case 13: {
                view2 = new l.p(context1, attributeSet0);
                break;
            }
            default: {
                view2 = null;
            }
        }
        if(view2 == null && context0 != context1) {
            Object[] arr_object = appCompatViewInflater0.a;
            if(s.equals("view")) {
                s = attributeSet0.getAttributeValue(null, "class");
            }
            try {
                arr_object[0] = context1;
                arr_object[1] = attributeSet0;
                if(-1 == s.indexOf(46)) {
                    int v3 = 0;
                    while(true) {
                        String[] arr_s = AppCompatViewInflater.d;
                        if(v3 >= 3) {
                            break;
                        }
                        view3 = appCompatViewInflater0.a(context1, s, arr_s[v3]);
                        if(view3 != null) {
                            goto label_137;
                        }
                        ++v3;
                    }
                }
                else {
                    goto label_145;
                }
                goto label_151;
            }
            catch(Exception unused_ex) {
                goto label_149;
            }
            finally {
                arr_object[0] = null;
                arr_object[1] = null;
            }
        label_137:
            view1 = view3;
            try {
                goto label_151;
            label_145:
                View view4 = appCompatViewInflater0.a(context1, s, null);
                view1 = view4;
            }
            catch(Exception unused_ex) {
            label_149:
                arr_object[0] = null;
                arr_object[1] = null;
            }
        label_151:
            view2 = view1;
        }
        if(view2 != null) {
            Context context2 = view2.getContext();
            if(context2 instanceof ContextWrapper && view2.hasOnClickListeners()) {
                TypedArray typedArray1 = context2.obtainStyledAttributes(attributeSet0, AppCompatViewInflater.c);
                String s2 = typedArray1.getString(0);
                if(s2 != null) {
                    view2.setOnClickListener(new f.v(view2, s2));
                }
                typedArray1.recycle();
            }
        }
        return view2;
    }

    @Override  // android.view.LayoutInflater$Factory
    public final View onCreateView(String s, Context context0, AttributeSet attributeSet0) {
        return this.onCreateView(null, s, context0, attributeSet0);
    }

    public final void p() {
        ViewGroup viewGroup0;
        if(!this.A) {
            int[] arr_v = a.j;
            Context context0 = this.l;
            TypedArray typedArray0 = context0.obtainStyledAttributes(arr_v);
            if(!typedArray0.hasValue(0x73)) {
                typedArray0.recycle();
                throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            }
            if(typedArray0.getBoolean(0x7C, false)) {
                this.f(1);
            }
            else if(typedArray0.getBoolean(0x73, false)) {
                this.f(108);
            }
            if(typedArray0.getBoolean(0x74, false)) {
                this.f(109);
            }
            if(typedArray0.getBoolean(0x75, false)) {
                this.f(10);
            }
            this.J = typedArray0.getBoolean(0, false);
            typedArray0.recycle();
            this.q();
            this.m.getDecorView();
            LayoutInflater layoutInflater0 = LayoutInflater.from(context0);
            if(this.K) {
                viewGroup0 = this.I ? ((ViewGroup)layoutInflater0.inflate(0x7F0A0016, null)) : ((ViewGroup)layoutInflater0.inflate(0x7F0A0015, null));  // layout:abc_screen_simple_overlay_action_mode
                E.n.c(viewGroup0, new l(this));
            }
            else if(this.J) {
                viewGroup0 = (ViewGroup)layoutInflater0.inflate(0x7F0A000C, null);  // layout:abc_dialog_title_material
                this.H = false;
                this.G = false;
            }
            else if(this.G) {
                TypedValue typedValue0 = new TypedValue();
                context0.getTheme().resolveAttribute(0x7F020009, typedValue0, true);  // attr:actionBarTheme
                Context context1 = typedValue0.resourceId == 0 ? context0 : new j.b(context0, typedValue0.resourceId);
                viewGroup0 = (ViewGroup)LayoutInflater.from(context1).inflate(0x7F0A0017, null);  // layout:abc_screen_toolbar
                U u0 = (U)viewGroup0.findViewById(0x7F07006F);  // id:decor_content_parent
                this.s = u0;
                u0.setWindowCallback(this.m.getCallback());
                if(this.H) {
                    ((ActionBarOverlayLayout)this.s).j(109);
                }
                if(this.E) {
                    ((ActionBarOverlayLayout)this.s).j(2);
                }
                if(this.F) {
                    ((ActionBarOverlayLayout)this.s).j(5);
                }
            }
            else {
                viewGroup0 = null;
            }
            if(viewGroup0 == null) {
                goto label_123;
            }
            if(this.s == null) {
                this.C = (TextView)viewGroup0.findViewById(0x7F070116);  // id:title
            }
            try {
                Method method0 = viewGroup0.getClass().getMethod("makeOptionalFitsSystemWindows", null);
                if(!method0.isAccessible()) {
                    method0.setAccessible(true);
                }
                method0.invoke(viewGroup0, null);
                goto label_64;
            }
            catch(NoSuchMethodException unused_ex) {
            }
            catch(InvocationTargetException invocationTargetException0) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", invocationTargetException0);
                goto label_64;
            }
            catch(IllegalAccessException illegalAccessException0) {
                goto label_63;
            }
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
            goto label_64;
        label_63:
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", illegalAccessException0);
        label_64:
            ContentFrameLayout contentFrameLayout0 = (ContentFrameLayout)viewGroup0.findViewById(0x7F070029);  // id:action_bar_activity_content
            ViewGroup viewGroup1 = (ViewGroup)this.m.findViewById(0x1020002);
            if(viewGroup1 != null) {
                while(viewGroup1.getChildCount() > 0) {
                    View view0 = viewGroup1.getChildAt(0);
                    viewGroup1.removeViewAt(0);
                    contentFrameLayout0.addView(view0);
                }
                viewGroup1.setId(-1);
                contentFrameLayout0.setId(0x1020002);
                if(viewGroup1 instanceof FrameLayout) {
                    ((FrameLayout)viewGroup1).setForeground(null);
                }
            }
            this.m.setContentView(viewGroup0);
            contentFrameLayout0.setAttachListener(new m(this));
            this.B = viewGroup0;
            CharSequence charSequence0 = this.k instanceof Activity ? ((Activity)this.k).getTitle() : this.r;
            if(!TextUtils.isEmpty(charSequence0)) {
                U u1 = this.s;
                if(u1 == null) {
                    A a0 = this.p;
                    if(a0 == null) {
                        TextView textView0 = this.C;
                        if(textView0 != null) {
                            textView0.setText(charSequence0);
                        }
                    }
                    else {
                        I0 i00 = (I0)a0.h;
                        if(!i00.g) {
                            i00.h = charSequence0;
                            if((i00.b & 8) != 0) {
                                i00.a.setTitle(charSequence0);
                            }
                        }
                    }
                }
                else {
                    u1.setWindowTitle(charSequence0);
                }
            }
            ContentFrameLayout contentFrameLayout1 = (ContentFrameLayout)this.B.findViewById(0x1020002);
            View view1 = this.m.getDecorView();
            int v = view1.getPaddingLeft();
            int v1 = view1.getPaddingTop();
            int v2 = view1.getPaddingRight();
            int v3 = view1.getPaddingBottom();
            contentFrameLayout1.o.set(v, v1, v2, v3);
            if(contentFrameLayout1.isLaidOut()) {
                contentFrameLayout1.requestLayout();
            }
            TypedArray typedArray1 = context0.obtainStyledAttributes(arr_v);
            typedArray1.getValue(0x7A, contentFrameLayout1.getMinWidthMajor());
            typedArray1.getValue(0x7B, contentFrameLayout1.getMinWidthMinor());
            if(typedArray1.hasValue(120)) {
                typedArray1.getValue(120, contentFrameLayout1.getFixedWidthMajor());
            }
            if(typedArray1.hasValue(0x79)) {
                typedArray1.getValue(0x79, contentFrameLayout1.getFixedWidthMinor());
            }
            if(typedArray1.hasValue(0x76)) {
                typedArray1.getValue(0x76, contentFrameLayout1.getFixedHeightMajor());
            }
            if(typedArray1.hasValue(0x77)) {
                typedArray1.getValue(0x77, contentFrameLayout1.getFixedHeightMinor());
            }
            typedArray1.recycle();
            contentFrameLayout1.requestLayout();
            this.A = true;
            s s0 = this.s(0);
            if(!this.R && s0.h == null) {
                this.u(108);
                return;
            label_123:
                StringBuilder stringBuilder0 = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
                stringBuilder0.append(this.G);
                stringBuilder0.append(", windowActionBarOverlay: ");
                stringBuilder0.append(this.H);
                stringBuilder0.append(", android:windowIsFloating: ");
                stringBuilder0.append(this.J);
                stringBuilder0.append(", windowActionModeOverlay: ");
                stringBuilder0.append(this.I);
                stringBuilder0.append(", windowNoTitle: ");
                throw new IllegalArgumentException(u9.g(stringBuilder0, this.K, " }"));
            }
        }
    }

    public final void q() {
        if(this.m == null) {
            Object object0 = this.k;
            if(object0 instanceof Activity) {
                this.j(((Activity)object0).getWindow());
            }
        }
        if(this.m == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final f.q r() {
        if(this.W == null) {
            if(B1.a.m == null) {
                Context context0 = this.l.getApplicationContext();
                B1.a.m = new B1.a(context0, ((LocationManager)context0.getSystemService("location")));
            }
            this.W = new p(this, B1.a.m);
        }
        return this.W;
    }

    public final s s(int v) {
        s[] arr_s = this.M;
        if(arr_s == null || arr_s.length <= v) {
            s[] arr_s1 = new s[v + 1];
            if(arr_s != null) {
                System.arraycopy(arr_s, 0, arr_s1, 0, arr_s.length);
            }
            this.M = arr_s1;
            arr_s = arr_s1;
        }
        s s0 = arr_s[v];
        if(s0 == null) {
            s0 = new s();  // 初始化器: Ljava/lang/Object;-><init>()V
            s0.a = v;
            s0.n = false;
            arr_s[v] = s0;
        }
        return s0;
    }

    public final void t() {
        this.p();
        if(this.G && this.p == null) {
            Object object0 = this.k;
            if(object0 instanceof Activity) {
                this.p = new A(this.H, ((Activity)object0));
            }
            else if(object0 instanceof Dialog) {
                this.p = new A(((Dialog)object0));
            }
            A a0 = this.p;
            if(a0 != null) {
                boolean z = this.b0;
                if(!a0.k) {
                    a0.k = true;
                    ((I0)a0.h).a((z ? 4 : 0) & 4 | ((I0)a0.h).b & -5);
                }
            }
        }
    }

    public final void u(int v) {
        this.Z |= 1 << v;
        if(!this.Y) {
            this.m.getDecorView().postOnAnimation(this.a0);
            this.Y = true;
        }
    }

    public final void v(s s0, KeyEvent keyEvent0) {
        int v1;
        if(!s0.m && !this.R) {
            int v = s0.a;
            Context context0 = this.l;
            if(v == 0 && (context0.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
            Window.Callback window$Callback0 = this.m.getCallback();
            if(window$Callback0 != null && !window$Callback0.onMenuOpened(v, s0.h)) {
                this.m(s0, true);
                return;
            }
            WindowManager windowManager0 = (WindowManager)context0.getSystemService("window");
            if(windowManager0 == null) {
                return;
            }
            if(!this.x(s0, keyEvent0)) {
                return;
            }
            r r0 = s0.e;
            if(r0 == null || s0.n) {
                if(r0 == null) {
                    this.t();
                    Context context1 = this.p == null ? null : this.p.Z();
                    if(context1 != null) {
                        context0 = context1;
                    }
                    TypedValue typedValue0 = new TypedValue();
                    Resources.Theme resources$Theme0 = context0.getResources().newTheme();
                    resources$Theme0.setTo(context0.getTheme());
                    resources$Theme0.resolveAttribute(0x7F020002, typedValue0, true);  // attr:actionBarPopupTheme
                    int v2 = typedValue0.resourceId;
                    if(v2 != 0) {
                        resources$Theme0.applyStyle(v2, true);
                    }
                    resources$Theme0.resolveAttribute(0x7F020116, typedValue0, true);  // attr:panelMenuListTheme
                    int v3 = typedValue0.resourceId;
                    if(v3 == 0) {
                        resources$Theme0.applyStyle(0x7F0F00FF, true);  // style:Theme.AppCompat.CompactMenu
                    }
                    else {
                        resources$Theme0.applyStyle(v3, true);
                    }
                    j.b b0 = new j.b(context0, 0);
                    b0.getTheme().setTo(resources$Theme0);
                    s0.j = b0;
                    TypedArray typedArray0 = b0.obtainStyledAttributes(a.j);
                    s0.b = typedArray0.getResourceId(84, 0);
                    s0.d = typedArray0.getResourceId(1, 0);
                    typedArray0.recycle();
                    s0.e = new r(this, s0.j);
                    s0.c = 81;
                }
                else if(s0.n && r0.getChildCount() > 0) {
                    s0.e.removeAllViews();
                }
                View view1 = s0.g;
                if(view1 != null) {
                    s0.f = view1;
                    goto label_79;
                }
                else if(s0.h != null) {
                    if(this.u == null) {
                        this.u = new m(this);
                    }
                    m m0 = this.u;
                    if(s0.i == null) {
                        k.h h0 = new k.h(s0.j);
                        s0.i = h0;
                        h0.m = m0;
                        s0.h.b(h0, s0.h.a);
                    }
                    k.h h1 = s0.i;
                    r r1 = s0.e;
                    if(h1.l == null) {
                        h1.l = (ExpandedMenuView)h1.j.inflate(0x7F0A000D, r1, false);  // layout:abc_expanded_menu_layout
                        if(h1.n == null) {
                            h1.n = new k.g(h1);
                        }
                        h1.l.setAdapter(h1.n);
                        h1.l.setOnItemClickListener(h1);
                    }
                    s0.f = h1.l;
                    if(h1.l != null) {
                    label_79:
                        if(s0.f != null) {
                            if(s0.g == null) {
                                k.h h2 = s0.i;
                                if(h2.n == null) {
                                    h2.n = new k.g(h2);
                                }
                                if(h2.n.getCount() > 0) {
                                    goto label_85;
                                }
                            }
                            else {
                            label_85:
                                ViewGroup.LayoutParams viewGroup$LayoutParams1 = s0.f.getLayoutParams();
                                if(viewGroup$LayoutParams1 == null) {
                                    viewGroup$LayoutParams1 = new ViewGroup.LayoutParams(-2, -2);
                                }
                                s0.e.setBackgroundResource(s0.b);
                                ViewParent viewParent0 = s0.f.getParent();
                                if(viewParent0 instanceof ViewGroup) {
                                    ((ViewGroup)viewParent0).removeView(s0.f);
                                }
                                s0.e.addView(s0.f, viewGroup$LayoutParams1);
                                if(!s0.f.hasFocus()) {
                                    s0.f.requestFocus();
                                }
                                v1 = -2;
                            label_96:
                                s0.l = false;
                                WindowManager.LayoutParams windowManager$LayoutParams0 = new WindowManager.LayoutParams(v1, -2, 0, 0, 1002, 0x820000, -3);
                                windowManager$LayoutParams0.gravity = s0.c;
                                windowManager$LayoutParams0.windowAnimations = s0.d;
                                windowManager0.addView(s0.e, windowManager$LayoutParams0);
                                s0.m = true;
                            }
                        }
                    }
                }
            }
            else {
                View view0 = s0.g;
                if(view0 == null) {
                    v1 = -2;
                }
                else {
                    ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
                    v1 = viewGroup$LayoutParams0 == null || viewGroup$LayoutParams0.width != -1 ? -2 : -1;
                }
                goto label_96;
            }
        }
    }

    public final boolean w(s s0, int v, KeyEvent keyEvent0) {
        if(keyEvent0.isSystem()) {
            return false;
        }
        if(s0.k || this.x(s0, keyEvent0)) {
            return s0.h == null ? false : s0.h.performShortcut(v, keyEvent0, 1);
        }
        return false;
    }

    public final boolean x(s s0, KeyEvent keyEvent0) {
        Resources.Theme resources$Theme1;
        if(this.R) {
            return false;
        }
        if(s0.k) {
            return true;
        }
        s s1 = this.N;
        if(s1 != null && s1 != s0) {
            this.m(s1, false);
        }
        Window.Callback window$Callback0 = this.m.getCallback();
        int v = s0.a;
        if(window$Callback0 != null) {
            s0.g = window$Callback0.onCreatePanelView(v);
        }
        boolean z = v == 0 || v == 108;
        if(z) {
            U u0 = this.s;
            if(u0 != null) {
                ((ActionBarOverlayLayout)u0).k();
                ((I0)((ActionBarOverlayLayout)u0).m).l = true;
            }
        }
        if(s0.g == null) {
            k.l l0 = s0.h;
            if(l0 == null || s0.o) {
                if(l0 == null) {
                    Context context0 = this.l;
                    if((v == 0 || v == 108) && this.s != null) {
                        TypedValue typedValue0 = new TypedValue();
                        Resources.Theme resources$Theme0 = context0.getTheme();
                        resources$Theme0.resolveAttribute(0x7F020009, typedValue0, true);  // attr:actionBarTheme
                        if(typedValue0.resourceId == 0) {
                            resources$Theme0.resolveAttribute(0x7F02000A, typedValue0, true);  // attr:actionBarWidgetTheme
                            resources$Theme1 = null;
                        }
                        else {
                            resources$Theme1 = context0.getResources().newTheme();
                            resources$Theme1.setTo(resources$Theme0);
                            resources$Theme1.applyStyle(typedValue0.resourceId, true);
                            resources$Theme1.resolveAttribute(0x7F02000A, typedValue0, true);  // attr:actionBarWidgetTheme
                        }
                        if(typedValue0.resourceId != 0) {
                            if(resources$Theme1 == null) {
                                resources$Theme1 = context0.getResources().newTheme();
                                resources$Theme1.setTo(resources$Theme0);
                            }
                            resources$Theme1.applyStyle(typedValue0.resourceId, true);
                        }
                        if(resources$Theme1 != null) {
                            j.b b0 = new j.b(context0, 0);
                            b0.getTheme().setTo(resources$Theme1);
                            context0 = b0;
                        }
                    }
                    k.l l1 = new k.l(context0);
                    l1.e = this;
                    k.l l2 = s0.h;
                    if(l1 != l2) {
                        if(l2 != null) {
                            l2.r(s0.i);
                        }
                        s0.h = l1;
                        k.h h0 = s0.i;
                        if(h0 != null) {
                            l1.b(h0, l1.a);
                        }
                    }
                    if(s0.h == null) {
                        return false;
                    }
                }
                if(z) {
                    U u1 = this.s;
                    if(u1 != null) {
                        if(this.t == null) {
                            this.t = new l(this);
                        }
                        ((ActionBarOverlayLayout)u1).l(s0.h, this.t);
                    }
                }
                s0.h.w();
                if(!window$Callback0.onCreatePanelMenu(v, s0.h)) {
                    k.l l3 = s0.h;
                    if(l3 != null) {
                        l3.r(s0.i);
                        s0.h = null;
                    }
                    if(z) {
                        U u2 = this.s;
                        if(u2 != null) {
                            ((ActionBarOverlayLayout)u2).l(null, this.t);
                        }
                    }
                    return false;
                }
                s0.o = false;
            }
            s0.h.w();
            Bundle bundle0 = s0.p;
            if(bundle0 != null) {
                s0.h.s(bundle0);
                s0.p = null;
            }
            if(!window$Callback0.onPreparePanel(0, s0.g, s0.h)) {
                if(z) {
                    U u3 = this.s;
                    if(u3 != null) {
                        ((ActionBarOverlayLayout)u3).l(null, this.t);
                    }
                }
                s0.h.v();
                return false;
            }
            boolean z1 = KeyCharacterMap.load((keyEvent0 == null ? -1 : keyEvent0.getDeviceId())).getKeyboardType() != 1;
            s0.h.setQwertyMode(z1);
            s0.h.v();
        }
        s0.k = true;
        s0.l = false;
        this.N = s0;
        return true;
    }

    public final void y() {
        if(this.A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }
}

