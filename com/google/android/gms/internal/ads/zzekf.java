package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public class zzekf extends zzbuf {
    public final zzdbr i;
    public final zzdje j;
    public final zzdcl k;
    public final zzdda l;
    public final zzddf m;
    public final zzdgm n;
    public final zzddz o;
    public final zzdjw p;
    public final zzdgi q;
    public final zzdcg r;

    public zzekf(zzdbr zzdbr0, zzdje zzdje0, zzdcl zzdcl0, zzdda zzdda0, zzddf zzddf0, zzdgm zzdgm0, zzddz zzddz0, zzdjw zzdjw0, zzdgi zzdgi0, zzdcg zzdcg0) {
        this.i = zzdbr0;
        this.j = zzdje0;
        this.k = zzdcl0;
        this.l = zzdda0;
        this.m = zzddf0;
        this.n = zzdgm0;
        this.o = zzddz0;
        this.p = zzdjw0;
        this.q = zzdgi0;
        this.r = zzdcg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zze() {
        this.i.onAdClicked();
        this.j.zzq();
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzf() {
        this.o.zzf(4);
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzg(int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzh(zze zze0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzi(int v, String s) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    @Deprecated
    public final void zzj(int v) throws RemoteException {
        this.zzk(new zze(v, "", "undefined", null, null));
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzk(zze zze0) {
        zze zze1 = zzfdc.zzc(8, zze0);
        this.r.zza(zze1);
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzl(String s) {
        this.zzk(new zze(0, s, "undefined", null, null));
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public void zzm() {
        this.k.zza();
        this.q.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzn() {
        this.l.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzo() {
        this.m.zzn();
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzp() {
        this.o.zzb();
        this.q.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzq(String s, String s1) {
        this.n.zzbD(s, s1);
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzr(zzblv zzblv0, String s) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public void zzs(zzcax zzcax0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public void zzt(zzcbb zzcbb0) throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public void zzu() throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public void zzv() {
        this.p.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzw() {
        this.p.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public final void zzx() throws RemoteException {
        this.p.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzbug
    public void zzy() {
        this.p.zzd();
    }
}

