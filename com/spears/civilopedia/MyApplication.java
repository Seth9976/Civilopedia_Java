package com.spears.civilopedia;

import D3.b;
import J2.j;
import M1.f;
import T1.c;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import androidx.lifecycle.x;
import com.google.ads.mediation.d;
import com.google.android.gms.ads.appopen.AppOpenAd;
import f2.E;
import f2.g;
import f2.h;
import f2.i;
import f2.l;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import n2.A;
import o2.G;
import o2.I;
import o2.q;
import u2.a;
import x2.k;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/spears/civilopedia/MyApplication;", "Landroid/app/Application;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroidx/lifecycle/m;", "<init>", "()V", "Lw2/k;", "onMoveToForeground", "O2/A", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class MyApplication extends Application implements Application.ActivityLifecycleCallbacks, m {
    public i i;
    public A j;
    public g k;
    public Activity l;
    public static E m;
    public static Map n;

    public final A b() {
        A a0 = this.j;
        if(a0 != null) {
            return a0;
        }
        l l0 = (l)this.c().k.get();
        List list0 = new n2.m(l0, "").c();
        String s = l0.a.getString("city-planning-selected-leader", null);
        if(s == null) {
            s = ((q)list0.get(0)).b;
        }
        else {
            ArrayList arrayList0 = new ArrayList(k.E(list0));
            for(Object object0: list0) {
                arrayList0.add(((q)object0).b);
            }
            if(!arrayList0.contains(s)) {
                s = ((q)list0.get(0)).b;
            }
        }
        A a1 = new A(((l)this.c().k.get()), s);
        this.j = a1;
        return a1;
    }

    public final i c() {
        i i0 = this.i;
        if(i0 != null) {
            return i0;
        }
        j.l("component");
        throw null;
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
        j.f(activity0, "activity");
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
        j.f(activity0, "activity");
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
        j.f(activity0, "activity");
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity0) {
        j.f(activity0, "activity");
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
        j.f(activity0, "activity");
        j.f(bundle0, "outState");
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity0) {
        j.f(activity0, "activity");
        g g0 = this.k;
        if(g0 != null) {
            if(!g0.c) {
                this.l = activity0;
            }
            return;
        }
        j.l("appOpenAdManager");
        throw null;
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
        j.f(activity0, "activity");
    }

    @Override  // android.app.Application
    public final void onCreate() {
        super.onCreate();
        this.registerActivityLifecycleCallbacks(this);
        b b0 = new b(this, 17);
        i i0 = new i();  // 初始化器: Ljava/lang/Object;-><init>()V
        u2.b b1 = a.a(new c(b0, 25));
        i0.i = b1;
        i0.j = a.a(new h(b0, b1, 1));
        u2.b b2 = a.a(new h(b0, i0.i, 0));
        u2.b b3 = i0.i;
        u2.b b4 = i0.j;
        i i1 = new i();  // 初始化器: Ljava/lang/Object;-><init>()V
        i1.i = b3;
        i1.j = b4;
        i1.k = b2;
        i0.k = a.a(i1);
        this.i = i0;
        SharedPreferences sharedPreferences0 = this.getSharedPreferences("PrefsFile", 0);
        j.c(sharedPreferences0);
        String s = sharedPreferences0.getString("rule-set-key-text", null);
        E.i.getClass();
        MyApplication.m = f.e(s);
        Context context0 = this.getApplicationContext();
        j.e(context0, "getApplicationContext(...)");
        I.v(context0);
        x.q.n.a(this);
        this.k = new g();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @v(androidx.lifecycle.g.ON_START)
    public final void onMoveToForeground() {
        if(!G.b) {
            return;
        }
        Object object0 = ((l)this.c().k.get()).c.b().e;
        if(object0 == t.k) {
            object0 = null;
        }
        if((((q2.f)object0) == null ? false : ((q2.f)object0).a)) {
            return;
        }
        Activity activity0 = this.l;
        if(activity0 != null) {
            g g0 = this.k;
            if(g0 == null) {
                j.l("appOpenAdManager");
                throw null;
            }
            if(!g0.c) {
                if(g0.a == null || new Date().getTime() - g0.d >= 14400000L) {
                    g0.a(activity0);
                    return;
                }
                if(new Date().getTime() - g0.e >= 300000L) {
                    AppOpenAd appOpenAd0 = g0.a;
                    if(appOpenAd0 != null) {
                        appOpenAd0.setFullScreenContentCallback(new d(g0, activity0));
                    }
                    g0.c = true;
                    AppOpenAd appOpenAd1 = g0.a;
                    if(appOpenAd1 != null) {
                        appOpenAd1.show(activity0);
                    }
                    g0.e = new Date().getTime();
                }
            }
        }
    }
}

