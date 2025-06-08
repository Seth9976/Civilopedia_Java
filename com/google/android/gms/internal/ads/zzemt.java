package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public final class zzemt implements zzdbw {
    public final zzemh zza;
    public final zzbrb zzb;

    public zzemt(zzemh zzemh0, zzbrb zzbrb0) {
        this.zza = zzemh0;
        this.zzb = zzbrb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdbw
    public final void zza(zze zze0) {
        zzbrb zzbrb0 = this.zzb;
        this.zza.zza(zze0);
        if(zzbrb0 != null) {
            try {
                zzbrb0.zzf(zze0);
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
        if(zzbrb0 != null) {
            try {
                zzbrb0.zze(zze0.zza);
            }
            catch(RemoteException remoteException1) {
                zzcfi.zzl("#007 Could not call remote method.", remoteException1);
            }
        }
    }
}

