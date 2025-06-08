package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

public final class zzdrg extends zzblp {
    public final String i;
    public final zzdnc j;
    public final zzdnh k;

    public zzdrg(String s, zzdnc zzdnc0, zzdnh zzdnh0) {
        this.i = s;
        this.j = zzdnc0;
        this.k = zzdnh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzblq
    public final double zzb() throws RemoteException {
        return this.k.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzblq
    public final Bundle zzc() throws RemoteException {
        return this.k.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzblq
    public final zzdk zzd() throws RemoteException {
        return this.k.zzj();
    }

    @Override  // com.google.android.gms.internal.ads.zzblq
    public final zzbkt zze() throws RemoteException {
        return this.k.zzl();
    }

    @Override  // com.google.android.gms.internal.ads.zzblq
    public final zzblb zzf() throws RemoteException {
        return this.k.zzn();
    }

    @Override  // com.google.android.gms.internal.ads.zzblq
    public final IObjectWrapper zzg() throws RemoteException {
        return this.k.zzt();
    }

    @Override  // com.google.android.gms.internal.ads.zzblq
    public final IObjectWrapper zzh() throws RemoteException {
        return ObjectWrapper.wrap(this.j);
    }

    @Override  // com.google.android.gms.internal.ads.zzblq
    public final String zzi() throws RemoteException {
        return this.k.zzw();
    }

    @Override  // com.google.android.gms.internal.ads.zzblq
    public final String zzj() throws RemoteException {
        return this.k.zzx();
    }

    @Override  // com.google.android.gms.internal.ads.zzblq
    public final String zzk() throws RemoteException {
        return this.k.zzz();
    }

    @Override  // com.google.android.gms.internal.ads.zzblq
    public final String zzl() throws RemoteException {
        return this.i;
    }

    @Override  // com.google.android.gms.internal.ads.zzblq
    public final String zzm() throws RemoteException {
        return this.k.zzB();
    }

    @Override  // com.google.android.gms.internal.ads.zzblq
    public final String zzn() throws RemoteException {
        return this.k.zzC();
    }

    @Override  // com.google.android.gms.internal.ads.zzblq
    public final List zzo() throws RemoteException {
        return this.k.zzE();
    }

    @Override  // com.google.android.gms.internal.ads.zzblq
    public final void zzp() throws RemoteException {
        this.j.zzV();
    }

    @Override  // com.google.android.gms.internal.ads.zzblq
    public final void zzq(Bundle bundle0) throws RemoteException {
        this.j.zzz(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzblq
    public final void zzr(Bundle bundle0) throws RemoteException {
        this.j.zzE(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzblq
    public final boolean zzs(Bundle bundle0) throws RemoteException {
        return this.j.zzQ(bundle0);
    }
}

