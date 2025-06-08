package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.List;

public final class zzdyd implements Runnable {
    public final zzdyj zza;
    public final zzbqn zzb;

    public zzdyd(zzdyj zzdyj0, zzbqn zzbqn0) {
        this.zza = zzdyj0;
        this.zzb = zzbqn0;
    }

    @Override
    public final void run() {
        try {
            List list0 = this.zza.zzg();
            this.zzb.zzb(list0);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
        }
    }
}

