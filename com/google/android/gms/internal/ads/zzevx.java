package com.google.android.gms.internal.ads;

import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzch;
import java.util.HashMap;
import java.util.concurrent.Callable;

public final class zzevx implements Callable {
    public static final zzevx zza;

    static {
        zzevx.zza = new zzevx();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override
    public final Object call() {
        HashMap hashMap0 = new HashMap();
        String s = (String)zzay.zzc().zzb(zzbhz.zzI);
        if(s != null && !s.isEmpty() && Build.VERSION.SDK_INT >= ((int)(((Integer)zzay.zzc().zzb(zzbhz.zzJ))))) {
            String[] arr_s = s.split(",", -1);
            for(int v = 0; v < arr_s.length; ++v) {
                String s1 = arr_s[v];
                hashMap0.put(s1, zzch.zza(s1));
            }
        }
        return new zzevz(hashMap0);
    }
}

