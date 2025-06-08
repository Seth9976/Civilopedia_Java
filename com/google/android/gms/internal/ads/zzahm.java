package com.google.android.gms.internal.ads;

public final class zzahm {
    public final String a;
    public final int b;
    public final int c;
    public int d;
    public String e;

    public zzahm(int v, int v1, int v2) {
        this.a = v == 0x80000000 ? "" : v + "/";
        this.b = v1;
        this.c = v2;
        this.d = 0x80000000;
        this.e = "";
    }

    public final int zza() {
        int v = this.d;
        if(v == 0x80000000) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
        return v;
    }

    public final String zzb() {
        if(this.d == 0x80000000) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
        return this.e;
    }

    public final void zzc() {
        int v = this.d == 0x80000000 ? this.b : this.d + this.c;
        this.d = v;
        this.e = this.a + v;
    }
}

