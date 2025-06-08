package f;

import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.j;
import j.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import l.I0;
import o2.I;

public abstract class h extends j implements i {
    public t A;

    @Override  // androidx.activity.e
    public final void addContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        t t0 = (t)this.i();
        t0.p();
        ((ViewGroup)t0.B.findViewById(0x1020002)).addView(view0, viewGroup$LayoutParams0);
        t0.n.i.onContentChanged();
    }

    @Override  // android.app.Activity
    public void attachBaseContext(Context context0) {
        super.attachBaseContext(context0);
        t t0 = (t)this.i();
        t0.i(false);
        t0.P = true;
    }

    @Override  // android.app.Activity
    public final void closeOptionsMenu() {
        this.j();
        if(this.getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override  // u.f
    public final boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        keyEvent0.getKeyCode();
        this.j();
        return super.dispatchKeyEvent(keyEvent0);
    }

    @Override  // android.app.Activity
    public final View findViewById(int v) {
        t t0 = (t)this.i();
        t0.p();
        return t0.m.findViewById(v);
    }

    @Override  // android.app.Activity
    public final MenuInflater getMenuInflater() {
        t t0 = (t)this.i();
        if(t0.q == null) {
            t0.t();
            t0.q = new g((t0.p == null ? t0.l : t0.p.Z()));
        }
        return t0.q;
    }

    @Override  // android.view.ContextThemeWrapper
    public final Resources getResources() {
        return super.getResources();
    }

    public final f.j i() {
        if(this.A == null) {
            this.A = new t(this, null, this, this);
        }
        return this.A;
    }

    @Override  // android.app.Activity
    public final void invalidateOptionsMenu() {
        t t0 = (t)this.i();
        t0.t();
        t0.u(0);
    }

    public final A j() {
        t t0 = (t)this.i();
        t0.t();
        return t0.p;
    }

    @Override  // androidx.fragment.app.j
    public final void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        t t0 = (t)this.i();
        if(t0.G && t0.A) {
            t0.t();
            A a0 = t0.p;
            if(a0 != null) {
                a0.b0(a0.d.getResources().getBoolean(0x7F030000));  // bool:abc_action_bar_embed_tabs
            }
        }
        l.t t1 = l.t.a();
        synchronized(t1) {
            t1.a.k(t0.l);
        }
        t0.i(false);
    }

    @Override  // android.app.Activity
    public final void onContentChanged() {
    }

    @Override  // androidx.fragment.app.j
    public void onCreate(Bundle bundle0) {
        f.j j0 = this.i();
        j0.a();
        j0.b();
        super.onCreate(bundle0);
    }

    @Override  // androidx.fragment.app.j
    public void onDestroy() {
        super.onDestroy();
        t t0 = (t)this.i();
        t0.getClass();
        synchronized(f.j.j) {
            f.j.c(t0);
        }
        if(t0.Y) {
            t0.m.getDecorView().removeCallbacks(t0.a0);
        }
        t0.Q = false;
        t0.R = true;
        p p0 = t0.W;
        if(p0 != null) {
            p0.c();
        }
        p p1 = t0.X;
        if(p1 != null) {
            p1.c();
        }
    }

    @Override  // android.app.Activity
    public final boolean onKeyDown(int v, KeyEvent keyEvent0) {
        if(Build.VERSION.SDK_INT < 26 && !keyEvent0.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent0.getMetaState()) && keyEvent0.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent0.getKeyCode())) {
            Window window0 = this.getWindow();
            return window0 == null || window0.getDecorView() == null || !window0.getDecorView().dispatchKeyShortcutEvent(keyEvent0) ? super.onKeyDown(v, keyEvent0) : true;
        }
        return super.onKeyDown(v, keyEvent0);
    }

    @Override  // androidx.fragment.app.j
    public final boolean onMenuItemSelected(int v, MenuItem menuItem0) {
        if(super.onMenuItemSelected(v, menuItem0)) {
            return true;
        }
        A a0 = this.j();
        if(menuItem0.getItemId() == 0x102002C && a0 != null && (((I0)a0.h).b & 4) != 0) {
            Intent intent0 = I.m(this);
            if(intent0 != null) {
                if(this.shouldUpRecreateTask(intent0)) {
                    ArrayList arrayList0 = new ArrayList();
                    Intent intent1 = I.m(this);
                    if(intent1 == null) {
                        intent1 = I.m(this);
                    }
                    if(intent1 != null) {
                        ComponentName componentName0 = intent1.getComponent();
                        if(componentName0 == null) {
                            componentName0 = intent1.resolveActivity(this.getPackageManager());
                        }
                        try {
                            int v1 = arrayList0.size();
                            for(Intent intent2 = I.n(this, componentName0); intent2 != null; intent2 = I.n(this, intent2.getComponent())) {
                                arrayList0.add(v1, intent2);
                            }
                        }
                        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                            throw new IllegalArgumentException(packageManager$NameNotFoundException0);
                        }
                        arrayList0.add(intent1);
                    }
                    if(arrayList0.isEmpty()) {
                        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
                    }
                    Intent[] arr_intent = (Intent[])arrayList0.toArray(new Intent[arrayList0.size()]);
                    arr_intent[0] = new Intent(arr_intent[0]).addFlags(0x1000C000);
                    if(!v.j.startActivities(this, arr_intent, null)) {
                        Intent intent3 = new Intent(arr_intent[arr_intent.length - 1]);
                        intent3.addFlags(0x10000000);
                        this.startActivity(intent3);
                    }
                    try {
                        this.finishAffinity();
                    }
                    catch(IllegalStateException unused_ex) {
                        this.finish();
                    }
                    return true;
                }
                this.navigateUpTo(intent0);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override  // android.app.Activity
    public final void onPostCreate(Bundle bundle0) {
        super.onPostCreate(bundle0);
        ((t)this.i()).p();
    }

    @Override  // androidx.fragment.app.j
    public final void onPostResume() {
        super.onPostResume();
        t t0 = (t)this.i();
        t0.t();
        A a0 = t0.p;
        if(a0 != null) {
            a0.w = true;
        }
    }

    @Override  // androidx.fragment.app.j
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        t t0 = (t)this.i();
        int v = t0.S;
        if(v != -100) {
            Class class0 = t0.k.getClass();
            t.f0.put(class0, v);
        }
    }

    @Override  // androidx.fragment.app.j
    public final void onStart() {
        super.onStart();
        t t0 = (t)this.i();
        t0.Q = true;
        t0.i(true);
        synchronized(f.j.j) {
            f.j.c(t0);
            WeakReference weakReference0 = new WeakReference(t0);
            f.j.i.add(weakReference0);
        }
    }

    @Override  // androidx.fragment.app.j
    public final void onStop() {
        super.onStop();
        t t0 = (t)this.i();
        t0.Q = false;
        synchronized(f.j.j) {
            f.j.c(t0);
        }
        t0.t();
        A a0 = t0.p;
        if(a0 != null) {
            a0.w = false;
            j.i i0 = a0.v;
            if(i0 != null) {
                i0.a();
            }
        }
        if(t0.k instanceof Dialog) {
            p p0 = t0.W;
            if(p0 != null) {
                p0.c();
            }
            p p1 = t0.X;
            if(p1 != null) {
                p1.c();
            }
        }
    }

    @Override  // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence0, int v) {
        super.onTitleChanged(charSequence0, v);
        this.i().h(charSequence0);
    }

    @Override  // android.app.Activity
    public final void openOptionsMenu() {
        this.j();
        if(this.getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override  // androidx.activity.e
    public final void setContentView(int v) {
        this.i().g(v);
    }

    @Override  // androidx.activity.e
    public void setContentView(View view0) {
        t t0 = (t)this.i();
        t0.p();
        ViewGroup viewGroup0 = (ViewGroup)t0.B.findViewById(0x1020002);
        viewGroup0.removeAllViews();
        viewGroup0.addView(view0);
        t0.n.i.onContentChanged();
    }

    @Override  // androidx.activity.e
    public final void setContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        t t0 = (t)this.i();
        t0.p();
        ViewGroup viewGroup0 = (ViewGroup)t0.B.findViewById(0x1020002);
        viewGroup0.removeAllViews();
        viewGroup0.addView(view0, viewGroup$LayoutParams0);
        t0.n.i.onContentChanged();
    }

    @Override  // android.app.Activity
    public final void setTheme(int v) {
        super.setTheme(v);
        ((t)this.i()).T = v;
    }
}

