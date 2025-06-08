package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdk;

public final class zzegl implements zzcxv {
    public final zzefg zza;

    public zzegl(zzefg zzefg0) {
        this.zza = zzefg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcxv
    public final zzdk zza() {
        try {
            return ((zzbvt)this.zza.zzb).zze();
        }
        catch(RemoteException remoteException0) {
            throw new zzfci(remoteException0);
        }
    }
}

