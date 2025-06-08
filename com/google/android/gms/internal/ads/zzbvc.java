package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbvc extends zzbuf {
    public final Adapter i;
    public final zzcaw j;

    public zzbvc(Adapter adapter0, zzcaw zzcaw0) {
        this.i = adapter0;
        this.j = zzcaw0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zze() throws RemoteException {
        zzcaw zzcaw0 = this.j;
        if(zzcaw0 != null) {
            zzcaw0.zze(ObjectWrapper.wrap(this.i));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzf() throws RemoteException {
        zzcaw zzcaw0 = this.j;
        if(zzcaw0 != null) {
            zzcaw0.zzf(ObjectWrapper.wrap(this.i));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzg(int v) throws RemoteException {
        zzcaw zzcaw0 = this.j;
        if(zzcaw0 != null) {
            zzcaw0.zzg(ObjectWrapper.wrap(this.i), v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzh(zze zze0) throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzi(int v, String s) throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzj(int v) throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzk(zze zze0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzl(String s) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzm() throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzn() throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzo() throws RemoteException {
        zzcaw zzcaw0 = this.j;
        if(zzcaw0 != null) {
            zzcaw0.zzi(ObjectWrapper.wrap(this.i));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzp() throws RemoteException {
        zzcaw zzcaw0 = this.j;
        if(zzcaw0 != null) {
            zzcaw0.zzj(ObjectWrapper.wrap(this.i));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzq(String s, String s1) throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzr(zzblv zzblv0, String s) throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzs(zzcax zzcax0) throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzt(zzcbb zzcbb0) throws RemoteException {
        zzcaw zzcaw0 = this.j;
        if(zzcaw0 != null) {
            zzcaw0.zzm(ObjectWrapper.wrap(this.i), new zzcax(zzcbb0.zzf(), zzcbb0.zze()));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzu() throws RemoteException {
        zzcaw zzcaw0 = this.j;
        if(zzcaw0 != null) {
            zzcaw0.zzn(ObjectWrapper.wrap(this.i));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzv() throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzw() throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzx() throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzy() throws RemoteException {
        zzcaw zzcaw0 = this.j;
        if(zzcaw0 != null) {
            zzcaw0.zzo(ObjectWrapper.wrap(this.i));
        }
    }
}

