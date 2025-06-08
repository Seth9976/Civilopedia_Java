package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build.VERSION;

public final class zzaog {
    public NetworkCapabilities a;

    public final long zza() {
        synchronized(zzaog.class) {
            NetworkCapabilities networkCapabilities0 = this.a;
            if(networkCapabilities0 != null) {
                if(networkCapabilities0.hasTransport(4)) {
                    return 2L;
                }
                if(this.a.hasTransport(1)) {
                    return 1L;
                }
                if(this.a.hasTransport(0)) {
                    return 0L;
                }
            }
            return -1L;
        }
    }

    public final NetworkCapabilities zzb() {
        return this.a;
    }

    public static zzaog zzc(Context context0) {
        if(context0 != null) {
            ConnectivityManager connectivityManager0 = (ConnectivityManager)context0.getSystemService("connectivity");
            zzaog zzaog0 = new zzaog();  // 初始化器: Ljava/lang/Object;-><init>()V
            if(connectivityManager0 != null && Build.VERSION.SDK_INT >= 24) {
                try {
                    connectivityManager0.registerDefaultNetworkCallback(new B0(zzaog0, 0));
                    return zzaog0;
                }
                catch(RuntimeException unused_ex) {
                    synchronized(zzaog.class) {
                        zzaog0.a = null;
                    }
                }
            }
            return zzaog0;
        }
        return null;
    }
}

