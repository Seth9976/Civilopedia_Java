package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcfi;

public final class zzag implements Runnable {
    public final zzas zza;

    public zzag(zzas zzas0) {
        this.zza = zzas0;
    }

    @Override
    public final void run() {
        this.zza.getClass();
        zzaw zzaw0 = zzt.zzs();
        String s = this.zza.d;
        String s1 = this.zza.e;
        String s2 = this.zza.f;
        boolean z = zzaw0.zzm();
        Context context0 = this.zza.a;
        zzaw0.zzh(zzaw0.zzj(context0, s, s1));
        if(zzaw0.zzm()) {
            if(!z && !TextUtils.isEmpty(s2)) {
                zzaw0.zze(context0, s1, s2, s);
            }
            zzcfi.zze("Device is linked for debug signals.");
            zzaw.a("The device is successfully linked for troubleshooting.", context0, false, true);
            return;
        }
        zzaw0.zzd(context0, s, s1);
    }
}

