package com.google.android.gms.ads.internal.util;

import B1.a;
import M1.f;
import Y.b;
import Y.c;
import Y.e;
import Y.n;
import Z.k;
import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzcfi;
import h0.i;
import java.util.HashMap;
import java.util.HashSet;

@KeepForSdk
public class WorkManagerUtil extends zzbq {
    public static void b(Context context0) {
        try {
            k.V(context0.getApplicationContext(), new b(new f(7)));
        }
        catch(IllegalStateException unused_ex) {
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(IObjectWrapper iObjectWrapper0) {
        k k0;
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        WorkManagerUtil.b(context0);
        try {
            k0 = k.U(context0);
        }
        catch(IllegalStateException illegalStateException0) {
            zzcfi.zzk("Failed to instantiate WorkManager.", illegalStateException0);
            return;
        }
        i0.b b0 = new i0.b(k0, 0);
        k0.n.k(b0);
        e e0 = new e();
        c c0 = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
        c0.a = 1;
        c0.f = -1L;
        c0.g = -1L;
        c0.h = new e();
        c0.b = false;
        c0.c = false;
        c0.a = 2;
        c0.d = false;
        c0.e = false;
        if(Build.VERSION.SDK_INT >= 24) {
            c0.h = e0;
            c0.f = -1L;
            c0.g = -1L;
        }
        a a0 = new a(OfflinePingSender.class);
        ((i)a0.k).j = c0;
        ((HashSet)a0.l).add("offline_ping_sender_work");
        k0.o(a0.d());
    }

    @Override  // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(IObjectWrapper iObjectWrapper0, String s, String s1) {
        k k0;
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        WorkManagerUtil.b(context0);
        e e0 = new e();
        c c0 = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
        c0.a = 1;
        c0.f = -1L;
        c0.g = -1L;
        c0.h = new e();
        c0.b = false;
        c0.c = false;
        c0.a = 2;
        c0.d = false;
        c0.e = false;
        if(Build.VERSION.SDK_INT >= 24) {
            c0.h = e0;
            c0.f = -1L;
            c0.g = -1L;
        }
        HashMap hashMap0 = new HashMap();
        hashMap0.put("uri", s);
        hashMap0.put("gws_query_id", s1);
        Y.f f0 = new Y.f(hashMap0);
        Y.f.b(f0);
        a a0 = new a(OfflineNotificationPoster.class);
        ((i)a0.k).j = c0;
        ((i)a0.k).e = f0;
        ((HashSet)a0.l).add("offline_notification_work");
        n n0 = a0.d();
        try {
            k0 = k.U(context0);
        }
        catch(IllegalStateException illegalStateException0) {
            zzcfi.zzk("Failed to instantiate WorkManager.", illegalStateException0);
            return false;
        }
        k0.o(n0);
        return true;
    }
}

