package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Callable;

public final class zzesq implements Callable {
    public final zzesr zza;

    public zzesq(zzesr zzesr0) {
        this.zza = zzesr0;
    }

    @Override
    public final Object call() {
        zzcdn zzcdn0 = this.zza.a;
        Context context0 = this.zza.c;
        if(!zzcdn0.zzu(context0)) {
            return new zzess(null, null, null, null, null);
        }
        String s = zzcdn0.zze(context0);
        String s1 = s == null ? "" : s;
        String s2 = zzcdn0.zzc(context0);
        String s3 = s2 == null ? "" : s2;
        String s4 = zzcdn0.zza(context0);
        String s5 = s4 == null ? "" : s4;
        String s6 = zzcdn0.zzb(context0);
        String s7 = s6 == null ? "" : s6;
        return "TIME_OUT".equals(s3) ? new zzess(s1, s3, s5, s7, ((Long)zzay.zzc().zzb(zzbhz.zzad))) : new zzess(s1, s3, s5, s7, null);
    }
}

