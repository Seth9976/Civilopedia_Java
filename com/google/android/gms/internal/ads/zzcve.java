package com.google.android.gms.internal.ads;

import android.view.View;

public final class zzcve extends zzcxx {
    public final View i;
    public final zzcli j;
    public final zzfbm k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final zzcuw o;
    public zzbck p;

    public zzcve(zzcxw zzcxw0, View view0, zzcli zzcli0, zzfbm zzfbm0, int v, boolean z, boolean z1, zzcuw zzcuw0) {
        super(zzcxw0);
        this.i = view0;
        this.j = zzcli0;
        this.k = zzfbm0;
        this.l = v;
        this.m = z;
        this.n = z1;
        this.o = zzcuw0;
    }

    public final int zza() {
        return this.l;
    }

    public final View zzb() {
        return this.i;
    }

    public final zzfbm zzc() {
        return zzfch.zzb(this.b.zzs, this.k);
    }

    public final void zzd(zzbca zzbca0) {
        this.j.zzaj(zzbca0);
    }

    public final boolean zze() {
        return this.m;
    }

    public final boolean zzf() {
        return this.n;
    }

    public final boolean zzg() {
        return this.j.zzay();
    }

    public final boolean zzh() {
        return this.j.zzP() != null && this.j.zzP().zzJ();
    }

    public final void zzi(long v, int v1) {
        this.o.zza(v, v1);
    }

    public final zzbck zzj() {
        return this.p;
    }

    public final void zzk(zzbck zzbck0) {
        this.p = zzbck0;
    }
}

