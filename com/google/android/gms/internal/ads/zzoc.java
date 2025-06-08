package com.google.android.gms.internal.ads;

public final class zzoc {
    public final zzmy[] a;
    public final zzou b;
    public final zzow c;

    public zzoc(zzmy[] arr_zzmy) {
        zzou zzou0 = new zzou();
        zzow zzow0 = new zzow();
        super();
        zzmy[] arr_zzmy1 = new zzmy[2];
        this.a = arr_zzmy1;
        System.arraycopy(arr_zzmy, 0, arr_zzmy1, 0, 0);
        this.b = zzou0;
        this.c = zzow0;
        arr_zzmy1[0] = zzou0;
        arr_zzmy1[1] = zzow0;
    }

    public final long zza(long v) {
        return this.c.zzi(v);
    }

    public final long zzb() {
        return this.b.zzo();
    }

    public final zzbt zzc(zzbt zzbt0) {
        this.c.zzk(zzbt0.zzc);
        this.c.zzj(zzbt0.zzd);
        return zzbt0;
    }

    public final boolean zzd(boolean z) {
        this.b.zzp(z);
        return z;
    }

    public final zzmy[] zze() {
        return this.a;
    }
}

