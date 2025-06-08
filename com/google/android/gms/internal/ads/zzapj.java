package com.google.android.gms.internal.ads;

import F0.g;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import java.lang.ref.WeakReference;

public final class zzapj implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    public final Context i;
    public final Application j;
    public final PowerManager k;
    public final KeyguardManager l;
    public g m;
    public final zzaov n;
    public WeakReference o;
    public WeakReference p;
    public final C0 q;
    public byte r;
    public int s;
    public long t;
    public static final Handler u;

    static {
        zzapj.u = new Handler(Looper.getMainLooper());
    }

    public zzapj(Context context0, zzaov zzaov0) {
        this.r = -1;
        this.s = -1;
        this.t = -3L;
        Context context1 = context0.getApplicationContext();
        this.i = context1;
        this.n = zzaov0;
        this.k = (PowerManager)context1.getSystemService("power");
        this.l = (KeyguardManager)context1.getSystemService("keyguard");
        if(context1 instanceof Application) {
            this.j = (Application)context1;
            this.q = new C0(((Application)context1), this);
        }
        this.a(null);
    }

    public final void a(View view0) {
        long v;
        View view1 = this.p == null ? null : ((View)this.p.get());
        if(view1 != null) {
            view1.removeOnAttachStateChangeListener(this);
            this.e(view1);
        }
        this.p = new WeakReference(view0);
        if(view0 == null) {
            v = -3L;
        }
        else {
            if(view0.getWindowToken() != null || view0.getWindowVisibility() != 8) {
                this.d(view0);
            }
            view0.addOnAttachStateChangeListener(this);
            v = -2L;
        }
        this.t = v;
    }

    public final void b(Activity activity0, int v) {
        if(this.p == null) {
            return;
        }
        Window window0 = activity0.getWindow();
        if(window0 == null) {
            return;
        }
        View view0 = window0.peekDecorView();
        View view1 = this.p == null ? null : ((View)this.p.get());
        if(view1 != null && view0 != null && view1.getRootView() == view0.getRootView()) {
            this.s = v;
        }
    }

    public final void c() {
        WindowManager.LayoutParams windowManager$LayoutParams0 = null;
        WeakReference weakReference0 = this.p;
        if(weakReference0 == null) {
            return;
        }
        View view0 = weakReference0 == null ? null : ((View)weakReference0.get());
        if(view0 == null) {
            this.t = -3L;
            this.r = -1;
            return;
        }
        int v = view0.getVisibility() == 0 ? 0 : 1;
        if(!view0.isShown()) {
            v |= 2;
        }
        if(this.k != null && !this.k.isScreenOn()) {
            v |= 4;
        }
        if(!this.n.a) {
            if(this.l == null || !this.l.inKeyguardRestrictedInputMode()) {
                v |= 8;
            }
            else {
                Activity activity0 = zzapf.zzb(view0);
                if(activity0 == null) {
                    v |= 8;
                }
                else {
                    Window window0 = activity0.getWindow();
                    if(window0 != null) {
                        windowManager$LayoutParams0 = window0.getAttributes();
                    }
                    if(windowManager$LayoutParams0 == null || (windowManager$LayoutParams0.flags & 0x80000) == 0) {
                        v |= 8;
                    }
                }
            }
        }
        if(!view0.getGlobalVisibleRect(new Rect())) {
            v |= 16;
        }
        if(!view0.getLocalVisibleRect(new Rect())) {
            v |= 0x20;
        }
        int v1 = view0.getWindowVisibility();
        int v2 = this.s;
        if(v2 != -1) {
            v1 = v2;
        }
        if(v1 != 0) {
            v |= 0x40;
        }
        if(this.r != v) {
            this.r = (byte)v;
            this.t = v == 0 ? SystemClock.elapsedRealtime() : -3L - ((long)v);
        }
    }

    public final void d(View view0) {
        ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
        if(viewTreeObserver0.isAlive()) {
            this.o = new WeakReference(viewTreeObserver0);
            viewTreeObserver0.addOnScrollChangedListener(this);
            viewTreeObserver0.addOnGlobalLayoutListener(this);
        }
        if(this.m == null) {
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("android.intent.action.SCREEN_ON");
            intentFilter0.addAction("android.intent.action.SCREEN_OFF");
            intentFilter0.addAction("android.intent.action.USER_PRESENT");
            g g0 = new g(this, 2);
            this.m = g0;
            this.i.registerReceiver(g0, intentFilter0);
        }
        Application application0 = this.j;
        if(application0 != null) {
            try {
                application0.registerActivityLifecycleCallbacks(this.q);
            }
            catch(Exception unused_ex) {
            }
        }
    }

    public final void e(View view0) {
        try {
            WeakReference weakReference0 = this.o;
            if(weakReference0 != null) {
                ViewTreeObserver viewTreeObserver0 = (ViewTreeObserver)weakReference0.get();
                if(viewTreeObserver0 != null && viewTreeObserver0.isAlive()) {
                    viewTreeObserver0.removeOnScrollChangedListener(this);
                    viewTreeObserver0.removeGlobalOnLayoutListener(this);
                }
                this.o = null;
            }
        }
        catch(Exception unused_ex) {
        }
        try {
            ViewTreeObserver viewTreeObserver1 = view0.getViewTreeObserver();
            if(viewTreeObserver1.isAlive()) {
                viewTreeObserver1.removeOnScrollChangedListener(this);
                viewTreeObserver1.removeGlobalOnLayoutListener(this);
            }
        }
        catch(Exception unused_ex) {
        }
        g g0 = this.m;
        if(g0 != null) {
            try {
                this.i.unregisterReceiver(g0);
            }
            catch(Exception unused_ex) {
            }
            this.m = null;
        }
        Application application0 = this.j;
        if(application0 != null) {
            try {
                application0.unregisterActivityLifecycleCallbacks(this.q);
            }
            catch(Exception unused_ex) {
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
        this.b(activity0, 0);
        this.c();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
        this.c();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
        this.b(activity0, 4);
        this.c();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity0) {
        this.b(activity0, 0);
        this.c();
        A0 a00 = new A0(this, 2);
        zzapj.u.post(a00);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
        this.c();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity0) {
        this.b(activity0, 0);
        this.c();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
        this.c();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.c();
    }

    @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
    public final void onScrollChanged() {
        this.c();
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        this.s = -1;
        this.d(view0);
        this.c();
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
        this.s = -1;
        this.c();
        A0 a00 = new A0(this, 2);
        zzapj.u.post(a00);
        this.e(view0);
    }

    public final long zza() {
        if(this.t <= -2L && (this.p == null ? null : ((View)this.p.get())) == null) {
            this.t = -3L;
        }
        return this.t;
    }
}

