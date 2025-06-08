package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcbl;
import com.google.android.gms.internal.ads.zzcfi;

public final class zzev implements Runnable {
    public final zzcbl zza;

    public zzev(zzcbl zzcbl0) {
        this.zza = zzcbl0;
    }

    @Override
    public final void run() {
        zzcbl zzcbl0 = this.zza;
        if(zzcbl0 != null) {
            try {
                zzcbl0.zze(1);
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
    }
}

