package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzcfi;

public final class zza implements Runnable {
    public final AdLoader zza;
    public final zzdr zzb;

    public zza(AdLoader adLoader0, zzdr zzdr0) {
        this.zza = adLoader0;
        this.zzb = zzdr0;
    }

    @Override
    public final void run() {
        this.zza.getClass();
        try {
            zzl zzl0 = this.zza.a.zza(this.zza.b, this.zzb);
            this.zza.c.zzg(zzl0);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("Failed to load ad.", remoteException0);
        }
    }
}

