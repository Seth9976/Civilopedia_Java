package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbqn;
import com.google.android.gms.internal.ads.zzcfi;
import java.util.Collections;

public final class zzer implements Runnable {
    public final zzes zza;

    public zzer(zzes zzes0) {
        this.zza = zzes0;
    }

    @Override
    public final void run() {
        zzbqn zzbqn0 = this.zza.i;
        if(zzbqn0 != null) {
            try {
                zzbqn0.zzb(Collections.emptyList());
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzk("Could not notify onComplete event.", remoteException0);
            }
        }
    }
}

