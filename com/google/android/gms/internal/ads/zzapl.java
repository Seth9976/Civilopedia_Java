package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build.VERSION;
import java.util.concurrent.Executor;

public final class zzapl {
    public long a;
    public long b;
    public long c;
    public boolean d;
    public static final String[] e;

    static {
        zzapl.e = new String[]{"android:establish_vpn_service", "android:establish_vpn_manager"};
    }

    public final long zzb() {
        long v = this.c;
        this.c = -1L;
        return v;
    }

    // 去混淆评级： 低(20)
    public final long zzc() {
        return this.d ? this.b - this.a : -1L;
    }

    public static zzapl zzd(Context context0, Executor executor0) {
        String[] arr_s = zzapl.e;
        zzapl zzapl0 = new zzapl();  // 初始化器: Ljava/lang/Object;-><init>()V
        zzapl0.a = 0L;
        zzapl0.b = 0L;
        zzapl0.c = -1L;
        zzapl0.d = false;
        if(Build.VERSION.SDK_INT >= 30) {
            E0 e00 = new E0(zzapl0);
            try {
                ((AppOpsManager)context0.getSystemService("appops")).startWatchingActive(arr_s, executor0, e00);
            }
            catch(NoSuchMethodError | IllegalArgumentException unused_ex) {
            }
        }
        return zzapl0;
    }

    public final void zzh() {
        if(this.d) {
            this.b = System.currentTimeMillis();
        }
    }
}

