package com.google.android.gms.internal.ads;

public final class zzbtj {
    public final zzbsm a;
    public zzfvl b;

    public zzbtj(zzbsm zzbsm0) {
        this.a = zzbsm0;
    }

    public final void a() {
        if(this.b == null) {
            zzcga zzcga0 = new zzcga();
            this.b = zzcga0;
            this.a.zzb(null).zzi(new zzbth(zzcga0), new zzbti(zzcga0));
        }
    }

    public final zzbtm zza(String s, zzbst zzbst0, zzbss zzbss0) {
        this.a();
        return new zzbtm(this.b, zzbst0, zzbss0);
    }

    public final void zzb(String s, zzbom zzbom0) {
        this.a();
        this.b = zzfvc.zzn(this.b, new zzbtf(s, zzbom0), zzcfv.zzf);
    }

    public final void zzc(String s, zzbom zzbom0) {
        this.b = zzfvc.zzm(this.b, new zzbtg(s, zzbom0), zzcfv.zzf);
    }
}

