package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzcxc implements Runnable {
    public final zzcxd zza;
    public final Runnable zzb;

    public zzcxc(zzcxd zzcxd0, Runnable runnable0) {
        this.zza = zzcxd0;
        this.zzb = runnable0;
    }

    @Override
    public final void run() {
        Runnable runnable0 = this.zzb;
        this.zza.getClass();
        try {
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(runnable0);
            if(!this.zza.i.zzb(iObjectWrapper0)) {
                Runnable runnable1 = (Runnable)((zzcxb)runnable0).zza.getAndSet(null);
                if(runnable1 != null) {
                    runnable1.run();
                }
            }
        }
        catch(RemoteException unused_ex) {
            Runnable runnable2 = (Runnable)((zzcxb)runnable0).zza.getAndSet(null);
            if(runnable2 != null) {
                runnable2.run();
            }
        }
    }
}

