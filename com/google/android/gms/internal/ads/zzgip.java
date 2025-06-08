package com.google.android.gms.internal.ads;

public final class zzgip {
    public final byte[] a;
    public int b;
    public int c;

    public zzgip(byte[] arr_b) {
        this.a = new byte[0x100];
        for(int v = 0; v < 0x100; ++v) {
            this.a[v] = (byte)v;
        }
        int v1 = 0;
        for(int v2 = 0; v2 < 0x100; ++v2) {
            byte b = this.a[v2];
            v1 = v1 + b + arr_b[v2 % arr_b.length] & 0xFF;
            this.a[v2] = this.a[v1];
            this.a[v1] = b;
        }
        this.b = 0;
        this.c = 0;
    }

    public final void zza(byte[] arr_b) {
        int v = this.b;
        int v1 = this.c;
        for(int v2 = 0; v2 < 0x100; ++v2) {
            v = v + 1 & 0xFF;
            byte b = this.a[v];
            v1 = v1 + b & 0xFF;
            this.a[v] = this.a[v1];
            this.a[v1] = b;
            arr_b[v2] = (byte)(this.a[this.a[v] + b & 0xFF] ^ arr_b[v2]);
        }
        this.b = v;
        this.c = v1;
    }
}

