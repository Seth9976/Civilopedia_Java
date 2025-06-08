package com.google.android.gms.internal.ads;

import android.util.Log;

public final class zzgp implements zzja {
    public final zzvv a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public int g;
    public boolean h;

    public zzgp() {
        zzvv zzvv0 = new zzvv(true, 0x10000);
        super();
        zzgp.a(2500, 0, "bufferForPlaybackMs", "0");
        zzgp.a(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzgp.a(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        zzgp.a(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzgp.a(50000, 50000, "maxBufferMs", "minBufferMs");
        zzgp.a(0, 0, "backBufferDurationMs", "0");
        this.a = zzvv0;
        this.b = zzeg.zzv(50000L);
        this.c = zzeg.zzv(50000L);
        this.d = zzeg.zzv(2500L);
        this.e = zzeg.zzv(5000L);
        this.g = 0xC80000;
        this.f = zzeg.zzv(0L);
    }

    public static void a(int v, int v1, String s, String s1) {
        zzcw.zze(v >= v1, s + " cannot be less than " + s1);
    }

    @Override  // com.google.android.gms.internal.ads.zzja
    public final long zza() {
        return this.f;
    }

    @Override  // com.google.android.gms.internal.ads.zzja
    public final void zzb() {
        this.g = 0xC80000;
        this.h = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzja
    public final void zzc() {
        this.g = 0xC80000;
        this.h = false;
        this.a.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzja
    public final void zzd() {
        this.g = 0xC80000;
        this.h = false;
        this.a.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzja
    public final void zze(zzjt[] arr_zzjt, zzty zzty0, zzvg[] arr_zzvg) {
        int v1 = 0;
        for(int v = 0; true; ++v) {
            int v2 = 0xC80000;
            if(v >= 2) {
                break;
            }
            if(arr_zzvg[v] != null) {
                if(arr_zzjt[v].zzb() != 1) {
                    v2 = 0x7D00000;
                }
                v1 += v2;
            }
        }
        int v3 = Math.max(0xC80000, v1);
        this.g = v3;
        this.a.zzf(v3);
    }

    @Override  // com.google.android.gms.internal.ads.zzja
    public final boolean zzf() {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzja
    public final boolean zzg(long v, long v1, float f) {
        int v2 = this.a.zza();
        int v3 = this.g;
        long v4 = this.c;
        boolean z = false;
        if(v1 < Math.max((f > 1.0f ? Math.min(zzeg.zzs(this.b, f), v4) : this.b), 500000L)) {
            if(v2 < v3) {
                z = true;
            }
            this.h = z;
            if(!z && v1 < 500000L) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                return this.h;
            }
        }
        else if(v1 >= v4 || v2 >= v3) {
            this.h = false;
        }
        return this.h;
    }

    @Override  // com.google.android.gms.internal.ads.zzja
    public final boolean zzh(long v, float f, boolean z, long v1) {
        long v2 = zzeg.zzu(v, f);
        long v3 = z ? this.e : this.d;
        if(v1 != 0x8000000000000001L) {
            v3 = Math.min(v1 / 2L, v3);
        }
        return v3 <= 0L || v2 >= v3 || this.a.zza() >= this.g;
    }

    @Override  // com.google.android.gms.internal.ads.zzja
    public final zzvv zzi() {
        return this.a;
    }
}

