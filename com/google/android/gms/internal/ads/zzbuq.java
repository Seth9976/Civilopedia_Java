package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzdn;

public final class zzbuq extends zzdj {
    public final Object i;
    public volatile zzdn j;

    public zzbuq() {
        this.i = new Object();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final float zzf() throws RemoteException {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final float zzg() throws RemoteException {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final zzdn zzi() throws RemoteException {
        synchronized(this.i) {
        }
        return this.j;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final void zzj(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final void zzk() throws RemoteException {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final void zzm(zzdn zzdn0) throws RemoteException {
        synchronized(this.i) {
            this.j = zzdn0;
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final void zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzo() throws RemoteException {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzq() throws RemoteException {
        throw new RemoteException();
    }
}

