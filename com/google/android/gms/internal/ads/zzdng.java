package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzdn;
import javax.annotation.Nullable;

public final class zzdng extends zzdj {
    public final Object i;
    public final zzdk j;
    public final zzbup k;

    public zzdng(@Nullable zzdk zzdk0, @Nullable zzbup zzbup0) {
        this.i = new Object();
        this.j = zzdk0;
        this.k = zzbup0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final float zzf() throws RemoteException {
        return this.k == null ? 0.0f : this.k.zzg();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final float zzg() throws RemoteException {
        return this.k == null ? 0.0f : this.k.zzh();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    @Nullable
    public final zzdn zzi() throws RemoteException {
        synchronized(this.i) {
            zzdk zzdk0 = this.j;
            if(zzdk0 != null) {
                return zzdk0.zzi();
            }
        }
        return null;
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
    public final void zzm(@Nullable zzdn zzdn0) throws RemoteException {
        synchronized(this.i) {
            zzdk zzdk0 = this.j;
            if(zzdk0 != null) {
                zzdk0.zzm(zzdn0);
            }
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

