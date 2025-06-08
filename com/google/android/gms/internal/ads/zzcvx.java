package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzcvx implements Runnable {
    public final e4 zza;

    public zzcvx(e4 e40) {
        this.zza = e40;
    }

    @Override
    public final void run() {
        e4 e40 = this.zza;
        zzdns zzdns0 = e40.n;
        if(zzdns0.zze() != null) {
            try {
                zzdns0.zze().zze(((zzbs)e40.p.zzb()), ObjectWrapper.wrap(e40.i));
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzh("RemoteException when notifyAdLoad is called", remoteException0);
            }
        }
    }
}

