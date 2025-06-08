package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzl;

public final class zzelm extends zzbk {
    public final zzems i;

    public zzelm(Context context0, zzcnf zzcnf0, zzfcb zzfcb0, zzdns zzdns0, zzbf zzbf0) {
        zzemu zzemu0 = new zzemu(zzdns0, zzcnf0.zzx());
        zzemu0.zze(zzbf0);
        this.i = new zzems(new zzene(zzcnf0, context0, zzemu0, zzfcb0), zzfcb0.zzI());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final String zze() {
        synchronized(this) {
            return this.i.zza();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final String zzf() {
        synchronized(this) {
            return this.i.zzb();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg(zzl zzl0) throws RemoteException {
        this.i.zzd(zzl0, 1);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zzh(zzl zzl0, int v) throws RemoteException {
        synchronized(this) {
            this.i.zzd(zzl0, v);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final boolean zzi() throws RemoteException {
        synchronized(this) {
            return this.i.zze();
        }
    }
}

