package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import i1.Z;
import i1.a0;

public final class zzki implements Runnable {
    public final Z zza;

    public zzki(Z z0) {
        this.zza = z0;
    }

    @Override
    public final void run() {
        Z z0 = this.zza;
        ((zzko)z0.k.k).zzg();
        zzko zzko0 = (zzko)z0.k.k;
        zzko0.a.zzay().zzc().zza("Application going to the background");
        zzge zzge0 = zzko0.a;
        zzge0.zzm().p.zza(true);
        Bundle bundle0 = new Bundle();
        if(!zzge0.zzf().zzu()) {
            ((a0)zzko0.e.k).a();
            zzko0.e.a(z0.j, false, false);
        }
        zzge0.zzq().d("auto", "_ab", bundle0, z0.i);
    }
}

