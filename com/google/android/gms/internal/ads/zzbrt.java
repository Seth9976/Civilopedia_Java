package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzca;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

public final class zzbrt implements Runnable {
    public final zzbsm zza;
    public final zzbsl zzb;

    public zzbrt(zzbsm zzbsm0, zzaoc zzaoc0, zzbsl zzbsl0) {
        this.zza = zzbsm0;
        this.zzb = zzbsl0;
    }

    @Override
    public final void run() {
        zzbrp zzbrp0;
        zzbsm zzbsm0 = this.zza;
        zzbsl zzbsl0 = this.zzb;
        zzbsm0.getClass();
        try {
            zzbrp0 = new zzbrp(zzbsm0.b, zzbsm0.d, null, null);
        }
        catch(Throwable throwable0) {
            zzcfi.zzh("Error creating webview.", throwable0);
            zzt.zzo().zzt(throwable0, "SdkJavascriptFactory.loadJavascriptEngine");
            zzbsl0.zzg();
            return;
        }
        zzbrp0.zzk(new zzbrv(zzbsm0, zzbsl0, zzbrp0));
        zzbrp0.zzq("/jsLoaded", new X1(zzbsm0, zzbsl0, zzbrp0));
        zzca zzca0 = new zzca();
        X1 x10 = new X1(zzbsm0, zzbrp0, zzca0);
        zzca0.zzb(x10);
        zzbrp0.zzq("/requestReload", x10);
        String s = zzbsm0.c;
        if(s.endsWith(".js")) {
            zzbrp0.zzh(s);
        }
        else if(s.startsWith("<html>")) {
            zzbrp0.zzf(s);
        }
        else {
            zzbrp0.zzg(s);
        }
        o0 o00 = new o0(zzbsm0, zzbsl0, zzbrp0, 2);
        zzs.zza.postDelayed(o00, 60000L);
    }
}

