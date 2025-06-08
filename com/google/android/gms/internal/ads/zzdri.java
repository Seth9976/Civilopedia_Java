package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

public final class zzdri extends zzblr {
    public final String i;
    public final zzdnc j;
    public final zzdnh k;

    public zzdri(String s, zzdnc zzdnc0, zzdnh zzdnh0) {
        this.i = s;
        this.j = zzdnc0;
        this.k = zzdnh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbls
    public final Bundle zzb() throws RemoteException {
        return this.k.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzbls
    public final zzdk zzc() throws RemoteException {
        return this.k.zzj();
    }

    @Override  // com.google.android.gms.internal.ads.zzbls
    public final zzbkt zzd() throws RemoteException {
        return this.k.zzl();
    }

    @Override  // com.google.android.gms.internal.ads.zzbls
    public final zzblb zze() throws RemoteException {
        return this.k.zzo();
    }

    @Override  // com.google.android.gms.internal.ads.zzbls
    public final IObjectWrapper zzf() throws RemoteException {
        return this.k.zzt();
    }

    @Override  // com.google.android.gms.internal.ads.zzbls
    public final IObjectWrapper zzg() throws RemoteException {
        return ObjectWrapper.wrap(this.j);
    }

    @Override  // com.google.android.gms.internal.ads.zzbls
    public final String zzh() throws RemoteException {
        return this.k.zzv();
    }

    @Override  // com.google.android.gms.internal.ads.zzbls
    public final String zzi() throws RemoteException {
        return this.k.zzw();
    }

    @Override  // com.google.android.gms.internal.ads.zzbls
    public final String zzj() throws RemoteException {
        return this.k.zzx();
    }

    @Override  // com.google.android.gms.internal.ads.zzbls
    public final String zzk() throws RemoteException {
        return this.k.zzz();
    }

    @Override  // com.google.android.gms.internal.ads.zzbls
    public final String zzl() throws RemoteException {
        return this.i;
    }

    @Override  // com.google.android.gms.internal.ads.zzbls
    public final List zzm() throws RemoteException {
        return this.k.zzE();
    }

    @Override  // com.google.android.gms.internal.ads.zzbls
    public final void zzn() throws RemoteException {
        this.j.zzV();
    }

    @Override  // com.google.android.gms.internal.ads.zzbls
    public final void zzo(Bundle bundle0) throws RemoteException {
        this.j.zzz(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbls
    public final void zzp(Bundle bundle0) throws RemoteException {
        this.j.zzE(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbls
    public final boolean zzq(Bundle bundle0) throws RemoteException {
        return this.j.zzQ(bundle0);
    }
}

