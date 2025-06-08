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
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbz;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public final class zzbao implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    public final Context i;
    public final Application j;
    public final PowerManager k;
    public final KeyguardManager l;
    public g m;
    public WeakReference n;
    public final WeakReference o;
    public final C0 p;
    public final zzbz q;
    public boolean r;
    public int s;
    public final HashSet t;
    public final DisplayMetrics u;
    public final Rect v;
    public static final long w;
    public static final int x;

    static {
        zzbao.w = (long)(((Long)zzay.zzc().zzb(zzbhz.zzbf)));
    }

    public zzbao(Context context0, View view0) {
        this.q = new zzbz(zzbao.w);
        this.r = false;
        this.s = -1;
        this.t = new HashSet();
        Context context1 = context0.getApplicationContext();
        this.i = context1;
        WindowManager windowManager0 = (WindowManager)context0.getSystemService("window");
        this.k = (PowerManager)context1.getSystemService("power");
        this.l = (KeyguardManager)context0.getSystemService("keyguard");
        if(context1 instanceof Application) {
            this.j = (Application)context1;
            this.p = new C0(((Application)context1), this);
        }
        this.u = context0.getResources().getDisplayMetrics();
        Rect rect0 = new Rect();
        this.v = rect0;
        rect0.right = windowManager0.getDefaultDisplay().getWidth();
        rect0.bottom = windowManager0.getDefaultDisplay().getHeight();
        View view1 = this.o == null ? null : ((View)this.o.get());
        if(view1 != null) {
            view1.removeOnAttachStateChangeListener(this);
            this.f(view1);
        }
        this.o = new WeakReference(view0);
        if(view0 != null) {
            if(view0.isAttachedToWindow()) {
                this.e(view0);
            }
            view0.addOnAttachStateChangeListener(this);
        }
    }

    public final Rect a(Rect rect0) {
        float f = this.u.density;
        return new Rect(((int)(((float)rect0.left) / f)), ((int)(((float)rect0.top) / f)), ((int)(((float)rect0.right) / f)), ((int)(((float)rect0.bottom) / f)));
    }

    public final void b(Activity activity0, int v) {
        WeakReference weakReference0 = this.o;
        if(weakReference0 == null) {
            return;
        }
        Window window0 = activity0.getWindow();
        if(window0 == null) {
            return;
        }
        View view0 = window0.peekDecorView();
        View view1 = (View)weakReference0.get();
        if(view1 != null && view0 != null && view1.getRootView() == view0.getRootView()) {
            this.s = v;
        }
    }

    // 检测为 lambda 实现。
    public final void c(int v) {
        boolean z3;
        List list0;
        View view1;
        boolean z1;
        boolean z;
        HashSet hashSet0 = this.t;
        if(hashSet0.isEmpty()) {
            return;
        }
        WeakReference weakReference0 = this.o;
        if(weakReference0 == null) {
            return;
        }
        View view0 = (View)weakReference0.get();
        Rect rect0 = new Rect();
        Rect rect1 = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        int[] arr_v = new int[2];
        if(view0 == null) {
            view1 = null;
            z = false;
            z1 = false;
        }
        else {
            z = view0.getGlobalVisibleRect(rect1);
            z1 = view0.getLocalVisibleRect(rect2);
            view0.getHitRect(rect3);
            try {
                view0.getLocationOnScreen(arr_v);
                view0.getLocationInWindow(new int[2]);
            }
            catch(Exception exception0) {
                zzcfi.zzh("Failure getting view location.", exception0);
            }
            int v1 = arr_v[0];
            rect0.left = v1;
            rect0.top = arr_v[1];
            rect0.right = view0.getWidth() + v1;
            int v2 = rect0.top;
            rect0.bottom = view0.getHeight() + v2;
            view1 = view0;
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzbi)).booleanValue() && view1 != null) {
            try {
                list0 = new ArrayList();
                ViewParent viewParent0 = view1.getParent();
                while(true) {
                    if(!(viewParent0 instanceof View)) {
                        goto label_46;
                    }
                    Rect rect4 = new Rect();
                    if(((View)viewParent0).isScrollContainer() && ((View)viewParent0).getGlobalVisibleRect(rect4)) {
                        ((ArrayList)list0).add(this.a(rect4));
                    }
                    viewParent0 = viewParent0.getParent();
                }
            }
            catch(Exception exception1) {
            }
            zzt.zzo().zzt(exception1, "PositionWatcher.getParentScrollViewRects");
        }
        list0 = Collections.emptyList();
    label_46:
        int v3 = view1 == null ? 8 : view1.getWindowVisibility();
        int v4 = this.s;
        if(v4 != -1) {
            v3 = v4;
        }
        long v5 = zzs.zzt(view1);
        boolean z2 = ((Boolean)zzay.zzc().zzb(zzbhz.zzhZ)).booleanValue();
        KeyguardManager keyguardManager0 = this.l;
        PowerManager powerManager0 = this.k;
        if(!z2) {
            if(view0 == null || !zzs.zzO(view1, powerManager0, keyguardManager0) || !z || !z1 || v3 != 0) {
                z3 = false;
            }
            else {
                z3 = true;
                v3 = 0;
            }
        }
        else if(view0 != null && zzs.zzO(view1, powerManager0, keyguardManager0) && z && z1 && v5 >= ((long)(((int)(((Integer)zzay.zzc().zzb(zzbhz.zzic)))))) && v3 == 0) {
            z3 = true;
            v3 = 0;
        }
        else {
            z3 = false;
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzie)).booleanValue()) {
            zzs.zzF(view1, (v3 == 0 ? 0x80 : 0) | ((zzs.zzO(view1, powerManager0, keyguardManager0) ? 0x40 : 0) | (z ? 8 : 0) | (z1 ? 16 : 0)) | (v5 < ((long)(((int)(((Integer)zzay.zzc().zzb(zzbhz.zzic)))))) ? 0 : 0x20) | z3, null);
        }
        if(v == 1 && !this.q.zzb() && z3 == this.r) {
            return;
        }
        if(!z3 && !this.r && v == 1) {
            return;
        }
        zzbam zzbam0 = new zzbam(zzt.zzA().elapsedRealtime(), powerManager0.isScreenOn(), view1 != null && view1.isAttachedToWindow(), (view1 == null ? 8 : view1.getWindowVisibility()), this.a(this.v), this.a(rect0), this.a(rect1), z, this.a(rect2), z1, v5, this.a(rect3), this.u.density, z3, list0);
        for(Object object0: hashSet0) {
            ((zzban)object0).zzc(zzbam0);
        }
        this.r = z3;
    }

    public final void d() {
        zzbak zzbak0 = () -> {
            boolean z3;
            List list0;
            View view1;
            boolean z1;
            boolean z;
            HashSet hashSet0 = this.t;
            if(hashSet0.isEmpty()) {
                return;
            }
            WeakReference weakReference0 = this.o;
            if(weakReference0 == null) {
                return;
            }
            View view0 = (View)weakReference0.get();
            Rect rect0 = new Rect();
            Rect rect1 = new Rect();
            Rect rect2 = new Rect();
            Rect rect3 = new Rect();
            int[] arr_v = new int[2];
            if(view0 == null) {
                view1 = null;
                z = false;
                z1 = false;
            }
            else {
                z = view0.getGlobalVisibleRect(rect1);
                z1 = view0.getLocalVisibleRect(rect2);
                view0.getHitRect(rect3);
                try {
                    view0.getLocationOnScreen(arr_v);
                    view0.getLocationInWindow(new int[2]);
                }
                catch(Exception exception0) {
                    zzcfi.zzh("Failure getting view location.", exception0);
                }
                int v1 = arr_v[0];
                rect0.left = v1;
                rect0.top = arr_v[1];
                rect0.right = view0.getWidth() + v1;
                int v2 = rect0.top;
                rect0.bottom = view0.getHeight() + v2;
                view1 = view0;
            }
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzbi)).booleanValue() && view1 != null) {
                try {
                    list0 = new ArrayList();
                    ViewParent viewParent0 = view1.getParent();
                    while(true) {
                        if(!(viewParent0 instanceof View)) {
                            goto label_46;
                        }
                        Rect rect4 = new Rect();
                        if(((View)viewParent0).isScrollContainer() && ((View)viewParent0).getGlobalVisibleRect(rect4)) {
                            ((ArrayList)list0).add(this.a(rect4));
                        }
                        viewParent0 = viewParent0.getParent();
                    }
                }
                catch(Exception exception1) {
                }
                zzt.zzo().zzt(exception1, "PositionWatcher.getParentScrollViewRects");
            }
            list0 = Collections.emptyList();
        label_46:
            int v3 = view1 == null ? 8 : view1.getWindowVisibility();
            int v4 = this.s;
            if(v4 != -1) {
                v3 = v4;
            }
            long v5 = zzs.zzt(view1);
            boolean z2 = ((Boolean)zzay.zzc().zzb(zzbhz.zzhZ)).booleanValue();
            KeyguardManager keyguardManager0 = this.l;
            PowerManager powerManager0 = this.k;
            if(!z2) {
                if(view0 == null || !zzs.zzO(view1, powerManager0, keyguardManager0) || !z || !z1 || v3 != 0) {
                    z3 = false;
                }
                else {
                    z3 = true;
                    v3 = 0;
                }
            }
            else if(view0 != null && zzs.zzO(view1, powerManager0, keyguardManager0) && z && z1 && v5 >= ((long)(((int)(((Integer)zzay.zzc().zzb(zzbhz.zzic)))))) && v3 == 0) {
                z3 = true;
                v3 = 0;
            }
            else {
                z3 = false;
            }
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzie)).booleanValue()) {
                zzs.zzF(view1, (v3 == 0 ? 0x80 : 0) | ((zzs.zzO(view1, powerManager0, keyguardManager0) ? 0x40 : 0) | (z ? 8 : 0) | (z1 ? 16 : 0)) | (v5 < ((long)(((int)(((Integer)zzay.zzc().zzb(zzbhz.zzic)))))) ? 0 : 0x20) | z3, null);
            }
            if(3 == 1 && !this.q.zzb() && z3 == this.r) {
                return;
            }
            if(!z3 && !this.r && 3 == 1) {
                return;
            }
            zzbam zzbam0 = new zzbam(zzt.zzA().elapsedRealtime(), powerManager0.isScreenOn(), view1 != null && view1.isAttachedToWindow(), (view1 == null ? 8 : view1.getWindowVisibility()), this.a(this.v), this.a(rect0), this.a(rect1), z, this.a(rect2), z1, v5, this.a(rect3), this.u.density, z3, list0);
            for(Object object0: hashSet0) {
                ((zzban)object0).zzc(zzbam0);
            }
            this.r = z3;
        };
        zzs.zza.post(zzbak0);
    }

    public final void e(View view0) {
        ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
        if(viewTreeObserver0.isAlive()) {
            this.n = new WeakReference(viewTreeObserver0);
            viewTreeObserver0.addOnScrollChangedListener(this);
            viewTreeObserver0.addOnGlobalLayoutListener(this);
        }
        if(this.m == null) {
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("android.intent.action.SCREEN_ON");
            intentFilter0.addAction("android.intent.action.SCREEN_OFF");
            intentFilter0.addAction("android.intent.action.USER_PRESENT");
            this.m = new g(this, 3);
            zzt.zzv().zzc(this.i, this.m, intentFilter0);
        }
        Application application0 = this.j;
        if(application0 != null) {
            try {
                application0.registerActivityLifecycleCallbacks(this.p);
            }
            catch(Exception exception0) {
                zzcfi.zzh("Error registering activity lifecycle callbacks.", exception0);
            }
        }
    }

    public final void f(View view0) {
        try {
            WeakReference weakReference0 = this.n;
            if(weakReference0 != null) {
                ViewTreeObserver viewTreeObserver0 = (ViewTreeObserver)weakReference0.get();
                if(viewTreeObserver0 != null && viewTreeObserver0.isAlive()) {
                    viewTreeObserver0.removeOnScrollChangedListener(this);
                    viewTreeObserver0.removeGlobalOnLayoutListener(this);
                }
                this.n = null;
            }
            goto label_10;
        }
        catch(Exception exception0) {
        }
        zzcfi.zzh("Error while unregistering listeners from the last ViewTreeObserver.", exception0);
        try {
        label_10:
            ViewTreeObserver viewTreeObserver1 = view0.getViewTreeObserver();
            if(viewTreeObserver1.isAlive()) {
                viewTreeObserver1.removeOnScrollChangedListener(this);
                viewTreeObserver1.removeGlobalOnLayoutListener(this);
            }
        }
        catch(Exception exception1) {
            zzcfi.zzh("Error while unregistering listeners from the ViewTreeObserver.", exception1);
        }
        if(this.m != null) {
            try {
                zzt.zzv().zzd(this.i, this.m);
            }
            catch(IllegalStateException illegalStateException0) {
                zzcfi.zzh("Failed trying to unregister the receiver", illegalStateException0);
            }
            catch(Exception exception2) {
                zzt.zzo().zzt(exception2, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.m = null;
        }
        Application application0 = this.j;
        if(application0 != null) {
            try {
                application0.unregisterActivityLifecycleCallbacks(this.p);
            }
            catch(Exception exception3) {
                zzcfi.zzh("Error registering activity lifecycle callbacks.", exception3);
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
        this.b(activity0, 0);
        this.c(3);
        this.d();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
        this.c(3);
        this.d();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
        this.b(activity0, 4);
        this.c(3);
        this.d();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity0) {
        this.b(activity0, 0);
        this.c(3);
        this.d();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
        this.c(3);
        this.d();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity0) {
        this.b(activity0, 0);
        this.c(3);
        this.d();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
        this.c(3);
        this.d();
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.c(2);
        this.d();
    }

    @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
    public final void onScrollChanged() {
        this.c(1);
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        this.s = -1;
        this.e(view0);
        this.c(3);
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
        this.s = -1;
        this.c(3);
        this.d();
        this.f(view0);
    }

    public final void zzc(zzban zzban0) {
        this.t.add(zzban0);
        this.c(3);
    }

    public final void zze(zzban zzban0) {
        this.t.remove(zzban0);
    }

    public final void zzf() {
        this.q.zza(zzbao.w);
    }

    public final void zzg(long v) {
        this.q.zza(v);
    }
}

