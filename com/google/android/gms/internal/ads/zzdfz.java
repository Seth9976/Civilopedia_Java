package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.overlay.zzo;

public final class zzdfz extends zzfko implements zza, zzo, zzarc, zzdbt, zzdcj, zzdcn, zzdds, zzdee, zzdjg {
    public final zzdfx i;
    public zzemh j;
    public zzeml k;
    public zzexh l;
    public zzfao m;

    public zzdfz() {
        this.i = new zzdfx(this);
    }

    public static void a(Object object0, l4 l40) {
        if(object0 != null) {
            l40.zza(object0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzdfz.a(this.j, zzdfn.zza);
        zzdfz.a(this.k, zzdfo.zza);
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        zzdfz.a(this.l, zzdft.zza);
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
        zzdfz.a(this.l, zzdew.zza);
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
        zzdfz.a(this.l, zzdfm.zza);
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
        zzdfz.a(this.l, zzdet.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzarc
    public final void zzbu(String s, String s1) {
        zzdfz.a(this.j, new zzdeq(s, s1));
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzbv() {
        zzdfz.a(this.j, zzder.zza);
        zzdfz.a(this.m, zzdes.zza);
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
        zzdfz.a(this.l, zzdep.zza);
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int v) {
        zzdfz.a(this.l, new zzdfk(v));
    }

    @Override  // com.google.android.gms.internal.ads.zzdee
    public final void zzg(zzs zzs0) {
        zzdfz.a(this.j, new zzdfq(zzs0));
        zzdfz.a(this.m, new zzdfr(zzs0));
        zzdfz.a(this.l, new zzdfs(zzs0));
    }

    @Override  // com.google.android.gms.internal.ads.zzdds
    public final void zzh() {
        zzdfz.a(this.l, zzdfc.zza);
    }

    public final zzdfx zzi() {
        return this.i;
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzj() {
        zzdfz.a(this.j, zzdfi.zza);
        zzdfz.a(this.m, zzdfj.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzdcj
    public final void zzk(zze zze0) {
        zzdfz.a(this.m, new zzdex(zze0));
        zzdfz.a(this.j, new zzdey(zze0));
    }

    @Override  // com.google.android.gms.internal.ads.zzdcn
    public final void zzl() {
        zzdfz.a(this.j, zzdfa.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzm() {
        zzdfz.a(this.j, zzdfl.zza);
        zzdfz.a(this.m, zzdfp.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzo() {
        zzdfz.a(this.j, zzdfu.zza);
        zzdfz.a(this.m, zzdfv.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzp(zzcal zzcal0, String s, String s1) {
        zzdfz.a(this.j, new zzdez(zzcal0, s, s1));
        zzdfz.a(this.m, new zzdfb(zzcal0, s, s1));
    }

    @Override  // com.google.android.gms.internal.ads.zzdjg
    public final void zzq() {
        zzdfz.a(this.j, zzdfd.zza);
        zzdfz.a(this.k, zzdfe.zza);
        zzdfz.a(this.m, zzdff.zza);
        zzdfz.a(this.l, zzdfg.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzr() {
        zzdfz.a(this.j, zzdeu.zza);
        zzdfz.a(this.m, zzdev.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzfko
    public final void zzv() {
        zzdfz.a(this.m, zzdfh.zza);
    }
}

