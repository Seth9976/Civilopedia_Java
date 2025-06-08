package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

public final class zzdha implements Runnable {
    public final zzdhb zza;
    public final Object zzb;

    public zzdha(zzdhb zzdhb0, Object object0) {
        this.zza = zzdhb0;
        this.zzb = object0;
    }

    @Override
    public final void run() {
        try {
            this.zza.zza(this.zzb);
        }
        catch(Throwable throwable0) {
            zzt.zzo().zzs(throwable0, "EventEmitter.notify");
            zze.zzb("Event emitter exception.", throwable0);
        }
    }
}

