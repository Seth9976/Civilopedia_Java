package com.google.android.gms.internal.ads;

import java.io.IOException;

public class zzyh {
    public final zzyb a;
    public final zzyg b;
    public zzyd c;
    public final int d;

    public zzyh(zzye zzye0, zzyg zzyg0, long v, long v1, long v2, long v3, long v4, int v5) {
        this.b = zzyg0;
        this.d = v5;
        this.a = new zzyb(zzye0, v, 0L, v1, v2, v3, v4);
    }

    public static final int a(zzys zzys0, long v, zzzr zzzr0) {
        if(v == zzys0.zzf()) {
            return 0;
        }
        zzzr0.zza = v;
        return 1;
    }

    public final int zza(zzys zzys0, zzzr zzzr0) throws IOException {
        long v1;
        while(true) {
            zzyd zzyd0 = this.c;
            zzcw.zzb(zzyd0);
            long v = zzyd0.f;
            v1 = zzyd0.h;
            zzyg zzyg0 = this.b;
            if(zzyd0.g - v <= ((long)this.d)) {
                this.c = null;
                zzyg0.zzb();
                return zzyh.a(zzys0, v, zzzr0);
            }
            long v2 = v1 - zzys0.zzf();
            if(v2 < 0L || v2 > 0x40000L) {
                break;
            }
            ((zzyl)zzys0).zzo(((int)v2), false);
            zzys0.zzj();
            zzyf zzyf0 = zzyg0.zza(zzys0, zzyd0.b);
            int v3 = zzyf0.a;
            if(v3 != -3) {
                long v4 = zzyf0.b;
                long v5 = zzyf0.c;
                switch(v3) {
                    case -2: {
                        zzyd0.d = v4;
                        zzyd0.f = v5;
                        zzyd0.h = zzyd.a(zzyd0.b, v4, zzyd0.e, v5, zzyd0.g, zzyd0.c);
                        break;
                    }
                    case -1: {
                        zzyd0.e = v4;
                        zzyd0.g = v5;
                        zzyd0.h = zzyd.a(zzyd0.b, zzyd0.d, v4, zzyd0.f, v5, zzyd0.c);
                        break;
                    }
                    default: {
                        long v6 = v5 - zzys0.zzf();
                        if(v6 >= 0L && v6 <= 0x40000L) {
                            ((zzyl)zzys0).zzo(((int)v6), false);
                        }
                        this.c = null;
                        zzyg0.zzb();
                        return zzyh.a(zzys0, v5, zzzr0);
                    }
                }
                continue;
            }
            this.c = null;
            zzyg0.zzb();
            return zzyh.a(zzys0, v1, zzzr0);
        }
        return zzyh.a(zzys0, v1, zzzr0);
    }

    public final zzzu zzb() {
        return this.a;
    }

    public final void zzd(long v) {
        if(this.c != null && this.c.a == v) {
            return;
        }
        this.c = new zzyd(v, this.a.zzf(v), this.a.c, this.a.d, this.a.e, this.a.f);
    }

    public final boolean zze() {
        return this.c != null;
    }
}

