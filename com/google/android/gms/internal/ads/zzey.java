package com.google.android.gms.internal.ads;

public final class zzey implements zzep {
    public final zzfm a;
    public zzfs b;
    public String c;
    public int d;
    public int e;
    public boolean f;

    public zzey() {
        this.a = new zzfm();
        this.d = 8000;
        this.e = 8000;
    }

    @Override  // com.google.android.gms.internal.ads.zzep
    public final zzeq zza() {
        return this.zzg();
    }

    public final zzey zzb(boolean z) {
        this.f = true;
        return this;
    }

    public final zzey zzc(int v) {
        this.d = v;
        return this;
    }

    public final zzey zzd(int v) {
        this.e = v;
        return this;
    }

    public final zzey zze(zzfs zzfs0) {
        this.b = zzfs0;
        return this;
    }

    public final zzey zzf(String s) {
        this.c = s;
        return this;
    }

    public final zzfd zzg() {
        zzfd zzfd0 = new zzfd(this.c, this.d, this.e, this.f, this.a);
        zzfs zzfs0 = this.b;
        if(zzfs0 != null) {
            zzfd0.zzf(zzfs0);
        }
        return zzfd0;
    }
}

