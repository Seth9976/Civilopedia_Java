package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzzz {
    public final byte[] a;
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public zzzz() {
        this.a = new byte[10];
    }

    public final void zza(zzzy zzzy0, zzzx zzzx0) {
        if(this.c > 0) {
            zzzy0.zzs(this.d, this.e, this.f, this.g, zzzx0);
            this.c = 0;
        }
    }

    public final void zzb() {
        this.b = false;
        this.c = 0;
    }

    public final void zzc(zzzy zzzy0, long v, int v1, int v2, int v3, zzzx zzzx0) {
        if(this.g > v2 + v3) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if(!this.b) {
            return;
        }
        int v4 = this.c;
        this.c = v4 + 1;
        if(v4 == 0) {
            this.d = v;
            this.e = v1;
            this.f = 0;
        }
        this.f += v2;
        this.g = v3;
        if(v4 + 1 >= 16) {
            this.zza(zzzy0, zzzx0);
        }
    }

    public final void zzd(zzys zzys0) throws IOException {
        if(this.b) {
            return;
        }
        zzys0.zzh(this.a, 0, 10);
        zzys0.zzj();
        if(this.a[4] == -8 && this.a[5] == 0x72 && this.a[6] == 0x6F && (this.a[7] & 0xFE) == 0xBA) {
            this.b = true;
        }
    }
}

