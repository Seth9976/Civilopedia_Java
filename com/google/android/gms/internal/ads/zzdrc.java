package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final class zzdrc implements Runnable {
    public final zzdre zza;

    public zzdrc(zzdre zzdre0) {
        this.zza = zzdre0;
    }

    @Override
    public final void run() {
        try {
            this.zza.zzd();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }
}

