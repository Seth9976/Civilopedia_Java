package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzcu;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

public final class zzdrn extends zzbmx {
    public final String i;
    public final zzdnc j;
    public final zzdnh k;

    public zzdrn(String s, zzdnc zzdnc0, zzdnh zzdnh0) {
        this.i = s;
        this.j = zzdnc0;
        this.k = zzdnh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final void zzA() {
        this.j.zzA();
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final void zzB(Bundle bundle0) throws RemoteException {
        this.j.zzE(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final void zzC() {
        this.j.zzG();
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final void zzD(zzcq zzcq0) throws RemoteException {
        this.j.zzH(zzcq0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final void zzE(zzde zzde0) throws RemoteException {
        this.j.zzI(zzde0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final void zzF(zzbmv zzbmv0) throws RemoteException {
        this.j.zzJ(zzbmv0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final boolean zzG() {
        return this.j.zzN();
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final boolean zzH() throws RemoteException {
        return !this.k.zzF().isEmpty() && this.k.zzk() != null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final boolean zzI(Bundle bundle0) throws RemoteException {
        return this.j.zzQ(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final double zze() throws RemoteException {
        return this.k.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final Bundle zzf() throws RemoteException {
        return this.k.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final zzdh zzg() throws RemoteException {
        return !((Boolean)zzay.zzc().zzb(zzbhz.zzfK)).booleanValue() ? null : this.j.zzl();
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final zzdk zzh() throws RemoteException {
        return this.k.zzj();
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final zzbkt zzi() throws RemoteException {
        return this.k.zzl();
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final zzbky zzj() throws RemoteException {
        return this.j.zza().zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final zzblb zzk() throws RemoteException {
        return this.k.zzn();
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final IObjectWrapper zzl() throws RemoteException {
        return this.k.zzt();
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final IObjectWrapper zzm() throws RemoteException {
        return ObjectWrapper.wrap(this.j);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final String zzn() throws RemoteException {
        return this.k.zzv();
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final String zzo() throws RemoteException {
        return this.k.zzw();
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final String zzp() throws RemoteException {
        return this.k.zzx();
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final String zzq() throws RemoteException {
        return this.k.zzz();
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final String zzr() throws RemoteException {
        return this.i;
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final String zzs() throws RemoteException {
        return this.k.zzB();
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final String zzt() throws RemoteException {
        return this.k.zzC();
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final List zzu() throws RemoteException {
        return this.k.zzE();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final List zzv() throws RemoteException {
        return this.zzH() ? this.k.zzF() : Collections.emptyList();
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final void zzw() throws RemoteException {
        this.j.zzk();
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final void zzx() throws RemoteException {
        this.j.zzV();
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final void zzy(zzcu zzcu0) throws RemoteException {
        this.j.zzw(zzcu0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmy
    public final void zzz(Bundle bundle0) throws RemoteException {
        this.j.zzz(bundle0);
    }
}

