package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.concurrent.atomic.AtomicReference;

public final class zzexh implements zzo, zzdbw, zzdcj, zzdds, zzdee, zzdjg, zzeyx {
    public final zzfdk i;
    public final AtomicReference j;
    public final AtomicReference k;
    public final AtomicReference l;
    public final AtomicReference m;
    public final AtomicReference n;
    public final AtomicReference o;
    public zzexh p;

    public zzexh(zzfdk zzfdk0) {
        this.j = new AtomicReference();
        this.k = new AtomicReference();
        this.l = new AtomicReference();
        this.m = new AtomicReference();
        this.n = new AtomicReference();
        this.o = new AtomicReference();
        this.p = null;
        this.i = zzfdk0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdbw
    public final void zza(zze zze0) {
        zzexh zzexh0 = this.p;
        if(zzexh0 != null) {
            zzexh0.zza(zze0);
            return;
        }
        zzews zzews0 = new zzews(zze0);
        zzeyo.zza(this.j, zzews0);
        zzewy zzewy0 = new zzewy(zze0);
        zzeyo.zza(this.j, zzewy0);
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        zzexh zzexh0 = this.p;
        if(zzexh0 != null) {
            zzexh0.zzb();
            return;
        }
        zzeyo.zza(this.n, zzexa.zza);
        zzeyo.zza(this.l, zzexb.zza);
        zzeyo.zza(this.l, zzexc.zza);
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
        zzexh zzexh0 = this.p;
        if(zzexh0 != null) {
            zzexh0.zzbC();
            return;
        }
        zzeyo.zza(this.n, zzewx.zza);
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
    }

    @Override  // com.google.android.gms.internal.ads.zzeyx
    public final void zzbL(zzeyx zzeyx0) {
        this.p = (zzexh)zzeyx0;
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
        zzexh zzexh0 = this.p;
        if(zzexh0 != null) {
            zzexh0.zze();
            return;
        }
        zzeyo.zza(this.n, zzexe.zza);
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int v) {
        zzexh zzexh0 = this.p;
        if(zzexh0 != null) {
            zzexh0.zzf(v);
            return;
        }
        zzeww zzeww0 = new zzeww(v);
        zzeyo.zza(this.n, zzeww0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdee
    public final void zzg(zzs zzs0) {
        zzexh zzexh0 = this.p;
        if(zzexh0 != null) {
            zzexh0.zzg(zzs0);
            return;
        }
        zzewv zzewv0 = new zzewv(zzs0);
        zzeyo.zza(this.o, zzewv0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdds
    public final void zzh() {
        zzexh zzexh0 = this.p;
        if(zzexh0 != null) {
            zzexh0.zzh();
            return;
        }
        zzeyo.zza(this.m, zzexg.zza);
    }

    public static zzexh zzi(zzexh zzexh0) {
        zzexh zzexh1 = new zzexh(zzexh0.i);
        zzexh1.p = zzexh0;
        return zzexh1;
    }

    public final void zzj() {
        zzexh zzexh0 = this.p;
        if(zzexh0 != null) {
            zzexh0.zzj();
            return;
        }
        this.i.zza();
        zzeyo.zza(this.k, zzewt.zza);
        zzeyo.zza(this.l, zzewu.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzdcj
    public final void zzk(zze zze0) {
        zzexh zzexh0 = this.p;
        if(zzexh0 != null) {
            zzexh0.zzk(zze0);
            return;
        }
        zzexd zzexd0 = new zzexd(zze0);
        zzeyo.zza(this.l, zzexd0);
    }

    public final void zzl(zzbcg zzbcg0) {
        zzexh zzexh0 = this.p;
        if(zzexh0 != null) {
            zzexh0.zzl(zzbcg0);
            return;
        }
        zzewz zzewz0 = new zzewz(zzbcg0);
        zzeyo.zza(this.j, zzewz0);
    }

    public final void zzn(zzdds zzdds0) {
        this.m.set(zzdds0);
    }

    public final void zzo(zzo zzo0) {
        this.n.set(zzo0);
    }

    public final void zzp(zzde zzde0) {
        this.o.set(zzde0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdjg
    public final void zzq() {
        zzexh zzexh0 = this.p;
        if(zzexh0 != null) {
            zzexh0.zzq();
            return;
        }
        zzeyo.zza(this.l, zzexf.zza);
    }

    public final void zzr(zzbcj zzbcj0) {
        this.j.set(zzbcj0);
    }

    public final void zzs(zzbcn zzbcn0) {
        this.l.set(zzbcn0);
    }

    public final void zzt(zzbck zzbck0) {
        this.k.set(zzbck0);
    }
}

