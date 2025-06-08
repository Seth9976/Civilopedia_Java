package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzfvm;

public final class zzai implements Runnable {
    public final zzas zza;
    public final zzfvm zzb;

    public zzai(zzas zzas0, zzfvm zzfvm0) {
        this.zza = zzas0;
        this.zzb = zzfvm0;
    }

    @Override
    public final void run() {
        zzas zzas0 = this.zza;
        zzfvm zzfvm0 = this.zzb;
        zzas0.getClass();
        Context context0 = zzas0.a;
        if(!zzt.zzs().zzj(context0, zzas0.d, zzas0.e)) {
            zzt.zzs().zzd(context0, zzas0.d, zzas0.e);
            return;
        }
        zzfvm0.execute(new zzaf(zzas0));
    }
}

