package com.google.android.gms.internal.ads;

public final class zzagq implements zzagz {
    public zzad i;
    public zzee j;
    public zzzy k;

    public zzagq(String s) {
        zzab zzab0 = new zzab();
        zzab0.zzS(s);
        this.i = zzab0.zzY();
    }

    @Override  // com.google.android.gms.internal.ads.zzagz
    public final void zza(zzdy zzdy0) {
        zzcw.zzb(this.j);
        long v = this.j.zzd();
        long v1 = this.j.zze();
        if(v != 0x8000000000000001L && v1 != 0x8000000000000001L) {
            zzad zzad0 = this.i;
            if(v1 != zzad0.zzq) {
                zzab zzab0 = zzad0.zzb();
                zzab0.zzW(v1);
                zzad zzad1 = zzab0.zzY();
                this.i = zzad1;
                this.k.zzk(zzad1);
            }
            int v2 = zzdy0.zza();
            zzzw.zzb(this.k, zzdy0, v2);
            this.k.zzs(v, 1, v2, 0, null);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzagz
    public final void zzb(zzee zzee0, zzyu zzyu0, zzahm zzahm0) {
        this.j = zzee0;
        zzahm0.zzc();
        zzzy zzzy0 = zzyu0.zzv(zzahm0.zza(), 5);
        this.k = zzzy0;
        zzzy0.zzk(this.i);
    }
}

