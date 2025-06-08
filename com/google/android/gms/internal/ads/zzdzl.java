package com.google.android.gms.internal.ads;

public class zzdzl extends Exception {
    public final int i;

    public zzdzl(int v) {
        this.i = v;
    }

    public zzdzl(int v, String s) {
        super(s);
        this.i = v;
    }

    public zzdzl(int v, String s, Throwable throwable0) {
        super(s, throwable0);
        this.i = 1;
    }

    public final int zza() {
        return this.i;
    }
}

