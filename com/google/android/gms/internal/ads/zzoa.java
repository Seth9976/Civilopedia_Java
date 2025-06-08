package com.google.android.gms.internal.ads;

public final class zzoa {
    public zzmv a;
    public zzoc b;

    public zzoa() {
        this.a = zzmv.zza;
    }

    public final zzoa zzb(zzmv zzmv0) {
        this.a = zzmv0;
        return this;
    }

    public final zzoa zzc(zzmy[] arr_zzmy) {
        this.b = new zzoc(arr_zzmy);
        return this;
    }

    public final zzom zzd() {
        if(this.b == null) {
            this.b = new zzoc(new zzmy[0]);
        }
        return new zzom(this);
    }
}

