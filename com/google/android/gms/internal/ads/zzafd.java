package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

public final class zzafd implements zzyr {
    public zzyu a;
    public T b;
    public boolean c;
    public static final zzyy zza;

    static {
        zzafd.zza = zzafc.zza;
    }

    public final boolean a(zzys zzys0) {
        N n0 = new N();
        if(n0.a(zzys0, true) && (n0.a & 2) == 2) {
            int v = Math.min(n0.e, 8);
            zzdy zzdy0 = new zzdy(v);
            ((zzyl)zzys0).zzm(zzdy0.zzH(), 0, v, false);
            zzdy0.zzF(0);
            if(zzdy0.zza() >= 5 && zzdy0.zzk() == 0x7F && zzdy0.zzs() == 1179402563L) {
                this.b = new L();  // 初始化器: Lcom/google/android/gms/internal/ads/T;-><init>()V
                return true;
            }
            zzdy0.zzF(0);
            try {
                if(zzaae.zzd(1, zzdy0, true)) {
                    this.b = new V();  // 初始化器: Lcom/google/android/gms/internal/ads/T;-><init>()V
                    return true;
                }
            }
            catch(zzbp unused_ex) {
            }
            zzdy0.zzF(0);
            if(P.e(zzdy0, P.n)) {
                this.b = new P();  // 初始化器: Lcom/google/android/gms/internal/ads/T;-><init>()V
                return true;
            }
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final int zza(zzys zzys0, zzzr zzzr0) throws IOException {
        zzdy zzdy1;
        zzdy zzdy0;
        zzcw.zzb(this.a);
        if(this.b == null) {
            if(!this.a(zzys0)) {
                throw zzbp.zza("Failed to determine bitstream type", null);
            }
            zzys0.zzj();
        }
        if(!this.c) {
            zzzy zzzy0 = this.a.zzv(0, 1);
            this.a.zzB();
            T t0 = this.b;
            t0.c = this.a;
            t0.b = zzzy0;
            t0.b(true);
            this.c = true;
        }
        T t1 = this.b;
        zzcw.zzb(t1.b);
        M m0 = t1.a;
        switch(t1.h) {
            case 0: {
                while(true) {
                    if(!m0.a(zzys0)) {
                        t1.h = 3;
                        return -1;
                    }
                    t1.k = zzys0.zzf() - t1.f;
                    zzdy0 = m0.b;
                    if(!t1.c(zzdy0, t1.f, t1.j)) {
                        break;
                    }
                    t1.f = zzys0.zzf();
                }
                zzad zzad0 = (zzad)t1.j.j;
                t1.i = zzad0.zzA;
                if(!t1.m) {
                    t1.b.zzk(zzad0);
                    t1.m = true;
                }
                K k0 = (K)t1.j.k;
                if(k0 != null) {
                    t1.d = k0;
                    zzdy1 = zzdy0;
                }
                else if(zzys0.zzd() == -1L) {
                    t1.d = new S(0);
                    zzdy1 = zzdy0;
                }
                else {
                    boolean z = (m0.a.a & 4) != 0;
                    zzdy1 = zzdy0;
                    t1.d = new J(t1, t1.f, zzys0.zzd(), ((long)(m0.a.d + m0.a.e)), m0.a.b, z);
                }
                t1.h = 2;
                if(zzdy1.zzH().length != 0xFE01) {
                    zzdy1.zzD(Arrays.copyOf(zzdy1.zzH(), Math.max(0xFE01, zzdy1.zzd())), zzdy1.zzd());
                }
                return 0;
            }
            case 1: {
                ((zzyl)zzys0).zzo(((int)t1.f), false);
                t1.h = 2;
                return 0;
            }
            case 2: {
                long v = t1.d.zzd(zzys0);
                if(v >= 0L) {
                    zzzr0.zza = v;
                    return 1;
                }
                if(v < -1L) {
                    t1.d(-(v + 2L));
                }
                if(!t1.l) {
                    zzzu zzzu0 = t1.d.zze();
                    zzcw.zzb(zzzu0);
                    t1.c.zzL(zzzu0);
                    t1.l = true;
                }
                if(t1.k <= 0L && !m0.a(zzys0)) {
                    t1.h = 3;
                    return -1;
                }
                t1.k = 0L;
                zzdy zzdy2 = m0.b;
                long v1 = t1.a(zzdy2);
                if(v1 >= 0L) {
                    long v2 = t1.g;
                    if(v2 + v1 >= t1.e) {
                        long v3 = v2 * 1000000L / ((long)t1.i);
                        zzzw.zzb(t1.b, zzdy2, zzdy2.zzd());
                        t1.b.zzs(v3, 1, zzdy2.zzd(), 0, null);
                        t1.e = -1L;
                    }
                }
                t1.g += v1;
                return 0;
            }
            default: {
                return -1;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyu0) {
        this.a = zzyu0;
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long v, long v1) {
        T t0 = this.b;
        if(t0 != null) {
            t0.a.a.a = 0;
            t0.a.a.b = 0L;
            t0.a.a.c = 0;
            t0.a.a.d = 0;
            t0.a.a.e = 0;
            t0.a.b.zzC(0);
            t0.a.c = -1;
            t0.a.e = false;
            if(v == 0L) {
                t0.b(!t0.l);
                return;
            }
            if(t0.h != 0) {
                long v2 = ((long)t0.i) * v1 / 1000000L;
                t0.e = v2;
                t0.d.zzg(v2);
                t0.h = 2;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzys0) throws IOException {
        try {
            return this.a(zzys0);
        }
        catch(zzbp unused_ex) {
            return false;
        }
    }
}

