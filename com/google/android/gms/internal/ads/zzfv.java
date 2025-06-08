package com.google.android.gms.internal.ads;

public class zzfv {
    public int a;

    public final boolean a(int v) {
        return (this.a & v) == v;
    }

    public final void zza(int v) {
        this.a |= 0x80000000;
    }

    public void zzb() {
        this.a = 0;
    }

    public final void zzc(int v) {
        this.a = v;
    }

    public final boolean zze() {
        return this.a(0x10000000);
    }

    public final boolean zzf() {
        return this.a(0x80000000);
    }

    public final boolean zzg() {
        return this.a(4);
    }

    public final boolean zzh() {
        return this.a(1);
    }
}

