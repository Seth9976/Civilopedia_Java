package com.google.android.gms.ads.internal.util;

import B.c;
import F0.d;
import F0.e;
import M1.f;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzaij;
import com.google.android.gms.internal.ads.zzaje;
import com.google.android.gms.internal.ads.zzaki;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzcfh;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcga;
import com.google.android.gms.internal.ads.zzfvl;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbo {
    public static zzaje a;
    public static final Object b;
    @Deprecated
    public static final zzbj zza;

    static {
        zzbo.b = new Object();
        zzbo.zza = new f(2);
    }

    public zzbo(Context context0) {
        if(context0.getApplicationContext() != null) {
            context0 = context0.getApplicationContext();
        }
        synchronized(zzbo.b) {
            if(zzbo.a == null) {
                zzbhz.zzc(context0);
                zzbo.a = ((Boolean)zzay.zzc().zzb(zzbhz.zzdx)).booleanValue() ? zzax.zzb(context0) : zzaki.zza(context0, null);
            }
        }
    }

    public final zzfvl zza(String s) {
        zzfvl zzfvl0 = new zzcga();
        zzbo.a.zza(new zzbn(s, null, ((zzcga)zzfvl0)));
        return zzfvl0;
    }

    public final zzfvl zzb(int v, String s, Map map0, byte[] arr_b) {
        zzfvl zzfvl0 = new e();  // 初始化器: Lcom/google/android/gms/internal/ads/zzcga;-><init>()V
        c c0 = new c(1, s, zzfvl0);
        byte[] arr_b1 = null;
        zzcfh zzcfh0 = new zzcfh(null);
        d d0 = new d(v, s, ((e)zzfvl0), c0, arr_b, map0, zzcfh0);
        if(zzcfh.zzl()) {
            try {
                Map map1 = d0.zzl();
                if(arr_b != null) {
                    arr_b1 = arr_b;
                }
                zzcfh0.zzd(s, "GET", map1, arr_b1);
            }
            catch(zzaij zzaij0) {
                zzcfi.zzj(zzaij0.getMessage());
            }
        }
        zzbo.a.zza(d0);
        return zzfvl0;
    }
}

