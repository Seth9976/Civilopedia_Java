package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzvv {
    public int a;
    public int b;
    public int c;
    public zzvo[] d;

    public zzvv(boolean z, int v) {
        this.c = 0;
        this.d = new zzvo[100];
    }

    public final int zza() {
        synchronized(this) {
        }
        return this.b * 0x10000;
    }

    public final zzvo zzb() {
        zzvo zzvo0;
        synchronized(this) {
            ++this.b;
            int v1 = this.c;
            if(v1 > 0) {
                zzvo[] arr_zzvo = this.d;
                this.c = v1 - 1;
                zzvo0 = arr_zzvo[v1 - 1];
                if(zzvo0 == null) {
                    throw null;
                }
                arr_zzvo[v1 - 1] = null;
                return zzvo0;
            }
            zzvo0 = new zzvo(new byte[0x10000], 0);
            zzvo[] arr_zzvo1 = this.d;
            if(this.b <= arr_zzvo1.length) {
                return zzvo0;
            }
            this.d = (zzvo[])Arrays.copyOf(arr_zzvo1, arr_zzvo1.length + arr_zzvo1.length);
            return zzvo0;
        }
    }

    public final void zzc(zzvo zzvo0) {
        synchronized(this) {
            int v1 = this.c;
            this.c = v1 + 1;
            this.d[v1] = zzvo0;
            --this.b;
            this.notifyAll();
        }
    }

    public final void zzd(zzvp zzvp0) {
        synchronized(this) {
            while(zzvp0 != null) {
                zzvo[] arr_zzvo = this.d;
                int v1 = this.c;
                this.c = v1 + 1;
                arr_zzvo[v1] = zzvp0.zzc();
                --this.b;
                zzvp0 = zzvp0.zzd();
            }
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
            int v2 = this.a;
            this.a = v;
            if(v < v2) {
                this.zzg();
            }
        }
    }

    public final void zzg() {
        synchronized(this) {
            int v1 = Math.max(0, zzeg.zze(this.a, 0x10000) - this.b);
            int v2 = this.c;
            if(v1 >= v2) {
                return;
            }
            Arrays.fill(this.d, v1, v2, null);
            this.c = v1;
        }
    }
}

