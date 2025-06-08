package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public final class zzow implements zzmy {
    public int a;
    public float b;
    public float c;
    public zzmw d;
    public zzmw e;
    public zzmw f;
    public zzmw g;
    public boolean h;
    public Xa i;
    public ByteBuffer j;
    public ShortBuffer k;
    public ByteBuffer l;
    public long m;
    public long n;
    public boolean o;

    public zzow() {
        this.b = 1.0f;
        this.c = 1.0f;
        this.d = zzmw.zza;
        this.e = zzmw.zza;
        this.f = zzmw.zza;
        this.g = zzmw.zza;
        this.j = zzmy.zza;
        this.k = zzmy.zza.asShortBuffer();
        this.l = zzmy.zza;
        this.a = -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzmy
    public final zzmw zza(zzmw zzmw0) throws zzmx {
        if(zzmw0.zzd != 2) {
            throw new zzmx(zzmw0);
        }
        this.d = zzmw0;
        zzmw zzmw1 = new zzmw((this.a == -1 ? zzmw0.zzb : this.a), zzmw0.zzc, 2);
        this.e = zzmw1;
        this.h = true;
        return zzmw1;
    }

    @Override  // com.google.android.gms.internal.ads.zzmy
    public final ByteBuffer zzb() {
        Xa xa0 = this.i;
        if(xa0 != null) {
            int v = xa0.b;
            int v1 = xa0.m * v;
            int v2 = v1 + v1;
            if(v2 > 0) {
                if(this.j.capacity() < v2) {
                    ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(v2).order(ByteOrder.nativeOrder());
                    this.j = byteBuffer0;
                    this.k = byteBuffer0.asShortBuffer();
                }
                else {
                    this.j.clear();
                    this.k.clear();
                }
                ShortBuffer shortBuffer0 = this.k;
                int v3 = Math.min(shortBuffer0.remaining() / v, xa0.m);
                int v4 = v3 * v;
                shortBuffer0.put(xa0.l, 0, v4);
                int v5 = xa0.m - v3;
                xa0.m = v5;
                System.arraycopy(xa0.l, v4, xa0.l, 0, v5 * v);
                this.n += (long)v2;
                this.j.limit(v2);
                this.l = this.j;
            }
        }
        ByteBuffer byteBuffer1 = this.l;
        this.l = zzmy.zza;
        return byteBuffer1;
    }

    @Override  // com.google.android.gms.internal.ads.zzmy
    public final void zzc() {
        if(this.zzg()) {
            zzmw zzmw0 = this.d;
            this.f = zzmw0;
            zzmw zzmw1 = this.e;
            this.g = zzmw1;
            if(this.h) {
                this.i = new Xa(zzmw0.zzb, zzmw0.zzc, this.b, this.c, zzmw1.zzb);
            }
            else {
                Xa xa0 = this.i;
                if(xa0 != null) {
                    xa0.k = 0;
                    xa0.m = 0;
                    xa0.o = 0;
                    xa0.p = 0;
                    xa0.q = 0;
                    xa0.r = 0;
                    xa0.s = 0;
                    xa0.t = 0;
                    xa0.u = 0;
                    xa0.v = 0;
                }
            }
        }
        this.l = zzmy.zza;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzmy
    public final void zzd() {
        Xa xa0 = this.i;
        if(xa0 != null) {
            int v = xa0.k;
            int v1 = xa0.m + ((int)((((float)v) / (xa0.c / xa0.d) + ((float)xa0.o)) / (xa0.e * xa0.d) + 0.5f));
            int v2 = xa0.h + xa0.h;
            xa0.j = xa0.f(xa0.j, v, v2 + v);
            for(int v3 = 0; true; ++v3) {
                int v4 = xa0.b;
                if(v3 >= v2 * v4) {
                    break;
                }
                xa0.j[v4 * v + v3] = 0;
            }
            xa0.k += v2;
            xa0.e();
            if(xa0.m > v1) {
                xa0.m = v1;
            }
            xa0.k = 0;
            xa0.r = 0;
            xa0.o = 0;
        }
        this.o = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzmy
    public final void zze(ByteBuffer byteBuffer0) {
        if(!byteBuffer0.hasRemaining()) {
            return;
        }
        Xa xa0 = this.i;
        xa0.getClass();
        ShortBuffer shortBuffer0 = byteBuffer0.asShortBuffer();
        int v = byteBuffer0.remaining();
        this.m += (long)v;
        int v1 = shortBuffer0.remaining() / xa0.b;
        int v2 = v1 * xa0.b;
        short[] arr_v = xa0.f(xa0.j, xa0.k, v1);
        xa0.j = arr_v;
        shortBuffer0.get(arr_v, xa0.k * xa0.b, (v2 + v2) / 2);
        xa0.k += v1;
        xa0.e();
        byteBuffer0.position(byteBuffer0.position() + v);
    }

    @Override  // com.google.android.gms.internal.ads.zzmy
    public final void zzf() {
        this.b = 1.0f;
        this.c = 1.0f;
        this.d = zzmw.zza;
        this.e = zzmw.zza;
        this.f = zzmw.zza;
        this.g = zzmw.zza;
        this.j = zzmy.zza;
        this.k = zzmy.zza.asShortBuffer();
        this.l = zzmy.zza;
        this.a = -1;
        this.h = false;
        this.i = null;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzmy
    public final boolean zzg() {
        return this.e.zzb != -1 && (Math.abs(this.b - 1.0f) >= 0.0001f || Math.abs(this.c - 1.0f) >= 0.0001f || this.e.zzb != this.d.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzmy
    public final boolean zzh() {
        if(this.o) {
            Xa xa0 = this.i;
            if(xa0 != null) {
                int v = xa0.m * xa0.b;
                return v + v == 0;
            }
            return true;
        }
        return false;
    }

    public final long zzi(long v) {
        long v1 = this.n;
        if(v1 >= 0x400L) {
            long v2 = this.m;
            Xa xa0 = this.i;
            xa0.getClass();
            int v3 = xa0.k * xa0.b;
            long v4 = v2 - ((long)(v3 + v3));
            int v5 = this.g.zzb;
            int v6 = this.f.zzb;
            return v5 == v6 ? zzeg.zzw(v, v4, v1) : zzeg.zzw(v, v4 * ((long)v5), v1 * ((long)v6));
        }
        return (long)(((double)this.b) * ((double)v));
    }

    public final void zzj(float f) {
        if(this.c != f) {
            this.c = f;
            this.h = true;
        }
    }

    public final void zzk(float f) {
        if(this.b != f) {
            this.b = f;
            this.h = true;
        }
    }
}

