package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzaym {
    public final zzayg[] a;
    public int b;
    public int c;
    public int d;
    public zzayg[] e;

    public zzaym(boolean z, int v) {
        this.d = 0;
        this.e = new zzayg[100];
        this.a = new zzayg[1];
    }

    public final int zza() {
        synchronized(this) {
        }
        return this.c * 0x10000;
    }

    public final zzayg zzb() {
        zzayg zzayg0;
        synchronized(this) {
            ++this.c;
            int v1 = this.d;
            if(v1 > 0) {
                zzayg[] arr_zzayg = this.e;
                this.d = v1 - 1;
                zzayg0 = arr_zzayg[v1 - 1];
                arr_zzayg[v1 - 1] = null;
            }
            else {
                zzayg0 = new zzayg(new byte[0x10000], 0);
            }
            return zzayg0;
        }
    }

    public final void zzc(zzayg zzayg0) {
        synchronized(this) {
            this.a[0] = zzayg0;
            this.zzd(this.a);
        }
    }

    public final void zzd(zzayg[] arr_zzayg) {
        synchronized(this) {
            int v1 = this.d + arr_zzayg.length;
            zzayg[] arr_zzayg1 = this.e;
            if(v1 >= arr_zzayg1.length) {
                this.e = (zzayg[])Arrays.copyOf(arr_zzayg1, Math.max(arr_zzayg1.length + arr_zzayg1.length, v1));
            }
            for(int v2 = 0; v2 < arr_zzayg.length; ++v2) {
                int v3 = this.d;
                this.d = v3 + 1;
                this.e[v3] = arr_zzayg[v2];
            }
            this.c -= arr_zzayg.length;
            this.notifyAll();
        }
    }

    public final void zze() {
        synchronized(this) {
            this.zzf(0);
        }
    }

    public final void zzf(int v) {
        synchronized(this) {
            int v2 = this.b;
            this.b = v;
            if(v < v2) {
                this.zzg();
            }
        }
    }

    public final void zzg() {
        synchronized(this) {
            int v1 = Math.max(0, zzazo.zzd(this.b, 0x10000) - this.c);
            int v2 = this.d;
            if(v1 >= v2) {
                return;
            }
            Arrays.fill(this.e, v1, v2, null);
            this.d = v1;
        }
    }
}

