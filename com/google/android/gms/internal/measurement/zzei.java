package com.google.android.gms.internal.measurement;

public final class zzei extends zzka implements zzlm {
    public final int zza() {
        return ((zzej)this.j).zza();
    }

    public final zzei zzb(String s) {
        if(this.k) {
            this.b();
            this.k = false;
        }
        zzej.j(((zzej)this.j), s);
        return this;
    }

    public final zzei zzc(int v, zzel zzel0) {
        if(this.k) {
            this.b();
            this.k = false;
        }
        zzej.k(((zzej)this.j), v, zzel0);
        return this;
    }

    public final zzel zzd(int v) {
        return ((zzej)this.j).zze(v);
    }

    // 去混淆评级： 低(20)
    public final String zze() {
        return "";
    }
}

